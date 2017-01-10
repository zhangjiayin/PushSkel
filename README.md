# PushSkel
android 里面配置aliyun 的key 和secret
```
    defaultConfig {
        manifestPlaceholders = [ALIYUN_PUSH_APPKEY: 'xxxx',ALIYUN_PUSH_APPSECRET:"xxxx"]
    }
```
    
依赖里面添加
```
    compile 'com.github.aliyun.push:push:0.1.8'
```
在application的onCreate方法里面添加
```
 com.github.aliyun.push.Initializer initializer = new com.github.aliyun.push.Initializer();
 initializer.initCloudChannel(this);
```
