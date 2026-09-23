package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE I — GENÈSE ET FONDATION D'AJ-TECH
 * Chapitres 1 à 12
 */
object Part1Data {

    val part1: BookPart = BookPart(
        id = "part_1",
        partNumber = 1,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE I — GENÈSE ET FONDATION D'AJ-TECH",
        titleHt = "PATI I — JENÈZ AK FONDASYON AJ-TECH",
        subtitleFr = "De l'apprentissage autodidacte à la création d'une vision technologique pour Haïti",
        subtitleHt = "Soti nan aprantisaj poukont li rive nan kreyasyon yon vizyon teknolojik pou Ayiti",
        plannedPages = "pp. 15–30 (Pagination provisoire — à confirmer lors de la mise en page finale)",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            BookChapter(
                id = "ch_1_1",
                chapterNumber = 1,
                partId = "part_1",
                titleFr = "Chapitre 1 — Le point de départ",
                titleHt = "Chapit 1 — Pwen depa a",
                subtitleFr = "Prendre conscience de la réalité et refuser la fatalité",
                subtitleHt = "Pran konsyans sou reyalite a epi refize bese bra",
                summaryFr = "Introduction sur le contexte d'émergence d'une idée technologique à Port-au-Prince au milieu des défis quotidiens.",
                summaryHt = "Entwodiksyon sou fason lide teknolojik la te kòmanse nan Pòtoprens nan mitan tout defi chak jou yo.",
                contentFr = """
                    Tout grand projet commence par un constat lucide. À Port-au-Prince, la réalité quotidienne impose des défis permanents : instabilité de l'énergie électrique, accès restreint et coûteux aux connexions Internet haut débit, et dépendance quasi-totale envers des solutions logicielles conçues à l'étranger.
                    
                    Face à cette situation, deux attitudes sont possibles : attendre passivement que les conditions idéales se présentent, ou décider de commencer là où l'on se trouve, avec ce que l'on a. Le point de départ d'AJ-TECH n'a pas été une abondance de capitaux ni un laboratoire de recherche sophistiqué, mais la conviction inébranlable que la technologie représente le levier le plus puissant pour transformer notre avenir et briser le cycle de la dépendance.
                """.trimIndent(),
                contentHt = """
                    Nenpòt gwo pwojè kòmanse ak yon analiz klè sou reyalite a. Nan Pòtoprens, lavi chak jou pote anpil defi : kouran ki pa estab, entènèt ki difisil pou jwenn epi ki koute chè, ak yon depandans prèske total sou lojisyèl ki fèt lòt bò dlo.
                    
                    Devan sitiyasyon sa a, gen de chwa : rete tann tout bagay vin pafè, oswa deside kòmanse kote w ye a, ak sa w gen nan men w. Pwen depa AJ-TECH pa t chita sou gwo lajan ni sou gwo biwo modèn, men sou yon konviksyon solid : teknoloji se pi gwo zouti ki ka transfòme lavni nou epi kraze chenn depandans lan.
                """.trimIndent(),
                plannedStartPage = 15,
                plannedEndPage = 16,
                estimatedReadMinutes = 4,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_2",
                chapterNumber = 2,
                partId = "part_1",
                titleFr = "Chapitre 2 — Le parcours de Jonathan Germain",
                titleHt = "Chapit 2 — Pakou Jonathan Germain",
                subtitleFr = "De la technique douanière à l'apprentissage autodidacte du code",
                subtitleHt = "Soti nan teknik dwayèn rive nan aprantisaj kòd poukont li",
                summaryFr = "Repères biographiques de Jonathan Germain, né le 12 octobre 1991 à Port-au-Prince, et sa trajectoire de formation pluridisciplinaire.",
                summaryHt = "Enfòmasyon sou lavi Jonathan Germain, ki fèt 12 oktòb 1991 nan Pòtoprens, ak divès etap fòmasyon li te swiv.",
                contentFr = """
                    Né le 12 octobre 1991 à Port-au-Prince, Haïti, Jonathan Germain grandit au contact des réalités urbaines du pays. Très tôt, une soif de comprendre et de bâtir l'anime. Son parcours de formation témoigne d'une volonté constante d'élargir ses compétences dans des domaines complémentaires :
                    - La Technique Douanière, lui offrant une rigueur analytique et une compréhension approfondie des flux commerciaux et réglementaires ;
                    - L'Informatique bureautique et la Technique réseau, lui apportant les fondations indispensables de l'infrastructure informatique et de la connectivité ;
                    - La maîtrise de l'Anglais, ouvrant l'accès direct à la documentation technique mondiale ;
                    - Le développement web en ligne et l'apprentissage autodidacte de la programmation.
                    
                    Ce parcours atypique forge chez lui une double compétence : la compréhension pratique des besoins concrets du terrain et la maîtrise progressive des outils numériques modernes.
                """.trimIndent(),
                contentHt = """
                    Jonathan Germain fèt 12 oktòb 1991 nan Pòtoprens, Ayiti. Depi li jèn, li te gen yon gwo anvi pou l konprann epi bati bagay ki util. Pakou fòmasyon li montre volonte li te toujou genyen pou l aprann nan divès domèn enpòtan :
                    - Teknik Dwayèn (Technique Douanière), ki ba li bonjan disiplin ak konpreyansyon sou kijan komès ak administrasyon fonksyone ;
                    - Enfòmatik biwo (Bureautique) ak Teknik Rezo (Technique réseau), ki te ba li baz fondamantal sou sistèm ak koneksyon enfòmatik ;
                    - Aprann pale Angle, sa ki te louvri pòt pou l li tout dokimantasyon teknik sou entènèt la dirèkteman ;
                    - Devlopman web sou entènèt ak aprantisaj kòd poukont li (autodidacte).
                    
                    Pakou sa a te pèmèt li gen yon vizyon laj : konprann bezwen reyèl sosyete a epi metrize zouti nimerik yo etap pa etap.
                """.trimIndent(),
                plannedStartPage = 16,
                plannedEndPage = 17,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_3",
                chapterNumber = 3,
                partId = "part_1",
                titleFr = "Chapitre 3 — Apprendre avec des ressources limitées",
                titleHt = "Chapit 3 — Aprann ak mwayen limite",
                subtitleFr = "Surmonter les obstacles techniques, financiers et matériels",
                subtitleHt = "Pase sou tout baryè teknik, lajan ak mank materyèl",
                summaryFr = "Témoignage authentique sur l'apprentissage de la programmation face aux contraintes de connectivité, d'énergie et de budget.",
                summaryHt = "Temwayaj sensè sou kijan pou aprann pwograme lè gen pwoblèm entènèt, kouran ak mank mwayen finansyè.",
                contentFr = """
                    Apprendre à développer des applications en Haïti relève souvent du parcours du combattant. Jonathan Germain fait face aux réalités que partagent des milliers de jeunes Haïtiens : connexions Internet instables et limitées en données, coupures d'électricité récurrentes, et ressources financières insuffisantes pour s'offrir des formations privées onéreuses, des ordinateurs haut de gamme ou des abonnements payants à certains logiciels et services d'intelligence artificielle.
                    
                    Loin d'être un frein définitif, ces limitations deviennent une école de discipline et de résilience. Chaque heure de connexion est optimisée, chaque tutoriel téléchargé est étudié avec minutie. L'important était d'avoir des idées claires, une vision forte et la volonté inébranlable de continuer à apprendre jour après jour, en tirant le meilleur parti de chaque ressource disponible.
                """.trimIndent(),
                contentHt = """
                    Aprann pwogramasyon an Ayiti se yon gwo batay chak jou. Jonathan Germain te viv menm reyalite ak plizyè milye jèn ayisyen : entènèt ki koupe souvan epi ki chè, kouran ki pa la tout tan, ak mank mwayen finansyè pou peye gwo inivèsite, achte òdinatè chè oswa peye abònman lojisyèl ak zouti entèlijans atifisyèl.
                    
                    Olye pou difikilte sa yo te dekouraje l, yo te vin tounen yon lekòl pasyans ak detèminasyon. Chak minit entènèt li te jwenn te sèvi pou telechaje dokiman ak videyo li te etidye byen fon. Sa k te pi enpòtan, se te gen lide klè, yon gwo vizyon nan tèt li ak volonte pou l pa janm sispann aprann, pandan l ap byen sèvi ak ti mwayen li te gen nan men l.
                """.trimIndent(),
                plannedStartPage = 17,
                plannedEndPage = 18,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_4",
                chapterNumber = 4,
                partId = "part_1",
                titleFr = "Chapitre 4 — La technologie comme opportunité",
                titleHt = "Chapit 4 — Teknoloji kòm yon gwo chans",
                subtitleFr = "L'émergence de l'IA et le saut technologique pour les pays émergents",
                subtitleHt = "Avansman IA ak chans pou peyi k ap devlope yo fè yon gwo pa an avan",
                summaryFr = "Comment l'intelligence artificielle et les standards web modernes permettent de démocratiser la création de logiciels.",
                summaryHt = "Kijan entèlijans atifisyèl ak teknoloji web modèn pèmèt nenpòt moun ki motive kreye lojisyèl util.",
                contentFr = """
                    L'avènement des outils d'intelligence artificielle et l'évolution des technologies web modernes comme les PWA (Progressive Web Apps) ont redéfini les règles du jeu technologique mondial. Pour un développeur autodidacte disposant de moyens limités, l'IA est devenue un tuteur permanent, un accélérateur de prototypage et un partenaire de réflexion architecturale.
                    
                    Grâce à l'utilisation progressive et méthodique de ces outils d'intelligence artificielle, Jonathan Germain a pu concevoir des sites web interactifs et prototyper ses premières applications web progressives. Cette expérience a confirmé une intuition fondamentale : la technologie offre aux pays émergents une opportunité historique de réaliser un véritable saut qualitatif, en contournant les infrastructures lourdes du passé pour bâtir directement des solutions modernes et légères.
                """.trimIndent(),
                contentHt = """
                    Arive zouti entèlijans atifisyèl yo ak evolisyon teknoloji web modèn tankou PWA (Progressive Web Apps) chanje fason mond lan travay. Pou yon devlopè ki aprann poukont li ak ti mwayen, IA vin tounen yon pwofesè ki la 24 sou 24, yon zouti pou teste lide byen vit epi ede nan estrikti kòd la.
                    
                    Gras ak itilizasyon entèlijan zouti IA sa yo, Jonathan Germain te kòmanse kreye sit web epi devlope premye pwototip aplikasyon PWA li yo. Eksperyans sa a te konfime yon verite fondamantal : teknoloji bay peyi tankou Ayiti yon gwo chans pou fè yon gwo pa an avan, san nou pa bezwen pase nan vye metòd lontan yo, pou nou bati dirèkteman solisyon modèn ki lejè e efikas.
                """.trimIndent(),
                plannedStartPage = 19,
                plannedEndPage = 20,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_5",
                chapterNumber = 5,
                partId = "part_1",
                titleFr = "Chapitre 5 — La naissance de l'idée AJ-TECH",
                titleHt = "Chapit 5 — Kouman lide AJ-TECH la te fèt",
                subtitleFr = "Transformer les contraintes du quotidien en principes de conception logicielle",
                subtitleHt = "Transfòme tout difikilte an prensip pou kreye bonjan lojisyèl",
                summaryFr = "De la conception d'un premier outil de productivité à la vision d'un écosystème logiciel interconnecté et résilient.",
                summaryHt = "Soti nan premye zouti jesyon travay rive nan lide pou kreye yon gwo ekosistèm nimerik kote tout lojisyèl konekte.",
                contentFr = """
                    L'idée d'AJ-TECH n'est pas née d'une spéculation abstraite, mais de l'observation quotidienne des dysfonctionnements locaux. Si une application cesse de fonctionner dès que la connexion Internet faiblit, elle est inutilisable pour la majorité de la population haïtienne. Si un service nécessite des serveurs coûteux et distants, il reste vulnérable et hors de portée.
                    
                    C'est ainsi qu'a germé l'idée directrice : concevoir un écosystème de solutions numériques pensées dès la première ligne de code pour fonctionner dans des conditions dégradées (approche Offline-First). L'expérience acquise sur le premier projet, AJ-Task, a servi de laboratoire d'expérimentation pour tester ces principes. L'ambition initiale d'un simple projet de développement s'est alors élargie pour devenir une initiative globale : AJ-TECH.
                """.trimIndent(),
                contentHt = """
                    Lide AJ-TECH la pa t soti nan teyori san sans, men nan gade reyalite chak jou nan peyi a. Si yon aplikasyon bloke kou entènèt la koupe, li pa ka sèvi majorite pèp ayisyen an. Si yon sèvis mande gwo sèvè ki koute twò chè lòt bò dlo, l ap toujou rete frajil epi pifò moun p ap ka jwenn li.
                    
                    Se konsa lide fondamantal la te pran nesans : kreye yon ekosistèm zouti nimerik ki fèt depi nan premye liy kòd pou mache menm lè pa gen entènèt (metòd Offline-First). Eksperyans sou premye pwojè a, AJ-Task, te sèvi kòm yon espas tès pou verifye prensip sa yo. Ti kras pa ti kras, senp lide pèsonèl la te transfòme pou vin tounen yon gwo pwojè nasyonal : AJ-TECH.
                """.trimIndent(),
                plannedStartPage = 20,
                plannedEndPage = 21,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_6",
                chapterNumber = 6,
                partId = "part_1",
                titleFr = "Chapitre 6 — La création officielle d'AJ-TECH en 2025",
                titleHt = "Chapit 6 — Kreyasyon ofisyèl AJ-TECH an 2025",
                subtitleFr = "L'acte de naissance à Port-au-Prince et les premiers jalons institutionnels",
                subtitleHt = "Nesans antrepriz la nan Pòtoprens ak premye etap ofisyèl yo",
                summaryFr = "Création officielle d'AJ-TECH à Port-au-Prince en 2025, marquant le passage de la phase exploratoire à la structuration formelle.",
                summaryHt = "Kreyasyon ofisyèl AJ-TECH nan Pòtoprens an 2025, ki make etap kote pwojè a soti nan lide pou vin yon estrikti fòmèl.",
                contentFr = """
                    En 2025, l'initiative franchit une étape décisive avec la création officielle d'AJ-TECH à Port-au-Prince, Haïti. Cet acte fondateur marque le passage d'une démarche d'apprentissage individuel à un projet d'entreprise structuré, porteur d'une responsabilité publique et d'une vision à long terme.
                    
                    Dès sa création, AJ-TECH établit sa présence numérique initiale : le déploiement d'un premier site web institutionnel (en cours d'évolution continue), la création des comptes officiels sur les principaux réseaux sociaux pour dialoguer avec le public, et la formalisation de son slogan officiel : « Vision, Technologie et Avenir ». La création en 2025 pose le socle juridique, moral et technique sur lequel l'édifice des années suivantes sera méthodiquement érigé.
                """.trimIndent(),
                contentHt = """
                    Nan lane 2025, pwojè a te franchi yon gwo etap ak kreyasyon ofisyèl AJ-TECH nan Pòtoprens, Ayiti. Desizyon sa a te make moman kote inisyativ la te kite nivo senp aprantisaj pèsonèl pou vin tounen yon vrè antrepriz òganize, ak responsablite devan sosyete a ak yon vizyon pou alafen.
                    
                    Depi lè li te kreye a, AJ-TECH te kòmanse poze premye baz li sou entènèt : yon premye sit web ofisyèl (k ap amelyore chak jou), paj sou rezo sosyal yo pou kominike ak piblik la, epi chwa deviz ofisyèl li : « Vision, Technologie et Avenir » (Vizyon, Teknoloji ak Lavni). Fondasyon an 2025 se te wòch premye sou plan legal, moral ak teknik pou bati tout rès pwojè a.
                """.trimIndent(),
                plannedStartPage = 21,
                plannedEndPage = 22,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_7",
                chapterNumber = 7,
                partId = "part_1",
                titleFr = "Chapitre 7 — Une entreprise ambitieuse en construction",
                titleHt = "Chapit 7 — Yon antrepriz anbisye k ap konstwi",
                subtitleFr = "La vérité sur notre stade de développement et le devoir de transparence",
                subtitleHt = "Verite sou nivo devlopman nou ak obligasyon pou nou klè ak tout moun",
                summaryFr = "Présentation transparente de l'état d'avancement d'AJ-TECH : prototypes, tests pilotes d'AJ-Task, identité visuelle en maturation et absence de commercialisation prématurée.",
                summaryHt = "Prezantasyon transparan sou nivo AJ-TECH ye jodi a : pwototip, tès sou AJ-Task, idantite vizyèl k ap prepare, san manti ni fo pwomès.",
                contentFr = """
                    La philosophie d'AJ-TECH repose sur un impératif d'honnêteté rigoureuse : nous sommes une entreprise ambitieuse en construction qui documente fidèlement son cheminement vers le sommet. Il est primordial de nommer les choses avec exactitude :
                    - Aucun produit d'AJ-TECH n'est actuellement présenté comme officiellement commercialisé ;
                    - Le produit le plus avancé à ce jour est AJ-Task, développé sous forme de PWA (Progressive Web App) et actuellement en phase de test pilote restreint auprès d'utilisateurs pionniers ;
                    - Plusieurs autres concepts et prototypes ont été manipulés expérimentalement par des membres de notre entourage technique pour éprouver les flux ;
                    - Notre site web officiel et notre identité visuelle globale demeurent en phase de consolidation et ne sont pas encore figés dans leur version définitive ;
                    - Les autres entités de l'écosystème sont clairement réparties entre les statuts de concept, de projet en développement ou de brique planifiée pour les phases futures.
                    
                    Cette clarté n'est pas une réserve, mais le gage de notre sérieux et de notre crédibilité.
                """.trimIndent(),
                contentHt = """
                    Filozofi AJ-TECH chita sou yon prensip verite ak transparans total : nou se yon antrepriz ki gen gwo anbisyon men ki nan faz konstriksyon, epi k ap dokimante tout vwayaj li avèk franchiz. Li enpòtan pou nou di tout bagay jan yo ye a :
                    - Okenn pwodwi AJ-TECH poko sou mache kòm yon pwodwi ki fini nèt pou vann ;
                    - Pwodwi ki pi avanse jounen jodi a se AJ-Task, ki devlope sou fòm PWA (Progressive Web App) epi ki nan faz tès pilòt ak kèk premye itilizatè ;
                    - Kèk lòt pwototip ak lide te teste sou fòm eksperyans pou gade kijan yo reponn ;
                    - Sit web ofisyèl nou an ak tout idantite vizyèl nou an ap kontinye amelyore epi yo poko definitif ;
                    - Lòt pwojè nan ekosistèm nan klase aklè ant lide (konsèp), pwojè k ap devlope, oswa brik ki planifye pou ane k ap vini yo.
                    
                    Transparans sa a se pa yon feblès, se prèv respè nou genyen pou piblik la ak garanti serye travay n ap fè a.
                """.trimIndent(),
                plannedStartPage = 23,
                plannedEndPage = 24,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_8",
                chapterNumber = 8,
                partId = "part_1",
                titleFr = "Chapitre 8 — De l'ambition personnelle à une vision collective",
                titleHt = "Chapit 8 — Soti nan anbisyon pèsonèl rive nan yon vizyon kolektif",
                subtitleFr = "Fédérer les compétences et dépasser la trajectoire individuelle",
                subtitleHt = "Rasanble tout talan epi depase nivo yon sèl moun",
                summaryFr = "Comment l'aspiration individuelle à programmer est devenue un projet fédérateur pour la jeunesse haïtienne et la diaspora.",
                summaryHt = "Kijan volonte yon sèl devlopè te vin tounen yon kòz pou rasanble jèn ayisyen ak dyaspora a tout kote.",
                contentFr = """
                    Ce qui avait commencé comme la quête d'un jeune homme déterminé à apprendre la programmation informatique s'est mué, au fil des mois et des réflexions, en une cause collective. Le défi technologique haïtien ne saurait être relevé par des initiatives isolées ou éphémères. Il exige un cadre de pensée unifié, capable d'inspirer les talents locaux et d'attirer les expertises disséminées au sein de la diaspora.
                    
                    AJ-TECH est conçu dès l'origine comme une plateforme ouverte, un étendard sous lequel développeurs, designers, enseignants, professionnels du droit, économistes et passionnés de technologie peuvent se rassembler. L'ambition personnelle s'efface ainsi au profit d'un idéal partagé : démontrer que notre pays est capable d'édifier ses propres infrastructures logicielles et de rivaliser avec les standards mondiaux les plus exigeants.
                """.trimIndent(),
                contentHt = """
                    Sa k te kòmanse kòm efò yon sèl jèn gason ki te vle aprann pwograme òdinatè vin transfòme pou tounen yon gwo kòz pou tout moun. Defi teknolojik peyi d Ayiti a pa ka rezoud ak ti pwojè izole ki disparèt vit. Li mande yon gwo vizyon kolektif ki kapab motive jèn nan peyi a epi rasanble espesyalis nou yo ki nan dyaspora a.
                    
                    AJ-TECH fèt depi nan kòmansman kòm yon espas ouvè kote devlopè, konsèpteur, pwofesè, avoka, ekonomis ak tout moun ki renmen teknoloji ka mete men ansanm. Efò yon sèl moun vin tounen yon kòz nasyonal : montre aklè peyi nou kapab bati pwòp lojisyèl pa l epi rive nan menm nivo ak pi bon estanda entènasyonal yo.
                """.trimIndent(),
                plannedStartPage = 25,
                plannedEndPage = 26,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_9",
                chapterNumber = 9,
                partId = "part_1",
                titleFr = "Chapitre 9 — La mission d'AJ-TECH",
                titleHt = "Chapit 9 — Misyon AJ-TECH",
                subtitleFr = "Mettre Haïti sur l'échelle mondiale et faciliter l'accès de tous à la technologie",
                subtitleHt = "Mete Ayiti sou echèl mondyal epi fasilite tout moun jwenn aksè ak teknoloji",
                summaryFr = "Explicitation de la mission officielle d'AJ-TECH et de son double objectif : rayonnement international et inclusion numérique démocratique.",
                summaryHt = "Eksplikasyon sou misyon ofisyèl AJ-TECH la ak de gwo poto l yo : fè non Ayiti briye sou plan mondyal epi pèmèt tout sitwayen jwenn bon zouti nimerik.",
                contentFr = """
                    La mission officielle d'AJ-TECH s'énonce avec force et clarté :
                    
                    « AJ-TECH a pour mission de mettre Haïti sur l'échelle mondiale dans la technologie et de faciliter l'accès de tous à la technologie. »
                    
                    Cette mission comporte deux dimensions indissociables :
                    1. Mettre Haïti sur l'échelle mondiale : refuser le statut de spectateur passif ou de consommateur de technologies étrangères. Nous voulons qu'Haïti devienne un pôle de création, de développement et d'exportation de solutions logicielles innovantes reconnues pour leur robustesse et leur inventivité.
                    2. Faciliter l'accès de tous à la technologie : lutter concrètement contre la fracture numérique. La technologie ne doit pas être le privilège d'une minorité connectée dans les centres urbains, mais un bien commun accessible à chaque écolier, chaque artisan, chaque commerçant et chaque famille, quelles que soient les contraintes géographiques ou financières.
                """.trimIndent(),
                contentHt = """
                    Misyon ofisyèl AJ-TECH ekri aklè avèk fòs :
                    
                    « AJ-TECH gen misyon pou mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a. »
                    
                    Misyon sa a gen de gwo pati ki mache ansanm :
                    1. Mete Ayiti sou echèl mondyal : refize rete sèlman kòm moun k ap gade oswa k ap konsome sa lòt moun kreye. Nou vle pou Ayiti tounen yon kote ki pwodui, devlope epi ekspòte bonjan lojisyèl ki rekonèt tout kote pou fòs yo ak kalite yo.
                    2. Fasilite tout moun jwenn aksè ak teknoloji a : konbat baryè ki anpeche moun jwenn zouti nimerik. Teknoloji pa dwe yon liks pou yon ti gwoup moun sèlman, men yon zouti itil pou chak elèv lekòl, chak machann, chak atizan ak chak fanmi, kèlkeswa kote yo ye oswa mwayen yo genyen.
                """.trimIndent(),
                plannedStartPage = 27,
                plannedEndPage = 28,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_10",
                chapterNumber = 10,
                partId = "part_1",
                titleFr = "Chapitre 10 — La vision : devenir un géant de la technologie",
                titleHt = "Chapit 10 — Vizyon an : vin tounen yon jeyan nan teknoloji",
                subtitleFr = "Une ambition assumée, méthodique et construite pas à pas",
                subtitleHt = "Yon gwo objektif nou pran responsablite l, k ap bati etap pa etap",
                summaryFr = "Pourquoi AJ-TECH assume l'objectif de devenir un géant de la technologie, sans arrogance mais avec une rigueur d'exécution implacable.",
                summaryHt = "Poukisa AJ-TECH fikse objektif pou l vin tounen yon gwo jeyan nan teknoloji, san pretansyon men ak anpil disiplin ak travay di.",
                contentFr = """
                    La vision d'AJ-TECH se résume en une formule simple et audacieuse :
                    
                    « Devenir un géant de la technologie. »
                    
                    Affirmer une telle vision dans un pays confronté à des crises structurelles peut sembler démesuré à ceux qui jugent le futur à l'aune des limites du présent. Pour AJ-TECH, cette ambition n'est pas un slogan creux, mais une boussole stratégique. Devenir un géant ne signifie pas copier aveuglément les géants étrangers de la Silicon Valley, mais bâtir une puissance technologique enracinée dans nos réalités, capable de résoudre les problèmes de millions d'individus et d'étendre son influence à l'échelle régionale et globale.
                    
                    Cette vision se concrétise par une méthode stricte : avancer par jalons décennaux vérifiables (2026–2035), consolider chaque produit avant de passer au suivant, et maintenir une discipline d'ingénierie irréprochable.
                """.trimIndent(),
                contentHt = """
                    Vizyon AJ-TECH la chita sou yon fraz ki kout men ki gen anpil fòs :
                    
                    « Vin tounen yon jeyan nan teknoloji. »
                    
                    Di yon bagay konsa nan yon peyi ki gen anpil pwoblèm ka parèt twò gwo pou moun ki wè sèlman difikilte jodi a. Men pou AJ-TECH, gwo vizyon sa a se yon bousòl. Vin tounen yon jeyan pa vle di kopye avègleman gwo konpayi etranje yo, men bati yon fòs teknolojik ki kanpe sou pwòp reyalite pa nou, ki kapab rezoud pwoblèm plizyè milyon moun epi elaji enfliyans li nan Karayib la ak nan tout mond lan.
                    
                    Vizyon sa a ap reyalize grasa yon plan solid : avanse etap pa etap sou plan 10 lane a (2026–2035), fè chak pwodwi solid avan nou pase nan yon lòt, epi kenbe yon nivo travay ak disiplin san fay.
                """.trimIndent(),
                plannedStartPage = 28,
                plannedEndPage = 29,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_11",
                chapterNumber = 11,
                partId = "part_1",
                titleFr = "Chapitre 11 — L'innovation haïtienne au service du monde",
                titleHt = "Chapit 11 — Inovasyon ayisyen nan sèvis lemonn",
                subtitleFr = "La devise officielle et la conviction que la contrainte engendre l'excellence",
                subtitleHt = "Deviz ofisyèl la ak konviksyon difikilte ka fè nou kreye pi bon kalite",
                summaryFr = "Signification profonde de la devise d'AJ-TECH : résoudre les problèmes complexes d'Haïti pour offrir des solutions au monde entier.",
                summaryHt = "Sans pwofon deviz AJ-TECH la : rezoud gwo defi peyi d Ayiti pou pote bonjan solisyon pou tout limanite.",
                contentFr = """
                    « L'innovation haïtienne au service du monde » constitue la devise officielle d'AJ-TECH. Elle résume une conviction centrale de notre philosophie d'ingénierie : un logiciel capable de fonctionner avec fluidité, rapidité et fiabilité dans les conditions d'Haïti possède un avantage compétitif majeur sur n'importe quel marché de la planète.
                    
                    Concevoir pour les environnements à faible bande passante, optimiser le stockage local, minimiser la consommation énergétique des processeurs et garantir la sécurité des échanges sont des exigences d'ingénierie universelles. En forgeant nos outils à l'épreuve de notre réalité nationale, nous créons des technologies résilientes prêtes à répondre aux besoins de milliards d'habitants des marchés émergents d'Amérique latine, d'Afrique et d'Asie. L'innovation haïtienne n'est pas un repli, mais une contribution offerte au monde.
                """.trimIndent(),
                contentHt = """
                    « L'innovation haïtienne au service du monde » (Inovasyon ayisyen nan sèvis lemonn) se deviz ofisyèl AJ-TECH. Li rezime yon prensip santral nan fason n ap pwograme : yon lojisyèl ki kapab mache vit, byen epi san pwoblèm nan kondisyon difisil Ayiti genyen yon gwo avantaj sou nenpòt lòt mache sou latè.
                    
                    Kreye lojisyèl pou kote ki gen ti koneksyon entènèt, ekonomize espas memwa sou aparèy yo, redui kantite batri aplikasyon yo konsome, ak asire bonjan sekirite se bezwen tout mond lan genyen jodi a. Lè nou devlope zouti nou yo pou yo reziste tout defi peyi nou an, nou kreye teknoloji djanm ki pare pou ede plizyè milya moun nan Amerik Latin, Afrik ak Azi. Inovasyon ayisyen an se yon kontribisyon n ap pote pou lemonn antye.
                """.trimIndent(),
                plannedStartPage = 29,
                plannedEndPage = 30,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),
            BookChapter(
                id = "ch_1_12",
                chapterNumber = 12,
                partId = "part_1",
                titleFr = "Chapitre 12 — Une histoire qui ne fait que commencer",
                titleHt = "Chapit 12 — Yon istwa ki fenk kòmanse",
                subtitleFr = "La première pierre d'un édifice décennal tourné vers l'avenir",
                subtitleHt = "Premye wòch nan yon gwo batiman 10 lane ki vire sou lavni",
                summaryFr = "Conclusion de la Partie I, ouvrant sur la mise en œuvre de l'écosystème et l'appel aux bâtisseurs de demain.",
                summaryHt = "Konklizyon Pati I an, ki louvri pòt pou konstriksyon ekosistèm nan ak apèl pou tout moun ki vle bati lavni.",
                contentFr = """
                    La Partie I de cet ouvrage a posé les jalons historiques, humains et philosophiques de l'aventure AJ-TECH. Elle a rappelé que l'origine d'un grand projet réside dans le courage d'entreprendre avec humilité et persévérance, même lorsque les ressources de départ sont limitées.
                    
                    En 2025, la fondation est posée. Les lignes de code initiales sont écrites, les premiers tests pilotes d'AJ-Task sont en cours, et la cartographie des 22 entités trace l'horizon des dix prochaines années (2026–2035). Rien n'est encore achevé, mais tout est désormais en mouvement. Le chemin sera long, exigeant et jalonné d'obstacles, mais la direction est claire et la volonté inébranlable. L'histoire d'AJ-TECH ne fait que commencer.
                """.trimIndent(),
                contentHt = """
                    Pati I liv sa a montre tout baz istorik, imèn ak filozofik ki te pèmèt AJ-TECH fèt. Li raple nou tout gwo pwojè kòmanse ak kouraj pou w avanse avèk imilite ak pasyans, menm lè w kòmanse ak ti mwayen.
                    
                    An 2025, fondasyon an poze. Premye liy kòd yo ekri, premye tès pilòt sou AJ-Task ap fèt, epi plan 22 antite yo trase chemen an pou 10 lane k ap vini yo (2026–2035). Anyen poko fini, men tout machin lan gentan an mach. Wout la ap long, l ap mande anpil efò ak travay di, men direksyon an klè epi volonte a solid. Istwa AJ-TECH la fenk kòmanse.
                """.trimIndent(),
                plannedStartPage = 30,
                plannedEndPage = 30,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
