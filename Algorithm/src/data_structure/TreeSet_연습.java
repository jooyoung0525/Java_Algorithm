package data_structure;

import java.util.TreeSet;

public class TreeSet_���� {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet();
		treeset.add(5);
		treeset.add(3);
		treeset.add(1);
		for(Integer data : treeset){
			System.out.println(data);
		}
	}
}

/*
 * 1.��Ŭ������ �Ѽ� ���� Algorithm ������Ʈ�� ����.
 * 2.�ڵ��� �Ѵ�.(��Ű�� ����� Ŭ���� ����� �ڵ��ϰ�~)
 * 3.class �ؿ� �� main �޼ҵ�(=�Լ�) �� ����� main �޼ҵ� ���ο� �ڵ带 �ۼ��Ѵ�.
 * 4.main �޼ҵ� ���� �� main �ױ��� ���� ctrl+space bar�� �ϸ� �˾Ƽ� ��õ���� (ctrl+space bar �ϸ� �����Ѱ� �� ��õ����) 
 * 5.�ڵ� �ε�Ʈ (��ȣ�� ��ܽ����� ���ڰ�)�ϴ°� ctrl + a + i;
 * 6.�۾��� ������ jooOng ���� ���� ���콺 ��Ŭ�� + git bash ����
 * 7. git status (��������� �νĵ����� ��������� ���� ���ϰ���)
 * 8. git add . (�� �̰� Ŀ���ϰڴ�)
 * 9. git commit -m "�޼���"
 * 10.git push origin master (origin�� ���� ����Ҹ� ���ϰ� master �귣ġ ���� push�� ���� ���ݿ� �� ���� ����Ȼ����� ������Ʈ�ϰڴ�) 
 */
