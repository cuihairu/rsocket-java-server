# Rsocket java server

Rsocket Java Server Demo

演示Java Rsocket Server

```
+-------------+    +--------------+   +-------------+
| game server |--->| cross server |<--| game server |
+-------------+    +--------------+   +-------------+
                     /|\    /|\
+-------------+       | wire |        +-------------+
| game server |-------+      +--------| game server |
+-------------+                       +-------------+
```

> `wire`: 硬件不同设备之间通信的协议，嵌入式引入这个概念，这边
代表不同进程之间的通信协议。

采用`Rsocket`+`websocket`+`protobuf`实现一个简易的`Demo`

