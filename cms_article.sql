/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : 1701b_cms

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2019-04-29 15:09:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cms_article`
-- ----------------------------
DROP TABLE IF EXISTS `cms_article`;
CREATE TABLE `cms_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `picture` varchar(200) DEFAULT NULL,
  `channel_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `hits` int(11) DEFAULT NULL,
  `hot` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `deleted` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_CMS_ARTI_REFERENCE_CMS_USER` (`user_id`),
  KEY `FK_CMS_ARTI_REFERENCE_CMS_CHAN` (`channel_id`),
  KEY `FK_CMS_ARTI_REFERENCE_CMS_CATE` (`category_id`),
  CONSTRAINT `FK_CMS_ARTI_REFERENCE_CMS_CATE` FOREIGN KEY (`category_id`) REFERENCES `cms_category` (`id`),
  CONSTRAINT `FK_CMS_ARTI_REFERENCE_CMS_CHAN` FOREIGN KEY (`channel_id`) REFERENCES `cms_channel` (`id`),
  CONSTRAINT `FK_CMS_ARTI_REFERENCE_CMS_USER` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_article
-- ----------------------------
INSERT INTO `cms_article` VALUES ('26', '华为又出新招，成立新公司，名字有点滑稽，却暗藏野心', '<p>\n	<img src=\"https://p1.pstatp.com/list/190x124/pgc-image/ee88ba4d86b54d3680f0aa46e9386f8b\" />\n</p>\n<p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p3.pstatp.com/large/pgc-image/a8dcd6479f3e4efea54dc391aef54af2\" alt=\"华为又出新招，成立新公司，名字有点滑稽，却暗藏野心\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		说起华为我相信大家一定都非常熟悉，在5G的研发领域抗住了美国的打压，成功拿下5G订单。不仅如此，在手机行业里也是世界上第二大手机厂商，已经成为了可以影响到苹果的存在。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/ee88ba4d86b54d3680f0aa46e9386f8b\" alt=\"华为又出新招，成立新公司，名字有点滑稽，却暗藏野心\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		前一段时间发布的华为P30系列，受到了来自全世界的好评，这款手机表现力非凡，拍照功能荣登第一，全球范围疯抢。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/d30dffc2a03e45c3be6a1760df3f9e00\" alt=\"华为又出新招，成立新公司，名字有点滑稽，却暗藏野心\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		大家都清楚，手机只是华为副业，重要的是华为的通信技术。每年华为都会花费大把的时间和金钱投入到科技研发领域去。5G亦是如此，还有华为独立研发的麒麟芯片，虽然5G路上遇到许多挫折，但是华为不负众望，接二连三的拿下订单。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/02379d4605cb474fb0262cb829db8c47\" alt=\"华为又出新招，成立新公司，名字有点滑稽，却暗藏野心\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		最近又有消息称，华为在成立一家新公司，名字已经取好，叫哈勃科技投资有限公司，是一家投资公司，。此消息一出，网友便犀利的指出，华为暗藏野心，下着很大的决心想把公司做大做强。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p9.pstatp.com/large/pgc-image/7321d866cbaf4c728d7396dbcc41ce7a\" alt=\"华为又出新招，成立新公司，名字有点滑稽，却暗藏野心\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		毕竟哈勃是空间望远镜的简称，是天文学家爱德温·哈勃的名字。名字虽然滑稽，但是却包含着华为巨大的野心，以大家对华为的了解，对这件事情，你们有什么样的看法，欢迎评论告诉大家。\n	</p>\n<br />\n</p>', 'https://p1.pstatp.com/list/190x124/pgc-image/ee88ba4d86b54d3680f0aa46e9386f8b', '1', '2', '1', null, null, '1', '1', '2019-04-29 08:11:15', '2019-04-29 08:11:15');
INSERT INTO `cms_article` VALUES ('27', '卡瓦伊，注定不是北方的狼？', '<p>\n	<img src=\"/pic/image/20190429/20190429095235_403.jpg\" alt=\"\" />\n</p>\n<p>\n	<p class=\"ql-align-justify\">\n		猛龙的训练馆，位于多伦多市中心湖边。球馆有LOGO的地方，都有两部分，左边是猛龙的爪印，右边是一个猫头鹰。有个工作人员告诉我，猫头鹰是猛龙形象大使所属的品牌，形象大使就是公鸭，音译为“追客(Drake）”，字面和音译都很花花公子范。\n	</p>\n	<p class=\"ql-align-justify\">\n		我在训练馆见到洛杉矶时报的丹·维克，很奇怪他怎么跑多伦多来了。维克指了指正在训练的莱昂纳德，“因为他。”我就问他，“你觉得猛龙季后赛成绩，会影响莱昂纳德的去留吗？”\n	</p>\n	<p class=\"ql-align-justify\">\n		“不会。我觉得他会去快船。”\n	</p>\n	<p class=\"ql-align-justify\">\n		维克来自卡瓦伊老家来的媒体，他的答案，只是他的想法。我问猛龙几个随队记者，还有球队的工作人员同一个问题，答案就是，没有答案。\n	</p>\n	<p class=\"ql-align-justify\">\n		卡瓦伊怎么想的？没有人知道。\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<div class=\"pgc-img\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/15ee9458d3d0408d8ba7a64b397b9787\" alt=\"卡瓦伊，注定不是北方的狼？\" />\n	</div>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<p class=\"ql-align-justify\">\n		我在多伦多呆了五天，看了两场比赛，两次训练，莱昂纳德和队友的交流次数，一只手都能数得过来。印象深刻的，第二场赛后和丹尼·格林寒暄，还有一次在训练馆采访室出来，洛瑞进去，两人对视了一下，洛瑞笑了一下，卡瓦伊努力的想笑一下，未遂，就错身了。\n	</p>\n	<p class=\"ql-align-justify\">\n		卡瓦伊怎么想，那是他的事情。作为猛龙队，对卡瓦伊的各种暖心献媚，我是切实感受到了。现在的猛龙，就好比一个穷小子，卖牛当车，找了一个漂亮女朋友，这个女朋友有一年的考察期，如果女朋友出走，那就是真的鸡飞蛋打。一年时间，怎么去追？\n	</p>\n	<p class=\"ql-align-justify\">\n		乌吉里在赛季前说，“很多都说没有人愿意来多伦多，这个说法过时了，我们要相信城市”。\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<div class=\"pgc-img\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/eadd60e20c054c989dededc4318bb7e8\" alt=\"卡瓦伊，注定不是北方的狼？\" />\n	</div>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<p class=\"ql-align-justify\">\n		小伙要想让姑娘留下来，要先让她喜欢你的村子。乌吉里这村，自然是指多伦多。猛龙季后赛的口号，“We\n the North(我们北方)”, \n我一直以为，单纯是指地理位置，类似于“我们东北银”。看了赛前大屏幕，才知道这来自加拿大国歌里面的一句，“The True North \nstrong and free \n（真北之邦，自由强壮）”。就像我们也对南北性格有个区分，北美也是这样。我们认为北方人彪悍，北美正好反过来，美国人经常嘲笑加拿大人太客气，婆婆妈妈，跑个百米都会客气半天，“你先你先”。加拿大人认为美国人自大，粗俗不讲礼貌。我记得2016年多伦多全明星时，有个朋友丢了包，场馆的保安说，“如果都是加拿大人，肯定能找回来，今天来了很多美国人，我不能保证了”。\n	</p>\n	<p class=\"ql-align-justify\">\n		卡瓦伊不是那种爱跟人寒暄的性格，加拿大人什么性格，他未必关心。刚到多伦多一年，卡瓦伊已经是最受欢迎的球员。相对来说，北方的球迷似乎更狂热一点，天气冷了没事干，比赛中发泄情绪的需求更强烈，魔术主教练克利福德说，猛龙的主场，是他经历的噪音最大的。球员选择城市的时候，无非是看是不是大城市，夜店怎么样，气候怎么样，等等。大城市就意味着市场更大，更多的曝光。\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<div class=\"pgc-img\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/530e6136641f4c47a6667eb4beeeccb4\" alt=\"卡瓦伊，注定不是北方的狼？\" />\n	</div>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<p class=\"ql-align-justify\">\n		可是卡瓦伊真的喜欢更多的曝光吗？第二场比赛结束，他默默跟着队友往更衣室走，猛龙公关杰西卡拉住他，让他去接受采访，他还稍微犹豫了一下；每次训练和比赛，采访全程他都绷着脸，没有表情，而且时间极短，詹姆斯训练采访一般是7分钟，公关要控制记者问的问题，卡瓦伊一般是3分钟结束，没有人能想出什么问题了。“季后赛和普通比赛一样，唯一区别就是你在前面加了季后”，我在多伦多五天，这句话是莱昂纳德最“金句”的一句，让媒体集体高潮了三小时，因为让卡瓦伊说点有新闻点的话，太难了。詹姆斯是喜欢活在聚光灯下的球员，威少在小地方，但威少穿得花哨，而卡瓦伊大部分时间，真的就想静静，没有人知道静静是谁。\n	</p>\n	<p class=\"ql-align-justify\">\n		再说了，多伦多是大城市，这个不用质疑。根据我的经验，\n北美城市的规模，和中餐馆的种类和质量成正比，基本是中餐馆越多，质量越好，越算的上大城市。多伦多有几个唐人街，我到最老的那个，都能看到绿茶和小肥羊等饭店，这对从村里来的我，冲击是巨大的，只能由衷赞叹，“俺的亲娘哎”。\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<div class=\"pgc-img\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/b380d46d52f44fa9af88f7c6af3b919d\" alt=\"卡瓦伊，注定不是北方的狼？\" />\n	</div>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<p class=\"ql-align-justify\">\n		至于天气，那是真冷。球队的一个高层跟我说，多伦多举办全明星的时候，猛龙和多伦多市卯足了劲，要办一届最好的全明星，给球员留下一个好印象。从装修到中场表演，都花了大价钱，结果那几天零下30度，库里一下飞机冻得六神无主。全明星结束，大家对装修没什么印象了，只记得冷。卡瓦伊出生在洛杉矶附近，这种寒冷的天气，未必对他胃口。去年在讨论詹姆斯可能去向的时候，我知道他肯定不会去休斯敦。姑且不说工资帽谁当老大等问题，詹姆斯自己私下说过，他不喜欢休斯敦的那种天气。让一个广东人，去东北生活工作，勉为其难。\n	</p>\n	<p class=\"ql-align-justify\">\n		天气这个东西，对NBA球星未必有多大的影响，一个赛季八个月，一半的时间在路上，感受气候的时候并不多。至于夜店，马刺接替卡瓦伊的怀特可能不逛夜店，因为白的不懂夜的黑，但卡瓦伊懂，多伦多的夜店，多的不要太多。\n	</p>\n	<p class=\"ql-align-justify\">\n		那到底什么对卡瓦伊有影响？\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<div class=\"pgc-img\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/5a0573ae01fd435497cf0efd289a592a\" alt=\"卡瓦伊，注定不是北方的狼？\" />\n	</div>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n	<p class=\"ql-align-justify\">\n		看一个人的思维方式，最好的方式，是看他曾经做过的决定。\n	</p>\n	<p class=\"ql-align-justify\">\n		卡瓦伊离开马刺的原因，有各种版本，我们能知道的公开消息就是，球队和卡瓦伊在身体健康方面有分歧。整个赛季，猛龙都把卡瓦伊的健康，放在最重要的位置，从来不让他打背靠背，每晚控制上场时间。在季后赛第一场，主教练纳斯只让卡瓦伊上了33分钟，按照当时的情形，如果他多打几分钟，可能猛龙不至于最后被动，但是和控制卡瓦伊的上场时间，让他保持健康相比，没有什么是大事。猛龙找了前湖人的训练师，精心负责卡瓦伊的身体。可以这么说，他到任何队，能得到的最好的保持健康的条件，不会超过猛龙。\n	</p>\n	<p class=\"ql-align-justify\">\n		从上到下，从里到外，猛龙把有助于留下卡瓦伊的各种招数，都用上了。可有时候，你对女孩百般好，不如闺蜜的一句话。猛龙的所有人，没有人见过卡瓦伊的女朋友。对卡瓦伊最有影响力的，莫过于他的舅舅。\n	</p>\n	<p class=\"ql-align-justify\">\n		和其他所有人一样，我对外界传言他舅舅暗中教唆卡瓦伊，颇为怀疑：如果情商这么低，卡瓦伊能到这个高度？\n	</p>\n	<p class=\"ql-align-center\">\n		<br />\n	</p>\n</p>', '/pic/image/20190429/20190429095235_403.jpg', '5', '17', '1', null, '1', '1', '1', '2019-04-29 09:53:08', '2019-04-29 09:53:08');
INSERT INTO `cms_article` VALUES ('28', '2019世乒赛国乒6龙6凤成绩单揭晓，刘国梁点评夸奖刘诗雯马龙', '<p>\n	<img src=\"https://p1.pstatp.com/list/190x124/pgc-image/f0b791f64e53487dae27c5f63465b992\" />\n</p>\n<p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		2019匈牙利世乒赛，国乒6龙6凤参赛，每个人的成绩单汇总揭晓！中国乒乓球队5金完美收官！刘国梁点评夸奖了双冠王马龙与刘诗雯。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/f0b791f64e53487dae27c5f63465b992\" alt=\"2019世乒赛国乒6龙6凤成绩单揭晓，刘国梁点评夸奖刘诗雯马龙\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【国乒男队6龙成绩】：\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【马龙】：男单金牌、男双金牌（与王楚钦），双冠王！\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【樊振东】：男单16强，混双铜牌（与丁宁）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【林高远】：男单8强，男双铜牌（与梁靖崑）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【梁靖崑】：男单铜牌，男双铜牌（与林高远）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【许昕】：男单32强，混双金牌（与刘诗雯）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【王楚钦】：男双金牌（与马龙）。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p3.pstatp.com/large/pgc-image/2e0ed04b82d74d7ab62badd3149115c6\" alt=\"2019世乒赛国乒6龙6凤成绩单揭晓，刘国梁点评夸奖刘诗雯马龙\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【国乒女队6凤成绩】：\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【刘诗雯】：女单金牌，混双金牌（与许昕），双冠王！\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【丁宁】：女单铜牌，混双铜牌（与樊振东）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【陈梦】：女单银牌，女双铜牌（与朱雨玲）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【王曼昱】：女单铜牌，女双金牌（与孙颖莎）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【孙颖莎】：女单8强，女双金牌（与王曼昱）。\n	</p>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		【朱雨玲】：女双铜牌（与陈梦）。\n	</p>\n	<div class=\"pgc-img\" style=\"margin:0px;padding:0px;color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		<img src=\"http://p1.pstatp.com/large/pgc-image/85eba43b2b6e40a4aab8ccc28858d43a\" alt=\"2019世乒赛国乒6龙6凤成绩单揭晓，刘国梁点评夸奖刘诗雯马龙\" />\n	</div>\n	<p style=\"color:#222222;font-family:&quot;font-size:16px;background-color:#FFFFFF;\">\n		中国乒乓球队包揽了全部5个冠军，这下又\n	</p>\n</p>', 'https://p1.pstatp.com/list/190x124/pgc-image/f0b791f64e53487dae27c5f63465b992', '5', '19', '1', null, '1', '1', '1', '2019-04-28 10:11:14', '2019-04-29 10:11:14');

