package com.ilifesmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ilifesmart.weather.R;

public class ArticleActivity extends AppCompatActivity {

    private static String content = "" +
            "阿良站起身，听到战场上遥遥响起一声号角，蛮荒天下收兵了。\n" +
            "\n" +
            "    双方会各自清理战场，下一场大战的落幕，可能就不需要号角声了。\n" +
            "\n" +
            "    阿良来到斩龙崖凉亭处，松开手中那只那空酒壶，身体旋转一圈，嚎了一嗓子，将酒壶一脚踢出凉亭，摔在演武场上。\n" +
            "\n" +
            "    大战告一段落，一时间城头上的剑修，如那候鸟北归，纷纷返家，一条条剑光，风景如画。\n" +
            "\n" +
            "    闭关，养伤，炼剑，饮酒。\n" +
            "\n" +
            "    逝者已逝，生还者的那些伤心，都会在酒碗里，或豪饮或小酌，在酒桌上一一消解。\n" +
            "\n" +
            "    阿良忘记是哪位高人在酒桌上说过，人的肚子，便是世间最好的酒缸，故人故事，就是最好的原浆，加上那颗苦胆，再勾兑了悲欢离合，就能酿造出最好的酒水，滋味无穷。\n" +
            "\n" +
            "    一番思索，一拍大腿，这个高人正是自己啊。\n" +
            "\n" +
            "    做人太过妄自菲薄真不好，得改。\n" +
            "\n" +
            "    很快就有一行人御剑从城头返回宁府，宁姚突然一个急急下坠，落在了大门口，与老妪言语。\n" +
            "\n" +
            "    其余陈三秋，叠嶂，董画符，晏琢，范大澈，依旧直奔凉亭，飘然而落，收剑在鞘。\n" +
            "\n" +
            "    阿良一手撑在亭柱上，一脚脚尖抵地，看着那位亭亭玉立的女子，感慨道：“叠嶂是个大姑娘了。”\n" +
            "\n" +
            "    叠嶂笑着喊了声阿良。\n" +
            "\n" +
            "    在她小时候，叠嶂经常陪着阿良一起蹲在街头巷尾犯愁，男人是犯愁怎么捣鼓出酒水钱，小姑娘是犯愁怎么还不让自己去买酒，每次买酒，都能挣些跑路费的铜钱、碎银子。铜钱与铜钱在破布钱袋子里边的“打架”，若是再加上一两粒碎银子，那就是天底下最悦耳动听的声响了，可惜阿良赊账次数太多，好些酒楼酒肆的掌柜，见着了她也怕。\n" +
            "\n" +
            "    董画符问道：“哪里大了？”\n" +
            "\n" +
            "    阿良笑眯眯道：“问你娘去。”\n" +
            "\n" +
            "    董画符呵呵一笑，“重峦叠嶂，我娘亲说你帮叠嶂取这个名字，不安好心。”\n" +
            "\n" +
            "    阿良无奈道：“这都什么跟什么啊，让你娘亲少看些浩然天下的脂粉本，就你家那么多藏书，不知道养活了南婆娑洲多少家的黑心书商，版刻又不好，内容写得也粗鄙，十本里边，就没一本能让人看第二遍的，你姐更是个昧良心的丫头，那么多关键书页，撕了作甚，当厕纸啊？”\n" +
            "\n" +
            "    董画符不说话，这件事情，他也有份，他姐哗啦啦翻书，杀气腾腾，他只负责帮着撕书，然后他姐偷偷装订成册。\n" +
            "\n" +
            "    陈三秋踢了靴子，盘腿而坐，意态闲适，背靠栏杆。\n" +
            "\n" +
            "    他喜欢董不得，董不得喜欢阿良，可这不是陈三秋不喜欢阿良的理由。\n" +
            "\n" +
            "    恰恰相反，陈三秋很仰慕阿良的那份洒脱，也很感激阿良当年的一些作为。\n" +
            "\n" +
            "    比如为了自己，阿良曾经私底下与老大剑仙大吵一架，大骂了陈氏家主陈熙一通，却从头到尾没有告诉陈三秋，陈三秋是事后才知晓这些内幕，只是知道的时候，阿良已经离开剑气长城，头戴斗笠，悬佩竹刀，就那么悄悄返回了家乡。\n" +
            "\n" +
            "    有些剑仙，剑术很高，却不自由，人生天地间，始终不自在。\n" +
            "\n" +
            "    好像最自由的阿良，却总说真正的自由，从来不是了无牵挂。\n" +
            "\n" +
            "    晏胖子在给男人揉肩敲背，低声问道：“阿良阿良，我如今剑法如何，去了浩然天下，能不能让仙子心如撞鹿？你可说过，只要是剑仙，哪怕模样没那么俊俏，出了剑，就是女子最好的胭脂，瞧见了高明的剑术，她们就像抹了腮红一般，到底作不作数？”\n" +
            "\n" +
            "    阿良点头道：“作数，怎么可能不作数，浩然天下我很熟，以后你要是有机会去那边游历，我就给你一张地图，将那些有仙子的山头全部标注出来，你也别傻乎乎去问剑，只需去了山脚，御剑而起，绕着山头走上一圈，耍上一套剑术，打完收工，在这期间什么话都别说，摘下酒壶，留给仙子们一个仰头喝酒的背影就成，直到这一刻，你再高声吟诗一首，潇洒远去……”\n" +
            "\n" +
            "    晏琢头大如簸箕，“阿良，我不会吟诗啊。”\n" +
            "\n" +
            "    阿良说道：“我有啊，一本册子三百多句，全部是为我们这些剑仙量身打造的诗词，友情价卖你？”\n" +
            "\n" +
            "    董画符问道：“册子上的诗句，早就都被你用烂了吧？”\n" +
            "\n" +
            "    阿良有些悻悻然。\n" +
            "\n" +
            "    范大澈最为拘谨。\n" +
            "\n" +
            "    他与阿良前辈不熟。\n" +
            "\n" +
            "    哪怕阿良前辈平易近人，可对于范大澈而言，依旧高高在上，近在眼前，却远在天边。\n" +
            "\n" +
            "    这就像许多年轻剑修遇见董三更、陆芝这些老剑仙、大剑仙，前辈们兴许不会看不起晚辈什么，但是晚辈们却往往会不由自主地看不起自己。\n" +
            "\n" +
            "    阿良笑道：“你叫范大澈吧？”\n" +
            "\n" +
            "    范大澈赶紧点头，受宠若惊。\n" +
            "\n" +
            "    阿良说道：“你跻身金丹境，比我和老大剑仙的原先预期要早些。”\n" +
            "\n" +
            "    范大澈不敢置信。\n" +
            "\n" +
            "    自己都能入阿良前辈和老大剑仙的法眼？\n" +
            "\n" +
            "    阿良笑道：“其实每个孩子的成长，都被老大剑仙看在眼里。只是老大剑仙性情腼腆，不喜欢与人客套。”\n" +
            "\n" +
            "    这话不好接。\n" +
            "\n" +
            "    毕竟不是待人以诚二掌柜。\n" +
            "\n" +
            "    宁姚与白嬷嬷分开后，走上斩龙崖石道，宁姚到了凉亭之后，阿良已经跟众人各自落座。\n" +
            "\n" +
            "    宁姚有些倦容，问道：“阿良，他有无大碍？”\n" +
            "\n" +
            "    “那小子一直睡不踏实，被我打晕，这会儿呼声如雷，好多了。”\n" +
            "\n" +
            "    阿良有一说一，“陈平安在短期内应该很难再出城厮杀了，你该拦着他打先前那场架的，太险，不能养成赌命这种习惯。”\n" +
            "\n" +
            "    宁姚摇头道：“大事由他，我劝不动。”\n" +
            "\n" +
            "    阿良啧啧称奇，“宁丫头还是那个我认识的宁丫头吗？”\n" +
            "\n" +
            "    宁姚默不作声坐下，肩靠亭柱。\n" +
            "\n" +
            "    她背负剑匣，身穿一袭雪白法袍。\n" +
            "\n" +
            "    凉亭之内，随便闲聊。\n" +
            "\n" +
            "    多是董画符在询问阿良关于青冥天下的事迹，阿良就在那边吹嘘自己在那边如何了得，拳打道老二算不得本事，毕竟没能分出胜负，可他不出一剑，就能以风采倾倒白玉京，可就不是谁都能做成的壮举了。\n" +
            "\n" +
            "    故作轻松语，定有难以释怀事。\n" +
            "\n" +
            "    阿良最后为这些年轻人指点了一番剑术，点破他们各自修行的瓶颈、关隘，便起身告辞，“我去找熟人要酒喝，你们也赶紧各回各家。”\n" +
            "\n" +
            "    宁姚起身目送阿良和所有朋友先后御剑远去。\n" +
            "\n" +
            "    她独自走下斩龙崖，去了那栋小宅子，轻手轻脚推开屋门，跨过门槛，坐在床边，轻轻握住陈平安那只不知何时探出被窝外的左手，依旧在微微颤抖，这是魂魄颤栗、气机犹然未稳的外显，宁姚动作轻柔，将陈平安那只手放回被褥，她低头弯腰，伸手抹去陈平安额头的汗水，以一根手指轻轻抚平他微微皱起的眉头。\n" +
            "\n" +
            "    陈平安喜欢自己，宁姚很开心。\n" +
            "\n" +
            "    可陈平安喜欢她，便要这么累，宁姚对自己有些生气。\n" +
            "\n" +
            "    所以熟睡中的陈平安眉头才刚刚舒展，她自己便皱起了眉头。\n" +
            "\n" +
            "    怎么办呢，也不能不喜欢他，也舍不得他不喜欢自己啊。\n" +
            "\n" +
            "    这些情愁，未下眉头，又上心头。\n" +
            "\n" +
            "    ————\n" +
            "\n" +
            "    阿良直接回了城头，却不是去往茅屋那边，而是坐在了依旧在勤勉炼剑的吴承霈身边。\n" +
            "\n" +
            "    吴承霈眺望战场，那条金色长河已经被三教圣人收起，大地之上，还有一些零零星星的厮杀。\n" +
            "\n" +
            "    面无半点悲苦色，人有不堪言之苦。\n" +
            "\n" +
            "    对于很多初来驾到的外乡游历的剑修，剑气长城的本土剑仙，几乎个个脾气古怪，难以亲近。\n" +
            "\n" +
            "    阿良也没说话。\n" +
            "\n" +
            "    吴承霈终于开口道：“听米祜说，周澄死前，说了句‘活着也无甚意思，那就死死看’，陶文则说痛快一死，难得轻松。我很羡慕他们。”\n" +
            "\n" +
            "    阿良说道：“确实不是谁都可以选择怎么个活法，就只能选择怎么个死法了。不过我还是要说一句好死不如赖活着。”\n" +
            "\n" +
            "    吴承霈说道：“你不在的这些年里，所有的外乡剑修，无论如今是死是活，不谈境界是高是低，都让人刮目相看，我对浩然天下，已经没有任何怨气了。”\n" +
            "\n" +
            "    阿良取出一壶仙家酒酿，揭了泥封，轻轻晃荡，酒香扑鼻，低头嗅了嗅，笑道：“酒中又过一年秋，酒味年年赢过桂子香。浩然天下和青冥天下的酒水，确实都不如剑气长城。”\n" +
            "\n" +
            "    吴承霈突然问道：“阿良，你有过真正喜欢的女子吗？”\n" +
            "\n" +
            "    阿良想了想，刚要说话，吴承霈已经摇头道：“不用回答了，问这个问题，就已经很后悔，估计听了答案，我更后悔。”\n" +
            "\n" +
            "    阿良笑了笑，“行走江湖，没点儿女情长，喝什么酒。你看那些痴情种，哪个不是酒坛里浸泡出来的醉汉。情场上，谁都是胆小鬼。”\n" +
            "\n" +
            "    吴承霈有些意外，这个狗日的阿良，难得说几句不沾荤腥的正经话。\n" +
            "\n" +
            "    陆芝难得现身，坐在吴承霈另外一侧。\n" +
            "\n" +
            "    阿良抛过去手中酒壶，结果被陆芝一巴掌拍回去，阿良借住酒壶，埋怨道：“跟你阿良哥哥客气什么，一壶酒而已。”\n" +
            "\n" +
            "    陆芝扬起手臂。\n" +
            "\n" +
            "    阿良哀叹一声，取出一壶新酒丢了过去，“女子豪杰，要不拘小节啊。”\n" +
            "\n" +
            "    陆芝饮酒之后，问道：“听闻青冥天下有道门剑仙一脉，历史悠久，剑法具体如何？比那龙虎山大天师如何？”\n" +
            "\n" +
            "    阿良揉了揉下巴，“你是说那个大玄都观的孙掌教吧，没打过交道，有些遗憾，大玄都观的女冠姐姐们……哦不对，是道观的那座桃林，不管有人没人，都风景绝好。至于龙虎山大天师，我倒是很熟，那些天师府的黄紫贵人们，每次待客，都特别热情，堪称兴师动众。”\n" +
            "\n" +
            "    见面不用说话，先来一记五雷轰顶，当然很热情。\n" +
            "\n" +
            "    阿良一把挪开吴承霈的脑袋，与陆芝笑道：“你要是有兴趣，回头拜访天师府，可以先报上我的名号。”\n" +
            "\n" +
            "    陆芝冷笑道：“报上你的名号？是不是就等于向龙虎山问剑了？”\n" +
            "\n" +
            "    阿良大笑道：“剑气长城最知我者，莫若陆芝。”\n" +
            "\n" +
            "    吴承霈说道：“两位，我在炼剑，喝酒聊天，去往别处。”\n" +
            "\n" +
            "    陆芝说道：“心死于人之前，炼不出什么好剑。”\n" +
            "\n" +
            "    吴承霈说道：“不劳你费心。我只知道飞剑‘甘霖’，就算再也不炼，还是在甲等前三之列，陆大剑仙的本命飞剑，只在乙等。避暑行宫的甲本，记载得清清楚楚。”\n" +
            "\n" +
            "    陆芝说道：“等我喝完酒。”\n" +
            "\n" +
            "    吴承霈说道：“求你喝快点。”\n" +
            "\n" +
            "    剑仙吴承霈，不擅长捉对厮杀，可在剑气长城是出了名的谁都不怕，阿良当年就在吴承霈这边，吃过不小的苦头。\n" +
            "\n" +
            "    吴承霈随随便便一句话，就让阿良喝了小半年的愁酒。\n" +
            "\n" +
            "    “你阿良，境界高，来头大，反正又不会死，与我逞什么威风？”\n" +
            "\n" +
            "    让人为难的，从来不是那种全无道理的言语，而是听上去有些道理、又不那么有道理的言语。\n" +
            "\n" +
            "    这会儿阿良大手一挥，朝不远处两位分坐南北城头的老剑修喊道：“坐庄了！程荃，赵个簃，押注押注！”\n" +
            "\n" +
            "    陆芝却已经站起身，将酒壶丢往城墙之外，御剑离去。\n" +
            "\n" +
            "    在陆芝远去之后，阿良说道：“陆芝以前看谁都像是外人，现在变了很多，与你难得说一句自家话，怎么不领情。”\n" +
            "\n" +
            "    吴承霈神色恍惚，说道：“自家话听了才难受。”\n" +
            "\n" +
            "    阿良点了点头，“也对。”\n" +
            "\n" +
            "    吴承霈说道：“萧愻一事，知道了吧？”\n" +
            "\n" +
            "    阿良后仰躺去，枕在手背上，翘起二郎腿，“人各有志。”\n" +
            "\n" +
            "    吴承霈突然说道：“当年事，没有道谢，也不曾道歉，今天一并补上。对不住，谢了。”\n" +
            "\n" +
            "    阿良却说道：“在别处天下，像我们哥俩这样剑术好、模样更好的剑修，很吃香的。”\n" +
            "\n" +
            "    吴承霈确实是一位美男子，在许多外乡女子言谈中，经常与米裕并称“双璧”。\n" +
            "\n" +
            "    只是一个痴心，一个多情。\n" +
            "\n" +
            "    亲眼见过了两位玉璞境剑修的容貌风姿，那些个个倍感不虚此行的外乡女子们才恍然，原来男人也可以长得这么好看，美人美人，不唯有女子独享美字。\n" +
            "\n" +
            "    吴承霈将剑坊佩剑横放在膝，眺望远方，轻声说道：“行到水穷处，坐看云起。”\n" +
            "\n" +
            "    吴承霈随即问道：“坐看山云起，加个山字，与水呼应，会不会更好些？”\n" +
            "\n" +
            "    阿良随口说道：“不好，字多，意思就少了。”\n" +
            "\n" +
            "    吴承霈思量片刻，点头道：“有道理。”\n" +
            "\n" +
            "    阿良笑道：“怎么也附庸风雅起来了？”\n" +
            "\n" +
            "    吴承霈答道：“闲来无事，翻了一下皕剑仙印谱，挺有意思的。”\n" +
            "\n" +
            "    阿良疑惑道：“啥玩意儿？”\n" +
            "\n" +
            "    吴承霈笑道：“不认识皕这个字？怎么当的读书人。你爹没被你气死？”\n" +
            "\n" +
            "    阿良笑嘻嘻道：“你爹已经快要被你气死了。”\n" +
            "\n" +
            "    吴承霈伸了个懒腰，面带笑意，缓缓道：“君子之心，天青日白，秋水澄镜。君子之交，合则同道，散无恶语。君子之行，野草朝露，来也可人，去也可爱。”\n" +
            "\n" +
            "    阿良愣了一下，“我说过这话？”\n" +
            "\n" +
            "    吴承霈笑道：“读书人说的。”\n" +
            "\n" +
            "    ————\n" +
            "\n" +
            "    陈平安再次清醒后，已经行走无碍，得知蛮荒天下已经停止攻城，也没有怎么轻松几分。\n" +
            "\n" +
            "    没能找到宁姚，白嬷嬷在躲寒行宫那边教拳，陈平安就御剑去了趟避暑行宫，结果发现阿良正坐在门槛那边，正在跟愁苗聊天。\n" +
            "\n" +
            "    愁苗、董不得他们这些本土剑修，与阿良都再熟悉不过，只是林君璧这些外乡剑修，对于同乡人的阿良，其实就只有个名字了。谁都听过，谁都没见过。\n" +
            "\n" +
            "    阿良在剑气长城待了百余年光阴，对于浩然天下年纪不大的修道之人，关于阿良，就只有口口相传的事迹了。\n" +
            "\n" +
            "    在北俱芦洲的姜尚真，故事多，已经走过三座天下的阿良，故事更多。\n" +
            "\n" +
            "    由于摊开在避暑行宫的两幅山水画卷，都无法触及金色长河以南的战场，所以阿良早先两次出剑，隐官一脉的所有剑修，都不曾亲眼目睹，只能通过汇总的情报去感受那份风采，以至于林君璧、曹衮这些年轻剑修，见着了阿良的真人，反而比那范大澈更加拘束。\n" +
            "\n" +
            "    来自扶摇洲的宋高元更是神色激动，满脸涨红，可就是不敢开口说话。\n" +
            "\n" +
            "    宋高元从小就知道，自己这一脉的那位女子祖师，对阿良十分爱慕，那时候宋高元仗着年纪小，问了许多其实比较犯忌讳的问题，那位女子祖师便与孩子说了许多陈年旧事，宋高元印象很深刻，女子祖师每每谈及那个阿良的时候，既怨又恼也羞，让当年的宋高元摸不着头脑，是很后来才知道那种神态，是女子真心喜欢一个人，才会有的。\n" +
            "\n" +
            "    郭竹酒蹲在门槛旁边，双手托腮，使劲盯着阿良。\n" +
            "\n" +
            "    她年纪太小，不曾见过阿良。\n" +
            "\n" +
            "    今儿多看几眼补回来。\n" +
            "\n" +
            "    郭竹酒偶尔转头看几眼那个老姑娘，再瞥一眼喜欢老姑娘的邓凉。\n" +
            "\n" +
            "    阿良被这个不忘背只竹箱的小姑娘盯得有些发毛。\n" +
            "\n" +
            "    现在剑气长城的小姑娘，不含糊啊。\n" +
            "\n" +
            "    偶尔对上视线，小姑娘就立即咧嘴一笑，阿良破天荒有些尴尬，只得跟着小姑娘一起笑。\n" +
            "\n" +
            "    让阿良没来由想起了李槐那个小王八蛋，小镇淳朴民风集大成者。\n" +
            "\n" +
            "    郭竹酒瞧见了陈平安，立即蹦跳起身，跑到他身边，一下子变得忧心忡忡，欲言又止。\n" +
            "\n" +
            "    陈平安笑道：“没事，慢慢养伤就是。”\n" +
            "\n" +
            "    郭竹酒使劲点头，然后用手指戳了戳门槛那边，压低嗓音说道：“师父！活的，活的阿良唉！”\n" +
            "\n" +
            "    陈平安揉了揉小姑娘的脑袋，“忘了？我跟阿良前辈早就认识。”\n" +
            "\n" +
            "    阿良翘起大拇指，笑道：“收了个好徒弟。”\n" +
            "\n" +
            "    郭竹酒也投桃报李，竖起大拇指，大概是觉得礼数不够，又伸出一根大拇指，“我师父认识了个好前辈。”\n" +
            "\n" +
            "    阿良也跟着再伸出拇指，“小姑娘好眼力。”\n" +
            "\n" +
            "    郭竹酒保持姿势，“董姐姐好眼光！”\n" +
            "\n" +
            "    阿良说道：“郭剑仙好福气。”\n" +
            "\n" +
            "    郭竹酒刚要继续言语，就挨了师父一记板栗，只得收起双手，“前辈你赢了。”\n" +
            "\n" +
            "    最后郭竹酒大摇大摆屋内。\n" +
            "\n" +
            "    陈平安和阿良一左一右坐在门槛。\n" +
            "\n" +
            "    两个剑客，两个读书人，开始一起喝酒。";

    private TextView article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);


        article = findViewById(R.id.centent);
        article.setText(content);
    }
}
