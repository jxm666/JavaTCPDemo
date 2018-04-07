import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

//TCP 客户端
public class TCPClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1、创建连接 ip 端口
		String ip="127.0.0.1";
		int port =10002;
		Socket sck = new Socket(ip,port);

		//2 传输内容
		String content ="This is Java Send Tcp 10002 Content";
		byte [] sbStrenmData = content.getBytes("UTF-8");
		OutputStream os = sck.getOutputStream();
		os.write(sbStrenmData);

		//3 关闭TCP连接
		sck.close();
	}

}
