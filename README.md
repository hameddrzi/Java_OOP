![elicottero](https://github.com/user-attachments/assets/26671674-395c-41bb-9d91-149673570dc7)

We ask you to write a class Helicopter to virtually represent helicopters. A helicopter is defined with three coordinates (integers, in km): x,y and altitude (non-negative), two velocities (integers, in km/h), speed (horizontal and non-negative) and verticalSpeed ​​(vertical), and a horizontal direction track (a real, angle in radians between 0 and 2π). The next drawing summarizes the meanings of the attributes of a helicopter.





The class has the following methods. Use asserts to prevent unacceptable attribute values.


(i) The Helicopter manufacturer defines a helicopter stationary in the sky, given the coordinates (x, y, altitude), with zero speed and zero heading angle. 

(ii) The class has get methods for each attribute and set methods for speed and direction, but not for x, y, altitude. We do not allow a helicopter to change position except by moving over time. 

(iii) A void elapse(double time) method changes the position of the helicopter given the elapsed time, based on the speed and direction, using trigonometry formulas. When assigning the result to integer coordinates you will need to round it, writing: (int) expression.


To call a public static attribute/method outside its class C, write C.attribute, C.method. For example, write Math.sin, Math.cos for the static sine and cosine methods of the Math class. We include a class HelicopterTest to experiment with the Helicopter class: run it (it requires the Helicopter class) and check that the results make sense.
