package words;

import java.util.HashMap;
import java.util.Map;

public class WordsText
{
    private Map<Integer, String> wordEn = new HashMap<>();
    private Map<Integer, String> wordRu = new HashMap<>();

    public Map<Integer, String> getWordsEn(){
        getStrWordsEn();
        return wordEn;
    }

    public Map<Integer, String> getWordsRu(){
        getStrWordsRu();
        return wordRu;
    }

    private Map<Integer, String> getStrWordsEn(){
        wordEn.put(0,"hi");
        wordEn.put(1,"hello");
        wordEn.put(2,"sorry");
        wordEn.put(3,"please");
        wordEn.put(4,"thank you");
        wordEn.put(5,"you are welcome");
        wordEn.put(6,"what a pity");
        wordEn.put(7,"(good)bye");
        wordEn.put(8,"people");
        wordEn.put(9,"man");
        wordEn.put(10,"woman");
        wordEn.put(11,"child");
        wordEn.put(12,"boy");
        wordEn.put(13,"girl");
        wordEn.put(14,"guy");
        wordEn.put(15,"friend");
        wordEn.put(16,"acquaintance");
        wordEn.put(17,"neighbor");
        wordEn.put(18,"guest");
        wordEn.put(19,"chief");
        wordEn.put(20,"boss");
        wordEn.put(21,"competitor");
        wordEn.put(22,"client");
        wordEn.put(23,"colleague");
        wordEn.put(24,"family ");
        wordEn.put(25,"parents");
        wordEn.put(26,"father");
        wordEn.put(27,"dad(dy)");
        wordEn.put(28,"mother");
        wordEn.put(29,"mum(my)");
        wordEn.put(30,"husband");
        wordEn.put(31,"wife");
        wordEn.put(32,"son");
        wordEn.put(33,"daughter");
        wordEn.put(34,"brother");
        wordEn.put(35,"sister");
        wordEn.put(36,"grandfather");
        wordEn.put(37,"father-in-law");
        wordEn.put(38,"uncle");
        wordEn.put(39,"aunt");
        wordEn.put(40,"cousin");
        wordEn.put(41,"nephew");
        wordEn.put(42,"niece");
        wordEn.put(43,"job");
        wordEn.put(44,"businessman");
        wordEn.put(45,"teacher");
        wordEn.put(46,"driver");
        wordEn.put(47,"worker");
        wordEn.put(48,"engineer");
        wordEn.put(49,"doctor");
        wordEn.put(50,"lawyer");
        wordEn.put(51,"journalist");
        wordEn.put(52,"nurse");
        wordEn.put(53,"shop assistant");
        wordEn.put(54,"waiter");
        wordEn.put(55,"accountant");
        wordEn.put(56,"artist");
        wordEn.put(57,"musician");
        wordEn.put(58,"actor");
        wordEn.put(59,"student");
        wordEn.put(60,"pupil");
        wordEn.put(61,"animal");
        wordEn.put(62,"cat");
        wordEn.put(63,"dog");
        wordEn.put(64,"bird");
        wordEn.put(65,"squirrel");
        wordEn.put(66,"wolf");
        wordEn.put(67,"goose");
        wordEn.put(68,"giraffe");
        wordEn.put(69,"rabbit");
        wordEn.put(70,"cow");
        wordEn.put(71,"rat");
        wordEn.put(72,"fox");
        wordEn.put(73,"horse");
        wordEn.put(74,"frog");
        wordEn.put(75,"bear");
        wordEn.put(76,"mouse");
        wordEn.put(77,"monkey");
        wordEn.put(78,"pig");
        wordEn.put(79,"elephant");
        wordEn.put(80,"duck");
        wordEn.put(81,"country");
        wordEn.put(82,"Russia");
        wordEn.put(83,"Great Britain");
        wordEn.put(84,"England");
        wordEn.put(85,"city");
        wordEn.put(86,"house");
        wordEn.put(87,"home");
        wordEn.put(88,"building");
        wordEn.put(89,"place");
        wordEn.put(90,"entrance");
        wordEn.put(91,"exit");
        wordEn.put(92,"center");
        wordEn.put(93,"yard");
        wordEn.put(94,"roof");
        wordEn.put(95,"fence");
        wordEn.put(96,"land");
        wordEn.put(97,"village");
        wordEn.put(98,"school");
        wordEn.put(99,"university");
        wordEn.put(100,"theater");
        wordEn.put(101,"church");
        wordEn.put(102,"restaurant");
        wordEn.put(103,"cafe");
        wordEn.put(104,"hotel");
        wordEn.put(105,"bank");
        wordEn.put(106,"cinema");
        wordEn.put(107,"hospital");
        wordEn.put(108,"police");
        wordEn.put(109,"post office");
        wordEn.put(110,"station");
        wordEn.put(111,"airport");
        wordEn.put(112,"shop");
        wordEn.put(113,"pharmacy");
        wordEn.put(114,"market");
        wordEn.put(115,"office");
        wordEn.put(116,"company");
        wordEn.put(117,"factory");
        wordEn.put(118,"square");
        wordEn.put(119,"street");
        wordEn.put(120,"road");
        wordEn.put(121,"crossroads");
        wordEn.put(122,"stop");
        wordEn.put(123,"sidewalk");
        wordEn.put(124,"path");
        wordEn.put(125,"garden");
        wordEn.put(126,"park");
        wordEn.put(127,"bridge");
        wordEn.put(128,"river");
        wordEn.put(129,"forest");
        wordEn.put(130,"field");
        wordEn.put(131,"mountain");
        wordEn.put(132,"lake");
        wordEn.put(133,"sea");
        wordEn.put(134,"ocean");
        wordEn.put(135,"coast");
        wordEn.put(136,"beach");
        wordEn.put(137,"sand");
        wordEn.put(138,"island");
        wordEn.put(139,"border");
        wordEn.put(140,"customs");
        wordEn.put(141,"garbage");
        wordEn.put(142,"waste");
        wordEn.put(143,"stone");
        wordEn.put(144,"plant");
        wordEn.put(145,"tree");
        wordEn.put(146,"grass");
        wordEn.put(147,"flower");
        wordEn.put(148,"leaf");
        wordEn.put(149,"flat");
        wordEn.put(150,"room");
        wordEn.put(151,"living room");
        wordEn.put(152,"bedroom");
        wordEn.put(153,"bathroom");
        wordEn.put(154,"shower");
        wordEn.put(155,"toilet");
        wordEn.put(156,"kitchen");
        wordEn.put(157,"hall");
        wordEn.put(158,"balcony");
        wordEn.put(159,"floor");
        wordEn.put(160,"ceiling");
        wordEn.put(161,"wall");
        wordEn.put(162,"stairs");
        wordEn.put(163,"door");
        wordEn.put(164,"window");
        wordEn.put(165,"windowsill");
        wordEn.put(166,"curtain");
        wordEn.put(167,"switch");
        wordEn.put(168,"socket");
        wordEn.put(169,"faucet");
        wordEn.put(170,"pipe");
        wordEn.put(171,"chimney");
        wordEn.put(172,"furniture");
        wordEn.put(173,"table");
        wordEn.put(174,"chair");
        wordEn.put(175,"armchair");
        wordEn.put(176,"sofa");
        wordEn.put(177,"bed");
        wordEn.put(178,"wardrobe");
        wordEn.put(179,"cabinet");
        wordEn.put(180,"shelf");
        wordEn.put(181,"mirror");
        wordEn.put(182,"carpet");
        wordEn.put(183,"fridge");
        wordEn.put(184,"microwave");
        wordEn.put(185,"oven");
        wordEn.put(186,"stove");
        wordEn.put(187,"food");
        wordEn.put(188,"bread");
        wordEn.put(189,"butter");
        wordEn.put(190,"oil");
        wordEn.put(191,"cheese");
        wordEn.put(192,"sausage");
        wordEn.put(193,"ham");
        wordEn.put(194,"meat");
        wordEn.put(195,"beef");
        wordEn.put(196,"pork");
        wordEn.put(197,"lamb");
        wordEn.put(198,"chicken");
        wordEn.put(199,"cutlet");
        wordEn.put(200,"fish");
        wordEn.put(201,"egg");
        wordEn.put(202,"salad");
        wordEn.put(203,"mushroom");
        wordEn.put(204,"corn");
        wordEn.put(205,"porridge");
        wordEn.put(206,"oatmeal");
        wordEn.put(207,"soup");
        wordEn.put(208,"sandwich");
        wordEn.put(209,"rice");
        wordEn.put(210,"noodles");
        wordEn.put(211,"flour");
        wordEn.put(212,"spice");
        wordEn.put(213,"pepper");
        wordEn.put(214,"salt");
        wordEn.put(215,"onion");
        wordEn.put(216,"garlic");
        wordEn.put(217,"sauce");
        wordEn.put(218,"vegetables");
        wordEn.put(219,"potatoes");
        wordEn.put(220,"carrot");
        wordEn.put(221,"beet");
        wordEn.put(222,"tomato");
        wordEn.put(223,"cucumber");
        wordEn.put(224,"cabbage");
        wordEn.put(225,"squash");
        wordEn.put(226,"eggplant");
        wordEn.put(227,"beans");
        wordEn.put(228,"pea");
        wordEn.put(229,"nut");
        wordEn.put(230,"fruit");
        wordEn.put(231,"apple");
        wordEn.put(232,"pear");
        wordEn.put(233,"banana");
        wordEn.put(234,"berry");
        wordEn.put(235,"strawberry");
        wordEn.put(236,"raspberry");
        wordEn.put(237,"cherry");
        wordEn.put(238,"plum");
        wordEn.put(239,"grape");
        wordEn.put(240,"apricot");
        wordEn.put(241,"peach");
        wordEn.put(242,"melon");
        wordEn.put(243,"watermelon");
        wordEn.put(244,"pumpkin");
        wordEn.put(245,"orange");
        wordEn.put(246,"mandarin");
        wordEn.put(247,"lemon");
        wordEn.put(248,"pineapple");
        wordEn.put(249,"sugar");
        wordEn.put(250,"honey");
        wordEn.put(251,"jam");
        wordEn.put(252,"cake");
        wordEn.put(253,"bun");
        wordEn.put(254,"cookie");
        wordEn.put(255,"pie");
        wordEn.put(256,"sweet");
        wordEn.put(257,"ice-cream");
        wordEn.put(258,"chocolate");
        wordEn.put(259,"water");
        wordEn.put(260,"soda");
        wordEn.put(261,"juice");
        wordEn.put(262,"wine");
        wordEn.put(263,"tea");
        wordEn.put(264,"coffee");
        wordEn.put(265,"milk");
        wordEn.put(266,"cream");
        wordEn.put(267,"yogurt");
        wordEn.put(268,"curd");
        wordEn.put(269,"dish ");
        wordEn.put(270,"cup");
        wordEn.put(271,"glass");
        wordEn.put(272,"mug");
        wordEn.put(273,"plate");
        wordEn.put(274,"spoon");
        wordEn.put(275,"fork");
        wordEn.put(276,"knife");
        wordEn.put(277,"saucer");
        wordEn.put(278,"bottle");
        wordEn.put(279,"napkin");
        wordEn.put(280,"pan");
        wordEn.put(281,"frying pan");
        wordEn.put(282,"kettle");
        wordEn.put(283,"meal ");
        wordEn.put(284,"breakfast");
        wordEn.put(285,"lunch");
        wordEn.put(286,"dinner");
        wordEn.put(287,"transport ");
        wordEn.put(288,"plane");
        wordEn.put(289,"car");
        wordEn.put(290,"tram");
        wordEn.put(291,"bus");
        wordEn.put(292,"train");
        wordEn.put(293,"ship");
        wordEn.put(294,"bicycle");
        wordEn.put(295,"time ");
        wordEn.put(296,"minute");
        wordEn.put(297,"hour");
        wordEn.put(298,"week");
        wordEn.put(299,"year");
        wordEn.put(300,"century");
        wordEn.put(301,"the day before yesterday");
        wordEn.put(302,"yesterday");
        wordEn.put(303,"today");
        wordEn.put(304,"tonight");
        wordEn.put(305,"tomorrow");
        wordEn.put(306,"the day after tomorrow");
        wordEn.put(307,"day");
        wordEn.put(308,"morning");
        wordEn.put(309,"afternoon");
        wordEn.put(310,"evening");
        wordEn.put(311,"night");
        wordEn.put(312,"Monday");
        wordEn.put(313,"Tuesday");
        wordEn.put(314,"Wednesday");
        wordEn.put(315,"Thursday");
        wordEn.put(316,"Friday");
        wordEn.put(317,"Saturday");
        wordEn.put(318,"Sunday");
        wordEn.put(319,"month");
        wordEn.put(320,"January");
        wordEn.put(321,"February");
        wordEn.put(322,"March");
        wordEn.put(323,"April");
        wordEn.put(324,"May");
        wordEn.put(325,"June");
        wordEn.put(326,"July");
        wordEn.put(327,"August");
        wordEn.put(328,"September");
        wordEn.put(329,"October");
        wordEn.put(330,"November");
        wordEn.put(331,"December");
        wordEn.put(332,"season");
        wordEn.put(333,"spring");
        wordEn.put(334,"summer");
        wordEn.put(335,"autumn");
        wordEn.put(336,"winter");
        wordEn.put(337,"holiday");
        wordEn.put(338,"Christmas");
        wordEn.put(339,"Easter");
        wordEn.put(340,"birthday");
        wordEn.put(341,"form");
        wordEn.put(342,"name");
        wordEn.put(343,"first name");
        wordEn.put(344,"surname");
        wordEn.put(345,"maiden name");
        wordEn.put(346,"birth date");
        wordEn.put(347,"place of birth");
        wordEn.put(348,"address");
        wordEn.put(349,"marital status");
        wordEn.put(350,"single");
        wordEn.put(351,"married");
        wordEn.put(352,"divorced");
        wordEn.put(353,"widowed");
        wordEn.put(354,"thing");
        wordEn.put(355,"pen");
        wordEn.put(356,"pencil");
        wordEn.put(357,"book");
        wordEn.put(358,"copybook");
        wordEn.put(359,"notebook");
        wordEn.put(360,"note");
        wordEn.put(361,"dictionary");
        wordEn.put(362,"letter");
        wordEn.put(363,"envelope");
        wordEn.put(364,"paper");
        wordEn.put(365,"newspaper");
        wordEn.put(366,"magazine");
        wordEn.put(367,"(tele)phone");
        wordEn.put(368,"clock");
        wordEn.put(369,"comb");
        wordEn.put(370,"TV");
        wordEn.put(371,"iron");
        wordEn.put(372,"soap");
        wordEn.put(373,"radio");
        wordEn.put(374,"bag");
        wordEn.put(375,"backpack");
        wordEn.put(376,"map");
        wordEn.put(377,"card");
        wordEn.put(378,"suitcase");
        wordEn.put(379,"present");
        wordEn.put(380,"camera");
        wordEn.put(381,"vase");
        wordEn.put(382,"handkerchief");
        wordEn.put(383,"ball");
        wordEn.put(384,"balloon");
        wordEn.put(385,"toy");
        wordEn.put(386,"ticket");
        wordEn.put(387,"luggage");
        wordEn.put(388,"battery");
        wordEn.put(389,"bucket");
        wordEn.put(390,"rope");
        wordEn.put(391,"board");
        wordEn.put(392,"calendar");
        wordEn.put(393,"laptop");
        wordEn.put(394,"brush");
        wordEn.put(395,"keyboard");
        wordEn.put(396,"key");
        wordEn.put(397,"wheel");
        wordEn.put(398,"steering wheel");
        wordEn.put(399,"trunk");
        wordEn.put(400,"gas(oline)");
        wordEn.put(401,"purse");
        wordEn.put(402,"wallet");
        wordEn.put(403,"lamp");
        wordEn.put(404,"ruler");
        wordEn.put(405,"shovel");
        wordEn.put(406,"machine");
        wordEn.put(407,"hammer");
        wordEn.put(408,"scissors");
        wordEn.put(409,"glasses");
        wordEn.put(410,"package");
        wordEn.put(411,"stick");
        wordEn.put(412,"glue");
        wordEn.put(413,"gift");
        wordEn.put(414,"towel");
        wordEn.put(415,"mail");
        wordEn.put(416,"wire");
        wordEn.put(417,"page");
        wordEn.put(418,"torch");
        wordEn.put(419,"box");
        wordEn.put(420,"blanket");
        wordEn.put(421,"sheet");
        wordEn.put(422,"pillow");

        return wordEn;
    }

