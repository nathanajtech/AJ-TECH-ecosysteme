package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.*

object BookRepository {

    val parts: List<BookPart> = listOf(
        // ==================== LIMINAIRES / DEVANT-LIVRE ====================
        BookPart(
            id = "part_front",
            partNumber = null,
            type = PartType.FRONT_MATTER,
            titleFr = "Documents Liminaires & Préambule",
            titleHt = "Dokiman Preliminè & Entwodiksyon",
            subtitleFr = "Dédicace, Remerciements, Préface et Manifeste",
            subtitleHt = "Dedikas, Remèsiman, Prefas ak Manifès",
            plannedPages = "pp. 1–14",
            status = BookContentStatus.AVAILABLE,
            chapters = listOf(
                BookChapter(
                    id = "front_dedicace",
                    chapterNumber = 1,
                    partId = "part_front",
                    titleFr = "Dédicace",
                    titleHt = "Dedikas",
                    subtitleFr = "À la jeunesse haïtienne et aux bâtisseurs de l'avenir",
                    subtitleHt = "Pou tout jèn ayisyen ak tout moun k ap bati lavni",
                    summaryFr = "Hommage solennel à la résilience du peuple haïtien et dédicace aux esprits audacieux qui osent bâtir.",
                    summaryHt = "Yon omaj solanèl pou rezilyans pèp ayisyen an ak tout moun k ap konstwi avèk kouraj.",
                    contentFr = """
                        À la jeunesse haïtienne, debout malgré les tempêtes, dont l'intelligence et la créativité ne demandent qu'un terrain fertile pour s'épanouir.
                        
                        À tous les ingénieurs, développeurs, enseignants, entrepreneurs et artisans qui refusent la résignation et continuent d'écrire les lignes de code d'un avenir digne.
                        
                        À la mémoire de nos ancêtres qui nous ont légué l'audace de la liberté. Que cette liberté trouve aujourd'hui son prolongement dans notre souveraineté technologique et intellectuelle.
                    """.trimIndent(),
                    contentHt = """
                        Pou tout jèn ayisyen, k ap goumen chak jou malgre tout difikilte, ki gen entèlijans ak kreyativite ki jis bezwen yon bon tè pou fleri.
                        
                        Pou tout enjenyè, devlopè, pwofesè, antreprenè ak atizan ki refize dekouraje epi k ap kontinye ekri kòd pou yon pi bon demen.
                        
                        Pou memwa zansèt nou yo ki te ban nou kouraj pou nou pran libète nou. Se pou libète sa a jwenn fòs li jodi a nan souverènte teknolojik ak entèlektyèl nou.
                    """.trimIndent(),
                    plannedStartPage = 3,
                    plannedEndPage = 4,
                    estimatedReadMinutes = 2,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_remerciements",
                    chapterNumber = 2,
                    partId = "part_front",
                    titleFr = "Remerciements",
                    titleHt = "Remèsiman",
                    subtitleFr = "Reconnaissance envers les soutiens et pionniers",
                    subtitleHt = "Rekonesans pou tout moun ki sipòte ak gide nou",
                    summaryFr = "Remerciements à la famille, aux mentors, aux développeurs et aux premiers utilisateurs pilotes d'AJ-Task.",
                    summaryHt = "Remèsiman pou fanmi, gid, devlopè ak premye itilizatè tès AJ-Task yo.",
                    contentFr = """
                        Je tiens à exprimer ma profonde gratitude :
                        
                        - À ma famille et mes proches, pour leur patience inébranlable et leur foi inconditionnelle dans ce projet.
                        - Aux premiers testeurs et utilisateurs pilotes d'AJ-Task, dont les retours constructifs ont permis d'affiner notre méthode et d'éprouver la résilience de notre architecture.
                        - À la communauté technologique haïtienne, en Haïti et au sein de la diaspora, dont les échanges constants nourrissent chaque page de cet ouvrage.
                    """.trimIndent(),
                    contentHt = """
                        Mwen vle di yon gwo mèsi :
                        
                        - Pou fanmi mwen ak tout zanmi pwòch mwen, pou pasyans yo ak konfyans yo nan vizyon sa a.
                        - Pou premye moun ki te teste epi itilize AJ-Task, ki te ede nou amelyore aplikasyon an ak rann li pi djanm.
                        - Pou tout kominote teknolojik ayisyen an, kit se nan peyi a oswa nan dyaspora a, k ap pote konsèy ak lide chak jou.
                    """.trimIndent(),
                    plannedStartPage = 5,
                    plannedEndPage = 6,
                    estimatedReadMinutes = 2,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_preface",
                    chapterNumber = 3,
                    partId = "part_front",
                    titleFr = "Préface",
                    titleHt = "Prefas",
                    subtitleFr = "Pourquoi ce livre et pourquoi maintenant",
                    subtitleHt = "Poukisa liv sa a epi poukisa se kounye a",
                    summaryFr = "Mise en perspective de l'urgence numérique pour Haïti à l'aube de la décennie 2026–2035.",
                    summaryHt = "Eksplikasyon sou enpòtans ijan teknoloji genyen pou Ayiti nan peryòd 2026–2035 lan.",
                    contentFr = """
                        Pourquoi écrire ce livre aujourd'hui ? Parce que le silence et l'attente ne sont plus des options viables.
                        
                        Le monde vit une accélération technologique sans précédent : intelligence artificielle, cloud computing, cybersécurité, économie décentralisée. Pendant ce temps, notre pays risque d'être relégué au rang de simple spectateur d'un monde qu'il n'a pas contribué à coder.
                        
                        Cet ouvrage n'est pas un catalogue de promesses faciles. C'est un document de travail, une boussole stratégique et un témoignage d'engagement. Il présente avec lucidité où nous en sommes en 2025, et où nous devons impérativement être en 2035.
                    """.trimIndent(),
                    contentHt = """
                        Poukisa liv sa a fèt jodi a ? Paske rete tann ak gade lòt moun avanse pa yon opsyon ankò.
                        
                        Mond lan ap kouri vit sou plan teknolojik : entèlijans atifisyèl, nwaj enfòmatik (cloud), sekirite nimerik, ekonomi dijital. Pandan tan sa a, peyi nou an pa dwe rete sèlman kòm yon senp konsomatè.
                        
                        Liv sa a se yon plan travay, yon gid estratejik ak yon angajman klè. Li montre avèk onètete kote nou ye an 2025, ak kote nou dwe rive an 2035.
                    """.trimIndent(),
                    plannedStartPage = 7,
                    plannedEndPage = 9,
                    estimatedReadMinutes = 3,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_manifesto",
                    chapterNumber = 4,
                    partId = "part_front",
                    titleFr = "Manifeste AJ-TECH",
                    titleHt = "Manifès AJ-TECH",
                    subtitleFr = "Les 5 piliers de la souveraineté numérique haïtienne",
                    subtitleHt = "5 poto mitan pou souverènte nimerik peyi d Ayiti",
                    summaryFr = "Déclaration des principes fondamentaux régissant l'action d'AJ-TECH.",
                    summaryHt = "Deklarasyon prensip debaz ki gide tout aksyon AJ-TECH.",
                    contentFr = """
                        1. L'innovation ne demande de permission à personne : elle naît de la volonté, du travail acharné et de la rigueur intellectuelle.
                        2. La souveraineté numérique est la condition sine qua non de la liberté économique du XXIe siècle.
                        3. Concevoir pour Haïti, c'est concevoir pour l'extrême : si un logiciel fonctionne dans les conditions de connectivité et d'énergie d'Haïti, il peut conquérir le monde entier.
                        4. La transparence absolue : nous distinguons toujours ce qui fonctionne aujourd'hui de ce qui est en développement et de ce qui relève de la vision.
                        5. Notre devise demeure immuable : 'L'innovation haïtienne au service du monde'.
                    """.trimIndent(),
                    contentHt = """
                        1. Inovasyon pa mande pèmisyon okenn moun : li soti nan volonte, travay di ak disiplin.
                        2. Souverènte nimerik se kle pou libète ekonomik nan 21yèm syèk la.
                        3. Kreye pou Ayiti, se kreye pou defi ki pi difisil yo : si yon lojisyèl fonksyone byen nan kondisyon Ayiti, li kapab reyisi nenpòt kote sou latè.
                        4. Transparans total : nou toujou fè diferans ant sa k ap mache jodi a, sa k ap devlope, ak sa k nan vizyon an.
                        5. Deviz nou pa janm chanje : 'Inovasyon ayisyen nan sèvis lemonn'.
                    """.trimIndent(),
                    plannedStartPage = 10,
                    plannedEndPage = 12,
                    estimatedReadMinutes = 3,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_bio",
                    chapterNumber = 5,
                    partId = "part_front",
                    titleFr = "Présentation de Jonathan Germain",
                    titleHt = "Prezantasyon Jonathan Germain",
                    subtitleFr = "Fondateur d'AJ-TECH & Auteur",
                    subtitleHt = "Fondatè AJ-TECH & Otè",
                    summaryFr = "Parcours, vision et engagement du fondateur d'AJ-TECH.",
                    summaryHt = "Pakou, vizyon ak angajman fondatè AJ-TECH la.",
                    contentFr = """
                        Jonathan Germain est le fondateur d'AJ-TECH, entreprise technologique haïtienne initiée en 2025 à Port-au-Prince.
                        
                        Passionné de développement logiciel, d'architecture système et d'entrepreneuriat à fort impact, il consacre ses efforts à la mise en place d'un écosystème logiciel souverain et adapté aux contraintes réelles du territoire haïtien.
                        
                        Concepteur de la PWA AJ-Task et architecte de la vision 2026–2035, il défend une approche pragmatique : bâtir d'abord des solutions fonctionnelles et robustes avant de prétendre à la grandeur.
                    """.trimIndent(),
                    contentHt = """
                        Jonathan Germain se fondatè AJ-TECH, yon antrepriz teknolojik ayisyen ki fèt an 2025 nan Pòtoprens.
                        
                        Li pasyone de devlopman lojisyèl, achitekti sistèm enfòmatik ak antreprenarya. Li dedye travay li pou bati yon ekosistèm nimerik nasyonal ki adapte ak reyalite peyi a.
                        
                        Li se designer PWA AJ-Task la ak achitèk vizyon 2026–2035 lan, avèk yon prensip klè : kreye solisyon solid ki mache avan tout bagay.
                    """.trimIndent(),
                    plannedStartPage = 13,
                    plannedEndPage = 14,
                    estimatedReadMinutes = 2,
                    status = BookContentStatus.AVAILABLE
                )
            )
        ),

        // ==================== PARTIE I ====================
        BookPart(
            id = "part_1",
            partNumber = 1,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE I — GENÈSE ET FONDATION D'AJ-TECH",
            titleHt = "PATI I — JENÈZ AK FONDASYON AJ-TECH",
            subtitleFr = "De l'apprentissage autodidacte à la création d'une vision technologique pour Haïti",
            subtitleHt = "Soti nan aprantisaj poukont li rive nan kreyasyon yon vizyon teknolojik pou Ayiti",
            plannedPages = "pp. 15–74",
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
                    plannedEndPage = 19,
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
                    plannedStartPage = 20,
                    plannedEndPage = 24,
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
                    plannedStartPage = 25,
                    plannedEndPage = 29,
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
                    plannedStartPage = 30,
                    plannedEndPage = 34,
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
                    plannedStartPage = 35,
                    plannedEndPage = 39,
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
                    plannedStartPage = 40,
                    plannedEndPage = 44,
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
                    plannedStartPage = 45,
                    plannedEndPage = 49,
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
                    plannedStartPage = 50,
                    plannedEndPage = 54,
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
                    plannedStartPage = 55,
                    plannedEndPage = 59,
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
                    plannedStartPage = 60,
                    plannedEndPage = 64,
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
                    plannedStartPage = 65,
                    plannedEndPage = 69,
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
                        
                        En 2025, la fondation est posée. Les lignes de code initiales sont écrites, les premiers tests pilotes d'AJ-Task sont en cours, et la cartographie des 21 entités trace l'horizon des dix prochaines années (2026–2035). Rien n'est encore achevé, mais tout est désormais en mouvement. Le chemin sera long, exigeant et jalonné d'obstacles, mais la direction est claire et la volonté inébranlable. L'histoire d'AJ-TECH ne fait que commencer.
                    """.trimIndent(),
                    contentHt = """
                        Pati I liv sa a montre tout baz istorik, imèn ak filozofik ki te pèmèt AJ-TECH fèt. Li raple nou tout gwo pwojè kòmanse ak kouraj pou w avanse avèk imilite ak pasyans, menm lè w kòmanse ak ti mwayen.
                        
                        An 2025, fondasyon an poze. Premye liy kòd yo ekri, premye tès pilòt sou AJ-Task ap fèt, epi plan 21 antite yo trase chemen an pou 10 lane k ap vini yo (2026–2035). Anyen poko fini, men tout machin lan gentan an mach. Wout la ap long, l ap mande anpil efò ak travay di, men direksyon an klè epi volonte a solid. Istwa AJ-TECH la fenk kòmanse.
                    """.trimIndent(),
                    plannedStartPage = 70,
                    plannedEndPage = 74,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                )
            )
        ),

        // ==================== PARTIE II ====================
        BookPart(
            id = "part_2",
            partNumber = 2,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE II — PHILOSOPHIE, MISSION, VISION ET VALEURS",
            titleHt = "PATI II — FILOZOFI, MISYON, VIZYON AK VALÈ",
            subtitleFr = "Les principes directeurs, l'éthique et les fondements de notre engagement",
            subtitleHt = "Prensip k ap gide nou, etik ak baz angajman nou pou lavni",
            plannedPages = "pp. 75–124",
            status = BookContentStatus.IN_PROGRESS,
            chapters = listOf(
                BookChapter(
                    id = "ch_2_13",
                    chapterNumber = 13,
                    partId = "part_2",
                    titleFr = "Chapitre 13 — La philosophie AJ-TECH",
                    titleHt = "Chapit 13 — Filozofi AJ-TECH",
                    subtitleFr = "L'innovation ancrée dans le réel, l'apprentissage continu et le développement humain",
                    subtitleHt = "Inovasyon ki chita sou reyalite, aprantisaj san rete ak devlopman moun",
                    summaryFr = "Les piliers philosophiques d'AJ-TECH : l'innovation par la contrainte, la souveraineté numérique et la coopération.",
                    summaryHt = "Poto mitan nan panse filozofik AJ-TECH : inovasyon nan mitan difikilte, libète nimerik ak kowoperasyon.",
                    contentFr = """
                        La philosophie d'AJ-TECH ne relève pas d'une théorie abstraite, mais d'une réflexion née du terrain et de l'expérience vécue. Elle s'articule autour de dix piliers fondamentaux :
                        
                        1. L'innovation pragmatique : chercher sans cesse des solutions inédites et légères adaptées aux contraintes réelles ;
                        2. L'accessibilité technologique : concevoir des logiciels simples et inclusifs pour tous les citoyens ;
                        3. L'apprentissage continu : cultiver la curiosité autodidacte et l'amélioration perpétuelle des savoirs ;
                        4. Le travail rigoureux : considérer l'effort constant comme la seule source légitime de progrès ;
                        5. La persévérance : surmonter méthodiquement les pannes, les pénuries et les doutes ;
                        6. La responsabilité morale : veiller à l'impact social et éthique de chaque ligne de code produite ;
                        7. La créativité : transformer le manque de ressources matérielles en ingéniosité architecturale ;
                        8. La souveraineté numérique : doter notre communauté de ses propres infrastructures logicielles indépendantes ;
                        9. La coopération : bâtir des ponts entre les créateurs locaux, la diaspora et les réseaux internationaux ;
                        10. Le développement humain : subordonner toute prouesse technique à l'épanouissement des personnes et de la société.
                        
                        Ces orientations constituent les principes éditoriaux directeurs qui guident la construction de chaque produit au sein de l'écosystème.
                    """.trimIndent(),
                    contentHt = """
                        Filozofi AJ-TECH pa soti nan gwo teyori nan liv sèlman, men nan leson nou tire sou teren an ak nan lavi chak jou. Li chita sou dis gwo poto mitan :
                        
                        1. Inovasyon pratik : chèche tout tan nouvo solisyon ki lejè epi ki adapte ak reyalite nou ;
                        2. Fasilite aksè nan teknoloji : kreye lojisyèl ki senp epi ki louvri pou tout sitwayen ;
                        3. Aprantisaj san rete : kenbe volonte pou aprann poukont nou epi ogmante konesans nou chak jou ;
                        4. Travay di ak disiplin : rekonèt se sèlman nan travay serye bonjan pwogrè ka soti ;
                        5. Pèseverans : pa janm dekouraje devan pann kouran, mank entènèt oswa difikilte ;
                        6. Responsablite moral : veye sou bon enpak chak liy kòd n ap ekri genyen sou sosyete a ;
                        7. Kreyativite : transfòme mank mwayen materyèl an gwo fòs entèlijans ak lide nèf ;
                        8. Libète ak souverènte nimerik : pèmèt peyi a gen pwòp enfrastrikti lojisyèl pa l san depann totalman de lòt bò dlo ;
                        9. Kowoperasyon : kreye bonjan pon ant devlopè lokal yo, dyaspora a ak rezo entènasyonal yo ;
                        10. Devlopman moun : mete byennèt moun ak avansman sosyete a anvan nenpòt zouti teknik.
                        
                        Prensip sa yo se gid k ap dirije jan n ap bati chak pwojè nan ekosistèm nan.
                    """.trimIndent(),
                    plannedStartPage = 75,
                    plannedEndPage = 78,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_14",
                    chapterNumber = 14,
                    partId = "part_2",
                    titleFr = "Chapitre 14 — La mission",
                    titleHt = "Chapit 14 — Misyon an",
                    subtitleFr = "Mettre Haïti sur l'échelle mondiale et faciliter l'accès de tous à la technologie",
                    subtitleHt = "Mete Ayiti sou echèl mondyal epi fasilite tout moun jwenn aksè ak teknoloji",
                    summaryFr = "Exposé approfondi de la mission officielle d'AJ-TECH : rayonnement technologique international et démocratisation numérique.",
                    summaryHt = "Eksplikasyon byen fon sou misyon ofisyèl AJ-TECH la : fè non peyi a briye nan lemonn epi mete teknoloji nan men tout moun.",
                    contentFr = """
                        La mission officielle d'AJ-TECH est formulée sans ambiguïté :
                        
                        « AJ-TECH a pour mission de mettre Haïti sur l'échelle mondiale dans la technologie et de faciliter l'accès de tous à la technologie. »
                        
                        Cette mission articule deux exigences indissociables :
                        
                        Premièrement, le rayonnement international. Haïti ne doit plus être cantonnée à un rôle de consommatrice passive de technologies importées. Notre ambition est de concevoir des architectures logicielles, des bibliothèques de code et des services en ligne dont l'efficacité et la robustesse seront reconnues au-delà de nos frontières, sur les marchés caribéens, latino-américains et mondiaux.
                        
                        Deuxièmement, la justice d'accès. La technologie moderne ne doit en aucun cas devenir un privilège réservé à une élite urbaine disposant d'équipements coûteux. Elle doit être pensée pour fonctionner sur des téléphones d'entrée de gamme, à travers des réseaux à faible débit et sous des régimes énergétiques intermittents, afin que chaque écolier, étudiant, commerçant ou entrepreneur puisse en bénéficier au quotidien.
                    """.trimIndent(),
                    contentHt = """
                        Misyon ofisyèl AJ-TECH ekri aklè san okenn dout :
                        
                        « AJ-TECH gen misyon pou mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a. »
                        
                        Misyon sa a gen de gwo devwa ki mache men nan men :
                        
                        Premyèman, fè non peyi a briye sou plan entènasyonal. Ayiti pa dwe rete sèlman yon peyi k ap achte epi konsome teknoloji ki fèt deyò. Anbisyon nou se kreye lojisyèl, sistèm ak sèvis sou entènèt ki tèlman djanm epi efikas ke tout moun nan Karayib la, nan Amerik Latin ak nan tout mond lan ap rekonèt valè yo.
                        
                        Dezyèmman, jistis nan aksè pou tout moun. Teknoloji modèn pa dwe tounen yon liks pou yon ti ponyen moun ki gen gwo mwayen ak gwo telefòn chè. Li fèt pou l mache sou ti telefòn senp, ak ti koneksyon fèb epi menm lè pa gen kouran tout tan, pou chak elèv, chak etidyan, chak machann ak chak antreprenè ka sèvi avè l chak jou pou amelyore lavi yo.
                    """.trimIndent(),
                    plannedStartPage = 79,
                    plannedEndPage = 82,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_15",
                    chapterNumber = 15,
                    partId = "part_2",
                    titleFr = "Chapitre 15 — La vision",
                    titleHt = "Chapit 15 — Vizyon an",
                    subtitleFr = "Devenir un géant de la technologie pas à pas",
                    subtitleHt = "Vin tounen yon jeyan nan teknoloji etap pa etap",
                    summaryFr = "La vision officielle d'AJ-TECH : un horizon stratégique sur 10 ans (2026–2035) bâti sur la rigueur d'ingénierie et la persévérance.",
                    summaryHt = "Vizyon ofisyèl AJ-TECH la : yon plan estratejik sou 10 lane (2026–2035) ki chita sou disiplin nan travay ak pèseverans.",
                    contentFr = """
                        La vision officielle d'AJ-TECH s'exprime en ces termes :
                        
                        « Devenir un géant de la technologie. »
                        
                        Pour une jeune initiative née à Port-au-Prince, afficher une telle vision n'est pas une bravade, mais un acte de foi lucide dans le potentiel de notre peuple et de notre jeunesse. Devenir un géant ne signifie pas chercher une domination hégémonique, mais bâtir une capacité technologique de premier plan, capable d'impacter positivement des millions de vies et d'offrir une alternative crédible aux standards existants.
                        
                        Cette vision s'inscrit dans un plan décennal structuré (2026–2035) composé de phases d'exécution méthodiques :
                        - 2026–2027 : Consolidation du socle technique, expérimentation pilote et formalisation institutionnelle ;
                        - 2028–2030 : Déploiement des premières briques applicatives stabilisées (productivité, éducation, identité) ;
                        - 2031–2035 : Expansion vers les infrastructures lourdes, le cloud souverain et l'ouverture internationale.
                        
                        Chaque étape est abordée avec patience, sans brûler les étapes et sans jamais substituer l'annonce à la réalisation.
                    """.trimIndent(),
                    contentHt = """
                        Vizyon ofisyèl AJ-TECH la ekri tou kout men ak anpil fòs :
                        
                        « Vin tounen yon jeyan nan teknoloji. »
                        
                        Pou yon jèn antrepriz ki pran nesans nan Pòtoprens, fikse yon gwo vizyon konsa se pa fè vante tèt, men se yon konviksyon klè sou fòs jèn yo ak kapasite pèp nou an genyen. Vin tounen yon jeyan pa vle di chèche kraze lòt moun, men se bati yon gwo fòs teknolojik ki gen kalite siperyè, ki kapab pote solisyon pou plizyè milyon moun epi kanpe djanm devan pi gwo estanda entènasyonal yo.
                        
                        Vizyon sa a chita sou yon plan 10 lane (2026–2035) ki divize an etap byen klè :
                        - 2026–2027 : Fòtifye baz teknik la, fè tès pilòt epi mete tout estrikti ofisyèl yo an plas ;
                        - 2028–2030 : Louvri premye gwo zouti ki fin pare nèt (jesyon travay, edikasyon, idantite nimerik) ;
                        - 2031–2035 : Bati gwo enfrastrikti tankou cloud lokal ak elaji sèvis yo nan Karayib la ak nan tout mond lan.
                        
                        Nou franchi chak etap ak pasyans, san kouri fè vante san nou poko travay, epi san janm pran pawòl pou rezilta.
                    """.trimIndent(),
                    plannedStartPage = 83,
                    plannedEndPage = 86,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_16",
                    chapterNumber = 16,
                    partId = "part_2",
                    titleFr = "Chapitre 16 — Les valeurs fondamentales",
                    titleHt = "Chapit 16 — Valè fondamantal yo",
                    subtitleFr = "Travail, intégrité, excellence, résilience et esprit de communauté",
                    subtitleHt = "Travay, entegrite, ekselans, rezilyans ak lespri kominotè",
                    summaryFr = "Les principes de conduite proposés pour structurer la culture d'entreprise et guider collaborateurs et partenaires.",
                    summaryHt = "Prensip konduit nou pwopoze pou gide tout moun k ap travay nan ekip la ak tout patnè k ap vin jwenn nou.",
                    contentFr = """
                        Pour soutenir son expansion dans la durée, AJ-TECH propose un ensemble de valeurs fondamentales qui constituent le socle de sa charte éditoriale et humaine :
                        
                        - Le Travail et la Discipline : la conviction que seul l'effort constant, méthodique et approfondi permet d'atteindre l'excellence technique ;
                        - L'Intégrité et la Vérité : l'engagement de toujours décrire fidèlement l'état réel de nos systèmes, sans gonfler nos résultats ni dissimuler nos limites ;
                        - L'Excellence d'Ingénierie : le refus de la médiocrité ou du travail approximatif, en cherchant la propreté du code, la sécurité et la légèreté ;
                        - La Résilience Opérationnelle : la capacité à continuer de concevoir et de produire en dépit des aléas techniques, énergétiques ou financiers ;
                        - L'Esprit de Communauté et d'Entraide : le devoir de partager les connaissances acquises, d'épauler les jeunes développeurs et de servir le bien commun.
                        
                        Ces valeurs ne sont pas de simples déclarations décoratives : elles définissent les critères concrets selon lesquels chaque collaborateur, contributeur ou partenaire est invité à s'engager au sein de l'aventure AJ-TECH.
                    """.trimIndent(),
                    contentHt = """
                        Pou pwojè a ka dire epi rete solid nan tan k ap vini yo, AJ-TECH pwopoze yon seri valè fondamantal ki sèvi kòm bousòl moral ak pwofesyonèl :
                        
                        - Travay ak Disiplin : konviksyon se sèlman nan travay di chak jou, ak bon metòd, nou ka rive nan nivo pi bon enjenyè sou latè ;
                        - Entegrite ak Laverite : angajman pou nou toujou di verite sou nivo aplikasyon nou yo, san fè bèl diskou sou sa k poko fèt ;
                        - Ekselans nan Pwogramasyon : refize travay koutba oswa kòd mal fèt, pandan n ap chèche pwòpte, sekirite ak lojisyèl ki lejè ;
                        - Rezilyans : kapasite pou n kontinye kreye epi avanse malgre tout difikilte kouran, entènèt oswa mank lajan ;
                        - Lespri Kominotè ak Pote Men : devwa pou pataje sa nou konnen ak lòt jèn devlopè epi travay pou avansman tout kominote a.
                        
                        Valè sa yo se pa bèl mo pou fè bri : se yo ki fikse fason chak moun ki vle travay oswa ede nan AJ-TECH dwe aji chak jou.
                    """.trimIndent(),
                    plannedStartPage = 87,
                    plannedEndPage = 90,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_17",
                    chapterNumber = 17,
                    partId = "part_2",
                    titleFr = "Chapitre 17 — L'éthique technologique",
                    titleHt = "Chapit 17 — Etik teknolojik",
                    subtitleFr = "Transparence, protection des données, sécurité et vérité opérationnelle",
                    subtitleHt = "Transparans, pwoteksyon done, sekirite ak verite sou nivo travay la",
                    summaryFr = "Les engagements éthiques stricts d'AJ-TECH : vérité sur les statuts, protection de la vie privée et utilisation responsable de l'intelligence artificielle.",
                    summaryHt = "Angajman etik AJ-TECH pran : di verite sou nivo pwojè yo, pwoteje lavi prive moun epi sèvi ak IA avèk responsablite.",
                    contentFr = """
                        L'éthique constitue le cœur battant de la gouvernance d'AJ-TECH. Dans un secteur technologique parfois tenté par le sensationnalisme ou la collecte abusive d'informations, nous affirmons des principes stricts et non négociables :
                        
                        1. La transparence et le refus des fausses promesses : nous faisons une distinction absolue entre une idée à l'étude (concept), une version expérimentale d'essai (prototype en développement) et une solution finalisée mise à disposition (produit opérationnel). Jamais une projection financière ou un partenariat envisagé ne sera présenté comme un fait accompli.
                        2. La protection rigoureuse des données des utilisateurs : nous considérons la vie privée comme un droit inaliénable. Nos architectures privilégient le stockage local des données personnelles et limitent au strict minimum les transmissions vers des serveurs distants.
                        3. La sécurité dès la conception (Security by Design) : chaque flux de données, chaque interface de programmation et chaque base locale fait l'objet de vérifications de sécurité rigoureuses pour prémunir nos utilisateurs contre les abus.
                        4. L'utilisation éthique et responsable de l'Intelligence Artificielle : l'IA est employée comme un amplificateur de productivité et un assistant d'apprentissage, jamais comme un outil de manipulation, de désinformation ou de substitution à l'esprit critique humain.
                    """.trimIndent(),
                    contentHt = """
                        Etik se poto mitan nan fason AJ-TECH ap dirije. Nan yon mond kote anpil moun konn fè manti pou atire atansyon oswa vòlè done moun, nou pran angajman fèm sou prensip sa yo :
                        
                        1. Transparans total ak refi fo pwomès : nou fè yon gwo diferans klè ant yon senp lide (konsèp), yon tès k ap fèt (pwototip) ak yon lojisyèl ki fini nèt pou moun sèvi (pwodwi operasyonèl). Nou p ap janm fè konprann yon pwojè fini pandan l ap fèt, ni pale sou lajan oswa patenarya ki poko siyen.
                        2. Pwoteksyon done prive moun : nou respekte lavi prive chak sitwayen kòm yon dwa sakre. Lojisyèl nou yo fèt pou kenbe enfòmasyon yo sou aparèy itilizatè a otank posib, san voye yo san rezon sou sèvè deyò.
                        3. Sekirite depi nan rasin : chak fwa n ap ekri yon liy kòd, nou veye pou sistèm lan byen pwoteje kont vòlè ak pirat enfòmatik.
                        4. Bon itilizasyon Entèlijans Atifisyèl (IA) : nou sèvi ak IA kòm yon zouti pou ede nou travay pi vit epi aprann pi byen, men pa janm pou twonpe moun, fè manti oswa ranplase entèlijans ak konsyans moun.
                    """.trimIndent(),
                    plannedStartPage = 91,
                    plannedEndPage = 94,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_18",
                    chapterNumber = 18,
                    partId = "part_2",
                    titleFr = "Chapitre 18 — L'humain au centre de la technologie",
                    titleHt = "Chapit 18 — Moun nan sant teknoloji a",
                    subtitleFr = "Servir les personnes et créer des opportunités concrètes",
                    subtitleHt = "Sèvi moun epi kreye bonjan chans pou tout sitwayen",
                    summaryFr = "La conviction que la technologie doit demeurer un instrument d'émancipation humaine, d'éducation et d'inclusion sociale.",
                    summaryHt = "Konviksyon teknoloji dwe toujou rete yon zouti pou ede moun grandi, jwenn bon fòmasyon epi louvri pòt opòtinite.",
                    contentFr = """
                        La technologie n'a de valeur que si elle sert l'être humain et contribue à l'amélioration concrète de ses conditions d'existence. Chez AJ-TECH, nous refusons la technophilie aveugle qui érige la complexité technique en fin en soi.
                        
                        Placer l'humain au centre implique plusieurs priorités d'action :
                        - L'inclusion et l'accessibilité : concevoir des interfaces intuitives et lisibles, adaptées aux réalités linguistiques (notamment le créole haïtien et le français) et utilisables par des personnes de tous niveaux de familiarité numérique ;
                        - L'éducation et l'autonomie : faire de nos outils des leviers d'apprentissage permettant aux jeunes et aux professionnels de développer leurs propres compétences et de gagner en indépendance économique ;
                        - La valorisation de la jeunesse et de la diaspora : offrir à la jeunesse haïtienne un motif d'espérance et un espace d'expression technique, tout en créant des ponts collaboratifs solides avec les compétences et les ressources de notre diaspora à travers le monde ;
                        - Le soutien à l'économie réelle : aider les artisans, commerçants, agriculteurs, enseignants et soignants locaux à mieux organiser leur activité grâce à des outils numériques légers et fiables.
                    """.trimIndent(),
                    contentHt = """
                        Teknoloji pa gen okenn valè si li pa sèvi moun epi ede amelyore lavi yo chak jou. Nan AJ-TECH, nou refize kreye bagay konplike pou granmisi oswa fè teknoloji pou fè wè sèlman.
                        
                        Mete moun nan sant travay nou vle di plizyè bagay enpòtan :
                        - Mete tout moun ladan l : fè aplikasyon ki fasil pou konprann, ki pale lang moun yo (Kreyòl Ayisyen ak Franse) epi nenpòt moun ka sèvi avè yo menm si li pa yon ekspè nan telefòn ;
                        - Edikasyon ak otonomi : fè zouti nou yo tounen mwayen pou jèn yo ak pwofesyonèl yo aprann plis bagay epi vin kapab pran swen tèt yo ak fanmi yo ;
                        - Bay jèn yo ak dyaspora a valè : bay jèn nan peyi a espwa ak espas pou montre sa yo ka fè nan kòd, pandan n ap kreye bonjan kolaborasyon ak frè ak sè nou yo ki nan dyaspora a toupatou sou latè ;
                        - Ede ekonomi peyi a mache : bay machann, kiltivatè, pwofesè, doktè ak ti antreprenè bonjan zouti nimerik ki lejè pou yo jere travay yo pi byen.
                    """.trimIndent(),
                    plannedStartPage = 95,
                    plannedEndPage = 98,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_19",
                    chapterNumber = 19,
                    partId = "part_2",
                    titleFr = "Chapitre 19 — L'innovation haïtienne au service du monde",
                    titleHt = "Chapit 19 — Inovasyon ayisyen nan sèvis lemonn",
                    subtitleFr = "Ancrage local et ambition universelle",
                    subtitleHt = "Rasin lokal ak gwo anbisyon pou tout mond lan",
                    summaryFr = "La devise officielle d'AJ-TECH : comment résoudre les problèmes les plus rudes d'Haïti permet de créer des logiciels compétitifs pour le monde entier.",
                    summaryHt = "Deviz ofisyèl AJ-TECH la : kijan rezoud pi gwo pwoblèm Ayiti pèmèt nou kreye pi bon lojisyèl pou tout latè.",
                    contentFr = """
                        La devise officielle d'AJ-TECH résume notre positionnement stratégique :
                        
                        « L'innovation haïtienne au service du monde. »
                        
                        Cette formule traduit une conviction d'ingénierie profonde : les contraintes sévères auxquelles nous faisons face en Haïti (bande passante restreinte, intermittence électrique, parc d'appareils hétérogène) ne sont pas seulement des handicaps, elles constituent un laboratoire d'exigence sans équivalent.
                        
                        Un logiciel conçu pour fonctionner avec fluidité en mode hors-ligne à Port-au-Prince, qui synchronise ses données de manière ultra-compacte dès qu'un signal apparaît, et qui préserve la batterie de l'appareil est, par nature, un logiciel supérieur qui trouvera son utilité partout où la légèreté et la robustesse sont recherchées. De l'Afrique subsaharienne aux zones rurales d'Asie, en passant par les métropoles occidentales en quête de sobriété numérique, l'ingénierie forgée dans la contrainte haïtienne a une valeur universelle à offrir à l'humanité.
                    """.trimIndent(),
                    contentHt = """
                        Deviz ofisyèl AJ-TECH la rezime tout kote nou vle rive aklè :
                        
                        « L'innovation haïtienne au service du monde » (Inovasyon ayisyen nan sèvis lemonn).
                        
                        Fraz sa a montre yon verite fondamantal nan travay nou : gwo difikilte nou rankontre an Ayiti (ti koneksyon entènèt ki fèb, kouran ki koupe, telefòn ki pa gen gwo memwa) se pa sèlman pwoblèm, yo se yon vrè espas aprantisaj pou nou kreye bagay ki pi solid.
                        
                        Yon lojisyèl ki kapab mache vit san entènèt nan Pòtoprens, ki voye ti done rapid lepli vit yon ti siyal parèt, epi ki pa fini batri telefòn moun, se yon lojisyèl ki gen pi gwo kalite pase anpil lòt. Zouti sa yo ap itil moun nan peyi d Ayiti, men y ap itil tou plizyè milyon moun ann Afrik, ann Amerik Latin, ann Azi, e menm nan gwo vil lòt bò dlo k ap chèche zouti ki senp e efikas. Se konsa inovasyon ki fèt lakay nou ka sèvi lemonn antye.
                    """.trimIndent(),
                    plannedStartPage = 99,
                    plannedEndPage = 102,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_20",
                    chapterNumber = 20,
                    partId = "part_2",
                    titleFr = "Chapitre 20 — Technologie, responsabilité et confiance",
                    titleHt = "Chapit 20 — Teknoloji, responsablite ak konfyans",
                    subtitleFr = "Bâtir des systèmes fiables dans un climat d'intégrité",
                    subtitleHt = "Bati sistèm ki solid nan respè ak konfyans",
                    summaryFr = "L'exigence de bâtir une relation de confiance durable avec les usagers, les institutions et la communauté technique internationale.",
                    summaryHt = "Obligasyon pou nou bati yon vrè relasyon konfyans ak tout sitwayen, enstitisyon ak kominote entènasyonal la.",
                    contentFr = """
                        Dans le domaine du numérique, la confiance ne se décrète pas : elle se gagne par la régularité, la fiabilité et le respect scrupuleux des engagements pris. Pour AJ-TECH, la responsabilité est le préalable absolu à toute croissance durable.
                        
                        Cette responsabilité se manifeste dans nos choix quotidiens :
                        - La fiabilité architecturale : tester rigoureusement nos applications avant toute mise à disposition afin d'éviter les pertes de données ou les dysfonctionnements critiques ;
                        - Le refus de la surenchère commerciale : ne jamais survendre les capacités d'un produit ni masquer ses limites techniques actuelles ;
                        - La transparence institutionnelle : publier des rapports d'étape clairs et documenter avec honnêteté nos réussites comme nos difficultés ;
                        - La contribution au bien commun numérique : participer aux discussions ouvertes sur les standards logiciels, l'inclusion numérique et la formation technologique de la jeunesse.
                    """.trimIndent(),
                    contentHt = """
                        Nan domèn teknoloji, moun pa fè w konfyans sou bèl pawòl : se sou bon kalite travay ou, fidelite w ak respè w genyen pou pawòl ou yo jije w. Pou AJ-TECH, pran responsablite se premye kondisyon pou bati yon bagay k ap dire.
                        
                        Responsablite sa a parèt aklè nan tout sa n ap fè :
                        - Solidite sistèm yo : fè tout tès ki nesesè anvan nou bay moun sèvi ak yon zouti pou done yo pa janm pèdi ;
                        - Refize fè kòmès sou manti : pa janm di yon lojisyèl ka fè sa l pa ka fè, epi rekonèt limit teknik nou genyen jodi a ;
                        - Transparans devan tout moun : pibliye bonjan enfòmasyon sou jan travay la ap avanse, ni sou sa ki reyisi ni sou sa ki bay difikilte ;
                        - Ede tout kominote a : patisipe nan tout jefò k ap fèt pou ede jèn yo aprann teknoloji epi bati yon pi bon avni nimerik pou peyi a.
                    """.trimIndent(),
                    plannedStartPage = 103,
                    plannedEndPage = 106,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_21",
                    chapterNumber = 21,
                    partId = "part_2",
                    titleFr = "Chapitre 21 — La culture AJ-TECH",
                    titleHt = "Chapit 21 — Kilti travay AJ-TECH",
                    subtitleFr = "Discipline d'ingénierie, apprentissage autodidacte et entraide",
                    subtitleHt = "Disiplin nan pwogramasyon, aprann poukont ou ak pote men bay lòt",
                    summaryFr = "Les principes de travail d'AJ-TECH : culture de la documentation, frugalité logicielle, autonomie et collaboration bienveillante.",
                    summaryHt = "Kilti travay anndan AJ-TECH : ekri bon dokimantasyon, kreye kòd ki pwòp, travay ak disiplin epi ede lòt kolaboratè.",
                    contentFr = """
                        La culture d'entreprise d'AJ-TECH s'est forgée dans les conditions de son émergence : elle valorise l'autonomie, l'ingéniosité et la discipline personnelle.
                        
                        Travailler au sein d'AJ-TECH ou contribuer à ses projets repose sur quelques principes partagés :
                        - La culture de l'écrit et de la documentation : chaque décision d'architecture, chaque module de code et chaque protocole doit être expliqué avec clarté pour faciliter la transmission du savoir ;
                        - La frugalité logicielle (Software Frugality) : préférer les solutions sobres, légères et directes aux architectures inutilement complexes et consommatrices de ressources ;
                        - L'autonomie et l'esprit d'initiative : encourager chaque membre à explorer, apprendre de nouvelles technologies et proposer des améliorations concrètes ;
                        - La solidarité et l'exigence bienveillante : cultiver un environnement où l'entraide technique est la règle, tout en maintenant un niveau d'exigence élevé sur la qualité du livrable.
                    """.trimIndent(),
                    contentHt = """
                        Kilti travay AJ-TECH soti nan menm kondisyon li te fèt la : li bay anpil valè ak moun ki ka travay poukont yo, ki gen lide entèlijan epi ki gen bonjan disiplin pèsonèl.
                        
                        Travay nan AJ-TECH oswa pote kontribisyon nan pwojè yo mande pou respekte prensip sa yo :
                        - Kilti ekri ak dokimante tout bagay : chak chwa teknik, chak moso kòd dwe byen eksplike pou nenpòt lòt moun ka konprann epi kontinye travay la ;
                        - Kreye lojisyèl ki senp e lejè : chwazi solisyon ki klè epi ki pa mande gwo materyèl ki twò lou pou granmisi ;
                        - Pran inisyativ : ankouraje chak manm nan ekip la chèche konnen, aprann nouvo zouti epi pote bon lide pou amelyore pwojè yo ;
                        - Solidarite ak travay byen fèt : kreye yon lespri kote tout moun pare pou ede lòt, pandan n ap kenbe yon nivo travay trè wo sou kalite sa n ap pwodui a.
                    """.trimIndent(),
                    plannedStartPage = 107,
                    plannedEndPage = 110,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_22",
                    chapterNumber = 22,
                    partId = "part_2",
                    titleFr = "Chapitre 22 — L'ambition de devenir un géant technologique",
                    titleHt = "Chapit 22 — Anbisyon pou vin tounen yon jeyan nan teknoloji",
                    subtitleFr = "Assumer une grande vision tout en reconnaissant les étapes à franchir",
                    subtitleHt = "Pran gwo vizyon an anmenm tan nou rekonèt tout etap ki rete pou n franchi",
                    summaryFr = "Explication de la vision stratégique : une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet.",
                    summaryHt = "Eksplikasyon sou gwo vizyon estratejik la : yon antrepriz ki gen gwo anbisyon k ap konstwi epi k ap dokimante vwayaj li avèk franchiz.",
                    contentFr = """
                        Affirmer l'ambition de « Devenir un géant de la technologie » suscite parfois l'étonnement ou le scepticisme. Pour AJ-TECH, cette ambition n'est pas une prétention vaniteuse, mais la définition claire de la trajectoire que nous avons choisie pour notre pays et notre jeunesse.
                        
                        Nous nous définissons avec exactitude comme :
                        « Une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet. »
                        
                        Cette formule concilie deux impératifs essentiels :
                        - La hauteur de vue : refuser les plafonds d'ambition arbitraires. Si d'autres nations ont su bâtir des géants du numérique à partir d'initiatives modestes, rien n'interdit à Haïti d'édifier sa propre puissance technologique ;
                        - La lucidité sur le présent : reconnaître avec humilité que nous en sommes aux premières étapes de notre construction, que nos produits sont en phase de maturation et de test pilote, et que le sommet exige des années de travail acharné et méthodique.
                    """.trimIndent(),
                    contentHt = """
                        Lè nou di nou vle « Vin tounen yon jeyan nan teknoloji », sa ka siprann kèk moun oswa fè lòt doute. Men pou AJ-TECH, gwo anbisyon sa a se pa lògèy, se chwa klè nou fè pou trase yon nouvo chemen pou peyi nou ak pou tout jèn yo.
                        
                        Nou defini tèt nou aklè konsa :
                        « Yon antrepriz anbisye k ap konstwi ki dokimante vwayaj li nan tout verite pandan l ap monte nan somè a. »
                        
                        Fason sa a kenbe de verite ki enpòtan anpil :
                        - Gwo vizyon pou lavni : refize panse nou twò piti pou nou bati gwo bagay. Si lòt peyi te kòmanse piti pou yo vin gen gwo konpayi nimerik nan mond lan, anyen pa anpeche Ayiti kreye pwòp fòs teknolojik pa l ;
                        - Wè reyalite jodi a klè : rekonèt ak anpil imilite nou nan premye etap konstriksyon an, lojisyèl nou yo nan faz tès ak devlopman, epi rive nan somè a ap mande anpil ane travay di, pasyans ak disiplin.
                    """.trimIndent(),
                    plannedStartPage = 111,
                    plannedEndPage = 114,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_23",
                    chapterNumber = 23,
                    partId = "part_2",
                    titleFr = "Chapitre 23 — Construire sans prétendre être arrivé",
                    titleHt = "Chapit 23 — Bati san nou pa fè kòmsi nou rive deja",
                    subtitleFr = "L'humilité des bâtisseurs et le devoir d'exactitude",
                    subtitleHt = "Imilite moun k ap bati ak obligasyon pou di laverite",
                    summaryFr = "Le respect scrupuleux de la réalité éditoriale : refuser de confondre concept, prototype et solution opérationnelle.",
                    summaryHt = "Respè total pou reyalite a : pa janm konfonn yon senp lide, yon tès k ap fèt ak yon lojisyèl ki fini nèt.",
                    contentFr = """
                        La règle d'or d'AJ-TECH est de construire chaque jour sans jamais prétendre être déjà arrivé à destination. Cette posture d'humilité active est la meilleure protection contre l'illusion et le relâchement.
                        
                        Nous appliquons scrupuleusement les règles de rigueur suivantes :
                        - Ne jamais présenter un concept comme un produit fini ;
                        - Ne jamais présenter un prototype ou une PWA en phase de test pilote (comme AJ-Task) comme une solution commercialisée ou universellement déployée ;
                        - Ne jamais présenter une vision stratégique à 2035 comme une réalité déjà accomplie aujourd'hui ;
                        - Ne jamais transformer une projection financière en chiffre d'affaires réel ;
                        - Ne jamais transformer une intention de collaboration en partenariat contractuel effectif.
                        
                        Cette discipline intellectuelle et morale garantit que chaque pas en avant est un pas solide, vérifié et digne de confiance.
                    """.trimIndent(),
                    contentHt = """
                        Prensip an lò nan AJ-TECH se travay di chak jou san nou pa janm fè kòmsi nou rive nan bout chemen an deja. Fason sa a pèmèt nou rete konsantre, gen imilite epi pa janm pran tèt nou pou sa nou poko ye.
                        
                        Nou respekte règ sa yo san fè koutba :
                        - Pa janm pran yon senp lide (konsèp) pou yon pwodwi ki fini nèt ;
                        - Pa janm fè konprann yon pwototip oswa yon PWA k ap teste (tankou AJ-Task) se yon lojisyèl ki deja sou mache pou vann bay tout moun ;
                        - Pa janm prezante vizyon 2035 lan kòmsi se yon bagay ki gentan fèt jodi a ;
                        - Pa janm pran lajan nou ta renmen fè pou lajan nou gentan genyen nan kès ;
                        - Pa janm pale de yon senp volonte pou travay ak moun kòmsi se yon kontra ki gentan siyen.
                        
                        Disiplin sa a bay garanti chak pa nou fè pi devan se yon pa ki fèm, ki reyèl epi tout moun ka fè konfyans.
                    """.trimIndent(),
                    plannedStartPage = 115,
                    plannedEndPage = 118,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                ),
                BookChapter(
                    id = "ch_2_24",
                    chapterNumber = 24,
                    partId = "part_2",
                    titleFr = "Chapitre 24 — Le manifeste d'une nouvelle génération",
                    titleHt = "Chapit 24 — Manifès yon nouvo jenerasyon",
                    subtitleFr = "Un appel au travail, à la persévérance et à l'élévation collective",
                    subtitleHt = "Yon apèl pou travay, pèseverans ak gwo efò ansanm",
                    summaryFr = "Message d'encouragement et de foi adressé à la jeunesse haïtienne, aux créateurs et à la diaspora pour bâtir l'avenir technologique.",
                    summaryHt = "Mesaj ankourajman ak espwa pou tout jèn ayisyen, kreyatè ak dyaspora a pou nou bati lavni teknolojik peyi nou.",
                    contentFr = """
                        La Partie II de cet ouvrage se conclut par un message solennel d'espoir, d'exigence et de confiance adressé à toute la communauté des bâtisseurs d'avenir :
                        
                        « Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens. »
                        
                        Cette conviction résume l'esprit d'AJ-TECH. Elle s'adresse aux étudiants qui s'initient au code à la lueur d'une lampe de secours, aux développeurs autodidactes qui explorent la documentation technique malgré les coupures de réseau, aux professionnels de la diaspora qui cherchent des moyens concrets de contribuer au renouveau national, et à tous les citoyens qui refusent la résignation.
                        
                        Le chemin vers l'excellence technologique est exigeant, mais les capacités existent et la détermination est totale. Avec de la méthode, de la discipline et un travail acharné, notre génération posera les fondations d'un écosystème numérique solide, autonome et respecté dans le monde entier.
                    """.trimIndent(),
                    contentHt = """
                        Pati II liv sa a fini ak yon gwo mesaj espwa, disiplin ak konfyans pou tout moun ki vle bati yon pi bon demen :
                        
                        « Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou nou rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo. »
                        
                        Konviksyon sa a rezime tout kè ak nanm AJ-TECH. Li pale ak chak etidyan k ap aprann pwograme anba ti limyè rechajab, ak chak devlopè k ap etidye kòd malgre tout pwoblèm entènèt, ak tout frè ak sè nou nan dyaspora a k ap chèche bonjan fason pou ede peyi a vanse, epi ak chak sitwayen ki refize bese bra.
                        
                        Wout pou rive nan gwo nivo teknoloji a pa fasil, men nou gen fòs, nou gen entèlijans epi volonte nou solid. Avèk bon metòd, bon disiplin ak travay di chak jou, jenerasyon nou an pral bati yon ekosistèm nimerik ki djanm, endepandan epi tout moun sou latè ap respekte.
                    """.trimIndent(),
                    plannedStartPage = 119,
                    plannedEndPage = 124,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.IN_PROGRESS
                )
            )
        ),

        // ==================== PARTIE III ====================
        Part3Data.part3,


        // ==================== PARTIE IV ====================
        Part4Data.part4,

        // ==================== PARTIE V ====================
        Part5Data.part5,

        // ==================== PARTIE VI ====================
        Part6Data.part6,

        // ==================== PARTIE VII ====================
        Part7Data.part7,

        // ==================== PARTIE VIII ====================
        BookPart(
            id = "part_8",
            partNumber = 8,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE VIII — Gouvernance et organisation",
            titleHt = "PATI VIII — Gouvènans ak òganizasyon",
            subtitleFr = "Structure juridique, éthique des données et culture d'entreprise",
            subtitleHt = "Estrikti legal, etik done ak kilti antrepriz",
            plannedPages = "pp. 151–164",
            status = BookContentStatus.PLANNED,
            chapters = listOf(
                BookChapter(
                    id = "ch_8_1",
                    chapterNumber = 9,
                    partId = "part_8",
                    titleFr = "9. Gouvernance Éthique & Souveraineté des Données",
                    titleHt = "9. Bonjan Gouvènans & Pwoteksyon Done",
                    subtitleFr = "Protection de la vie privée et conformité aux standards mondiaux",
                    subtitleHt = "Pwoteksyon lavi prive ak respè estanda entènasyonal yo",
                    summaryFr = "Principes de gouvernance assurant la sécurité des utilisateurs et la protection des données citoyennes.",
                    summaryHt = "Prensip gouvènans pou pwoteje done tout moun ak respekte vi prive sitwayen yo.",
                    contentFr = """
                        La confiance est la monnaie ultime du numérique. AJ-TECH met en place des politiques strictes de non-revente des données et de chiffrement de bout en bout pour l'ensemble de ses applications.
                    """.trimIndent(),
                    contentHt = """
                        Konfyans se pi gwo richès nan zafè dijital. AJ-TECH pran angajman pou l pa janm vann done moun epi pou l pwoteje tout enfòmasyon ak bonjan sekirite.
                    """.trimIndent(),
                    plannedStartPage = 151,
                    plannedEndPage = 164,
                    estimatedReadMinutes = 4,
                    status = BookContentStatus.PLANNED
                )
            )
        ),

        // ==================== PARTIE IX ====================
        BookPart(
            id = "part_9",
            partNumber = 9,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE IX — Innovation, IA et technologies futures",
            titleHt = "PATI IX — Inovasyon, IA ak teknoloji lavni",
            subtitleFr = "Intelligence artificielle adaptée, traitement automatique du créole haïtien",
            subtitleHt = "Entèlijans atifisyèl ki konprann kreyòl ayisyen ak teknoloji lavni",
            plannedPages = "pp. 165–178",
            status = BookContentStatus.PLANNED,
            chapters = listOf(
                BookChapter(
                    id = "ch_9_1",
                    chapterNumber = 10,
                    partId = "part_9",
                    titleFr = "10. L'Intelligence Artificielle en Contexte Haïtien",
                    titleHt = "10. Entèlijans Atifisyèl nan Reyalite Ayisyen",
                    subtitleFr = "Modèles de langage pour le créole et assistance automatisée",
                    subtitleHt = "Modèl langaj pou kreyòl ak asistans otomatik",
                    summaryFr = "L'intégration de l'IA dans AJ-Assistant et AJ-MathQuest pour l'apprentissage interactif.",
                    summaryHt = "Itilizasyon IA nan AJ-Assistant ak AJ-MathQuest pou ede elèv yo aprann pi fasil.",
                    contentFr = """
                        L'IA ne doit pas être un luxe réservé aux pays industrialisés. AJ-TECH explore des modèles légers d'IA capables de traiter le créole haïtien et de fonctionner sur des appareils modestes.
                    """.trimIndent(),
                    contentHt = """
                        Entèlijans atifisyèl pa dwe pou peyi rich yo sèlman. AJ-TECH ap travay sou modèl ki konprann kreyòl ayisyen epi ki ka mache sou telefòn ki pa chè.
                    """.trimIndent(),
                    plannedStartPage = 165,
                    plannedEndPage = 178,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.PLANNED
                )
            )
        ),

        // ==================== PARTIE X ====================
        BookPart(
            id = "part_10",
            partNumber = 10,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE X — Expansion internationale",
            titleHt = "PATI X — Ekspansyon entènasyonal",
            subtitleFr = "De la Caraïbe aux marchés émergents mondiaux",
            subtitleHt = "Soti nan Karayib la rive nan tout mache mondyal yo",
            plannedPages = "pp. 179–190",
            status = BookContentStatus.PLANNED,
            chapters = listOf(
                BookChapter(
                    id = "ch_10_1",
                    chapterNumber = 11,
                    partId = "part_10",
                    titleFr = "11. Exporter l'Ingénierie Haïtienne",
                    titleHt = "11. Ekspòte Enjenyeri Ayisyen an",
                    subtitleFr = "Des solutions éprouvées localement pour les marchés mondiaux",
                    subtitleHt = "Solisyon ki mache byen lakay pou vann lòt bò dlo",
                    summaryFr = "La stratégie d'exportation des briques logicielles d'AJ-TECH vers la Caraïbe, l'Afrique et l'Amérique latine.",
                    summaryHt = "Estrateji pou vann lojisyèl AJ-TECH nan peyi Karayib, Afrik ak Amerik Latin.",
                    contentFr = """
                        Les défis que nous résolvons en Haïti existent dans des dizaines d'autres pays du Sud global. En concevant des logiciels robustes, AJ-TECH prépare l'exportation de sa valeur technologique.
                    """.trimIndent(),
                    contentHt = """
                        Defi nou rankontre Ayiti yo egziste nan anpil lòt peyi nan mond lan. Lè nou kreye lojisyèl solid, AJ-TECH ap prepare pou ekspòte valè sa a tout kote.
                    """.trimIndent(),
                    plannedStartPage = 179,
                    plannedEndPage = 190,
                    estimatedReadMinutes = 4,
                    status = BookContentStatus.PLANNED
                )
            )
        ),

        // ==================== PARTIE XI ====================
        BookPart(
            id = "part_11",
            partNumber = 11,
            type = PartType.MAIN_PART,
            titleFr = "PARTIE XI — Vision 2035 et héritage",
            titleHt = "PATI XI — Vizyon 2035 ak eritaj",
            subtitleFr = "L'aboutissement d'une décennie d'efforts et le legs aux générations futures",
            subtitleHt = "Rezilta 10 lane travay di ak sa n ap kite pou jenerasyon k ap vini yo",
            plannedPages = "pp. 191–200",
            status = BookContentStatus.AVAILABLE,
            chapters = listOf(
                BookChapter(
                    id = "ch_11_1",
                    chapterNumber = 12,
                    partId = "part_11",
                    titleFr = "12. Le Legs Technologique pour 2035",
                    titleHt = "12. Eritaj Teknoloji pou 2035",
                    subtitleFr = "Une Haïti productrice de technologies et pôle d'innovation reconnu",
                    subtitleHt = "Yon Ayiti ki pwodui teknoloji epi kote lemonn rekonèt talan li",
                    summaryFr = "Conclusion sur l'engagement d'AJ-TECH et l'appel final aux forces vives de la nation.",
                    summaryHt = "Konklizyon sou angajman AJ-TECH ak dènye apèl pou tout moun ki kwè nan lavni peyi a.",
                    contentFr = """
                        En 2035, l'histoire retiendra que des femmes et des hommes ont refusé la fatalité et ont choisi de bâtir pierre par pierre un écosystème numérique solide.
                        
                        AJ-TECH n'est que l'étincelle de ce mouvement. Le reste appartient à chaque Haïtien qui décide aujourd'hui d'apprendre, de coder et d'innover.
                    """.trimIndent(),
                    contentHt = """
                        An 2035, listwa ap sonje te gen gason ak fanm ki te refize bese bra epi ki te chwazi bati, moso pa moso, yon gran ekosistèm nimerik.
                        
                        AJ-TECH se sèlman premye etap mouvman sa a. Rès la nan men chak Ayisyen ki chwazi jodi a pou l aprann, pwograme ak inove.
                    """.trimIndent(),
                    plannedStartPage = 191,
                    plannedEndPage = 200,
                    estimatedReadMinutes = 5,
                    status = BookContentStatus.AVAILABLE
                )
            )
        ),

        // ==================== ANNEXES & GLOSSAIRE ====================
        BookPart(
            id = "part_annexes",
            partNumber = null,
            type = PartType.BACK_MATTER,
            titleFr = "ANNEXES & Glossaire",
            titleHt = "ANÈKS & Glosè",
            subtitleFr = "Fiche technique d'édition et lexique des termes clés",
            subtitleHt = "Fich teknik edisyon ak eksplikasyon mo enpòtan yo",
            plannedPages = "pp. 201–210",
            status = BookContentStatus.AVAILABLE,
            chapters = listOf(
                BookChapter(
                    id = "annex_specs",
                    chapterNumber = 13,
                    partId = "part_annexes",
                    titleFr = "Fiche Technique d'Édition",
                    titleHt = "Fich Teknik Edisyon",
                    subtitleFr = "Spécifications prévues pour l'ouvrage imprimé et numérique",
                    subtitleHt = "Detay teknik pou enpresyon ak vèsyon nimerik la",
                    summaryFr = "Format d'impression 6x9 pouces, standard CMYK, ISBN à attribuer et engagements de transparence.",
                    summaryHt = "Fòma 6x9 pous, estanda koulè CMYK, ISBN ki gen pou bay ak angajman transparans.",
                    contentFr = """
                        Spécifications éditoriales prévues :
                        - Titre : AJ-TECH — L'Écosystème Numérique Haïtien
                        - Slogan : Vision, Technologie et Avenir
                        - Devise : L'innovation haïtienne au service du monde
                        - Auteur : Jonathan Germain (Fondateur d'AJ-TECH)
                        - Format : 6 x 9 pouces (15.24 x 22.86 cm)
                        - Pagination prévue : ~200 pages
                        - ISBN : À attribuer
                        - Couleurs : Quadrichromie CMYK haute fidélité (Bleu Roi #0A192F, Or #FFD700, Rouge Haïtien #D21034).
                    """.trimIndent(),
                    contentHt = """
                        Detay sou liv la :
                        - Tit : AJ-TECH — L'Écosystème Numérique Haïtien
                        - Slogan : Vision, Technologie et Avenir
                        - Deviz : L'innovation haïtienne au service du monde
                        - Otè : Jonathan Germain (Fondatè AJ-TECH)
                        - Fòma : 6 x 9 pous (15.24 x 22.86 cm)
                        - Kantite paj prevwa : ~200 paj
                        - ISBN : Gen pou bay
                        - Koulè : Ble Woyal (#0A192F), Lò (#FFD700), Wouj Ayisyen (#D21034).
                    """.trimIndent(),
                    plannedStartPage = 201,
                    plannedEndPage = 205,
                    estimatedReadMinutes = 3,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "annex_glossaire",
                    chapterNumber = 14,
                    partId = "part_annexes",
                    titleFr = "Glossaire Technologique",
                    titleHt = "Glosè Teknoloji",
                    subtitleFr = "Définition des concepts informatiques et d'écosystème",
                    subtitleHt = "Eksplikasyon tèm enfòmatik ak ekosistèm yo",
                    summaryFr = "Définitions claires des termes PWA, Offline-First, IndexedDB, Cloud souverain et API.",
                    summaryHt = "Eksplikasyon senp sou mo tankou PWA, Offline-First, IndexedDB, Cloud ak API.",
                    contentFr = """
                        - PWA (Progressive Web App) : Application web moderne capable de s'installer sur l'écran d'accueil et de fonctionner hors-ligne.
                        - Offline-First : Méthode de conception logicielle qui stocke d'abord les données sur l'appareil de l'utilisateur.
                        - Cloud Souverain : Infrastructure d'hébergement informatique gérée sous juridiction nationale et garantissant la maîtrise des données.
                        - Interopérabilité : Capacité de différents logiciels de l'écosystème à communiquer et échanger des données de façon sécurisée.
                    """.trimIndent(),
                    contentHt = """
                        - PWA (Progressive Web App) : Aplikasyon web modèn ki ka enstale sou telefòn lan epi mache menm san entènèt.
                        - Offline-First : Metòd pwogramasyon ki sove done yo sou aparèy la an premye.
                        - Cloud Nasyonal : Sèvè enfòmatik ki kontwole nan peyi a pou done sitwayen yo rete an sekirite.
                        - Entè-operabilite : Kapasite pou divès lojisyèl nan ekosistèm nan kominike epi pataje enfòmasyon byen fasil.
                    """.trimIndent(),
                    plannedStartPage = 206,
                    plannedEndPage = 210,
                    estimatedReadMinutes = 4,
                    status = BookContentStatus.AVAILABLE
                )
            )
        )
    )

    val allChapters: List<BookChapter> by lazy {
        parts.flatMap { it.chapters }
    }

    fun getChapterById(id: String): BookChapter? {
        return allChapters.find { it.id == id }
    }

    fun getPartByChapterId(chapterId: String): BookPart? {
        return parts.find { part -> part.chapters.any { it.id == chapterId } }
    }

    fun getPreviousChapter(currentId: String): BookChapter? {
        val index = allChapters.indexOfFirst { it.id == currentId }
        return if (index > 0) allChapters[index - 1] else null
    }

    fun getNextChapter(currentId: String): BookChapter? {
        val index = allChapters.indexOfFirst { it.id == currentId }
        return if (index >= 0 && index < allChapters.size - 1) allChapters[index + 1] else null
    }

    fun searchBook(query: String, language: BookLanguage = BookLanguage.FRENCH): List<BookChapter> {
        if (query.isBlank()) return allChapters
        val lowercaseQuery = query.lowercase()
        return allChapters.filter { chapter ->
            val title = if (language == BookLanguage.FRENCH) chapter.titleFr else chapter.titleHt
            val subtitle = if (language == BookLanguage.FRENCH) chapter.subtitleFr else chapter.subtitleHt
            val summary = if (language == BookLanguage.FRENCH) chapter.summaryFr else chapter.summaryHt
            val content = if (language == BookLanguage.FRENCH) chapter.contentFr else chapter.contentHt
            
            title.lowercase().contains(lowercaseQuery) ||
                    subtitle.lowercase().contains(lowercaseQuery) ||
                    summary.lowercase().contains(lowercaseQuery) ||
                    content.lowercase().contains(lowercaseQuery)
        }
    }
}
