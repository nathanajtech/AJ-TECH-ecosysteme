package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES
 * Chapitres 62 à 76 (Exactement 15 chapitres d'analyse économique, entrepreneuriat résilient, modèles de revenus et stratégie 2026–2035).
 */
object Part5Data {

    val part5: BookPart = BookPart(
        id = "part_5",
        partNumber = 5,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES",
        titleHt = "PATI V — EKONOMI, ANTREPRENARYA AK MODÈL BIZNIS",
        subtitleFr = "Modèles de revenus éthiques, entrepreneuriat résilient, création de valeur et vision 2026–2035",
        subtitleHt = "Modèl revni onèt, antreprenarya solid, kreyasyon valè ak vizyon estratejik 2026–2035",
        plannedPages = "pp. 95–114",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 62 : Construire une économie numérique durable ====================
            BookChapter(
                id = "ch_5_62",
                chapterNumber = 62,
                partId = "part_5",
                titleFr = "Chapitre 62 — Construire une économie numérique durable",
                titleHt = "Chapit 62 — Bati yon ekonomi nimerik dirab",
                subtitleFr = "Fondations économiques, valeur locale, souveraineté et refus de la consommation passive",
                subtitleHt = "Fondasyon ekonomik, valè lokal, souvrenete ak refi pou n sèlman rete ap konsome",
                summaryFr = "Analyse des fondements d'une économie numérique nationale durable en Haïti et du rôle transformateur des technologies locales.",
                summaryHt = "Analiz sou fondasyon yon ekonomi nimerik dirab an Ayiti ak jan teknoloji ki fèt sou plas ka kreye richès.",
                contentFr = """
                    1. État des lieux et opportunité historique :
                    L'économie haïtienne fait face à des contraintes structurelles majeures : prédominance du secteur informel, faible bancarisation, coût élevé des transactions d'argent traditionnelles, instabilité énergétique et pénurie d'infrastructures physiques. Cependant, le numérique offre l'opportunité d'un saut technologique (Leapfrogging) capable de dématérialiser les services et de réduire les coûts d'intermédiation.
                    
                    2. Refus de la simple posture de consommateur passif :
                    Pendant des décennies, les pays émergents ont été cantonnés au rôle de consommateurs passifs de technologies conçues à l'étranger. Ces outils externes ignorent souvent les réalités de terrain haïtiennes (coupures de réseau, langue créole, faible pouvoir d'achat).
                    
                    3. Création de richesses et rétention de capital :
                    Chaque fois qu'une entreprise ou une institution locale paie un abonnement logiciel étranger, des devises précieuses quittent le pays. Créer des éditeurs de logiciels nationaux permet de conserver cette valeur ajoutée sur le territoire et de réinvestir dans les talents locaux.
                    
                    4. La durabilité comme principe fondamental :
                    Une économie numérique durable repose sur des solutions logicielles frugales, résilientes face aux pannes d'énergie, accessibles à tous et génératrices d'emplois décents pour la jeunesse haïtienne.
                """.trimIndent(),
                contentHt = """
                    1. Reyalite peyi a ak chans istorik nou genyen :
                    Ekonomi Ayiti a gen gwo difikilte : pifò komès fèt nan enfòmèl san ankadreman, anpil moun pa gen kont labank, frè transfè lajan souvan twò chè, pa gen kouran ki fyab epi wout yo pa fasil. Men teknoloji nimerik la pèmèt nou fè yon gwo so pi devan (Leapfrogging) pou retire baryè sa yo.
                    
                    2. Refize rete sèlman kòm moun k ap konsome :
                    Pandan twòp tan, nou te sèlman moun k ap achte lojisyèl lòt nasyon fè. Zouti etranje sa yo souvan pa konprann reyalite Ayiti tankou entènèt ki koupe, lang kreyòl la oswa ti telefòn senp yo.
                    
                    3. Kreye richès epi kenbe lajan nan peyi a :
                    Chak fwa yon biznis peye yon abònman lojisyèl etranje, se gwo lajan etranje ki soti kite peyi a. Lè nou kreye pwòp lojisyèl pa nou, lajan an rete nan peyi a pou peye jèn enjenyè ak devlopè nou yo.
                    
                    4. Yon ekonomi ki ka dire tout bon vre :
                    Yon ekonomi nimerik dirab bati sou lojisyèl ki pa gaspiye resous, ki mache menm lè kouran koupe, ki ouvri pou tout moun epi ki kreye bonjan travay pou jèn yo.
                """.trimIndent(),
                plannedStartPage = 95,
                plannedEndPage = 96,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 63 : L'entrepreneuriat technologique haïtien ====================
            BookChapter(
                id = "ch_5_63",
                chapterNumber = 63,
                partId = "part_5",
                titleFr = "Chapitre 63 — L'entrepreneuriat technologique haïtien",
                titleHt = "Chapit 63 — Antreprenarya teknolojik ayisyen",
                subtitleFr = "Résilience, innovation frugale, surmonter l'adversité et créer sous contraintes",
                subtitleHt = "Kouraj, fè bèl bagay ak ti mwayen, venk difikilte ak bati nan mitan kontrent",
                summaryFr = "Étude des caractéristiques uniques de l'entrepreneuriat technologique en Haïti et des leviers pour innover malgré les contraintes structurelles.",
                summaryHt = "Etid sou fòs ak kouraj antreprenè teknoloji an Ayiti bezwen pou kreye solisyon solid malgre gwo difikilte yo.",
                contentFr = """
                    1. L'entrepreneuriat sous contrainte extrême :
                    Entreprendre dans la tech en Haïti exige un niveau exceptionnel de résilience. Les entrepreneurs locaux doivent composer avec l'instabilité politique, les coupures régulières de courant, le coût élevé des télécommunications et la rareté des capitaux d'amorçage. Cette adversité forge des solutions d'une grande frugalité et robustesse.
                    
                    2. L'innovation frugale (Jugaad) comme avantage compétitif :
                    L'innovation frugale consiste à concevoir le maximum de valeur avec le minimum de ressources. En adaptant les logiciels aux téléphones modestes et aux connexions intermittentes, les créateurs haïtiens développent des produits extrêmement efficaces.
                    
                    3. Le freelancing et l'exportation de compétences :
                    Grâce à Internet, un développeur, intégrateur ou designer haïtien basé aux Cayes, à Jacmel, au Cap-Haïtien ou à Port-au-Prince peut offrir ses compétences à des entreprises du monde entier, injectant directement des devises dans l'économie locale.
                    
                    4. Construire pour durer :
                    L'entrepreneur haïtien ne cherche pas la spéculation financière rapide mais la résolution de problèmes réels et vitaux pour sa communauté.
                """.trimIndent(),
                contentHt = """
                    1. Kreye biznis nan mitan gwo difikilte :
                    Fè biznis teknoloji an Ayiti mande anpil kouraj ak pasyans. Antreprenè nou yo oblije goumen ak kouran ki pa genyen, entènèt ki chè epi lajan ki difisil pou jwenn. Men difikilte sa yo fè yo kreye zouti ki pi solid pase lòt moun.
                    
                    2. Fè bèl bagay ak ti mwayen (Inovasyon fwigal) :
                    Inovasyon fwigal vle di fè gwo bagay ak ti kras mwayen. Lè nou bati lojisyèl ki mache sou ti telefòn senp ak entènèt ki koupe, nou kreye zouti ki pi djanm epi ki pa gaspiye batri.
                    
                    3. Travay a distans sou entènèt (Freelancing) :
                    Gras ak entènèt, yon jèn ki konn pwograme oswa fè bèl desen nan Okay, Jakmèl, Okap oswa Pòtoprens ka travay pou konpayi nan tout mond lan, sa k fè lajan rantre nan peyi a san l pa oblije pati.
                    
                    4. Bati pou pwojè a ka dire :
                    Antreprenè ayisyen an pa la pou fè kòb sou do moun nan manti, men li la pou rezoud gwo pwoblèm reyèl ki bloke lavi kominote a.
                """.trimIndent(),
                plannedStartPage = 96,
                plannedEndPage = 97,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 64 : Transformer une idée en produit ====================
            BookChapter(
                id = "ch_5_64",
                chapterNumber = 64,
                partId = "part_5",
                titleFr = "Chapitre 64 — Transformer une idée en produit",
                titleHt = "Chapit 64 — Transfòme yon lide an yon pwodui reyèl",
                subtitleFr = "Du concept au produit minimum viable (MVP), écoute utilisateur et itération rapide",
                subtitleHt = "Soti nan lide rive nan premye vèsyon ki ka sèvi (MVP), koute moun epi amelyore vit",
                summaryFr = "Méthodologie de développement de produit logiciel : validation du besoin, prototypage rapide, MVP et boucle de rétroaction utilisateur.",
                summaryHt = "Fason pou pran yon senp lide lojisyèl, fè yon premye ti modèl senp (MVP) epi teste l ak moun pou wè si l bon.",
                contentFr = """
                    1. Le piège de la surconception théorique :
                    L'une des erreurs les plus fréquentes consiste à concevoir un produit monumental pendant des mois sans jamais le confronter à des utilisateurs réels. En contexte haïtien, où les ressources sont limitées, l'itération courte est vitale.
                    
                    2. La démarche du Produit Minimum Viable (MVP) :
                    Le MVP consiste à développer uniquement la fonctionnalité centrale capable de résoudre le problème prioritaire de l'utilisateur. Exemple : pour une application de gestion, valider la saisie et la consultation hors-ligne avant d'ajouter des tableaux de bord sophistiqués.
                    
                    3. Prototypage et tests terrain :
                    Tester immédiatement sur des appareils réels d'entrée de gamme permet d'identifier les goulets d'étranglement de performance, les incompréhensions d'interface et les problèmes de consommation de données.
                    
                    4. La boucle itérative Construire-Mesurer-Apprendre :
                    Chaque retour d'expérience permet de corriger le tir, de simplifier l'ergonomie bilingue et de prioriser les fonctionnalités véritablement utiles.
                """.trimIndent(),
                contentHt = """
                    1. Danje pou w pase twòp tan ap fè plan san w pa bati :
                    Youn nan pi gwo erè se pase plizyè mwa ap imajine yon gwo sistèm konplike san w pa janm montre moun li. Paske nou pa gen gwo mwayen, fòk nou teste ti moso pa ti moso vit.
                    
                    2. Prensip Premye Modèl Senk ki ka Sèvi a (MVP) :
                    MVP a vle di kreye sèlman premye ti pati ki pi enpòtan nan aplikasyon an pou rezoud pwoblèm prensipal la. Pa egzanp : nan yon ti kaye jesyon, asire moun ka anrejistre epi li sa yo mete a san entènèt anvan w al mete gwo desen konplike.
                    
                    3. Teste sou ti telefòn senp :
                    Fè tès sou ti telefòn òdinè pèmèt ou wè touswit si aplikasyon an lou, si l ap manje twòp batri oswa si moun yo pa konprann bouton yo.
                    
                    4. Bati, Gade epi Aprann :
                    Chak fwa yon moun teste l epi ba w avi l, ou korije sa k pa bon an, ou fè l pale kreyòl pi klè epi ou mete sa k vrèman itil yo sèlman.
                """.trimIndent(),
                plannedStartPage = 98,
                plannedEndPage = 99,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 65 : Le bootstrapping et la construction avec peu de moyens ====================
            BookChapter(
                id = "ch_5_65",
                chapterNumber = 65,
                partId = "part_5",
                titleFr = "Chapitre 65 — Le bootstrapping et la construction avec peu de moyens",
                titleHt = "Chapit 65 — Bootstrapping ak bati ak ti mwayen",
                subtitleFr = "Autofinancement rigoureux, maîtrise des coûts, architecture frugale et liberté d'action",
                subtitleHt = "Travay ak sa w genyen san fè dèt, kontwole depans, itilize bon zouti gratis ak libète",
                summaryFr = "Principes et mise en pratique du bootstrapping pour développer des projets technologiques solides sans dépendance financière extérieure.",
                summaryHt = "Prensip ak pratik bootstrapping pou bati pwojè teknoloji solid ak pwòp fòs ponyèt ou san w pa depann de moun.",
                contentFr = """
                    1. Définition et philosophie du Bootstrapping :
                    Le « bootstrapping » désigne le processus de création et de développement d'une entreprise sans apport de capitaux externes ou d'investisseurs en capital-risque, en s'appuyant exclusivement sur l'autofinancement, la frugalité et le travail des fondateurs.
                    
                    2. Les avantages stratégiques du bootstrapping en Haïti :
                    - Indépendance totale : Conservation du contrôle des décisions éditoriales, éthiques et techniques ;
                    - Résilience accrue : Absence de pression pour une rentabilité spéculative immédiate ;
                    - Discipline de conception : Obligation d'optimiser chaque ligne de code et d'éliminer les dépenses superflues.
                    
                    3. Architecture logicielle frugale :
                    Privilégier les technologies sans licence coûteuse (Kotlin, Jetpack Compose, bases SQLite/Room, PWA ouvertes) et des architectures locales (Offline-First) qui évitent des factures de serveurs cloud exorbitantes.
                    
                    4. La patience stratégique :
                    Avancer étape par étape, brique par brique, en validant chaque avancée technique avant toute tentative d'expansion.
                """.trimIndent(),
                contentHt = """
                    1. Kisa Bootstrapping vle di :
                    Bootstrapping se lè w chwazi kreye epi devlope biznis ou ak pwòp ti mwayen pa w, san w pa al prete gwo lajan nan men moun, gras ak travay di, fè ekonomi epi pa fè gaspiyaj.
                    
                    2. Poukisa chwa sa a bon anpil an Ayiti :
                    - Libète total : Ou rete sèl mèt desizyon w sou kòd la, sou lang lan ak sou sa w vle fè ;
                    - Pi solid devan tanpèt : Pa gen moun k ap vin mete presyon sou ou pou mande gwo enterè rapid ;
                    - Disiplin nan travay : Ou oblije ekri bon kòd ki pwòp epi ki pa koute chè pou woule.
                    
                    3. Chwazi zouti gratis ak sistèm lejè :
                    Itilize bon zouti ki pa mande peye gwo lisans (Kotlin, Jetpack Compose, baz done lokal SQLite/Room) ak lojisyèl ki mache sou telefòn la san w pa bezwen peye gwo sèvè etranje ki chè.
                    
                    4. Pasyans ak disiplin :
                    Avanse ti pa ti pa, moso pa moso, epi asire chak etap solid anvan w pase nan yon lòt.
                """.trimIndent(),
                plannedStartPage = 99,
                plannedEndPage = 100,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 66 : Modèles économiques numériques ====================
            BookChapter(
                id = "ch_5_66",
                chapterNumber = 66,
                partId = "part_5",
                titleFr = "Chapitre 66 — Modèles économiques numériques",
                titleHt = "Chapit 66 — Modèl ekonomik nimerik yo",
                subtitleFr = "Panorama des modèles : Freemium, abonnements SaaS, transactionnel, licences et services",
                subtitleHt = "Gade tout modèl yo : Gratis ak opsyon peye, abònman SaaS, ti pousantaj sou tranzaksyon ak lisans",
                summaryFr = "Typologie comparative des modèles économiques applicables aux produits numériques dans les pays émergents et en Haïti.",
                summaryHt = "Konparezon ant tout fason yon antrepriz nimerik ka rantre lajan pou peye depans li nan peyi tankou Ayiti.",
                contentFr = """
                    1. Typologie générale des modèles de revenus :
                    Pour assurer sa pérennité sans compromettre l'accessibilité publique, une entreprise numérique peut combiner plusieurs modèles :
                    
                    2. Le modèle Freemium :
                    - Accès gratuit à un socle de fonctionnalités de base pour maximiser l'inclusion et l'apprentissage ;
                    - Options avancées « Pro » ou d'entreprise payantes (collaboration multi-comptes, stockage étendu, exports avancés).
                    
                    3. Le modèle SaaS (Software as a Service) / Abonnement :
                    - Facturation périodique (mensuelle ou annuelle) prévisible, adaptée aux budgets professionnels et garantissant la maintenance continue des services.
                    
                    4. Le modèle transactionnel / Commission :
                    - Prélèvement d'un pourcentage minime sur chaque transaction ou échange de valeur intermédié.
                    
                    5. Licences et prestations de services spécialisées :
                    - Développement sur mesure, intégration de systèmes et contrats de maintenance pour les écoles, cliniques et institutions partenaires.
                    
                    6. Prudence et adéquation au pouvoir d'achat :
                    Tout modèle de tarification en Haïti doit impérativement respecter le pouvoir d'achat local pour éviter l'exclusion des utilisateurs modestes.
                """.trimIndent(),
                contentHt = """
                    1. Diferan kalite fason pou rantre lajan nan lojisyèl :
                    Pou yon konpayi nimerik ka kenbe san l pa bare moun ki pa gen gwo mwayen, li ka itilize plizyè modèl biznis :
                    
                    2. Modèl Freemium (Gratis ak opsyon peye) :
                    - Zouti debaz la gratis pou tout moun ka itilize l epi aprann ;
                    - Opsyon espesyal pou gwo ekip oswa biznis ki bezwen plis espas, rapò espesyal oswa travay an gwoup.
                    
                    3. Modèl Abònman (SaaS) :
                    - Peye yon ti pri pa mwa oswa pa ane pou itilize lojisyèl la tout tan epi jwenn tout dènye mizajou yo.
                    
                    4. Ti komisyon sou tranzaksyon :
                    - Pran yon ti pousantaj tou piti lè yon vant oswa yon peman pase sou platfòm lan.
                    
                    5. Sèvis devlopman ak enstalasyon espesyal :
                    - Travay sou lòd pou bati oswa enstale sistèm nan lekòl, klinik oswa gwo biznis ki bezwen sa.
                    
                    6. Respekte pòch moun yo :
                    Pri yo dwe toujou kalkile pou yo pa twò lou pou sitwayen òdinè yo nan peyi a.
                """.trimIndent(),
                plannedStartPage = 100,
                plannedEndPage = 101,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 67 : Monétisation éthique ====================
            BookChapter(
                id = "ch_5_67",
                chapterNumber = 67,
                partId = "part_5",
                titleFr = "Chapitre 67 — Monétisation éthique",
                titleHt = "Chapit 67 — Fè lajan nan respè ak diyite (Monétisation éthique)",
                subtitleFr = "Refus de la revente de données personnelles, prix justes, transparence et respect de l'utilisateur",
                subtitleHt = "Refize vann enfòmasyon prive moun, bon pri ki kòrèk, transparans ak respè pou itilizatè a",
                summaryFr = "Définition des principes de monétisation éthique : protection absolue de la vie privée, rejet des modèles publicitaires prédateurs et équité tarifaire.",
                summaryHt = "Prensip pou fè biznis san pèdi konsyans : pa vann done prive moun, pa mete piblisite k ap vòlè atansyon epi bay bon pri.",
                contentFr = """
                    1. Rejet du modèle « Si c'est gratuit, vous êtes le produit » :
                    Les géants du web ont bâti leur fortune sur l'extraction massive et la revente des données comportementales des utilisateurs à des régies publicitaires. AJ-TECH rejette catégoriquement cette logique intrusive et prédatrice.
                    
                    2. Principes fondamentaux de la monétisation éthique :
                    - Respect absolu de la vie privée : Aucune collecte, revente ou monétisation de données personnelles ;
                    - Transparence totale des prix : Absence de frais cachés, de renouvellements automatiques trompeurs ou de mécanismes de verrouillage prédateurs ;
                    - Alignement d'intérêt : L'utilisateur paie pour un service utile et fonctionnel, créant une relation saine et équilibrée entre l'éditeur et le client.
                    
                    3. La tarification juste et solidaire :
                    Proposer des tarifs différenciés et solidaires pour les étudiants, enseignants et micro-entrepreneurs locaux afin que la technologie reste un levier d'émancipation sociale.
                    
                    4. La réputation comme actif pérenne :
                    L'honnêteté et la loyauté commerciale constituent le fondement de la confiance à long terme.
                """.trimIndent(),
                contentHt = """
                    1. Refize vann vi prive moun pou fè lajan :
                    Gwo konpayi etranje yo vin rich paske yo pran tout enfòmasyon sou sa moun ap fè sou entènèt pou vann bay konpayi piblisite. Nou refize fason sa a nèt.
                    
                    2. Gwo prensip pou fè biznis nan diyite :
                    - Pwoteje vi prive tout moun : Nou pa janm pran, vann ni fè komès ak done prive pyès moun ;
                    - Pri klè san kache anyen : Pa gen okenn ti frè kache ni pyèj pou rache kòb nan pòch moun san yo pa konnen ;
                    - Relasyon onèt : Moun nan peye pou yon bon sèvis li wè ak je l k ap rann li sèvis.
                    
                    3. Pri ki rezonab pou elèv ak ti machann :
                    Mete ti pri espesyal ki pi ba anpil pou elèv, pwofesè ak ti komèsan pou zouti a ka ede yo vanse olye l bloke yo.
                    
                    4. Bon repitasyon se pi gwo richès :
                    Lè w mache dwat epi w di verite nan biznis ou, sa fè tout moun fè w konfyans pou tout tan.
                """.trimIndent(),
                plannedStartPage = 102,
                plannedEndPage = 103,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 68 : AJ-TECH et la création de valeur ====================
            BookChapter(
                id = "ch_5_68",
                chapterNumber = 68,
                partId = "part_5",
                titleFr = "Chapitre 68 — AJ-TECH et la création de valeur",
                titleHt = "Chapit 68 — AJ-TECH ak kreyasyon valè",
                subtitleFr = "Philosophie d'ingénierie, utilité sociale, productivité et transparence sur l'état réel",
                subtitleHt = "Prensip enjenyri, itilite pou sosyete a, ede moun travay pi byen ak verite sou nivo nou ye",
                summaryFr = "Analyse de la création de valeur globale visée par l'écosystème AJ-TECH pour la société haïtienne, avec un rappel strict de son état d'avancement.",
                summaryHt = "Eksplikasyon sou jan AJ-TECH vle kreye vrè valè pou peyi a, ansanm ak verite klè sou kote pwojè a ye kounye a.",
                contentFr = """
                    1. Transparence institutionnelle et économique d'AJ-TECH :
                    À ce jour, AJ-TECH est un projet d'ingénierie et d'écosystème en phase de conception et de structuration logicielle. L'entreprise ne dispose actuellement d'aucun produit commercialisé à grande échelle, ne réalise aucun chiffre d'affaires, ne génère aucun bénéfice et n'a conclu aucune levée de fonds auprès d'investisseurs.
                    
                    2. Les trois dimensions de la création de valeur visée :
                    - Valeur technique : Développement de briques logicielles robustes, documentées et conçues selon les meilleures pratiques internationales (architecture MVVM, Clean Architecture, Kotlin, Compose) ;
                    - Valeur humaine et cognitive : Diffusion gratuite de méthodologies d'ingénierie et de guides techniques bilingues pour former les développeurs locaux ;
                    - Valeur sociétale : Conception d'outils adaptés aux contraintes du pays (fonctionnement hors-ligne, faible consommation de bande passante).
                    
                    3. La priorité au socle avant la commercialisation :
                    AJ-TECH refuse l'illusion des valorisations artificielles sans produit réel et accorde la priorité absolue à la solidité du code et à l'utilité pratique.
                """.trimIndent(),
                contentHt = """
                    1. Verite total sou nivo ekonomik AJ-TECH jodi a :
                    Jodi a, AJ-TECH se yon pwojè enjenyri k ap bati kòd ak estrikti li. Konpayi an pa gen okenn pwodui ki deja sou mache a pou vann, li pa fè okenn kòb oswa benefis kounye a, epi li pa t pran okenn gwo lajan prete nan men envestisè.
                    
                    2. Twa fason nou vle kreye valè pou peyi a :
                    - Valè teknik : Ekri bon kòd lojisyèl ki solid, byen dokimante epi ki respekte tout pi bon prensip entènasyonal (Kotlin, Compose, MVVM) ;
                    - Valè pou lespri ak fòmasyon : Pataje konesans gratis an kreyòl ak fransè pou ede jèn yo vin bon enjenyè ;
                    - Valè pou sosyete a : Fè zouti ki mache san entènèt epi ki pa gaspiye megabay moun yo.
                    
                    3. Bati fondasyon an anvan nou pale de vann :
                    AJ-TECH refize fè gwo bri sou fo lajan san pwodui a poko pare nèt, li mete tout fòs li sou bon kòd solid ak zouti ki itil tout bon.
                """.trimIndent(),
                plannedStartPage = 103,
                plannedEndPage = 104,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 69 : AJ-Commerce et le commerce numérique ====================
            BookChapter(
                id = "ch_5_69",
                chapterNumber = 69,
                partId = "part_5",
                titleFr = "Chapitre 69 — AJ-Commerce et le commerce numérique",
                titleHt = "Chapit 69 — AJ-Commerce ak komès sou entènèt",
                subtitleFr = "Vision prospective, vitrines numériques locales, logistique et statut de développement",
                subtitleHt = "Vizyon pou pi devan, bèl vitrin sou telefòn pou komèsan, livrezon ak nivo pwojè a ye",
                summaryFr = "Présentation prospective de l'entité AJ-Commerce pour soutenir les commerçants et producteurs haïtiens, avec clarification sur son état non commercialisé.",
                summaryHt = "Prezantasyon sa nou prevwa pou AJ-Commerce pou ede machann ayisyen, ak eksplikasyon klè ke l poko sou mache a kounye a.",
                contentFr = """
                    1. Rôle et ambition prospective d'AJ-Commerce :
                    AJ-Commerce est conçu conceptuellement comme une plateforme d'intermédiation et de vitrine numérique pour les producteurs, artisans, boutiques et prestataires de services haïtiens. L'objectif est de permettre à chaque commerçant de créer facilement son catalogue numérique accessible sur mobile.
                    
                    2. Statut actuel : Non commercialisé :
                    La plateforme AJ-Commerce n'est actuellement pas commercialisée ni ouverte au grand public. Elle constitue une entité en phase de recherche conceptuelle et d'analyse des flux logistiques.
                    
                    3. Modèle de monétisation potentiel :
                    - Gratuité totale pour la création des petits catalogues de quartier ;
                    - Commission légère (ex. 1 à 2 %) uniquement sur les ventes intermédiées en ligne ;
                    - Services optionnels d'outils de gestion de stocks simplifiés pour les grossistes.
                    
                    4. Les défis structurels du commerce électronique en Haïti :
                    Le déploiement futur d'AJ-Commerce devra surmonter l'absence d'adressage postal précis dans de nombreuses zones, les contraintes de transport et l'habitude culturelle du paiement physique en espèces.
                """.trimIndent(),
                contentHt = """
                    1. Kisa nou prevwa pou AJ-Commerce fè :
                    AJ-Commerce fèt nan lide pou pèmèt atizan, ti boutik, plantè ak machann ayisyen gen yon bèl vitrin sou telefòn pou montre sa yo gen pou vann bay tout moun fasil.
                    
                    2. Kote pwojè a ye kounye a : Li poko sou mache a :
                    AJ-Commerce poko ouvri pou moun achte sou li jodi a. Li se yon lide ak yon pwojè k ap prepare pou n konprann kijan livrezon ak komès ka fèt pi byen.
                    
                    3. Kijan li ta ka fè ti lajan pou kenbe tèt li :
                    - Gratis pou ti machann mete kèk ti pwodui sou li ;
                    - Yon ti pousantaj tou piti (tankou 1 oswa 2 %) lè yon vant fèt sou entènèt la ;
                    - Ti opsyon peye pou moun ki vle jere depo machandiz yo pi byen.
                    
                    4. Gwo defi komès sou entènèt genyen an Ayiti :
                    Pou AJ-Commerce ka mache byen pita, l ap gen pou rezoud gwo pwoblèm : anpil zòn pa gen nimewo kay ak bon non lari, gen pwoblèm transpò, epi moun yo abitye peye ak lajan kach nan men lè machandiz la rive.
                """.trimIndent(),
                plannedStartPage = 104,
                plannedEndPage = 105,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 70 : AJ-Biz et l'accompagnement des entreprises ====================
            BookChapter(
                id = "ch_5_70",
                chapterNumber = 70,
                partId = "part_5",
                titleFr = "Chapitre 70 — AJ-Biz et l'accompagnement des entreprises",
                titleHt = "Chapit 70 — AJ-Biz ak akonpayman antrepriz yo",
                subtitleFr = "Conseil en transformation numérique, modernisation des processus et distinction avec AJ-Fondation",
                subtitleHt = "Konsèy pou modènize biznis ak zouti nimerik, epi diferans klè ak AJ-Fondation",
                summaryFr = "Présentation de l'entité AJ-Biz dédiée au conseil, à la digitalisation des PME et à l'accompagnement stratégique des entreprises haïtiennes.",
                summaryHt = "Prezantasyon antite AJ-Biz ki la pou bay konsèy ak ede ti konpayi modènize fason y ap travay ak zouti nimerik.",
                contentFr = """
                    1. Mission et positionnement d'AJ-Biz :
                    AJ-Biz constitue le pôle de conseil, d'ingénierie d'affaires et d'accompagnement en transformation numérique au sein de l'écosystème AJ-TECH. Sa mission est d'aider les petites et moyennes entreprises (PME), coopératives et institutions haïtiennes à auditer, moderniser et sécuriser leurs flux de travail grâce au logiciel.
                    
                    2. Distinction stricte entre AJ-Biz et AJ-Fondation :
                    Il est essentiel de rappeler qu'AJ-Biz et AJ-Fondation sont deux entités distinctes :
                    - AJ-Biz est une entité d'accompagnement professionnel et de prestations de services techniques ;
                    - AJ-Fondation est une structure à vocation philanthropique et non lucrative dédiée aux actions citoyennes, à l'éducation ouverte et aux bourses d'études.
                    
                    3. Typologie des services envisagés par AJ-Biz :
                    - Diagnostics de maturité numérique et audits de sécurité informatique ;
                    - Conception de feuilles de route technologiques adaptées au contexte local ;
                    - Formation sur mesure des équipes de direction et des opérationnels.
                    
                    4. Modèle de viabilité :
                    Honoraires de conseil et contrats d'assistance technique calibrés pour être accessibles aux structures haïtiennes.
                """.trimIndent(),
                contentHt = """
                    1. Misyon ak wòl AJ-Biz :
                    AJ-Biz se branch nan ekosistèm nan ki la pou bay konsèy ak akonpaye ti biznis, kowoperativ ak enstitisyon nan peyi a pou yo ka itilize zouti nimerik pou travay pi byen ak plis sekirite.
                    
                    2. Diferans klè ant AJ-Biz ak AJ-Fondation :
                    Fòk nou sonje byen AJ-Biz ak AJ-Fondation se de antite separe :
                    - AJ-Biz se yon antite pwofesyonèl pou bay sèvis konsèy ak sipò teknik bay biznis ;
                    - AJ-Fondation se yon fondasyon ki pa la pou fè kòb, ki la pou ede kominote a, bay bous etid epi sipòte lekòl.
                    
                    3. Kalite sèvis AJ-Biz prevwa bay :
                    - Gade kijan yon biznis ap travay epi montre l ki zouti nimerik ki ka ede l ;
                    - Prepare plan travay sou mezi ki adapte ak sa konpayi an ka peye ;
                    - Fòme anplwaye yo sou fason pou yo sèvi ak lojisyèl yo byen.
                    
                    4. Kijan l ap fonksyone :
                    Peye pou sèvis konsèy ak kontra sipò teknik ak pri ki kalkile kòrèkteman pou ti biznis ayisyen.
                """.trimIndent(),
                plannedStartPage = 106,
                plannedEndPage = 107,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 71 : Paiements numériques et inclusion financière ====================
            BookChapter(
                id = "ch_5_71",
                chapterNumber = 71,
                partId = "part_5",
                titleFr = "Chapitre 71 — Paiements numériques et inclusion financière",
                titleHt = "Chapit 71 — Peman nimerik ak enklizyon finansyè",
                subtitleFr = "Vision d'AJ-Pay et AJ-Wallet, réglementation BRH, lutte contre l'exclusion et transparence",
                subtitleHt = "Vizyon AJ-Pay ak AJ-Wallet, règleman Labank Santral (BRH), ede tout moun jwenn sèvis ak laverite",
                summaryFr = "Analyse prospective des paiements dématérialisés et portefeuilles numériques (AJ-Pay, AJ-Wallet), du cadre légal BRH et de l'état réel des développements.",
                summaryHt = "Analiz sou bous ak peman sou telefòn (AJ-Pay, AJ-Wallet), lwa labank mande ak verite klè sou kote devlopman an ye.",
                contentFr = """
                    1. L'enjeu vital de l'inclusion financière :
                    En Haïti, la majorité des citoyens ne possèdent pas de compte bancaire traditionnel en raison des exigences administratives, des distances géographiques et des coûts de tenue de compte. Les outils numériques sur téléphone constituent le vecteur le plus prometteur pour démocratiser l'accès aux services financiers de base.
                    
                    2. Positionnement prospectif d'AJ-Pay et d'AJ-Wallet :
                    - AJ-Pay vise conceptuellement à faciliter les micro-paiements du quotidien, les règlements de factures et les transactions commerciales locales ;
                    - AJ-Wallet est pensé comme un outil de gestion budgétaire personnelle, d'éducation financière et de conservation sécurisée des reçus.
                    
                    3. Transparence réglementaire absolue :
                    Il est impératif de rappeler qu'AJ-Pay et AJ-Wallet ne sont pas des services bancaires opérationnels, ne collectent aucun dépôt d'épargne et ne disposent à ce jour d'aucune intégration connectée avec les systèmes MonCash, NatCash ou le réseau interbancaire de la Banque de la République d'Haïti (BRH).
                    
                    4. Conditions préalables indispensables :
                    Tout déploiement opérationnel nécessitera l'obtention des licences réglementaires de la BRH, la conformité aux normes de lutte contre le blanchiment d'argent (LCB-FT) et la vérification rigoureuse des identités (KYC).
                """.trimIndent(),
                contentHt = """
                    1. Enpòtans pou tout moun ka jwenn sèvis lajan :
                    Anpil sitwayen an Ayiti pa gen kont labank paske papye yo mande twòp, bank yo twò lwen epi frè yo twò chè. Telefòn mobil se pi bon zouti pou pèmèt tout moun jwenn bon sèvis lajan senp.
                    
                    2. Sa nou prevwa pou AJ-Pay ak AJ-Wallet fè :
                    - AJ-Pay gen vizyon pou ede moun fè ti peman tou senp chak jou, peye bòdwo ak sèvis ;
                    - AJ-Wallet fèt nan lide pou sèvi kòm yon bous sou telefòn pou ede moun konprann kòman yo depanse kòb yo epi kenbe resi yo an sekirite.
                    
                    3. Verite klè sou sa k ap mache jodi a :
                    Nou dwe repete sa aklè : AJ-Pay ak AJ-Wallet se pa bank k ap mache jodi a, yo pa pran kòb moun sere, epi yo poko konekte sou MonCash, NatCash ni sou okenn rezo labank santral (BRH) kounye a.
                    
                    4. Sa k dwe fèt anvan yo ouvri :
                    Pou yo ta ka ouvri pi devan, fòk gen bonjan lisans ak otorizasyon nan men BRH, respekte tout lwa kont lajan sal epi verifye idantite moun yo (KYC) pou sekirite tout moun.
                """.trimIndent(),
                plannedStartPage = 107,
                plannedEndPage = 108,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 72 : Investissement et financement responsable ====================
            BookChapter(
                id = "ch_5_72",
                chapterNumber = 72,
                partId = "part_5",
                titleFr = "Chapitre 72 — Investissement et financement responsable",
                titleHt = "Chapit 72 — Envestisman ak finansman responsab",
                subtitleFr = "Capital patient, investissement d'impact, préservation des valeurs et absence de dette",
                subtitleHt = "Lajan ki gen pasyans, envestisman ki la pou ede sosyete a, pwoteje prensip nou epi pa fè dèt",
                summaryFr = "Revue des mécanismes de financement éthiques pour le secteur technologique haïtien et présentation transparente de la situation financière d'AJ-TECH.",
                summaryHt = "Gade tout fason responsab pou jwenn lajan pou pwojè teknoloji, ak verite sou kote AJ-TECH ye nan zafè kòb.",
                contentFr = """
                    1. Les dérives du capital spéculatif à court terme :
                    Le modèle classique du capital-risque mondial pousse souvent les startups vers une course effrénée à la croissance artificielle, au détriment de la qualité logicielle et des besoins fondamentaux des utilisateurs.
                    
                    2. L'alternative du capital patient et de l'investissement d'impact :
                    L'investissement d'impact (Impact Investing) privilégie des projets qui génèrent des retombées positives mesurables sur le plan éducatif, social et économique, tout en assurant une rentabilité modérée et pérenne.
                    
                    3. Situation financière réelle d'AJ-TECH :
                    AJ-TECH ne bénéficie actuellement d'aucune subvention publique, d'aucun fonds de capital-risque ni d'aucun prêt bancaire. Le travail d'ingénierie et de documentation est entièrement autofinancé par les fondateurs sur leur temps libre et leurs ressources personnelles.
                    
                    4. Principes d'alignement éthique :
                    Tout partenariat financier éventuel à l'avenir devra impérativement respecter la souveraineté décisionnelle de l'écosystème, la protection de la vie privée des citoyens et l'enracinement haïtien du projet.
                """.trimIndent(),
                contentHt = """
                    1. Danje ki genyen nan kouri dèyè lajan fasil :
                    Fason gwo konpayi etranje yo prete lajan souvan fòse jèn antrepriz yo fè gwo manti sou kwasans yo olye yo bati bonjan zouti solid k ap sèvi pèp la tout bon.
                    
                    2. Envestisman ki gen pasyans ak konsyans (Impact Investing) :
                    Sa se lè moun mete lajan nan yon pwojè paske yo vle wè bonjan chanjman nan lekòl, nan travay ak nan lavi moun yo, pandan pwojè a ap rantre ti kòb rezonab pou kenbe tèt li.
                    
                    3. Sitiyasyon lajan AJ-TECH jodi a :
                    AJ-TECH pa gen okenn èd lajan leta, okenn gwo envestisè etranje, ni okenn kòb prete nan bank kounye a. Tout travay kòd sa a fèt ak pwòp ti mwayen ak fòs ponyèt fondatè yo.
                    
                    4. Prensip nou pap janm negosye :
                    Si pi devan ta gen yon patnè ki vle mete lajan, fòk li respekte libète pwojè a, sekirite done moun yo epi misyon nou pou sèvi peyi Ayiti an premye.
                """.trimIndent(),
                plannedStartPage = 109,
                plannedEndPage = 110,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 73 : Diaspora et capital international ====================
            BookChapter(
                id = "ch_5_73",
                chapterNumber = 73,
                partId = "part_5",
                titleFr = "Chapitre 73 — Diaspora et capital international",
                titleHt = "Chapit 73 — Dyaspora ak kapital entènasyonal",
                subtitleFr = "Mobilisation des compétences diasporiques, mentorat, investissements productifs et canaux sécurisés",
                subtitleHt = "Mete konesans dyaspora a travay, sipòte jèn yo, envesti nan biznis ak kreye bon mwayen ki fyab",
                summaryFr = "Stratégie de mobilisation de la diaspora haïtienne comme partenaire clé pour le transfert de savoir-faire technique et l'investissement productif.",
                summaryHt = "Estrateji pou fè dyaspora ayisyen an vin yon gwo patnè pou pote konesans teknik ak envesti nan kreye travay nan peyi a.",
                contentFr = """
                    1. Le poids économique majeur de la diaspora :
                    Les transferts financiers de la diaspora haïtienne dépassent 30 % du PIB national. Toutefois, la quasi-totalité de ces fonds est absorbée par les dépenses d'urgence et la consommation courante, sans créer d'infrastructures productives pérennes.
                    
                    2. La transition vers l'investissement productif :
                    L'objectif est d'offrir à la diaspora des canaux transparents et vérifiables pour investir dans des entreprises technologiques haïtiennes, finançant des salaires d'ingénieurs locaux et le développement d'outils nationaux.
                    
                    3. Le capital immatériel : Mentorat et transfert de compétences :
                    Des milliers d'ingénieurs logiciels, de chercheurs et de gestionnaires haïtiens exercent au sein des plus grands pôles technologiques mondiaux. Leur accompagnement sous forme de revues de code, de cours magistraux et de conseils stratégiques a une valeur inestimable pour l'écosystème.
                    
                    4. Absence de mécanismes d'investissement actifs :
                    Il est précisé qu'AJ-TECH ne gère actuellement aucun fonds d'investissement de la diaspora. Les coopérations actuelles relèvent exclusivement du dialogue intellectuel et de la révision technique bénévole.
                """.trimIndent(),
                contentHt = """
                    1. Gwo fòs lajan dyaspora a :
                    Lajan moun nan dyaspora a voye reprezante plis pase 30 % nan tout richès peyi Ayiti. Men prèske tout lajan sa a sèvi sèlman pou kouri achte manje oswa peye lopital, li pa kreye gwo izin oswa biznis ki la pou tout tan.
                    
                    2. Chanje fason nou itilize lajan sa a :
                    Objektif la se kreye bon mwayen klè pou moun lòt bò dlo ka envesti nan konpayi teknoloji an Ayiti, pou peye bon enjenyè sou plas epi bati zouti pou peyi a.
                    
                    3. Pi gwo richès la se konesans ak eksperyans :
                    Gen plizyè milye enjenyè, doktè ak espesyalis ayisyen k ap travay nan pi gwo konpayi teknoloji sou latè. Lè yo vin moutre jèn yo sa yo konnen epi verifye kòd yo, sa vo plis pase lò.
                    
                    4. Verite sou sa k ap fèt kounye a :
                    AJ-TECH pa gen okenn kès kote l ap ranmase lajan nan men dyaspora a jodi a. Tout koutmen k ap fèt kounye a se bon konsèy ak verifye kòd gratis pou ede pwojè a vanse.
                """.trimIndent(),
                plannedStartPage = 110,
                plannedEndPage = 111,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 74 : Mesurer la performance d'une entreprise technologique ====================
            BookChapter(
                id = "ch_5_74",
                chapterNumber = 74,
                partId = "part_5",
                titleFr = "Chapitre 74 — Mesurer la performance d'une entreprise technologique",
                titleHt = "Chapit 74 — Mezire rezilta ak pèfòmans yon konpayi teknoloji",
                subtitleFr = "Indicateurs clés de performance (KPI), qualité du code, satisfaction utilisateur et impact réel",
                subtitleHt = "Bonjan chif pou kontwole travay la (KPI), kalite kòd la, satisfaksyon moun ak chanjman nan lavi reyèl",
                summaryFr = "Méthodes de mesure de la performance d'une startup technologique : métriques logicielles, indicateurs d'usage réels et métriques d'impact social.",
                summaryHt = "Fason pou kontwole si yon konpayi teknoloji ap mache byen tout bon : bon kòd san erè, moun k ap sèvi avè l ak bon sèvis li rann.",
                contentFr = """
                    1. Rejet des métriques de vanité (Vanity Metrics) :
                    Mesurer le succès d'une entreprise au nombre de téléchargements bruts ou de vues sur les réseaux sociaux est trompeur. La véritable performance repose sur des indicateurs d'usage réels et durables.
                    
                    2. Indicateurs techniques et de qualité logicielle :
                    - Taux de réussite des tests automatisés (Unit Tests, intégration) : 100 % requis ;
                    - Couverture de code et maintenabilité architecturale ;
                    - Temps de démarrage et consommation de mémoire RAM sur des appareils modestes ;
                    - Taux de plantage (Crash-free users) supérieur à 99,5 %.
                    
                    3. Indicateurs d'utilité et de fidélisation :
                    - Taux d'utilisation régulière des fonctionnalités hors-ligne ;
                    - Taux de satisfaction des utilisateurs et rapidité de résolution des problèmes remontés ;
                    - Économie de temps et de données générée pour les utilisateurs finaux.
                    
                    4. Métriques d'impact sociétal et humain :
                    Nombre d'étudiants et de développeurs formés, compétences transmises et valeur ajoutée locale créée.
                """.trimIndent(),
                contentHt = """
                    1. Pa kite fo chif twonpe w (Vanity Metrics) :
                    Konte konbyen moun ki klike sou yon paj oswa telechaje yon aplikasyon yon sèl fwa pa vle di anyen si yo pa sèvi avè l vre. Vrè siksè a se lè zouti a itil moun chak jou.
                    
                    2. Chif pou verifye kalite kòd la ak lojisyèl la :
                    - Tout tès otomatik dwe pase a 100 % san okenn erè ;
                    - Kòd la dwe pwòp epi fasil pou lòt devlopè konprann ;
                    - Aplikasyon an dwe ouvri vit epi li pa dwe pran tout memwa telefòn lan ;
                    - Aplikasyon an pa dwe janm fèmen poukont li sou moun (plis pase 99.5 % san pann).
                    
                    3. Chif pou wè si zouti a itil tout bon :
                    - Konbyen moun ki itilize l san entènèt san pwoblèm ;
                    - Èske moun yo kontan epi èske nou repare ti pwoblèm yo vit ;
                    - Konbyen tan ak kòb megabay li fè itilizatè yo ekonomize.
                    
                    4. Chanjman li pote nan sosyete a :
                    Kantite jèn ki aprann kode gras ak liv la, konesans ki pataje ak richès ki rete nan peyi a.
                """.trimIndent(),
                plannedStartPage = 111,
                plannedEndPage = 112,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 75 : Croissance, scalabilité et expansion ====================
            BookChapter(
                id = "ch_5_75",
                chapterNumber = 75,
                partId = "part_5",
                titleFr = "Chapitre 75 — Croissance, scalabilité et expansion",
                titleHt = "Chapit 75 — Grandi, pase a lechèl ak elaji prezans",
                subtitleFr = "Passage à l'échelle maîtrisé, résilience organisationnelle et stratégie d'expansion caribéenne",
                subtitleHt = "Grandi san pèdi kontwòl, kenbe estrikti a solid epi elaji nan zòn Karayib la pita",
                summaryFr = "Analyse des conditions d'un passage à l'échelle maîtrisé et de la stratégie d'expansion géographique progressive d'AJ-TECH.",
                summaryHt = "Analiz sou fason pou fè yon konpayi grandi san l pa kraze, ak plan pou elaji sèvis yo nan Karayib la pi devan.",
                contentFr = """
                    1. Les risques d'une croissance prématurée :
                    Vouloir s'étendre trop vite avant d'avoir stabilisé son produit et ses processus est l'une des causes majeures d'échec des startups. La scalabilité doit être technique, humaine et financière avant d'être géographique.
                    
                    2. Scalabilité technique et architecturale :
                    - Architecture modulaire et découplée permettant de monter en charge sans réécrire l'ensemble du système ;
                    - Utilisation de standards ouverts et d'APIs REST documentées ;
                    - Optimisation du code pour minimiser les coûts d'infrastructure serveur.
                    
                    3. Stratégie d'expansion par cercles concentriques :
                    - Cercle 1 — Haïti : Consolidation du socle technologique et validation terrain ;
                    - Cercle 2 — La Caraïbe : Adaptation aux contextes insulaires voisins partageant des contraintes similaires ;
                    - Cercle 3 — Les communautés diasporiques : Déploiement auprès de la diaspora en Amérique du Nord et Europe ;
                    - Cercle 4 — Marchés internationaux : Exportation de briques logicielles et d'ingénierie à haute valeur ajoutée.
                    
                    4. Transparence sur le statut d'expansion :
                    AJ-TECH ne possède actuellement aucune filiale ni bureau commercial à l'étranger. L'expansion internationale constitue une orientation stratégique à long terme.
                """.trimIndent(),
                contentHt = """
                    1. Danje pou w vle kouri twò vit anvan w pare :
                    Lè yon biznis vle louvri tout kote anvan menm pwodui li fin solid, se pi bon fason pou l fè fayit. Fòk sistèm nan solid nan kòd li, nan moun k ap jere l yo ak nan lajan l anvan l chache elaji.
                    
                    2. Bati kòd ki ka sipòte anpil moun alafwa :
                    - Separe moso kòd yo pou si yon pati bezwen grandi, sa pa kraze rès sistèm nan ;
                    - Sèvi ak bonjan estanda entènasyonal ak API REST ki byen dokimante ;
                    - Ekri kòd ki lejè pou l pa koute chè lè gen plis moun k ap itilize l.
                    
                    3. Etap pou n vanse ti pa ti pa :
                    - Premye etap — Ayiti : Fini byen bati zouti yo nan peyi a epi verifye yo itil moun tout bon ;
                    - Dezyèm etap — Karayib la : Pote solisyon yo bay lòt peyi vwazen ki gen menm pwoblèm kouran ak entènèt ;
                    - Twazyèm etap — Dyaspora a : Pèmèt ayisyen k ap viv lòt bò dlo itilize zouti nou yo pou travay ;
                    - Katriyèm etap — Tout mond lan : Vann bon lojisyèl bay gwo konpayi etranje.
                    
                    4. Verite sou kote nou ye jodi a :
                    AJ-TECH pa gen okenn biwo deyò peyi a kounye a. Tout sa se plan ak vizyon pou pi devan lè travay fondasyon an va fin fèt.
                """.trimIndent(),
                plannedStartPage = 112,
                plannedEndPage = 113,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 76 : Vers un modèle économique AJ-TECH 2026–2035 ====================
            BookChapter(
                id = "ch_5_76",
                chapterNumber = 76,
                partId = "part_5",
                titleFr = "Chapitre 76 — Vers un modèle économique AJ-TECH 2026–2035",
                titleHt = "Chapit 76 — Vè yon modèl ekonomik AJ-TECH 2026–2035",
                subtitleFr = "Feuille de route décennale : amorçage, validation commerciale, passage à l'échelle et maturité",
                subtitleHt = "Plan travay sou 10 lane : kòmanse ak pasyans, teste sou mache a, grandi epi vin solid nèt",
                summaryFr = "Feuille de route économique décennale d'AJ-TECH, structurée en quatre phases progressives et éthiques de 2026 à 2035.",
                summaryHt = "Plan travay ekonomik sou 10 lane pou gide devlopman ekosistèm AJ-TECH an kat gwo faz soti 2026 rive 2035.",
                contentFr = """
                    1. Nature des projections économiques décennales :
                    Les phases présentées ci-dessous constituent un cadre d'orientation stratégique, méthodologique et moral pour guider l'évolution de l'écosystème. Elles ne constituent en aucun cas des garanties de résultats financiers.
                    
                    2. Les quatre phases de la feuille de route 2026–2035 :
                    
                    - Phase 1 (2026–2027) — Amorçage, Frugalité & Consolidation du Socle :
                      - Finalisation du socle logiciel documentaire et de l'architecture de référence ;
                      - Test pilote approfondi de la PWA AJ-Task auprès d'utilisateurs tests sans monétisation agressive ;
                      - Maintien du modèle 100 % autofinancé (Bootstrapping) avec zéro endettement.
                    
                    - Phase 2 (2028–2030) — Premières validations commerciales & Modèles pilotes :
                      - Expérimentation des premiers modèles Freemium sur les outils de productivité ;
                      - Études de conformité réglementaire pour les services financiers futurs (AJ-Pay / AJ-Wallet) ;
                      - Premiers recrutements rémunérés de développeurs et formateurs locaux sur fonds propres.
                    
                    - Phase 3 (2031–2033) — Passage à l'échelle & Diversification éthique :
                      - Lancement d'AJ-Commerce et d'EDUKA auprès des institutions partenaires ;
                      - Structuration des offres d'abonnements professionnels (AJ-Dev, AJ-Cloud) ;
                      - Atteinte visée de l'équilibre financier opérationnel global.
                    
                    - Phase 4 (2034–2035) — Maturité, Réinvestissement & Rayonnement caribéen :
                      - Consolidation des revenus récurrents et réinvestissement majeur dans la recherche et le développement ;
                      - Premiers déploiements commerciaux dans la région caribéenne ;
                      - Établissement d'AJ-TECH comme référence de l'entrepreneuriat technologique souverain haïtien.
                    
                    3. Conclusion de la Partie V :
                    La grandeur d'une entreprise technologique ne se mesure pas aux promesses de lendemains enchanteurs, mais à la constance de son travail, à la vérité de ses comptes et à l'impact réel et mesurable qu'elle apporte à son peuple.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan ekonomik sa a vle di :
                    Dat ak etap sa yo se yon gid travay ak yon vizyon estratejik pou gide kijan ekosistèm nan ap grandi, se pa yon pwomès lajan fasil san travay.
                    
                    2. Kat gwo faz nan plan 2026–2035 lan :
                    
                    - Faz 1 (2026–2027) — Kòmanse ak pasyans san fè bri :
                      - Fini byen ekri liv la ak tout kòd debaz lojisyèl yo ;
                      - Fè tès sou PWA AJ-Task la ak moun k ap ede nou teste san chache vann li chè ;
                      - Kontinye travay ak pwòp fòs ponyèt nou san fè okenn dèt.
                    
                    - Faz 2 (2028–2030) — Premye tès sou mache a :
                      - Kòmanse teste ti abònman pou pwofesyonèl sou zouti ki pare yo ;
                      - Fè tout demach legal ak labank pou prepare sèvis lajan (AJ-Pay / AJ-Wallet) ;
                      - Kòmanse peye premye jèn devlopè ak pwofesè k ap travay avèk nou sou fon pwòp.
                    
                    - Faz 3 (2031–2033) — Grandi epi elaji sèvis yo nan respè :
                      - Louvri AJ-Commerce ak EDUKA pou lekòl ak biznis patnè yo ;
                      - Mete bonjan abònman pou sèvè ak zouti devlopman (AJ-Dev, AJ-Cloud) ;
                      - Rive nan pwen kote kòb k ap rantre a ka peye tout depans konpayi an.
                    
                    - Faz 4 (2034–2035) — Vin yon gwo fòs nan peyi a ak nan Karayib la :
                      - Fè gwo re-envestisman nan kreye nouvo teknoloji ak fòmasyon ;
                      - Kòmanse vann sèvis nou yo bay lòt peyi nan Karayib la ;
                      - Fè AJ-TECH vin yon gwo modèl siksè antrepriz teknolojik ki fèt an Ayiti.
                    
                    3. Konklizyon Pati V la :
                    Valè yon antrepriz pa chita sou gwo pawòl van, men li chita sou travay di chak jou, sou di laverite sou zafè lajan epi sou bonjan sèvis li rann pèp la nan lavi reyèl.
                """.trimIndent(),
                plannedStartPage = 113,
                plannedEndPage = 114,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
