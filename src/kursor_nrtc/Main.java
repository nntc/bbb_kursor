package kursor_nrtc;

//подключаем классы awt для работы с курсором
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

//создаём класс Main 
public class Main {
	//создаём метод main для запуска приложения
	 public static void main(String[] args) { 
		 //создаём обхект app класса Kursor (файл класса лежит рядом с этим файлом)
		 Kursor app = new Kursor();
		 
		 //в бесконечном цикле...
		 while (true) {
			  //создаём объект info класса PointerInfo
			  //и читаем туда информацию о курсоре
		      PointerInfo info = MouseInfo.getPointerInfo();
		      //создаём объект p класса Point и читаем туда
		      //информацию о локации курсора
		      Point p = info.getLocation();
		      //устанавливаем положение объекта app
		      //вызовом метода SetXY и передачей в него информации о координатах мыши
		      app.SetXY(p.x, p.y);
		      //делаем задержку (метод этого класса - описан ниже)
		      sleep(50);
		    }
	 }
	 
	 //метод, реализующий задержку в millisec миллисекунд
	 private static void sleep(int millisec) {
		 //пробуется выполнить задержку в отдельном потоке
		 try
		    {
		      Thread.sleep(millisec);
		    }
		 	// если вдруг что, то напечатать стектрейс
		    catch (InterruptedException e)
		    {
		      e.printStackTrace();
		    }	
	}
}


