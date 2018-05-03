# lib-anim

Android 动画库，动画相关的功能封装，方便使用, 支持动画的with操作和连续动画(组)操作，通过代理支持属性动画中的各种参数设置，完成同样的动画效果可以减少一半以上的y原生代码调用


# 用法:  
最新版  ![](https://jitpack.io/v/huanle19891345/lib-anim.svg)

1. Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add the dependency
```
	dependencies {
	        implementation 'com.github.huanle19891345:lib-anim:{x.y,z}' //x y z is the lastest version name
	}

```

3. Usage in your code:(You can reference the app module sample usage code)
```
 建造者方式调用，支持所有属性动画和动画组效果和自定义配置，完成同样的动画效果可以减少一半以上的y原生代码调用:
        AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 0f, 800f)
                .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 0f, 800f).setDuration(10000))
                .withFloat(tv_2, ANIMATOR_TYPE_SCALE_X, 1f, 1.5f, 1f)
                .then(AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 800f, 0f)
                        .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 800f, 0f).setDuration(10000)))
                .thenFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 0f, 800f)
                .then(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 0f, 800f))
                .then(AnimatorBuilder.playFloat(tv_1, ANIMATOR_TYPE_TRANSLATION_X, 800f, 0f).setDuration(10000)
                        .with(AnimatorBuilder.ofFloat(tv_2, ANIMATOR_TYPE_TRANSLATION_Y, 800f, 0f).setDuration(10000)))
                .setDuration(5000)
                .start()
```
