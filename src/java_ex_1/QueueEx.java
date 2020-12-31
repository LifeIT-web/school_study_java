package java_ex_1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Message> mq = new LinkedList<Message>();
		
		mq.offer(new Message("sendMail", "Hong"));
		mq.offer(new Message("sendSMS", "Sin"));
		mq.offer(new Message("sendKakaotalk", "Lee"));
		
		while (!mq.isEmpty()) {
			Message mm = mq.poll();
			
			switch (mm.command) {
			case "sendMail":
				System.out.println(mm.to + " ���� ���� ������");
				break;

			case "sendSMS":
				System.out.println(mm.to + " ���� SMS ������");
				break;

			case "sendKakaotalk":
				System.out.println(mm.to + " ���� �� ������");
				break;

			default:
				break;
			}
		}
	}
}
