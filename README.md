# ShopcartCode
购物车数量加减

使用方法：
1.在项目根目录添加
 	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  2.在项目目录build.gradle添加
  	dependencies {
	        compile 'com.github.d746997:ShopcartCode:1.0'
	}

3.    <com.duanc.app.shopcart.AddMinusView
        android:id="@+id/add"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:addtextbg="@drawable/box_val"
        app:alltextsize="5sp"
        app:buttonheight="30dp"
        app:buttonwidth="30dp"
        app:minustextbg="@drawable/box_val"
        app:textbg="@color/white"
        app:textcolor="@color/colorPrimary"
        app:textwidth="60dp"
        />
