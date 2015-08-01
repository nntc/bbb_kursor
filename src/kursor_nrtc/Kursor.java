package kursor_nrtc;
//подключаем классы для работы с объектами типа Color и JFrame
//(awt и swing библиотеки, соответственно)
import java.awt.Color;
import javax.swing.JFrame;

//создаём класс Kursor - наследник класса JFrame
public class Kursor extends JFrame {

	// эту штуку попросила добавить Eclipse. ХЗ что это такое...
	private static final long serialVersionUID = 1L;
	
	// поле класса - высота и ширина (квадратика, который будем рисовать)
	public int wh=8;

	// конструктор
	public Kursor(){
		//переопределяем заголовок окна
	    super("BBB Kursor");
	    //начальное положение окна в x=10, y=10 с заданой через поле this.wh шириной и высотой
	    setBounds(10, 10, this.wh, this.wh);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при 
	                                                    //закрытии окна закрывалась и программа,
	                                                    //иначе она останется висеть в процессах
	    //убираем рамку вокруг окна
	    setUndecorated(true);
	    //выставляем цвет бэкграунда в красный
	    getContentPane().setBackground(Color.RED);
	    //делаем окно всегда поверх других
	    setAlwaysOnTop(true);
	    //делаем окно видимым
	    setVisible(true);
	  }
	
	//метод, устанавливающий координаты старта окна
	public void SetXY(int x, int y) {
		//шаманим методом тыка с входными параметрами, чтобы квадратик находился чуть ниже курсора
		//иначе при тыке мышкой, тык получается на этой программе и мышь становится бесполезной
		setBounds(x - (int) (this.wh/2), y+ (int) (this.wh), this.wh, this.wh);
	}
}

// этот класс используется в файла Main.java для прорисовки квадратика-объекта класса JFrame с красным фоном
// в бесконечном цикле, в котором мониторятся x и y координаты мыши