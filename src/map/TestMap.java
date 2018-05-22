package map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Map����ƣ�ǳ����
 * 
 * @author nullyb
 */
public class TestMap {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		map.put("basicType", 100);
		map.put("list", list);

		// ����չʾ
		System.out.println("------����չʾ--------");
		System.out.println("map:\n" + map);
		// �˴���ﵽcopyMap1����Ϊmap�е����ݲ���
		System.out.println("ǳ���ơ���������");
		Map<String, Object> copyMap1 = map;// ǳ���ƣ�ֻ�����ø���copyMap,map�����ݸı�,copyMap����Ҳ��ı�
		map.put("basicType", 200);
		System.out.println("map:\n" + map);
		System.out.println("copyMap1:\n" + copyMap1);

		// �˴���ﵽcopyMap2����Ϊmap�е����ݲ���
		System.out.println("�����-----�ı��������ͺͻ�������");
		Map<String, Object> copyMap2 = new HashMap<String, Object>();
		copyMap2.putAll(map);// ����ƣ�ֻ�Ի������Ϳ��ã���list�����ݷ����ı�ʱ��copyMap2��������Ȼ���
		map.put("basicType", 300);
		list.add(300);
		System.out.println("map:\n" + map);
		System.out.println("copyMap2:\n" + copyMap2);

		// �˴���ﵽcopyMap3����Ϊmap�е����ݲ���
		System.out.println("���---ʹ�����л��������");
		HashMap<String, Object> copyMap3 = new HashMap<String, Object>();
		copyMap3 = clone(map);
		map.put("basicType", 400);
		list.add(400);
		System.out.println("map:\n" + map);
		System.out.println("copyMap3:\n" + copyMap3);
	}

	/**
	 * ������ȿ�¡---ʹ�����л��������
	 * 
	 * @param obj
	 *            Ҫ��¡�Ķ���
	 * @return ע�⣺ ʹ�����л��ķ�ʽ��ʵ�ֶ�������������ǰ���ǣ����������ʵ���� Serializable�ӿڲſ��ԣ�Map����û��ʵ��
	 *         Serializable
	 *         ����ӿڣ��������ַ�ʽ�������л�Map��Ҳ���ǲ������Map������HashMap�ǿ��Եģ���Ϊ��ʵ����Serializable��
	 */
	public static <T extends Serializable> T clone(T obj) {
		T clonedObj = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			oos.close();
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			clonedObj = (T) ois.readObject();
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return clonedObj;
	}

}