    private Map<Integer, String> getStrWordsRu(){
        wordRu.put(0,"привет");
        wordRu.put(1,"здравствуйте, привет");
        wordRu.put(2,"извини(те)");
        wordRu.put(3,"пожалуйста (прошу); угождать");
        wordRu.put(4,"спасибо");
        wordRu.put(5,"пожалуйста, не за что");
        wordRu.put(6,"как жаль");
        wordRu.put(7,"до свидания");
        wordRu.put(8,"люди");
        wordRu.put(9,"мужчина");
        wordRu.put(10,"женщина");
        wordRu.put(11,"ребенок");
        wordRu.put(12,"мальчик");
        wordRu.put(13,"девочка");
        wordRu.put(14,"парень");
        wordRu.put(15,"друг");
        wordRu.put(16,"знакомый; знакомство");
        wordRu.put(17,"сосед");
        wordRu.put(18,"гость");
        wordRu.put(19,"начальник; шеф; главный; вождь");
        wordRu.put(20,"босс");
        wordRu.put(21,"конкурент, соперник");
        wordRu.put(22,"клиент");
        wordRu.put(23,"коллега");
        wordRu.put(24,"семья");
        wordRu.put(25,"родители");
        wordRu.put(26,"отец");
        wordRu.put(27,"папа");
        wordRu.put(28,"мать");
        wordRu.put(29,"мама");
        wordRu.put(30,"муж");
        wordRu.put(31,"жена");
        wordRu.put(32,"сын");
        wordRu.put(33,"дочь");
        wordRu.put(34,"брат");
        wordRu.put(35,"сестра");
        wordRu.put(36,"дед");
        wordRu.put(37,"тесть, свекор");
        wordRu.put(38,"дядя");
        wordRu.put(39,"тетя");
        wordRu.put(40,"двоюродный брат, двоюродная сестра");
        wordRu.put(41,"племянник");
        wordRu.put(42,"племянница");
        wordRu.put(43,"работа");
        wordRu.put(44,"бизнесмен");
        wordRu.put(45,"учитель");
        wordRu.put(46,"водитель");
        wordRu.put(47,"рабочий");
        wordRu.put(48,"инженер");
        wordRu.put(49,"врач");
        wordRu.put(50,"адвокат, юрист");
        wordRu.put(51,"журналист");
        wordRu.put(52,"медсестра");
        wordRu.put(53,"продавец");
        wordRu.put(54,"официант");
        wordRu.put(55,"бухгалтер");
        wordRu.put(56,"художник");
        wordRu.put(57,"музыкант");
        wordRu.put(58,"актер");
        wordRu.put(59,"студент");
        wordRu.put(60,"школьник, ученик");
        wordRu.put(61,"животное");
        wordRu.put(62,"кошка");
        wordRu.put(63,"собака");
        wordRu.put(64,"птица");
        wordRu.put(65,"белка");
        wordRu.put(66,"волк");
        wordRu.put(67,"гусь");
        wordRu.put(68,"жираф");
        wordRu.put(69,"кролик; заяц");
        wordRu.put(70,"корова");
        wordRu.put(71,"крыса");
        wordRu.put(72,"лиса");
        wordRu.put(73,"лошадь");
        wordRu.put(74,"лягушка");
        wordRu.put(75,"медведь");
        wordRu.put(76,"мышь");
        wordRu.put(77,"обезьяна");
        wordRu.put(78,"свинья");
        wordRu.put(79,"слон");
        wordRu.put(80,"утка");
        wordRu.put(81,"страна; сельская местность");
        wordRu.put(82,"Россия");
        wordRu.put(83,"Великобритания");
        wordRu.put(84,"Англия");
        wordRu.put(85,"город");
        wordRu.put(86,"дом (здание)");
        wordRu.put(87,"дом (место проживания)");
        wordRu.put(88,"здание; строительство");
        wordRu.put(89,"место; помещать");
        wordRu.put(90,"вход");
        wordRu.put(91,"выход");
        wordRu.put(92,"центр");
        wordRu.put(93,"двор");
        wordRu.put(94,"крыша");
        wordRu.put(95,"забор");
        wordRu.put(96,"земля, участок");
        wordRu.put(97,"деревня, поселок");
        wordRu.put(98,"школа");
        wordRu.put(99,"университет");
        wordRu.put(100,"театр");
        wordRu.put(101,"церковь");
        wordRu.put(102,"ресторан");
        wordRu.put(103,"кафе");
        wordRu.put(104,"гостиница");
        wordRu.put(105,"банк");
        wordRu.put(106,"кинотеатр");
        wordRu.put(107,"больница");
        wordRu.put(108,"полиция");
        wordRu.put(109,"почта");
        wordRu.put(110,"станция, вокзал");
        wordRu.put(111,"аэропорт");
        wordRu.put(112,"магазин");
        wordRu.put(113,"аптека");
        wordRu.put(114,"рынок");
        wordRu.put(115,"офис");
        wordRu.put(116,"компания, фирма");
        wordRu.put(117,"предприятие, завод, фабрика");
        wordRu.put(118,"площадь");
        wordRu.put(119,"улица");
        wordRu.put(120,"дорога");
        wordRu.put(121,"перекрёсток");
        wordRu.put(122,"остановка; останавливаться");
        wordRu.put(123,"тротуар");
        wordRu.put(124,"тропа, тропинка");
        wordRu.put(125,"сад");
        wordRu.put(126,"парк");
        wordRu.put(127,"мост");
        wordRu.put(128,"река");
        wordRu.put(129,"лес");
        wordRu.put(130,"поле");
        wordRu.put(131,"гора");
        wordRu.put(132,"озеро");
        wordRu.put(133,"море");
        wordRu.put(134,"океан");
        wordRu.put(135,"морской берег, побережье");
        wordRu.put(136,"пляж");
        wordRu.put(137,"песок");
        wordRu.put(138,"остров");
        wordRu.put(139,"граница");
        wordRu.put(140,"таможня");
        wordRu.put(141,"мусор");
        wordRu.put(142,"отходы; тратить впустую");
        wordRu.put(143,"камень");
        wordRu.put(144,"растение; завод; сажать");
        wordRu.put(145,"дерево");
        wordRu.put(146,"трава");
        wordRu.put(147,"цветок");
        wordRu.put(148,"лист (дерева)");
        wordRu.put(149,"квартира");
        wordRu.put(150,"комната");
        wordRu.put(151,"зал");
        wordRu.put(152,"спальня");
        wordRu.put(153,"ванная");
        wordRu.put(154,"душ");
        wordRu.put(155,"туалет");
        wordRu.put(156,"кухня");
        wordRu.put(157,"коридор");
        wordRu.put(158,"балкон");
        wordRu.put(159,"пол; этаж");
        wordRu.put(160,"потолок");
        wordRu.put(161,"стена");
        wordRu.put(162,"ступеньки; лестница");
        wordRu.put(163,"дверь");
        wordRu.put(164,"окно");
        wordRu.put(165,"подоконник");
        wordRu.put(166,"занавес(ка), штора");
        wordRu.put(167,"выключатель; переключать");
        wordRu.put(168,"розетка");
        wordRu.put(169,"(водопроводный) кран");
        wordRu.put(170,"труба; трубка");
        wordRu.put(171,"дымовая труба");
        wordRu.put(172,"мебель");
        wordRu.put(173,"стол");
        wordRu.put(174,"стул");
        wordRu.put(175,"кресло");
        wordRu.put(176,"диван");
        wordRu.put(177,"кровать");
        wordRu.put(178,"(платяной) шкаф");
        wordRu.put(179,"шкаф(чик)");
        wordRu.put(180,"полка");
        wordRu.put(181,"зеркало");
        wordRu.put(182,"ковер");
        wordRu.put(183,"холодильник");
        wordRu.put(184,"микроволновка");
        wordRu.put(185,"печь, духовка");
        wordRu.put(186,"кухонная плита");
        wordRu.put(187,"еда");
        wordRu.put(188,"хлеб");
        wordRu.put(189,"масло");
        wordRu.put(190,"растительное масло; нефть");
        wordRu.put(191,"сыр");
        wordRu.put(192,"колбаса, сосиска");
        wordRu.put(193,"ветчина");
        wordRu.put(194,"мясо");
        wordRu.put(195,"говядина");
        wordRu.put(196,"свинина");
        wordRu.put(197,"баранина; ягненок");
        wordRu.put(198,"цыпленок; курица");
        wordRu.put(199,"котлета");
        wordRu.put(200,"рыба; рыбачить");
        wordRu.put(201,"яйцо");
        wordRu.put(202,"салат");
        wordRu.put(203,"гриб");
        wordRu.put(204,"кукуруза; зерно");
        wordRu.put(205,"каша");
        wordRu.put(206,"овсянка");
        wordRu.put(207,"суп");
        wordRu.put(208,"бутерброд");
        wordRu.put(209,"рис");
        wordRu.put(210,"лапша");
        wordRu.put(211,"мука");
        wordRu.put(212,"специя, пряность");
        wordRu.put(213,"перец; поперчить");
        wordRu.put(214,"соль; посолить");
        wordRu.put(215,"лук (репчатый)");
        wordRu.put(216,"чеснок");
        wordRu.put(217,"соус");
        wordRu.put(218,"овощи");
        wordRu.put(219,"картофель");
        wordRu.put(220,"морковь");
        wordRu.put(221,"свекла");
        wordRu.put(222,"помидор");
        wordRu.put(223,"огурец");
        wordRu.put(224,"капуста");
        wordRu.put(225,"кабачок");
        wordRu.put(226,"баклажан");
        wordRu.put(227," бобы");
        wordRu.put(228,"горох");
        wordRu.put(229,"орех");
        wordRu.put(230,"фрукт(ы); плод");
        wordRu.put(231,"яблоко");
        wordRu.put(232,"груша");
        wordRu.put(233,"банан");
        wordRu.put(234,"ягода");
        wordRu.put(235,"клубника, земляника");
        wordRu.put(236,"малина");
        wordRu.put(237,"вишня");
        wordRu.put(238,"слива");
        wordRu.put(239,"виноград");
        wordRu.put(240,"абрикос");
        wordRu.put(241,"персик");
        wordRu.put(242,"дыня");
        wordRu.put(243,"арбуз");
        wordRu.put(244,"тыква");
        wordRu.put(245,"апельсин; оранжевый");
        wordRu.put(246,"мандарин");
        wordRu.put(247,"лимон");
        wordRu.put(248,"ананас");
        wordRu.put(249,"сахар");
        wordRu.put(250,"мёд");
        wordRu.put(251,"варенье");
        wordRu.put(252,"торт");
        wordRu.put(253,"булочка");
        wordRu.put(254,"печенье");
        wordRu.put(255,"пирог, пирожок");
        wordRu.put(256,"конфета; сладкий");
        wordRu.put(257,"мороженое");
        wordRu.put(258,"шоколад");
        wordRu.put(259,"вода; поливать");
        wordRu.put(260,"газировка");
        wordRu.put(261,"сок");
        wordRu.put(262,"вино");
        wordRu.put(263,"чай");
        wordRu.put(264,"кофе");
        wordRu.put(265,"молоко");
        wordRu.put(266,"сливки; крем");
        wordRu.put(267,"йогурт");
        wordRu.put(268,"творог");
        wordRu.put(269,"блюдо  ");
        wordRu.put(270," чашка");
        wordRu.put(271,"стакан; стекло");
        wordRu.put(272,"кружка");
        wordRu.put(273,"тарелка");
        wordRu.put(274,"ложка");
        wordRu.put(275,"вилка");
        wordRu.put(276,"нож");
        wordRu.put(277,"блюдце");
        wordRu.put(278,"бутылка");
        wordRu.put(279,"салфетка");
        wordRu.put(280,"кастрюля");
        wordRu.put(281,"сковородка");
        wordRu.put(282,"чайник; котел");
        wordRu.put(283,"принятие пищи, еда");
        wordRu.put(284,"завтрак");
        wordRu.put(285,"обед");
        wordRu.put(286,"ужин");
        wordRu.put(287,"транспорт");
        wordRu.put(288,"самолет");
        wordRu.put(289,"автомобиль");
        wordRu.put(290,"трамвай");
        wordRu.put(291,"автобус");
        wordRu.put(292,"поезд");
        wordRu.put(293,"корабль");
        wordRu.put(294,"велосипед");
        wordRu.put(295,"время; раз");
        wordRu.put(296,"минута");
        wordRu.put(297,"час");
        wordRu.put(298,"неделя");
        wordRu.put(299,"год");
        wordRu.put(300,"век, столетие");
        wordRu.put(301,"позавчера");
        wordRu.put(302,"вчера");
        wordRu.put(303,"сегодня (днем)");
        wordRu.put(304,"сегодня вечером (ночью)");
        wordRu.put(305,"завтра");
        wordRu.put(306,"послезавтра");
        wordRu.put(307,"день");
        wordRu.put(308,"утро");
        wordRu.put(309,"день (после полудня)");
        wordRu.put(310,"вечер");
        wordRu.put(311,"ночь");
        wordRu.put(312,"понедельник");
        wordRu.put(313,"вторник");
        wordRu.put(314,"среда");
        wordRu.put(315,"четверг");
        wordRu.put(316,"пятница");
        wordRu.put(317,"суббота");
        wordRu.put(318,"воскресенье");
        wordRu.put(319,"месяц");
        wordRu.put(320,"январь");
        wordRu.put(321,"февраль");
        wordRu.put(322,"март");
        wordRu.put(323,"апрель");
        wordRu.put(324,"май");
        wordRu.put(325,"июнь");
        wordRu.put(326,"июль");
        wordRu.put(327,"август");
        wordRu.put(328,"сентябрь");
        wordRu.put(329,"октябрь");
        wordRu.put(330,"ноябрь");
        wordRu.put(331,"декабрь");
        wordRu.put(332,"время года; сезон");
        wordRu.put(333,"весна");
        wordRu.put(334,"лето");
        wordRu.put(335,"осень");
        wordRu.put(336,"зима");
        wordRu.put(337,"праздник; отпуск; каникулы");
        wordRu.put(338,"Рождество");
        wordRu.put(339,"Пасха");
        wordRu.put(340,"день рождения");
        wordRu.put(341,"анкета; форма; бланк; класс; формировать, образовывать");
        wordRu.put(342,"имя, фамилия; название; называть");
        wordRu.put(343,"имя");
        wordRu.put(344,"фамилия");
        wordRu.put(345,"девичья фамилия");
        wordRu.put(346,"дата рождения");
        wordRu.put(347,"место рождения");
        wordRu.put(348,"адрес");
        wordRu.put(349,"семейное положение");
        wordRu.put(350,"холостой, незамужняя; один(окий); в один конец (о билете)");
        wordRu.put(351,"женатый/замужняя");
        wordRu.put(352,"разведенный");
        wordRu.put(353,"овдовевший");
        wordRu.put(354,"вещь");
        wordRu.put(355,"ручка");
        wordRu.put(356,"карандаш");
        wordRu.put(357,"книга");
        wordRu.put(358,"тетрадь");
        wordRu.put(359,"блокнот");
        wordRu.put(360,"записка, запись");
        wordRu.put(361,"словарь");
        wordRu.put(362,"письмо; буква");
        wordRu.put(363,"конверт");
        wordRu.put(364,"бумага");
        wordRu.put(365,"газета");
        wordRu.put(366,"журнал");
        wordRu.put(367,"телефон; разговаривать по телефону");
        wordRu.put(368,"часы");
        wordRu.put(369,"расчёска; расчесывать");
        wordRu.put(370,"телевизор");
        wordRu.put(371,"утюг; железо; гладить (утюгом)");
        wordRu.put(372,"мыло; намыливать");
        wordRu.put(373,"радио");
        wordRu.put(374,"сумка");
        wordRu.put(375,"рюкзак");
        wordRu.put(376,"карта (географическая)");
        wordRu.put(377,"открытка; карта (игральная); карточка");
        wordRu.put(378,"чемодан");
        wordRu.put(379,"подарок");
        wordRu.put(380,"фотоаппарат; видеокамера");
        wordRu.put(381,"ваза");
        wordRu.put(382,"носовой платок");
        wordRu.put(383,"мяч");
        wordRu.put(384,"воздушный шар(ик)");
        wordRu.put(385,"игрушка");
        wordRu.put(386,"билет");
        wordRu.put(387,"багаж");
        wordRu.put(388,"батарейка, аккумулятор");
        wordRu.put(389,"ведро");
        wordRu.put(390,"веревка");
        wordRu.put(391,"доска; борт; совет (правление)");
        wordRu.put(392,"календарь");
        wordRu.put(393,"ноутбук");
        wordRu.put(394,"щетка; кисть, кисточка; чистить щеткой");
        wordRu.put(395,"клавиатура");
        wordRu.put(396,"ключ; клавиша");
        wordRu.put(397,"колесо");
        wordRu.put(398,"руль");
        wordRu.put(399,"багажник; ствол; хобот");
        wordRu.put(400,"бензин");
        wordRu.put(401,"дамская сумка; кошелек");
        wordRu.put(402,"бумажник");
        wordRu.put(403,"лампа");
        wordRu.put(404,"линейка; правитель");
        wordRu.put(405,"лопата; рыть");
        wordRu.put(406,"машина; механизм; аппарат; станок");
        wordRu.put(407,"молоток; вбивать молотком");
        wordRu.put(408,"ножницы");
        wordRu.put(409,"очки");
        wordRu.put(410,"посылка; упаковка");
        wordRu.put(411,"палка; придерживаться; втыкать");
        wordRu.put(412,"клей; приклеивать");
        wordRu.put(413,"подарок; дар");
        wordRu.put(414,"полотенце");
        wordRu.put(415,"почта (корреспонденция); отправлять по почте");
        wordRu.put(416,"проволока; провод");
        wordRu.put(417,"страница");
        wordRu.put(418,"карманный фонарь; горелка; факел");
        wordRu.put(419,"коробка, ящик; боксировать");
        wordRu.put(420,"одеяло");
        wordRu.put(421,"простыня; лист(ок)");
        wordRu.put(422,"подушка");

        return wordRu;
    }
}