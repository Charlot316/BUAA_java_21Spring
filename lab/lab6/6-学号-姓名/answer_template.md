# Java程序设计 LAB06

```java
/**
* 学号:19373073
* 姓名:何潇龙
* JDK版本:jdk1.8.0_91
* 代码文件编码方式:UTF-8
* IDE:IDEA
 */
```

## 1. InnerClass `代码填空`

```java
class Outer {
  public int num = 10;

  class Inner {
   public int num = 20;

   public void show() {
     int num = 30;
     System.out.println(/*???*/);
     System.out.println(/*???*/);
     System.out.println(/*???*/);
   }
  }
}

public class Test {
  public static void main(String[] args) {
   Outer.Inner oi = /*???*/;
   oi.show();
  }
}
```

- 在 `oo/Q01/TestQ01.java` 中的注释部分填代码，使程序先后输出 30、20、10。
    - `num`
    - `this.num`
    - `Outer.this.num`
    - `new Outer().new Inner()`
- 注意：
    - 不允许修改已经有的代码。
    - 考察的是内部类的构造以及访问外部类的方法，请**不要用加减运算**这种操作。

### 2. InnerClass2 `代码填空`

```java
interface Inter {
  void show();
}

class Outer {
  /*???*/
}

public class Test {
  public static void main(String[] args) {
   Outer.method().show();
  }
}
```

- 在 `oo/Q02/TestQ02.java` 中的注释部分填代码，使程序输出"oo"。

    - ```java
        public static Inter method() {
            return new Inter() {
                public void show() {
                    System.out.println("oo");
                }
            };
        }
        ```

- 注意：
    - 不允许修改已经有的代码。
    - 考察的是匿名类，但是用内部类也可以实现

### 3. 匿名类的ShapeFactory `编程题|旧题`

注意写在oo文件夹中

test类名为TestShape。

### 4. ShapeSequence `编程题`

注意写在oo文件夹中