-- ----------------------------
-- Table structure for `cms_category`
-- ----------------------------
DROP TABLE IF EXISTS `cms_category`;
CREATE TABLE `cms_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `channel_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_CMS_CATE_REFERENCE_CMS_CHAN` (`channel_id`),
  CONSTRAINT `FK_CMS_CATE_REFERENCE_CMS_CHAN` FOREIGN KEY (`channel_id`) REFERENCES `cms_channel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_category
-- ----------------------------
INSERT INTO `cms_category` VALUES ('1', '互联网', '1');
INSERT INTO `cms_category` VALUES ('2', '软件', '1');
INSERT INTO `cms_category` VALUES ('3', '智能家居', '1');
INSERT INTO `cms_category` VALUES ('4', '虚拟货币', '2');
INSERT INTO `cms_category` VALUES ('5', '股票', '2');
INSERT INTO `cms_category` VALUES ('6', '外汇', '2');
INSERT INTO `cms_category` VALUES ('7', '黄金', '2');
INSERT INTO `cms_category` VALUES ('8', '宏观经济', '2');
INSERT INTO `cms_category` VALUES ('9', '美国', '3');
INSERT INTO `cms_category` VALUES ('10', '亚洲', '3');
INSERT INTO `cms_category` VALUES ('11', '欧洲', '3');
INSERT INTO `cms_category` VALUES ('12', '非洲', '3');
INSERT INTO `cms_category` VALUES ('13', '新车', '4');
INSERT INTO `cms_category` VALUES ('14', 'SUV', '4');
INSERT INTO `cms_category` VALUES ('15', '汽车导购', '4');
INSERT INTO `cms_category` VALUES ('16', '用车', '4');
INSERT INTO `cms_category` VALUES ('17', 'NBA', '5');
INSERT INTO `cms_category` VALUES ('18', 'CBA', '5');
INSERT INTO `cms_category` VALUES ('19', '中超', '5');
INSERT INTO `cms_category` VALUES ('20', '意甲', '5');
INSERT INTO `cms_category` VALUES ('21', '电影', '6');
INSERT INTO `cms_category` VALUES ('22', '电视剧', '6');
INSERT INTO `cms_category` VALUES ('23', '综艺', '6');
INSERT INTO `cms_category` VALUES ('24', '明星八卦', '6');
INSERT INTO `cms_category` VALUES ('25', '段子', '7');
INSERT INTO `cms_category` VALUES ('26', '爆笑节目', '7');
INSERT INTO `cms_category` VALUES ('27', '童趣萌宠', '7');
INSERT INTO `cms_category` VALUES ('28', '雷人囧事', '7');

