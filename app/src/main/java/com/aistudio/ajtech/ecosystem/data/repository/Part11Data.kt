package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE XI — HORIZON 2035 : CONSTRUIRE L’AVENIR NUMÉRIQUE HAÏTIEN
 * PATI XI — ORIZON 2035 : KONSTWI LAVNI NIMERIK AYITI
 * 
 * Sous-titre FR : Vision, héritage, gouvernance et feuille de route vers un écosystème technologique durable
 * Soutit HT : Vizyon, eritaj, gouvènans ak plan estratejik pou yon ekosistèm teknolojik dirab
 * 
 * Pages : 199–214
 * Statut : IN_PROGRESS
 * Chapitres 152 à 166 (Exactement 15 chapitres).
 */
object Part11Data {

    val part11: BookPart = BookPart(
        id = "part_11",
        partNumber = 11,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE XI — HORIZON 2035 : CONSTRUIRE L’AVENIR NUMÉRIQUE HAÏTIEN",
        titleHt = "PATI XI — ORIZON 2035 : KONSTWI LAVNI NIMERIK AYITI",
        subtitleFr = "Vision, héritage, gouvernance et feuille de route vers un écosystème technologique durable",
        subtitleHt = "Vizyon, eritaj, gouvènans ak plan estratejik pou yon ekosistèm teknolojik dirab",
        plannedPages = "pp. 199–214",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 152 : La vision AJ-TECH à l’horizon 2035 ====================
            BookChapter(
                id = "ch_11_152",
                chapterNumber = 152,
                partId = "part_11",
                titleFr = "Chapitre 152 — La vision AJ-TECH à l’horizon 2035",
                titleHt = "Chapit 152 — Vizyon AJ-TECH pou 2035",
                subtitleFr = "Devenir un géant de la technologie au service d'Haïti et du monde : une décennie pour transformer le destin numérique national",
                subtitleHt = "Vin yon jeyan nan teknoloji nan sèvis Ayiti ak tout lemonn : dis lane pou transfòme lavni nimerik nasyon an",
                summaryFr = "Présentation fondamentale de la Vision 2035 d'AJ-TECH : mission, vision cardinale, slogan, devise et posture de vérité guidant l'écosystème sur dix ans.",
                summaryHt = "Gwo prezantasyon fondamantal Vizyon 2035 AJ-TECH : misyon, gwo vizyon, eslogan, deviz ak prensip verite k ap gide ekosistèm nan sou dis lane.",
                contentFr = """
                    1. La mission fondamentale :
                    « AJ-TECH a pour mission de mettre Haïti sur l'échelle mondiale dans la technologie et de faciliter l'accès de tous à la technologie. »
                    
                    2. La vision cardinale :
                    « Devenir un géant de la technologie. »
                    
                    3. Signification de l'horizon 2035 :
                    L'année 2035 ne constitue pas une promesse magique ou une prédiction présomptueuse, mais une boussole stratégique audacieuse. Elle incarne l'aboutissement prévisionnel d'une décennie d'efforts méthodiques, d'apprentissage continu et de construction patiente, transformant une aspiration patriotique en une puissance d'ingénierie logicielle reconnue.
                    
                    4. Les piliers directeurs :
                    - Slogan officiel : « Vision, Technologie et Avenir » ;
                    - Devise d'action : « L'innovation haïtienne au service du monde » ;
                    - Posture de vérité : « Une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet. »
                """.trimIndent(),
                contentHt = """
                    1. Gwo misyon fondamantal la :
                    « AJ-TECH gen misyon pou mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji. »
                    
                    2. Gwo vizyon prensipal la :
                    « Vin yon jeyan nan teknoloji. »
                    
                    3. Kisa ane 2035 la vle di pou nou :
                    Ane 2035 la pa yon kado majik k ap tonbe sot nan syèl la san travay, men se yon gwo bousòl ki klè. Li reprezante rezilta 10 lane travay di san pran souf, aprann chak jou epi bati ti pa ti pa pou fè rèv sa a tounen yon gwo reyalite solid.
                    
                    4. Gwo prensip k ap gide nou :
                    - Eslogan ofisyèl : « Vizyon, Teknoloji ak Lavni » ;
                    - Deviz travay la : « Inovasyon ayisyen an nan sèvis lemonn » ;
                    - Pawòl verite a : « Yon antrepriz ki gen gwo anbisyon k ap bati ti pa ti pa epi k ap ekri tout verite sou wout li pou rive nan somè a. »
                """.trimIndent(),
                plannedStartPage = 199,
                plannedEndPage = 200,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 153 : Construire sur les fondations de 2026 ====================
            BookChapter(
                id = "ch_11_153",
                chapterNumber = 153,
                partId = "part_11",
                titleFr = "Chapitre 153 — Construire sur les fondations de 2026",
                titleHt = "Chapit 153 — Konstwi sou fondasyon 2026 yo",
                subtitleFr = "Consolidation des premiers prototypes, rigueur documentaire et capitalisation sur l'existant",
                subtitleHt = "Ranfòse premye pwototip yo, kenbe bonjan dokiman epi bati sou sa ki deja la a",
                summaryFr = "L'ancrage sur les acquis de l'année 2026 : stabiliser le socle PWA Offline-First, valider les premières applications et structurer les processus internes.",
                summaryHt = "Chita byen sou sa nou reyalize an 2026 : rann sistèm PWA yo pi djanm, valide premye aplikasyon yo epi mete lòd nan travay la.",
                contentFr = """
                    1. La valeur irremplaçable des fondations :
                    Aucune cathédrale technologique ne s'élève sans fondations stables. L'année 2026 marque le passage décisif de l'idée abstraite au code tangible, en matérialisant les premières briques fonctionnelles d'AJ-TECH.
                    
                    2. Les acquis structurants de 2026 :
                    - La validation concrète de l'architecture PWA Offline-First avec AJ-Task ;
                    - L'établissement d'une identité visuelle et d'un design system unifié inspiré de Material Design 3 ;
                    - La cartographie rigoureuse des 22 entités écosystémiques ;
                    - La rédaction de ce Livre Compagnon en tant que référence doctrinale et pédagogique.
                    
                    3. La discipline de capitalisation :
                    Construire sur les fondations de 2026 signifie refuser la dispersion : chaque nouveau projet doit réutiliser les composants testés, consolider la dette technique et s'insérer harmonieusement dans le schéma directeur global.
                """.trimIndent(),
                contentHt = """
                    1. Valè fondasyon yo :
                    Ou pa ka bati yon gwo kay si fondasyon an pa solid. Ane 2026 la se moman kote lide yo tounen vrè kòd ak vrè aplikasyon sou telefòn ak òdinatè, pou mete premye gwo baz AJ-TECH yo.
                    
                    2. Sa nou deja reyalize an 2026 :
                    - Prèv ke aplikasyon PWA ki mache san entènèt (Offline-First) tankou AJ-Task fonksyone byen ;
                    - Bèl desen ak koulè ofisyèl ki klè dapre prensip Material Design 3 ;
                    - Plan klè pou 22 antite ki nan ekosistèm nan ;
                    - Ekri gwo liv sa a pou sèvi gid ak referans pou tout moun.
                    
                    3. Disiplin pou bati sou sa ki la a :
                    Bati sou fondasyon 2026 yo vle di pa kouri nan tout sans : chak nouvo pwojè dwe sèvi ak zouti nou te deja verifye yo, pa kreye erè initil, epi mache dwat nan menm direksyon an.
                """.trimIndent(),
                plannedStartPage = 201,
                plannedEndPage = 201,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 154 : Une technologie pensée pour les réalités haïtiennes ====================
            BookChapter(
                id = "ch_11_154",
                chapterNumber = 154,
                partId = "part_11",
                titleFr = "Chapitre 154 — Une technologie pensée pour les réalités haïtiennes",
                titleHt = "Chapit 154 — Yon teknoloji ki fèt pou reyalite ayisyen yo",
                subtitleFr = "Résilience énergétique, connectivité intermittente, accessibilité économique et ergonomie intuitive",
                subtitleHt = "Rezistans kouran, entènèt ki konn koupe, pri abòdab ak ekran ki fasil pou tout moun konprann",
                summaryFr = "Concevoir le logiciel sous contrainte extrême haïtienne : fonctionnement hors-ligne, consommation de données ultra-réduite et interfaces inclusives bilingues.",
                summaryHt = "Fason pou kode lojisyèl nan difikilte peyi Dayiti : mache san entènèt, pa vide batri ni pran twòp done, epi sèvi ak Kreyòl pou tout moun alèz.",
                contentFr = """
                    1. L'ingénierie sous contrainte extrême :
                    En Haïti, la coupure d'électricité et l'intermittence du réseau télécom ne sont pas des anomalies exceptionnelles : ce sont les conditions opérationnelles normales. Tout logiciel exigeant une connexion permanente à haut débit est voué à l'échec sur notre territoire.
                    
                    2. Les choix d'architecture adaptés :
                    - Primauté du stockage local (IndexedDB, Room Database) permettant une utilisation ininterrompue hors-ligne ;
                    - Synchronisation asynchrone intelligente en arrière-plan dès le retour de la connectivité ;
                    - Optimisation drastique du poids des assets pour préserver les forfaits de données mobiles coûteux des utilisateurs.
                    
                    3. L'inclusion culturelle et linguistique :
                    Une technologie pour Haïti doit parler la langue du peuple. Le bilinguisme intégral (Français et Kreyòl Ayisyen) et l'adoption de parcours utilisateurs intuitifs garantissent que nul n'est exclu de la révolution numérique en marche.
                """.trimIndent(),
                contentHt = """
                    1. Kode pou reyalite peyi nou :
                    An Ayiti, kouran ki koupe ak entènèt ki ralanti se pa bagay etranj : se konsa peyi a ye chak jou. Nenpòt aplikasyon ki bezwen gwo entènèt tout tan ap kraze fasil epi moun pap ka sèvi avè l.
                    
                    2. Bonjan chwa teknik nou fè :
                    - Mete tout done yo sou telefòn lan an premye (IndexedDB, Room) pou aplikasyon an pa janm bloke menm san entènèt ;
                    - Voye enfòmasyon yo sou sèvè dousman lè entènèt la tounen san deranje itilizatè a ;
                    - Fè fichye yo lejè anpil pou yo pa fin manje ti plan entènèt moun yo.
                    
                    3. Mete tout moun alèz ak lang yo :
                    Teknoloji pou Ayiti dwe pale lang tout pèp la. Lè nou mete ni Fransè ni Kreyòl Ayisyen nan tout ekran yo epi nou fè yo senp, tout sitwayen ka patisipe san baryè.
                """.trimIndent(),
                plannedStartPage = 202,
                plannedEndPage = 202,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 155 : Frugalité, efficacité et innovation durable ====================
            BookChapter(
                id = "ch_11_155",
                chapterNumber = 155,
                partId = "part_11",
                titleFr = "Chapitre 155 — Frugalité, efficacité et innovation durable",
                titleHt = "Chapit 155 — Frigalite, efikasite ak inovasyon dirab",
                subtitleFr = "L'ingénierie sobre comme avantage compétitif : maximiser la valeur sans gaspillage de ressources computationnelles",
                subtitleHt = "Enjenyeri san gaspiyaj kòm yon gwo fòs : fè pi bon bagay ak mwens mwayen san kraze telefòn moun",
                summaryFr = "La doctrine de la frugalité logicielle d'AJ-TECH : optimisation de la mémoire, limitation de l'obsolescence matérielle et durabilité environnementale.",
                summaryHt = "Prensip frigalite lojisyèl AJ-TECH : pa gaspiye memwa RAM, fè lojisyèl mache sou vye telefòn tou epi pwoteje batri ak anviwònman an.",
                contentFr = """
                    1. La frugalité comme philosophie de conception :
                    L'industrie technologique mondiale souffre d'un gaspillage effréné de ressources : frameworks surchargés, serveurs énergivores et obsolescence programmée. AJ-TECH adopte une démarche inverse, celle de l'innovation frugale (Jugaad) élevée au rang de doctrine d'ingénierie.
                    
                    2. Les critères de l'efficacité logicielle sobre :
                    - Minimisation stricte de l'empreinte mémoire (RAM) et des cycles processeur (CPU) ;
                    - Prolongation de la durée de vie utile des smartphones d'entrée de gamme et reconditionnés ;
                    - Réduction drastique de la consommation énergétique pour préserver l'autonomie des batteries dans les zones sans réseau électrique stable.
                    
                    3. De la contrainte locale à l'avantage mondial :
                    Ce qui est conçu avec sobriété pour Haïti s'avère infiniment plus rapide, résilient et écologique que les standards occidentaux lorsqu'il est déployé à l'échelle internationale.
                """.trimIndent(),
                contentHt = """
                    1. Frigalite kòm yon gwo prensip travay :
                    Gwo konpayi deyò yo gen tandans kreye lojisyèl ki twò lou, ki mande gwo òdinatè chè epi ki fòse moun chanje telefòn chak ane. AJ-TECH chwazi yon lòt wout : fè bèl bagay ki itil ak ti mwayen san gaspiye anyen.
                    
                    2. Règleman pou kòd ki lejè epi ki efikas :
                    - Pa pran twòp memwa (RAM) ni chofe processeur telefòn lan ;
                    - Fè lojisyèl yo ka mache menm sou telefòn senp ak ti telefòn dezyèm men ;
                    - Pa vide batri a vit, pou moun ka sèvi ak telefòn yo menm lè yo pa gen kouran pou chaje l.
                    
                    3. Sa ki bon pou Ayiti bon pou tout lemonn :
                    Yon aplikasyon ki fèt ak lespri sa a ap kouri pi vit, li pap janm plante, epi tout moun nan lemonn ap renmen l paske li respekte resous yo.
                """.trimIndent(),
                plannedStartPage = 203,
                plannedEndPage = 203,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 156 : Gouverner un écosystème technologique ====================
            BookChapter(
                id = "ch_11_156",
                chapterNumber = 156,
                partId = "part_11",
                titleFr = "Chapitre 156 — Gouverner un écosystème technologique",
                titleHt = "Chapit 156 — Gouvène yon ekosistèm teknolojik",
                subtitleFr = "Pôles métier, indépendance des modules, responsabilité collégiale et pilotage stratégique",
                subtitleHt = "Gwoup travay, modil endepandan, responsablite pataje ak direksyon estratejik klè",
                summaryFr = "Principes d'organisation et de gouvernance d'AJ-TECH pour piloter 22 entités sans bureaucratie étouffante ni dispersion stérile.",
                summaryHt = "Fason pou dirije ak òganize 22 antite AJ-TECH yo pou yo travay ansanm san dezòd, san gaspiye tan epi ak responsablite klè.",
                contentFr = """
                    1. La complexité d'un écosystème multi-entités :
                    Piloter 22 entités technologiques coordonnées requiert un modèle de gouvernance à la fois rigoureux et décentralisé, évitant les lourdeurs bureaucratiques tout en maintenant une vision d'ensemble cohérente.
                    
                    2. L'organisation en pôles complémentaires :
                    - Pôle Productivité et Outils : AJ-Task, AJ-Cloud ;
                    - Pôle Éducation et Savoir : EDUKA, AJ-Learn, AJ-MathQuest, EDH ;
                    - Pôle Finance et Commerce : AJ-Pay, AJ-Wallet, AJ-Commerce, AJ-Biz ;
                    - Pôle Communication et Média : AJ-Chat, AJ-Meet, AJ-Mail, AJ-Studio, AJ-Dev ;
                    - Pôle Santé et Citoyenneté : AJ-Bioklin, AJ-Fitness, AJ-Tè, AJ-Maps, AJ-Assistant ;
                    - Pôle Philanthropie et Écosystème : AJ-Fondation, AJ-TECH.
                    
                    3. Principes directeurs de gouvernance :
                    - Autonomie modulaire : chaque entité doit pouvoir fonctionner isolément sans bloquer les autres ;
                    - Interopérabilité par API unifiées : partage sécurisé des identités et des formats de données ;
                    - Collégialité et révision par les pairs : aucune décision architecturale majeure n'est prise sans revue critique documentée.
                """.trimIndent(),
                contentHt = """
                    1. Jan pou n dirije yon gwo ekosistèm konsa :
                    Menm jan yon gwo kò gen plizyè manm k ap travay ansanm, jere 22 pwojè teknolojik mande yon bonjan sistèm lidèchip ki klè, ki pa nan pèdi tan nan papye initil, men ki kenbe tout moun sou menm liy lan.
                    
                    2. Òganize pwojè yo an gwoup ki mache ansanm :
                    - Gwoup Travay ak Òdinatè : AJ-Task, AJ-Cloud ;
                    - Gwoup Edikasyon ak Fòmasyon : EDUKA, AJ-Learn, AJ-MathQuest, EDH ;
                    - Gwoup Lajan ak Komès : AJ-Pay, AJ-Wallet, AJ-Commerce, AJ-Biz ;
                    - Gwoup Kominikasyon ak Medya : AJ-Chat, AJ-Meet, AJ-Mail, AJ-Studio, AJ-Dev ;
                    - Gwoup Sante ak Sèvis Pèp la : AJ-Bioklin, AJ-Fitness, AJ-Tè, AJ-Maps, AJ-Assistant ;
                    - Gwoup Èd ak Fondasyon : AJ-Fondation, AJ-TECH.
                    
                    3. Gwo règleman pou tout bagay mache byen :
                    - Chak pwojè dwe ka fonksyone poukont li menm si yon lòt gen pann ;
                    - Tout sistèm yo dwe ka pale youn ak lòt san baryè ;
                    - Gade kòd ak plan tout moun anvan n aplike yo pou n pa fè erè.
                """.trimIndent(),
                plannedStartPage = 204,
                plannedEndPage = 204,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 157 : La confiance comme infrastructure invisible ====================
            BookChapter(
                id = "ch_11_157",
                chapterNumber = 157,
                partId = "part_11",
                titleFr = "Chapitre 157 — La confiance comme infrastructure invisible",
                titleHt = "Chapit 157 — Konfyans kòm enfrastrikti envizib",
                subtitleFr = "Transparence totale, protection de la vie privée, sécurité cryptographique et éthique des données",
                subtitleHt = "Tout verite klè, pwoteje vi prive moun, bon sekirite enfòmatik ak respè pou done tout sitwayen",
                summaryFr = "La confiance des utilisateurs est le capital le plus précieux : transparence sans faille, refus de la monétisation prédatrice des données et sécurité by design.",
                summaryHt = "Konfyans pèp la se pi gwo richès yon antrepriz : pa vann done moun bay etranje, mete gwo sekirite epi di verite sou tout bagay.",
                contentFr = """
                    1. La confiance, socle premier de la technologie :
                    Dans un monde saturé de promesses non tenues et de dérives marchandes, la confiance n'est pas un concept marketing : c'est une infrastructure invisible mais indispensable. Sans elle, aucune adoption pérenne n'est possible.
                    
                    2. Les piliers de la confiance chez AJ-TECH :
                    - L'éthique de la donnée : nous refusons formellement la revente de données personnelles ou l'exploitation opaque des profils de nos concitoyens ;
                    - La sécurité cryptographique : mise en œuvre rigoureuse des algorithmes modernes de chiffrement (AES-256, TLS 1.3) pour protéger l'intimité numérique ;
                    - La transparence d'ingénierie : distinction systématique entre ce qui fonctionne réellement, ce qui est en développement et ce qui relève de la vision stratégique.
                    
                    3. Construire la réputation sur la vérité :
                    AJ-TECH prouve sa valeur par son code et ses livrables concrets, rejetant toute forme de complaisance ou d'artifice publicitaire.
                """.trimIndent(),
                contentHt = """
                    1. Konfyans se pi gwo fondasyon teknoloji :
                    Nan yon mond kote gen twòp manti ak twòp magouy, konfyans se tankou yon gwo poto kache : si l pa la, tout bagay ap tonbe. Moun pap janm sèvi ak yon lojisyèl si yo pa gen konfyans nan li.
                    
                    2. Sa k fè moun gen konfyans nan AJ-TECH :
                    - Respè pou done moun : nou pap janm vann enfòmasyon prive pèsonn bay okenn konpayi ;
                    - Bonjan kle sekirite : sèvi ak pi bon kòd chifreman (AES-256) pou pèsonn pa ka vòlè enfòmasyon itilizatè yo ;
                    - Verite sou tout bagay : toujou di klèman sa k mache jodi a, sa n ap travay sou li ak sa k se lide pou demen.
                    
                    3. Bati yon non sou verite :
                    AJ-TECH montre sa l vo nan sa l kreye ak de men l, pa nan bèl pawòl san prèv.
                """.trimIndent(),
                plannedStartPage = 205,
                plannedEndPage = 205,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 158 : Le capital humain au centre du projet ====================
            BookChapter(
                id = "ch_11_158",
                chapterNumber = 158,
                partId = "part_11",
                titleFr = "Chapitre 158 — Le capital humain au centre du projet",
                titleHt = "Chapit 158 — Kapital imen an nan sant pwojè a",
                subtitleFr = "Valorisation des talents locaux, équité, épanouissement intellectuel et dignité du travailleur tech",
                subtitleHt = "Bay talan nan peyi a valè, jistis, grandi nan konesans ak diyite pou tout moun k ap travay nan teknoloji",
                summaryFr = "L'humain avant la machine : placer les développeurs, designers et formateurs haïtiens au cœur de l'équation de développement d'AJ-TECH.",
                summaryHt = "Moun anvan machin : mete devlopè, desinatè ak pwofesè ayisyen yo nan sant tout sa n ap fè pou yo ka fleri ak diyite.",
                contentFr = """
                    1. L'illusion du tout-technologique :
                    La technologie n'est qu'un amplificateur de la volonté humaine. Sans ingénieurs passionnés, sans designers rigoureux et sans éducateurs dévoués, les serveurs et les algorithmes ne sont que des coquilles vides.
                    
                    2. La doctrine du capital humain haïtien :
                    - Valorisation inconditionnelle du génie créatif local : donner aux jeunes Haïtiens la fierté et les moyens de bâtir chez eux ;
                    - Rémunération juste et équitable : créer des perspectives économiques concrètes pour freiner l'exode des cerveaux ;
                    - Culture de l'exigence et de la bienveillance : former des professionnels capables de rivaliser avec les meilleurs standards internationaux.
                    
                    3. L'épanouissement individuel et collectif :
                    AJ-TECH veille à ce que chaque collaborateur progresse techniquement et humainement au contact de projets ambitieux et stimulants.
                """.trimIndent(),
                contentHt = """
                    1. Se moun ki fè teknoloji, se pa machin :
                    Teknoloji se sèlman yon zouti nan men moun. Si pa gen jèn ki renmen sa y ap fè a, si pa gen moun ki vle aprann epi travay di, tout òdinatè ak tout pwogram pa vo anyen.
                    
                    2. Prensip nou pou ede jèn yo grandi :
                    - Mete talan jèn nan peyi a an valè : bay jèn Ayisyen zouti ak fyète pou yo bati bèl bagay lakay yo ;
                    - Peye moun byen ak respè : pèmèt moun viv ak diyite nan travay yo pou yo pa oblije kouri kite peyi a ;
                    - Travay byen ak disiplin : fòme jèn yo pou yo ka nan menm nivo ak pi gwo espesyalis nan lemonn.
                    
                    3. Ede tout moun monte nan nivo :
                    Nan AJ-TECH, nou vle pou chak moun ki travay avèk nou aprann chak jou epi santi yo fyè de sa y ap bati ansanm.
                """.trimIndent(),
                plannedStartPage = 206,
                plannedEndPage = 206,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 159 : Former, transmettre et créer une relève ====================
            BookChapter(
                id = "ch_11_159",
                chapterNumber = 159,
                partId = "part_11",
                titleFr = "Chapitre 159 — Former, transmettre et créer une relève",
                titleHt = "Chapit 159 — Fòme, transmèt konesans epi prepare jenerasyon k ap vini an",
                subtitleFr = "Autodidaxie structurée, ingénierie pédagogique par EDUKA et pérennisation des compétences",
                subtitleHt = "Aprann poukont ou ak bonjan metòd, fòmasyon sou platfòm EDUKA epi prepare jèn k ap pran relèv la",
                summaryFr = "La mission d'éducation technologique d'AJ-TECH : bâtir des parcours d'apprentissage rigoureux avec EDUKA, documenter le savoir et former la prochaine génération d'ingénieurs.",
                summaryHt = "Misyon edikasyon AJ-TECH : bati bonjan kou sou platfòm EDUKA, ekri tout sa n aprann epi fòme ti jèn yo pou yo vin pi bon pase nou.",
                contentFr = """
                    1. L'impératif absolu de transmission :
                    Une organisation technologique qui ne forme pas sa relève est condamnée à disparaître avec ses pionniers. La pérennité d'AJ-TECH repose sur sa capacité à transmettre ses méthodes, ses outils et ses convictions.
                    
                    2. L'écosystème d'apprentissage :
                    - L'ingénierie pédagogique de la plateforme EDUKA et d'EDH (entités d'éducation indépendantes de formation) pour démocratiser l'accès aux sciences informatiques ;
                    - La formalisation de l'autodidaxie : prouver qu'avec de la méthode, de la curiosité et de la constance, chacun peut devenir un développeur accompli ;
                    - La documentation exhaustive du code source et des choix d'architecture pour en faire des cas d'étude vivants pour les étudiants haïtiens.
                    
                    3. Préparer les bâtisseurs de 2035 :
                    Les enfants et adolescents formés aujourd'hui à la logique algorithmique seront les architectes qui dirigeront les entités d'AJ-TECH à l'horizon 2035.
                """.trimIndent(),
                contentHt = """
                    1. Fòk nou transmèt sa nou konnen :
                    Nenpòt antrepriz ki pa fòme lòt jèn pou pran plas li ap disparèt lè fondatè yo pa la ankò. Pou AJ-TECH ka viv lontan, fòk nou pataje tout konesans nou ak jèn k ap monte yo.
                    
                    2. Kijan n ap fòme moun yo :
                    - Atravè platfòm EDUKA ak EDH (sant fòmasyon ki pa gen okenn fo etikèt AJ-) pou montre tout moun kijan pou yo kode ;
                    - Montre moun kijan pou yo aprann poukont yo ak bonjan disiplin ak kouraj ;
                    - Ekri tout eksplikasyon sou kòd nou yo pou etidyan ka li yo, konprann yo epi amelyore yo.
                    
                    3. Prepare moun k ap dirije an 2035 :
                    Ti jèn k ap aprann òdinatè jodi a, se yo menm ki pral gwo direktè ak gwo enjenyè k ap dirije pwojè yo lè 2035 rive.
                """.trimIndent(),
                plannedStartPage = 207,
                plannedEndPage = 207,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 160 : Une économie numérique au service de la société ====================
            BookChapter(
                id = "ch_11_160",
                chapterNumber = 160,
                partId = "part_11",
                titleFr = "Chapitre 160 — Une économie numérique au service de la société",
                titleHt = "Chapit 160 — Yon ekonomi nimerik nan sèvis sosyete a",
                subtitleFr = "Création de richesses partagées, inclusion financière, entrepreneuriat local et utilité citoyenne",
                subtitleHt = "Kreye richès pou tout moun, mete lajan nan men tout kouch sosyal, biznis lokal ak sèvis pou pèp la",
                summaryFr = "Comment l'écosystème AJ-TECH dynamise l'économie réelle : paiements sécurisés (AJ-Pay, AJ-Wallet), commerce local (AJ-Commerce, AJ-Biz) et utilité sociale.",
                summaryHt = "Fason ekosistèm AJ-TECH ede ekonomi peyi a mache pi byen : peman fasil (AJ-Pay, AJ-Wallet), ti komès (AJ-Commerce, AJ-Biz) ak kreye bonjan travay.",
                contentFr = """
                    1. Dépasser la rentabilité financière brute :
                    L'économie numérique ne doit pas être un mécanisme d'extraction de richesses au profit d'une poignée d'initiés. Chez AJ-TECH, l'économie est conçue comme un vecteur d'inclusion, de désenclavement et d'émancipation collective.
                    
                    2. Les moteurs de l'économie intégrée :
                    - Faciliter les transactions quotidiennes et réduire les frais pour les petits commerçants grâce à AJ-Pay et AJ-Wallet ;
                    - Digitaliser les marchés locaux et valoriser les producteurs haïtiens avec AJ-Commerce et AJ-Biz ;
                    - Créer un écosystème d'opportunités d'emplois indépendants et de micro-entreprises technologiques.
                    
                    3. Le réinvestissement dans le bien commun :
                    Par l'intermédiaire d'AJ-Fondation, une part constante de la valeur générée sera réinjectée dans des bourses d'études, des équipements scolaires et le soutien aux initiatives communautaires.
                """.trimIndent(),
                contentHt = """
                    1. Teknoloji pou ede tout moun, pa pou kèk moun rich sèlman :
                    Biznis nimerik pa dwe fèt pou pran ti lajan pèp la sèlman. Pou AJ-TECH, zouti nou yo dwe ede tout ti machann, tout jèn ak tout fanmi viv pi byen epi fè plis kòb.
                    
                    2. Zouti k ap fè ekonomi an mache :
                    - Ede moun peye epi voye lajan san gwo frè ki twò chè grasa AJ-Pay ak AJ-Wallet ;
                    - Ede ti boutik ak ti biznis lokal vann pwodui yo pi fasil grasa AJ-Commerce ak AJ-Biz ;
                    - Bay jèn yo chans pou yo kreye ti biznis ak kòd ak òdinatè yo.
                    
                    3. Pataje ak kominote a :
                    Grasa AJ-Fondation, yon pati nan sa nou touche va sèvi pou peye lekòl pou timoun ki pa gen mwayen epi bay zouti nan katye yo.
                """.trimIndent(),
                plannedStartPage = 208,
                plannedEndPage = 208,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 161 : Haïti dans la compétition technologique mondiale ====================
            BookChapter(
                id = "ch_11_161",
                chapterNumber = 161,
                partId = "part_11",
                titleFr = "Chapitre 161 — Haïti dans la compétition technologique mondiale",
                titleHt = "Chapit 161 — Ayiti nan konpetisyon teknolojik mondyal la",
                subtitleFr = "De la périphérie au centre : imposer l'ingénierie haïtienne par la qualité, l'innovation frugale et l'audace",
                subtitleHt = "Soti nan dèyè pou vin nan mitan : fè konesans ayisyen an pran plas li ak bon kalite kòd ak kouraj",
                summaryFr = "Positionnement géopolitique d'Haïti dans la tech internationale : démontrer que nos solutions résilientes répondent aux besoins de millions d'utilisateurs dans le monde.",
                summaryHt = "Pozisyon Ayiti nan konpetisyon entènasyonal la : montre ke lojisyèl solid nou yo itil plizyè milyon lòt moun sou latè ki gen menm defi avèk nou.",
                contentFr = """
                    1. Rejeter le fatalisme de la périphérie :
                    Pendant trop longtemps, Haïti a été perçue uniquement comme un consommateur passif ou un récepteur d'aide humanitaire. Le monde du logiciel offre l'opportunité de renverser cette dynamique : sur Internet, seule compte la rigueur de l'architecture et la qualité de l'exécution.
                    
                    2. Notre avantage comparatif mondial :
                    Les ingénieurs formés dans le contexte haïtien possèdent une maîtrise instinctive de l'optimisation extrême et de la tolérance aux pannes. Ces compétences sont précisément celles recherchées par les marchés émergents d'Amérique latine, d'Afrique et d'Asie du Sud.
                    
                    3. Porter haut le drapeau technologique :
                    Chaque ligne de code écrite par AJ-TECH porte la marque de l'excellence haïtienne, prouvant au monde entier que notre nation est un acteur légitime de l'innovation mondiale.
                """.trimIndent(),
                contentHt = """
                    1. Nou pa dèyè lòt nasyon nan lespri :
                    Pandan twòp tan, yo te konn gade Ayiti tankou yon peyi ki pa ka kreye anyen. Men nan zafè lojisyèl ak òdinatè, pa gen baryè : si kòd ou bon, si aplikasyon w solid, tout moun sou latè ap sèvi avè l.
                    
                    2. Gwo avantaj enjenyè ayisyen genyen :
                    Paske nou abitye travay nan difikilte, nou konn kijan pou n fè pwogram ki pa janm bloke epi ki pa gaspiye resous. Sa se yon gwo konesans ke anpil lòt peyi nan Karayib, Amerik Latin ak Lafrik bezwen anpil.
                    
                    3. Leve drapo peyi a byen wo :
                    Chak aplikasyon AJ-TECH kreye se yon bèl prèv ki montre tout lemonn sa Ayiti ka fè lè jèn li yo mete tèt yo ansanm ak disiplin.
                """.trimIndent(),
                plannedStartPage = 209,
                plannedEndPage = 209,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 162 : La diaspora et les générations futures ====================
            BookChapter(
                id = "ch_11_162",
                chapterNumber = 162,
                partId = "part_11",
                titleFr = "Chapitre 162 — La diaspora et les générations futures",
                titleHt = "Chapit 162 — Dyaspora a ak jenerasyon k ap vini yo",
                subtitleFr = "Alliances stratégiques intergénérationnelles, ponts de compétences et continuité historique",
                subtitleHt = "Gwo koutmen ant moun tout laj, pon konesans ak dyaspora a epi prepare demen pou timoun yo",
                summaryFr = "La synergie entre les talents de la diaspora et les jeunes générations en Haïti : investissement intellectuel, mentorat et transmission du flambeau.",
                summaryHt = "Mete men ansanm ant dyaspora a ak jèn k ap grandi nan peyi a : bay konsèy, pataje konesans epi prepare yon bèl avni pou ti jèn yo.",
                contentFr = """
                    1. La diaspora, extension vivante de la nation :
                    La communauté haïtienne établie à l'étranger concentre une expertise technique, financière et managériale inestimable. L'objectif d'AJ-TECH est de transformer la relation traditionnelle d'aide financière en un partenariat stratégique de co-création technologique.
                    
                    2. Les mécanismes de coopération active :
                    - Programmes de mentorat technique à distance entre ingénieurs séniors de la diaspora et étudiants locaux ;
                    - Contribution au code open source et revues d'architecture par les pairs ;
                    - Financement participatif et investissement dans les infrastructures souveraines de demain.
                    
                    3. Le pacte pour les générations à venir :
                    Nous travaillons aujourd'hui pour que nos enfants n'aient plus à quitter leur terre natale pour réaliser leurs rêves technologiques, mais puissent s'épanouir pleinement au pays.
                """.trimIndent(),
                contentHt = """
                    1. Dyaspora a se yon gwo fòs pou peyi a :
                    Frè ak sè nou k ap viv lòtbò dlo gen anpil gwo konesans nan zafè enjenyè, sèvè ak jesyon gwo antrepriz. AJ-TECH vle pou n travay ansanm tankou patnè pou bati bon zouti pou peyi a.
                    
                    2. Kijan nou ka travay ansanm :
                    - Enjenyè nan dyaspora a ka bay jèn nan peyi a konsèy sou kòd yo chak semèn ;
                    - Gade plan lojisyèl yo ansanm pou verifye si yo respekte pi gwo nòm entènasyonal yo ;
                    - Envesti nan pwojè solid ki kreye travay pou jèn yo nan peyi a.
                    
                    3. Angajman pou timoun demen yo :
                    N ap travay di jodi a pou pitit nou yo pa oblije kouri kite peyi a pou yo ka reyisi nan lavi yo, men pou yo ka jwenn tout chans sa yo lakay yo.
                """.trimIndent(),
                plannedStartPage = 210,
                plannedEndPage = 210,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 163 : L’héritage technologique que nous voulons laisser ====================
            BookChapter(
                id = "ch_11_163",
                chapterNumber = 163,
                partId = "part_11",
                titleFr = "Chapitre 163 — L’héritage technologique que nous voulons laisser",
                titleHt = "Chapit 163 — Eritaj teknolojik nou vle kite",
                subtitleFr = "Code pérenne, institutions solides, fierté nationale et souveraineté retrouvée",
                subtitleHt = "Bonjan kòd k ap dire, enstitisyon solid, fyète nasyonal ak yon peyi ki mèt tèt li tout bon",
                summaryFr = "La vision de ce qu'AJ-TECH laissera à la postérité : un écosystème ouvert, documenté, utile et indestructible qui servira les générations futures.",
                summaryHt = "Sa AJ-TECH vle kite pou demen : yon gwo ekosistèm louvri, byen ekri, ki sèvi pèp la epi ki pap janm kraze.",
                contentFr = """
                    1. Penser au-delà de sa propre existence :
                    La marque des grands bâtisseurs réside dans leur capacité à ériger des institutions capables de leur survivre. AJ-TECH n'est pas le projet d'un homme ou d'un clan, mais une œuvre nationale conçue pour traverser les décennies.
                    
                    2. La nature de cet héritage :
                    - Des bibliothèques logicielles robustes, libres et utilisables par tous les futurs développeurs ;
                    - Une doctrine d'ingénierie documentée dans ce Livre Compagnon, accessible à chaque étudiant ;
                    - La preuve éclatante qu'une entreprise technologique de rang mondial peut émerger depuis Port-au-Prince.
                    
                    3. La restauration de la fierté nationale :
                    L'héritage ultime d'AJ-TECH sera d'avoir redonné à la jeunesse haïtienne la certitude inébranlable de sa propre grandeur intellectuelle et créatrice.
                """.trimIndent(),
                contentHt = """
                    1. Bati bagay k ap dire apre nou :
                    Moun ki konn bati tout bon bati bagay ki ka rete kanpe menm lè yo menm yo pa la ankò. AJ-TECH se pa zafè yon sèl moun, se yon gwo richès pou tout nasyon an pou plizyè jenerasyon.
                    
                    2. Kisa n ap kite dèyè pou jèn yo :
                    - Bon kòd ak bon pwogram ki louvri pou tout jèn devlopè ka sèvi avè yo ;
                    - Tout konesans nou ekri nan liv sa a pou tout etidyan ka aprann gratis ;
                    - Prèv klè ki montre nou ka bati yon gwo jeyan nan teknoloji depi nan mitan Pòtoprens.
                    
                    3. Remete fyète nan kè tout moun :
                    Pi bèl kado AJ-TECH ap kite pou Ayiti, se remete konfyans nan tèt chak jèn pou yo konnen yo gen kapasite pou fè bèl bagay menm jan ak nenpòt lòt moun sou latè.
                """.trimIndent(),
                plannedStartPage = 211,
                plannedEndPage = 211,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 164 : Les risques, les échecs et les leçons du chemin ====================
            BookChapter(
                id = "ch_11_164",
                chapterNumber = 164,
                partId = "part_11",
                titleFr = "Chapitre 164 — Les risques, les échecs et les leçons du chemin",
                titleHt = "Chapit 164 — Risk, echèk ak leson ki sou wout la",
                subtitleFr = "Lucidité sur les épreuves, apprentissage par l'erreur et résilience face à l'adversité",
                subtitleHt = "Gade danje yo nan je, aprann sou erè nou yo epi leve pi fò chak fwa gen yon difikilte",
                summaryFr = "Analyse honnête des embûches et des risques majeurs : instabilité politique, pénurie d'électricité, lassitude et leçons apprises pour rebondir.",
                summaryHt = "Gade tout difikilte yo san kache anyen : pwoblèm peyi, mank kouran, dekourajman, ak leson nou tire pou n toujou kanpe pi djanm.",
                contentFr = """
                    1. La lucidité contre l'illusion :
                    Bâtir un écosystème technologique en Haïti est un parcours semé d'obstacles colossaux. Nier les risques d'échec ou d'interruption temporaire relèverait de l'irresponsabilité.
                    
                    2. Les risques identifiés et les mesures d'atténuation :
                    - L'instabilité sociopolitique : mitigation par la décentralisation des sauvegardes et le travail asynchrone ;
                    - La précarité énergétique : mitigation par des architectures hyper-frugales et des équipements solaires autonomes ;
                    - Le découragement face à la lenteur des résultats : mitigation par la culture des petites victoires régulières documentées.
                    
                    3. Transformer l'échec en apprentissage :
                    Chaque prototype non retenu, chaque bug découvert et chaque retard de calendrier constitue une leçon précieuse. Dans la culture d'AJ-TECH, on ne perd jamais : soit on réussit, soit on apprend.
                """.trimIndent(),
                contentHt = """
                    1. Gade reyalite a nan je san manti :
                    Bati yon gwo pwojè konsa an Ayiti pa fasil ditou, gen anpil gwo baryè sou wout la. Si nou di pa gen danje, se manti n ap bay tèt nou.
                    
                    2. Gwo danje yo ak fason n ap pare pou yo :
                    - Pwoblèm peyi ak ensekirite : pare pou sa lè nou sere done yo plizyè kote epi n travay sou entènèt san bezwen rasanble tout moun nan yon sèl lokal ;
                    - Mank kouran : sèvi ak panno solèy epi kode lojisyèl ki pa vide batri ;
                    - Dekourajman lè bagay yo pran tan : fete chak ti etap nou franchi chak semèn.
                    
                    3. Fè erè sèvi leson :
                    Chak fwa yon lide pa mache jan nou te vle, nou pa dekouraje : nou gade poukisa l pa t mache, nou korije l, epi nou kontinye vanse pi fò.
                """.trimIndent(),
                plannedStartPage = 212,
                plannedEndPage = 212,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 165 : Feuille de route AJ-TECH 2026–2035 ====================
            BookChapter(
                id = "ch_11_165",
                chapterNumber = 165,
                partId = "part_11",
                titleFr = "Chapitre 165 — Feuille de route AJ-TECH 2026–2035",
                titleHt = "Chapit 165 — Plan estratejik AJ-TECH 2026–2035",
                subtitleFr = "Les 4 phases de développement : consolidation, expansion, coopération internationale et maturité",
                subtitleHt = "4 gwo faz devlopman yo : ranfòse baz la, ouvèti, koperasyon entènasyonal ak gwo nivo matirite",
                summaryFr = "La planification décennale détaillée d'AJ-TECH : jalons précis, objectifs mesurables et progression méthodique pour devenir un géant de la technologie.",
                summaryHt = "Plan 10 lane AJ-TECH la byen kalkile : objektif klè pou chak peryòd pou rive nan somè a etap pa etap.",
                contentFr = """
                    1. La structuration stratégique en 4 phases :
                    Pour concrétiser la Vision 2035, AJ-TECH déploie une feuille de route méthodique divisée en quatre temps cardinaux :
                    
                    - Phase 1 (2026–2027) : Consolidation et documentation
                      Stabilisation du socle logiciel initial (AJ-Task, EDUKA, EDH), fixation des standards d'ingénierie, diffusion du Livre Compagnon et affirmation des valeurs éthiques.
                    
                    - Phase 2 (2028–2030) : Ouverture et premières capacités d'expansion
                      Déploiement progressif des briques financières et commerciales (AJ-Pay, AJ-Wallet, AJ-Commerce), premiers pilotes scolaires et communautaires en Haïti.
                    
                    - Phase 3 (2031–2033) : Coopération et présence internationale progressive
                      Mise en réseau des talents avec la diaspora, exportations de librairies logicielles frugales et partenariats académiques régionaux dans la Caraïbe.
                    
                    - Phase 4 (2034–2035) : Rayonnement international et maturité de l'écosystème
                      Aboutissement de la Vision 2035 : un écosystème technologique souverain, auto-suffisant, reconnu mondialement comme une référence d'ingénierie résiliente.
                    
                    2. Les engagements immuables de l'écosystème :
                    - Slogan officiel : « Vision, Technologie et Avenir » ;
                    - Devise d'action : « L’innovation haïtienne au service du monde » ;
                    - Posture de vérité : « Une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet. »
                """.trimIndent(),
                contentHt = """
                    1. 4 gwo etap klè pou rive nan ane 2035 :
                    Pou n ka reyalize gwo vizyon sa a, nou separe 10 lane k ap vini yo an kat gwo faz :
                    
                    - Faz 1 (2026–2027) : Ranfòse baz la epi ekri bon dokiman
                      Rann premye aplikasyon yo djanm (AJ-Task, EDUKA, EDH), mete bonjan prensip travay, pataje liv sa a ak tout moun epi kenbe prensip verite a.
                    
                    - Faz 2 (2028–2030) : Ouvèti ak premye tès pou grandi
                      Lanse zouti komès ak peman yo (AJ-Pay, AJ-Wallet, AJ-Commerce), epi fè premye tès nan lekòl ak nan kominote yo an Ayiti.
                    
                    - Faz 3 (2031–2033) : Koperasyon ak prezans lòtbò dlo
                      Mete men ansanm ak dyaspora a, kòmanse vann bon kòd ak lojisyèl bay lòt peyi nan Karayib la ak nan lemonn.
                    
                    - Faz 4 (2034–2035) : Gwo nivo matirite ak respè nan lemonn
                      Reyalize gwo rèv 2035 lan : yon gwo ekosistèm solid, ki mèt tèt li, ke tout nasyon sou latè ap admire pou jan li rezistan.
                    
                    2. Prensip nou ki pap janm chanje :
                    - Eslogan ofisyèl : « Vizyon, Teknoloji ak Lavni » ;
                    - Deviz travay la : « Inovasyon ayisyen an nan sèvis lemonn » ;
                    - Pawòl verite a : « Yon antrepriz ki gen gwo anbisyon k ap bati ti pa ti pa epi k ap ekri tout verite sou wout li pou rive nan somè a. »
                """.trimIndent(),
                plannedStartPage = 213,
                plannedEndPage = 213,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 166 : L’avenir reste à construire ====================
            BookChapter(
                id = "ch_11_166",
                chapterNumber = 166,
                partId = "part_11",
                titleFr = "Chapitre 166 — L’avenir reste à construire",
                titleHt = "Chapit 166 — Lavni an toujou rete pou konstwi",
                subtitleFr = "Appel solennel à la jeunesse haïtienne, foi en l'avenir et marche inébranlable jusqu'au sommet",
                subtitleHt = "Gwo apèl pou tout jèn Ayisyen, lafwa nan lavni epi mache san bite jouk nou rive nan somè a",
                summaryFr = "L'apothéose du Livre Compagnon AJ-TECH : conclusion finale, hommage solennel à la jeunesse créatrice et engagement pour bâtir l'avenir.",
                summaryHt = "Dènye chapit ofisyèl Liv AJ-TECH la : gwo omaj pou tout jèn k ap goumen, lafwa nan Bondye ak travay di pou mennen Ayiti nan somè.",
                contentFr = """
                    1. Le couronnement d'un manifeste fondateur :
                    À travers ses 11 parties et ses 166 chapitres bilingues, ce livre compagnon a posé les jalons théoriques, architecturaux et éthiques de l'écosystème numérique haïtien. Mais les pages écrites ne sont que la carte : le territoire reste à conquérir par l'action.
                    
                    2. L'avenir n'est pas un destin subi, il est un devoir à bâtir :
                    Personne ne viendra construire Haïti à notre place. Aucune aide extérieure ne remplacera jamais l'effort soutenu, la compétence technique et la détermination patriotique de nos propres enfants.
                    
                    3. Le message immortel à la jeunesse haïtienne :
                    « Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens. »
                    
                    4. La marche inébranlable jusqu'au sommet :
                    Avec l'aide de Dieu, la sueur de notre front et la fraternité de toute une nation, le chemin vers 2035 est tracé. L'avenir d'Haïti dans la technologie commence aujourd'hui, avec chacun d'entre nous.
                """.trimIndent(),
                contentHt = """
                    1. Fen premye gwo liv gid la :
                    Nan 11 gwo pati sa yo ak 166 bèl chapit nan de lang nou yo, liv sa a mete tout fondasyon teknik, moral ak estratejik pou ekosistèm nimerik peyi nou an. Men se pa ekri liv la ki fini travay la : se kounye a vrè travay la kòmanse sou teren an.
                    
                    2. Se nou menm ki pou bati lavni nou :
                    Pèsonn moun pap soti deyò pou vin bati peyi nou pou nou. Pa gen okenn kado k ap ranplase travay di, bon konpetans ak gwo lanmou pou peyi nou.
                    
                    3. Dènye gwo mesaj pou tout jèn Ayisyen :
                    « Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou n rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo. »
                    
                    4. Ann mache ansanm pou rive nan somè a :
                    Avèk èd Bondye, ak fòs kouraj nou epi ak tèt ansanm tout pèp la, wout pou rive nan 2035 la tou louvri devan nou. Lavni Ayiti nan teknoloji kòmanse jodi a, ak nou chak.
                """.trimIndent(),
                plannedStartPage = 214,
                plannedEndPage = 214,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
