# multiple-parallax-view
Parallax view

![Screen shoot](https://github.com/khacpv/multiple-parallax-view/blob/master/images/screenshoot.png)

[![](https://jitpack.io/v/khacpv/multiple-parallax-view.svg)](https://jitpack.io/#khacpv/multiple-parallax-view)

## How to install

step 1: /build.gradle

````gradle
allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
````

step 2: /app/build.gradle

````gradle
dependencies {
  compile 'com.github.khacpv:multiple-parallax-view:-SNAPSHOT'
}
````

## How to use

````java
List<DataItem> data = new ArrayList<>();
mParallaxView = (ParallaxView) findViewById(R.id.parallax);

DataItem item = DataItem.Builder.make("Nhất cử lưỡng tiện", DataItem.Builder.MODE_DEFAULT)
    .setXPercent(0)
    .setYPercent(0)
    .build();
data.add(item);

mParallaxView.setData(data);

````

see [MainActivity.java](https://github.com/khacpv/multiple-parallax-view/blob/master/app/src/main/java/com/oicmap/game/multipleparalaxview/MainActivity.java)