-- ----------------------------
-- Table structure for `cms_channel`
-- ----------------------------
DROP TABLE IF EXISTS `cms_channel`;
CREATE TABLE `cms_channel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `icon` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_channel
-- ----------------------------
INSERT INTO `cms_channel` VALUES ('1', '科技', null, null);
INSERT INTO `cms_channel` VALUES ('2', '财经', null, null);
INSERT INTO `cms_channel` VALUES ('3', '国际', null, null);
INSERT INTO `cms_channel` VALUES ('4', '汽车', null, null);
INSERT INTO `cms_channel` VALUES ('5', '体育', null, null);
INSERT INTO `cms_channel` VALUES ('6', '娱乐', null, null);
INSERT INTO `cms_channel` VALUES ('7', '搞笑', null, null);
INSERT INTO `cms_channel` VALUES ('8', '游戏', '游戏游戏游戏游戏', null);

-- ----------------------------
-- Table structure for `cms_comment`
-- ----------------------------
DROP TABLE IF EXISTS `cms_comment`;
CREATE TABLE `cms_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `article_id` int(11) DEFAULT NULL,
  `content` text,
  `created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_comment
-- ----------------------------
INSERT INTO `cms_comment` VALUES ('1', '1', '27', '内容内容内容内容内容内容内容内容', '2019-04-29 12:25:26');
INSERT INTO `cms_comment` VALUES ('2', '1', '21', '内容内容内容内容内容内容内容内容22222222222222', '2019-04-29 14:03:59');
INSERT INTO `cms_comment` VALUES ('3', '1', '28', '士大夫发沙发沙发沙发是阿森', '2019-04-29 14:33:02');
INSERT INTO `cms_comment` VALUES ('4', '1', '27', '图库巨化股份吧', '2019-04-29 14:33:26');

-- ----------------------------
-- Table structure for `cms_settings`
-- ----------------------------
DROP TABLE IF EXISTS `cms_settings`;
CREATE TABLE `cms_settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `site_domain` varchar(50) DEFAULT NULL,
  `site_name` varchar(50) DEFAULT NULL,
  `article_list_size` int(11) DEFAULT NULL,
  `slide_size` int(11) DEFAULT NULL,
  `admin_username` varchar(16) DEFAULT NULL,
  `admin_password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_settings
-- ----------------------------

-- ----------------------------
-- Table structure for `cms_slide`
-- ----------------------------
DROP TABLE IF EXISTS `cms_slide`;
CREATE TABLE `cms_slide` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `picture` varchar(50) DEFAULT NULL,
  `url` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_slide
-- ----------------------------

-- ----------------------------
-- Table structure for `cms_user`
-- ----------------------------
DROP TABLE IF EXISTS `cms_user`;
CREATE TABLE `cms_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `locked` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cms_user
-- ----------------------------
INSERT INTO `cms_user` VALUES ('1', 'zhangsan', '123', '新新', '2019-04-23', '1', '1', '2019-04-22 17:15:30', '2019-04-25 21:07:35');
INSERT INTO `cms_user` VALUES ('8', 'zhangsan', '123', '光头强', '2019-04-02', '1', '1', '2019-04-22 17:15:30', '2019-04-25 07:40:42');
INSERT INTO `cms_user` VALUES ('9', 'wangwu', '123', '王五', '2019-04-24', '0', '1', '2019-04-22 17:15:30', '2019-04-24 15:51:41');
INSERT INTO `cms_user` VALUES ('10', '赵六', '123', '田七', '2019-04-16', '0', '0', '2019-04-22 17:15:30', '2019-04-24 11:31:51');
INSERT INTO `cms_user` VALUES ('11', '田七', '123', '田七', '2019-04-16', '1', '1', '2019-04-22 17:15:30', '2019-04-27 14:46:35');
INSERT INTO `cms_user` VALUES ('12', '测试用户1', '123', null, '2019-04-16', '1', '0', '2019-04-22 17:15:30', '2019-04-22 17:15:30');
INSERT INTO `cms_user` VALUES ('13', '测试用户2', null, null, '2019-04-16', '1', '0', '2019-04-22 17:15:30', '2019-04-22 17:15:30');
INSERT INTO `cms_user` VALUES ('14', 'wanger', '123', null, null, '1', null, '2019-04-28 11:24:53', '2019-04-28 11:24:53');
INSERT INTO `cms_user` VALUES ('15', 'wanger', '123', null, null, '1', null, '2019-04-28 11:26:13', '2019-04-28 11:26:13');
INSERT INTO `cms_user` VALUES ('16', 'wanger', '123', null, null, '1', null, '2019-04-28 11:27:16', '2019-04-28 11:27:16');
INSERT INTO `cms_user` VALUES ('17', 'wangsan', '123', null, null, '2', null, '2019-04-28 11:27:53', '2019-04-28 11:27:53');
INSERT INTO `cms_user` VALUES ('18', 'zhaoliu', '123', null, null, '1', null, '2019-04-28 11:39:52', '2019-04-28 11:39:52');
INSERT INTO `cms_user` VALUES ('19', 'tianqi', '123', null, null, '1', null, '2019-04-28 11:40:55', '2019-04-28 11:40:55');
INSERT INTO `cms_user` VALUES ('20', '王八', '456', null, null, '1', null, '2019-04-28 11:46:51', '2019-04-28 11:46:51');
INSERT INTO `cms_user` VALUES ('21', 'aa', '123', null, null, '1', null, '2019-04-28 11:48:41', '2019-04-28 11:48:41');
INSERT INTO `cms_user` VALUES ('22', 'admin', 'admin', null, null, '1', null, null, null);
