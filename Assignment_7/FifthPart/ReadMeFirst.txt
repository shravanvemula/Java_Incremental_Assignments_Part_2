/**
 * Create a class with an inner class that has a non-default constructor (one that takes arguments).
 * Create a second class with an inner class that inherits from the first inner class.
 *
 * I have created FirstClass with an inner class FirstInnerClass with parameterized constructor that takes String
 * as its argument. Now,I have created a SecondClass with an inner class SecondInnerClass inherited from
 * FirstInnerClass . I have written its constructor in such a way that it calls its parent class(FirstInnerClass)'s
 * constructor.Since an instance of FirstClass is required for calling FirstInnerClass's constructor,I have created
 * an instance of FirstClass in SecondInnerClass's constructor and called its parent constructor(FirstInnerClass)
 * using super().
 * Since ,an instance of FirstInnerClass is created,its constructor is also called in the SecondInnerClass's constructor.
 * That'swhy I have created instances for only SecondClass and SecondInnerClass in DriverClass's main().
 *
 */
