### 接口文档



| 接口名称                    | 参数列表                                  | 作用                                                         | 返回值                                                       |
| --------------------------- | ----------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| localhost:8182/order        | 一个id，为空。一个count（点餐数量）       | 提交给后端点餐人数                                           | 返回“Success”                                                |
| localhost:8182/save         | 一个id，是食物的id，一个num（要点多少份） | 提交给后端哪个食物点了多少个                                 | 返回"Success"                                                |
| localhost:8182/getList      | 无                                        | 获取当前点了的食物的列表                                     | 返回哪个食物点了几个，一个list                               |
| localhost:8182/getMenu      | 无                                        | 获取菜单的所有数据（id, name, img, price, introduction）     | 返回一个菜单列表                                             |
| localhost:8182/getMenuById  | 食物id                                    | 获取某个食物的信息                                           | 返回食物信息                                                 |
| localhost:8182/getSum       | 无                                        | 获取一共花费多少钱                                           | 返回一个数字，表示当前点这些需要花多少钱                     |
| localhost:8182/getCount     | 无                                        | 获取当前点餐人数                                             | 返回一个数字，表示当前点餐人数                               |
| localhost:8182/getOrderList | 无                                        | 获取当前点餐的信息，包括点了哪些食物的编号，食物的名字等信息，点了多少个 | 返回一个{m:{}, count:}，其中m表示食物信息，count表示点了几个。 |
| localhost:8182/changeCount   | 一个count，是将人数修改为多少             | 将用餐人数修改为多少                                         | 返回"Success"                                                |
