package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE VI — ÉDUCATION, COMPÉTENCES ET CAPITAL HUMAIN
 * Chapitres 76 à 90 (Exactement 15 chapitres d'analyse éducative, formation technique et souveraineté cognitive).
 */
object Part6Data {

    val part6: BookPart = BookPart(
        id = "part_6",
        partNumber = 6,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE VI — ÉDUCATION, COMPÉTENCES ET CAPITAL HUMAIN",
        titleHt = "PATI VI — EDIKASYON, KONPETANS AK KAPITAL IMEN",
        subtitleFr = "Formation d'une génération de bâtisseurs, autodidaxie, intelligence artificielle et stratégie 2026–2035",
        subtitleHt = "Fòmasyon yon jenerasyon moun k ap bati, aprann poukont ou, entèlijans atifisyèl ak plan 2026–2035",
        plannedPages = "pp. 341–395",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 76 : L'éducation numérique en Haïti ====================
            BookChapter(
                id = "ch_6_76",
                chapterNumber = 76,
                partId = "part_6",
                titleFr = "Chapitre 76 — L'éducation numérique en Haïti",
                titleHt = "Chapit 76 — Edikasyon nimerik an Ayiti",
                subtitleFr = "Fracture numérique, infrastructures scolaires et impératif de transformation",
                subtitleHt = "Diferans nan aksè teknoloji, lekòl san mwayen ak obligasyon pou n chanje sa",
                summaryFr = "Analyse des défis structurels de l'éducation en Haïti et du potentiel du numérique pour démocratiser l'accès au savoir.",
                summaryHt = "Analiz sou gwo pwoblèm lekòl genyen an Ayiti ak jan zouti nimerik ka ede tout timoun jwenn konesans pi fasil.",
                contentFr = """
                    1. État des lieux et fracture numérique :
                    Le système éducatif haïtien fait face à des disparités géographiques et économiques aiguës. La grande majorité des établissements scolaires, en particulier dans les provinces et les zones rurales, ne disposent ni de laboratoires informatiques, ni de connexion Internet stable, ni d'alimentation électrique permanente.
                    
                    2. Coût des équipements et du haut débit :
                    Le coût prohibitif des ordinateurs, tablettes et forfaits de données mobiles constitue un frein majeur pour les familles et les étudiants. L'accès aux bibliothèques numériques mondiales demeure un privilège réservé à une minorité urbaine.
                    
                    3. Le défi de la formation pédagogique :
                    L'intégration efficace des technologies ne se résume pas à distribuer du matériel : elle exige la formation continue des enseignants à la pédagogie numérique, à la création de supports interactifs et à l'évaluation formative.
                    
                    4. L'impératif de solutions adaptées et hors-ligne :
                    Pour être équitable, l'éducation numérique en Haïti doit s'émanciper de la dépendance à Internet continu grâce à des architectures de contenus préchargés, des applications légères et des supports bilingues accessibles à tous.
                """.trimIndent(),
                contentHt = """
                    1. Reyalite lekòl yo ak diferans nan aksè teknoloji :
                    Sistèm lekòl la an Ayiti gen gwo pwoblèm : pifò lekòl, sitou sa ki nan pwovens yo ak nan zòn andeyò yo, pa gen sal enfòmatik, pa gen entènèt ki fyab, epi pa gen kouran tout tan.
                    
                    2. Pri òdinatè ak kat entènèt ki twò chè :
                    Òdinatè, tablèt ak megabay koute twòp kòb pou pifò fanmi ak elèv. Se yon ti ponyen moun lavil sèlman ki gen mwayen pou fouye nan gwo liv sou entènèt.
                    
                    3. Bezwen fòme pwofesè yo :
                    Mete teknoloji nan lekòl se pa sèlman bay aparèy : fòk nou fòme mèt ak metrès yo sou fason pou anseye ak zouti sa yo, pou prepare bon leson epi ede elèv yo pi byen konprann.
                    
                    4. Zouti ki dwe mache san entènèt :
                    Pou tout timoun ka jwenn menm chans, zouti edikasyon yo dwe ka mache san yo pa bezwen entènèt tout tan, ak leson ki deja telechaje epi ki ekri an kreyòl ak fransè pou tout moun konprann.
                """.trimIndent(),
                plannedStartPage = 341,
                plannedEndPage = 344,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 77 : EDUKA : une vision pour l'éducation ====================
            BookChapter(
                id = "ch_6_77",
                chapterNumber = 77,
                partId = "part_6",
                titleFr = "Chapitre 77 — EDUKA : une vision pour l'éducation",
                titleHt = "Chapit 77 — EDUKA : yon vizyon pou edikasyon",
                subtitleFr = "Plateforme éducative modulaire, contenus structurés et statut de conception",
                subtitleHt = "Yon platfòm edikasyon modilè, leson byen prepare ak nivo konsepsyon li ye kounye a",
                summaryFr = "Présentation de l'entité EDUKA, son statut officiel de conception et son architecture pédagogique envisagée.",
                summaryHt = "Prezantasyon pwojè EDUKA a, nivo konsepsyon li ye jodi a ak sa nou vle li fè pou lekòl yo.",
                contentFr = """
                    1. Statut officiel et transparence :
                    L'entité EDUKA est officiellement classée sous le statut « CONCEPT / EN CONCEPTION » au sein de l'écosystème. Elle ne constitue pas à ce jour une plateforme en ligne commercialisée ni déployée dans les écoles. Aucun partenariat scolaire officiel, aucune certification d'État ni aucun chiffre d'étudiants n'est actuellement revendiqué.
                    
                    2. Vision et finalité d'EDUKA :
                    EDUKA est conçue pour devenir une plateforme éducative unifiée offrant :
                    - Des cours structurés couvrant le cursus fondamental, secondaire et technique ;
                    - Des exercices interactifs avec correction pas à pas et explications conceptuelles ;
                    - Un fonctionnement 100 % hors-ligne avec synchronisation périodique facultative ;
                    - Une adaptation linguistique intégrale en Kreyòl Ayisyen et en Français.
                    
                    3. Architecture pédagogique modulaire :
                    Le contenu est découpé en micro-modules d'apprentissage progressifs (micro-learning) permettant à chaque élève d'avancer à son propre rythme selon ses disponibilités énergétiques et temporelles.
                    
                    4. Collaborations futures visées :
                    À terme, EDUKA ambitionne de collaborer avec les pédagogues, linguistes et associations d'enseignants haïtiens pour garantir la conformité et la rigueur académique des contenus.
                """.trimIndent(),
                contentHt = """
                    1. Nivo pwojè a ye jodi a ak verite total :
                    Pwojè EDUKA anrejistre ofisyèlman anba estati « KONSÈP / AN KONSEPSYON ». Li poko yon sitwèb ki louvri pou tout moun ni li poko enstale nan lekòl yo jodi a. Nou pa gen okenn kontra ofisyèl ak lekòl, okenn diplòm leta ni okenn chif sou elèv kounye a (Tout bagay sa yo se : Pou defini / An kou konsepsyon).
                    
                    2. Sa nou vle EDUKA fè pi devan :
                    EDUKA fèt nan lide pou vin yon gwo zouti edikasyon ki genyen :
                    - Bon leson ki byen prepare pou elèv lekòl primè, segondè ak pwofesyonèl ;
                    - Egzèsis ak bon eksplikasyon etap pa etap sou sa w pa t konprann ;
                    - Kapasite pou fonksyone 100 % san entènèt sou nenpòt ti aparèy ;
                    - Tout leson yo disponib ni an Kreyòl Ayisyen ni an Fransè.
                    
                    3. Ti leson kout ki fasil pou aprann :
                    Leson yo separe an ti moso kout pou elèv la ka etidye ti pa ti pa selon lè li gen kouran oswa tan lib.
                    
                    4. Moun nou ta renmen travay avèk yo pi devan :
                    Lè pwojè a va fin pare, nou ta renmen travay ak pwofesè, moun ki konn lang kreyòl ak asosyasyon edikatè ayisyen pou leson yo gen bon kalite kòrèk.
                """.trimIndent(),
                plannedStartPage = 345,
                plannedEndPage = 348,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 78 : EDH : l'École Du Digital d'Haïti ====================
            BookChapter(
                id = "ch_6_78",
                chapterNumber = 78,
                partId = "part_6",
                titleFr = "Chapitre 78 — EDH : l'École Du Digital d'Haïti",
                titleHt = "Chapit 78 — EDH : Lekòl Dijital Ayiti (École Du Digital d'Haïti)",
                subtitleFr = "Projet d'académie d'excellence technologique, cursus intensifs et statut conceptuel",
                subtitleHt = "Pwojè pou yon gwo lekòl metye teknoloji, gwo fòmasyon solid ak nivo konsepsyon li ye",
                summaryFr = "Présentation de l'entité EDH (École Du Digital d'Haïti), son ambition de formation d'élite et son statut de concept.",
                summaryHt = "Prezantasyon pwojè EDH la, misyon li pou fòme gwo espesyalis teknoloji ak estati konsèp li genyen jodi a.",
                contentFr = """
                    1. Identité et statut de l'entité EDH :
                    L'acronyme officiel EDH désigne l'« École Du Digital d'Haïti ». Il convient de maintenir strictement cette dénomination (sans préfixe « AJ- »). EDH est actuellement au statut de « CONCEPT » au sein de l'écosystème AJ-TECH. Aucun campus physique, corps professoral permanent ou cursus diplômant n'est encore opérationnel à ce stade.
                    
                    2. Mission fondamentale d'EDH :
                    EDH a pour vocation de devenir un centre d'excellence formant les futurs leaders technologiques haïtiens dans les filières de pointe : génie logiciel, cybersécurité, architecture de bases de données, intelligence artificielle appliquée et gestion de projets numériques.
                    
                    3. Pédagogie par projets et immersion professionnelle :
                    Le modèle pédagogique envisagé repose sur l'apprentissage par la pratique intensive (Project-Based Learning) :
                    - Résolution de problèmes réels rencontrés par les institutions et entreprises haïtiennes ;
                    - Développement d'applications de production dès la première année ;
                    - Revues de code rigoureuses et travail en équipe agile.
                    
                    4. Critères d'excellence et accessibilité sociale :
                    L'ambition future d'EDH est d'allier une sélection rigoureuse basée sur le mérite et le talent à des mécanismes de bourses d'études pour garantir qu'aucun jeune talentueux ne soit écarté par manque de moyens financiers.
                """.trimIndent(),
                contentHt = """
                    1. Non ofisyèl ak estati pwojè EDH la :
                    Non ofisyèl EDH vle di « École Du Digital d'Haïti » (Lekòl Dijital Ayiti). Nou dwe toujou kenbe non sa a konsa san mete « AJ- » devan l. Pwojè EDH la nan nivo « KONSÈP » kounye a. Li poko gen yon gwo bilding lekòl ki louvri, ni pwofesè fiks, ni diplòm l ap bay jodi a (Tout bagay sa yo se : Pou defini / An kou konsepsyon).
                    
                    2. Pi gwo misyon EDH genyen :
                    EDH fèt nan lide pou vin yon gwo sant fòmasyon kote pi bon jèn enjenyè ayisyen ap prepare nan gwo metye konplike : ekri gwo lojisyèl, sekirite enfòmatik, jere gwo baz done ak pwojè teknoloji.
                    
                    3. Aprann nan fè pratik tout bon :
                    Fason pou anseye a chita sou fè gwo pwojè reyèl :
                    - Rezoud pwoblèm tout bon vre biznis ak lopital genyen nan peyi a ;
                    - Bati bonjan aplikasyon depi nan premye ane a ;
                    - Verifye kòd ansanm epi travay an ekip menm jan ak nan gwo konpayi sou latè.
                    
                    4. Ede jèn ki gen talan men ki pa gen mwayen :
                    Plan nou pou pita se chwazi jèn ki travay di ak tout kè yo, epi jwenn bous pou ede sa ki pa gen gwo lajan yo etidye san traka.
                """.trimIndent(),
                plannedStartPage = 349,
                plannedEndPage = 352,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 79 : Apprendre à programmer ====================
            BookChapter(
                id = "ch_6_79",
                chapterNumber = 79,
                partId = "part_6",
                titleFr = "Chapitre 79 — Apprendre à programmer",
                titleHt = "Chapit 79 — Aprann pwograme",
                subtitleFr = "Une compétence d'émancipation cognitive, logique algorithmique et réalisme professionnel",
                subtitleHt = "Yon zouti pou louvri lespri, kalkil lojik ak verite sou travay nan teknoloji",
                summaryFr = "Analyse de la programmation comme outil de résolution de problèmes et de création, avec lucidité sur le marché du travail.",
                summaryHt = "Eksplikasyon sou fason aprann ekri kòd louvri lespri moun epi verite sou sa sa mande pou jwenn travay.",
                contentFr = """
                    1. La programmation comme super-pouvoir cognitif :
                    Apprendre à programmer ne consiste pas seulement à mémoriser la syntaxe d'un langage : c'est acquérir une discipline de pensée rigoureuse, apprendre à décomposer des problèmes complexes en étapes logiques élémentaires et transformer des idées abstraites en outils fonctionnels.
                    
                    2. Les opportunités ouvertes par le code :
                    La maîtrise du développement informatique permet :
                    - De créer ses propres outils et automatiser des tâches fastidieuses ;
                    - De résoudre des problèmes concrets dans sa communauté (santé, agriculture, éducation) ;
                    - De travailler à distance en tant que travailleur indépendant (freelance) ;
                    - De fonder des entreprises innovantes exportatrices de logiciels.
                    
                    3. Lucidité et réalisme professionnel :
                    Il est essentiel de dissiper une illusion tenace : apprendre les bases de la programmation ne garantit pas automatiquement un emploi bien rémunéré. Le marché exige un investissement continu, des centaines d'heures de pratique, la compréhension des architectures logicielles et une capacité constante d'adaptation aux évolutions technologiques.
                """.trimIndent(),
                contentHt = """
                    1. Pwograme se yon zouti ki louvri lespri :
                    Aprann ekri kòd se pa sèlman konnen kòmand yon langaj : se aprann reflechi ak lòd, separe gwo pwoblèm konplike an ti moso senp, epi transfòme yon senp lide nan yon zouti k ap mache tout bon.
                    
                    2. Sa kòd pèmèt ou fè :
                    Lè w konn ekri lojisyèl, ou kapab :
                    - Kreye pwòp zouti pa w pou fè travay ou pi vit ;
                    - Rezoud pwoblèm nan zòn kote w rete a (lopital, agrikilti, lekòl) ;
                    - Travay a distans sou entènèt pou moun lòt bò dlo ;
                    - Kreye pwòp konpayi pa w pou vann lojisyèl.
                    
                    3. Verite aklè sou zafè travay :
                    Nou dwe di sa nan laverite : aprann ti baz nan kòd pa vle di w ap jwenn yon gwo travay otomatikman. Sa mande pase plizyè santèn èdtan ap pratike chak jou, konprann jan gwo sistèm fèt, epi kontinye aprann toutan paske teknoloji a toujou ap chanje.
                """.trimIndent(),
                plannedStartPage = 353,
                plannedEndPage = 356,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 80 : La formation professionnelle numérique ====================
            BookChapter(
                id = "ch_6_80",
                chapterNumber = 80,
                partId = "part_6",
                titleFr = "Chapitre 80 — La formation professionnelle numérique",
                titleHt = "Chapit 80 — Fòmasyon pwofesyonèl nan metye nimerik",
                subtitleFr = "Parcours courts, reconversions, adéquation avec le marché et standards industriels",
                subtitleHt = "Fòmasyon kout, chanje metye, prepare pou sa konpayi bezwen ak bon estanda",
                summaryFr = "Rôle des cursus professionnels pratiques et intensifs pour accélérer l'insertion économique des jeunes.",
                summaryHt = "Enpòtans pou gen bon fòmasyon kout ak pratik pou ede jèn yo jwenn metye nan men yo rapid.",
                contentFr = """
                    1. Nécessité des filières courtes et professionnalisantes :
                    Tous les jeunes ne peuvent pas suivre un cursus universitaire de cinq ans. La formation professionnelle numérique propose des parcours intensifs (bootcamps de 6 à 12 mois) axés sur des compétences immédiatement opérationnelles.
                    
                    2. Typologie des métiers techniques d'accès rapide :
                    - Développeur web front-end et intégrateur d'interfaces ;
                    - Testeur logiciel et analyste qualité (QA) ;
                    - Administrateur de réseaux locaux et technicien support ;
                    - Gestionnaire de communauté et créateur de contenus techniques.
                    
                    3. Alignement sur les standards de l'industrie :
                    Pour être crédible sur le marché national et international, toute formation professionnelle doit enseigner les outils standards utilisés par les entreprises : systèmes de contrôle de versions (Git), environnements conteneurisés, méthodologies agiles (Scrum, Kanban) et communication technique professionnelle.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou bezwen fòmasyon kout ki pratik :
                    Se pa tout jèn ki gen mwayen oswa tan pou fè 5 ane nan inivèsite. Fòmasyon pwofesyonèl nimerik pèmèt moun fè 6 a 12 mwa fòmasyon entansif sou yon metye espesyal pou yo ka kòmanse travay rapid.
                    
                    2. Kalite metye moun ka aprann vit :
                    - Moun ki monte bèl sitwèb ak ekran aplikasyon ;
                    - Moun ki teste lojisyèl pou wè si pa gen erè ladan yo (QA) ;
                    - Moun ki enstale rezo ak repare pwoblèm òdinatè ;
                    - Moun ki jere paj ak kominikasyon sou rezo sosyo pou biznis.
                    
                    3. Aprann ak menm zouti gwo konpayi yo itilize :
                    Pou lòt moun ka fè w konfyans, fòmasyon an dwe aprann ou zouti tout devlopè sou latè itilize : Git pou sere kòd, fason pou travay an ekip rapid epi kominike byen sou sa w ap fè.
                """.trimIndent(),
                plannedStartPage = 357,
                plannedEndPage = 360,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 81 : L'autodidaxie et l'apprentissage par la pratique ====================
            BookChapter(
                id = "ch_6_81",
                chapterNumber = 81,
                partId = "part_6",
                titleFr = "Chapitre 81 — L'autodidaxie et l'apprentissage par la pratique",
                titleHt = "Chapit 81 — Aprann poukont ou (Otodidak) ak fè pratik",
                subtitleFr = "Lire la documentation, forger son expérience par l'erreur et persévérer sans relâche",
                subtitleHt = "Li dokiman teknik, aprann nan erè ou fè epi pa janm dekouraje",
                summaryFr = "Éloge et méthodologie de l'apprentissage autodidacte, clé de voûte de la progression technologique en contexte de ressources limitées.",
                summaryHt = "Konsèy ak bon metòd pou moun k ap aprann poukont yo, ki se pi gwo fòs pou vanse lè w pa gen gwo mwayen.",
                contentFr = """
                    1. L'autodidaxie comme moteur fondamental :
                    Dans l'histoire de l'informatique, les plus grandes innovations ont souvent été conçues par des esprits autodidactes passionnés. En Haïti, où l'accès aux grandes écoles est restreint, la capacité à apprendre par soi-même constitue un atout d'une puissance inestimable.
                    
                    2. Les piliers de la méthode autodidacte :
                    - La lecture assidue de la documentation officielle : Refuser la facilité des tutoriels superficiels et aller à la source des spécifications techniques ;
                    - L'apprentissage par l'erreur (Trial & Error) : Considérer chaque message d'erreur du compilateur comme une leçon d'ingénierie et non comme un échec ;
                    - La réalisation de projets personnels concrets : Construire des applications fonctionnelles du début à la fin plutôt que de consommer passivement des vidéos ;
                    - La persévérance inébranlable face aux blocages techniques.
                    
                    3. L'intelligence artificielle comme tuteur personnel :
                    Les outils d'IA contemporains offrent à l'autodidacte un tuteur disponible 24h/24 capable d'expliquer un concept obscur, de débugger un fragment de code ou de proposer des exercices adaptés.
                """.trimIndent(),
                contentHt = """
                    1. Aprann poukont ou se yon gwo fòs :
                    Nan listwa teknoloji, anpil nan pi gwo bagay yo se moun ki te aprann poukont yo ki te kreye yo. An Ayiti, kote li pa fasil pou tout moun jwenn gwo inivèsite, kapasite pou aprann poukont ou se pi bèl kado ou ka bay tèt ou.
                    
                    2. Bonjan prensip pou aprann poukont ou :
                    - Li dokiman ofisyèl yo : Pa sèlman gade ti videyo kout, men li liv ak dokiman kote tout règ teknik yo ekri ;
                    - Aprann nan erè ou fè : Lè òdinatè a di kòd la pa bon, se pa yon echèk, se yon leson pou w konprann sa k te manke a ;
                    - Kreye pwòp ti pwojè pa w : Bati yon ti aplikasyon soti nan kòmansman rive nan bout li olye w rete ap gade lòt moun k ap travay ;
                    - Kenbe fèm san dekouraje lè yon kòd bloke w pandan plizyè jou.
                    
                    3. Sèvi ak Entèlijans Atifisyèl tankou yon mèt bò kote w :
                    Zouti IA jodi a pèmèt ou gen yon pwofesè bò kote w tout lajounen ak tout lannwit pou eksplike w sa w pa konprann, ede w jwenn erè nan kòd la epi ba w bon egzèsis pou pratike.
                """.trimIndent(),
                plannedStartPage = 361,
                plannedEndPage = 364,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 82 : Intelligence artificielle et éducation ====================
            BookChapter(
                id = "ch_6_82",
                chapterNumber = 82,
                partId = "part_6",
                titleFr = "Chapitre 82 — Intelligence artificielle et éducation",
                titleHt = "Chapit 82 — Entèlijans atifisyèl ak edikasyon",
                subtitleFr = "Potentiel pédagogique, esprit critique, risques de plagiat et supervision humaine",
                subtitleHt = "Èd pou aprann, devlope lespri kritik, danje kopye san konprann ak kontwòl moun",
                summaryFr = "Analyse équilibrée de l'apport de l'IA à l'apprentissage, des précautions éthiques et du nécessaire maintien de l'esprit critique.",
                summaryHt = "Analiz sou kijan IA ka ede nan lekòl, danje si moun itilize l san reflechi ak enpòtans pou toujou verifye sa l di.",
                contentFr = """
                    1. Le potentiel éducatif transformateur de l'IA :
                    L'Intelligence Artificielle générative permet d'individualiser l'apprentissage à une échelle inédite : reformulation d'un concept selon le niveau de l'étudiant, génération de quiz personnalisés, traduction instantanée de ressources techniques vers le Kreyòl Ayisyen.
                    
                    2. Les risques majeurs et dérives potentielles :
                    - Dépendance intellectuelle et atrophie de la réflexion : Laisser l'IA penser ou coder à sa place sans comprendre les fondements détruit la capacité d'apprentissage ;
                    - Hallucinations et fausses certitudes : Les modèles peuvent affirmer avec assurance des faits scientifiques ou historiques erronés ;
                    - Plagiat et malhonnêteté académique : Soumettre du travail généré automatiquement sans mentionner la source.
                    
                    3. La règle d'or : Esprit critique et supervision humaine :
                    L'IA doit être utilisée comme un miroir de réflexion et un accélérateur d'exploration, jamais comme une autorité suprême dispensant de l'effort intellectuel personnel.
                """.trimIndent(),
                contentHt = """
                    1. Kijan IA ka chanje fason nou aprann :
                    Entèlijans Atifisyèl pèmèt chak elèv aprann nan nivo pa l : li ka re-eksplike yon leson yon lòt fason si w pa t konprann, prepare ti tès pou w pratike, epi tradui gwo dokiman teknik an Kreyòl Ayisyen fasil.
                    
                    2. Gwo danje ak move fason pou itilize l :
                    - Kite IA panse nan plas ou : Si w kite l ekri tout devwa ak kòd pou ou san w pa konprann, ou pap janm vin gen konpetans nan tèt ou ;
                    - Erè ak manti IA ka fè (hallucinations) : Zouti sa yo ka di bagay ki pa vre ak anpil asirans, kidonk fòk ou toujou verifye ;
                    - Kopye san travay (plagiat) : Pran sa IA ekri pou di se ou ki fè l se yon zak malonèt ki pa ede w grandi.
                    
                    3. Règ an lò : Toujou reflechi ak pwòp tèt ou :
                    IA se yon zouti pou ede w chèche epi konprann pi vit, men li pa dwe janm ranplase pwòp lespri ak bon konprann pa w.
                """.trimIndent(),
                plannedStartPage = 365,
                plannedEndPage = 368,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 83 : La jeunesse haïtienne et le numérique ====================
            BookChapter(
                id = "ch_6_83",
                chapterNumber = 83,
                partId = "part_6",
                titleFr = "Chapitre 83 — La jeunesse haïtienne et le numérique",
                titleHt = "Chapit 83 — Jèn Ayisyen yo ak zouti nimerik",
                subtitleFr = "Courage, talent, créativité et foi inébranlable dans le travail acharné",
                subtitleHt = "Kouraj, talan, lespri kreyatif ak bonjan konviksyon nan travay di",
                summaryFr = "Hommage et appel vibrant à la jeunesse haïtienne pour embrasser les métiers du savoir et de la technologie.",
                summaryHt = "Yon bèl mesaj ankourajman pou tout jèn Ayisyen pou yo kwè nan tèt yo epi travay di pou fè peyi a vanse.",
                contentFr = """
                    1. Un potentiel exceptionnel forgé dans l'adversité :
                    La jeunesse haïtienne possède une énergie, une ingéniosité et une créativité hors du commun. Face aux épreuves quotidiennes les plus sévères, nos jeunes font preuve d'une soif d'apprendre et d'une détermination sans faille.
                    
                    2. Le message fondateur d'AJ-TECH :
                    « Nous sommes forts, nous avons beaucoup de capacités. Continuons de lutter pour arriver au sommet. Rien n'est facile sans le travail. Merci aux jeunes Haïtiens. »
                    Ce principe n'est pas un slogan publicitaire, mais le rappel constant que le destin technologique d'une nation repose sur la discipline, l'effort silencieux et le refus de la résignation.
                    
                    3. Transformer la frustration en force bâtisseuse :
                    Plutôt que de céder au découragement face aux difficultés ambiantes, la jeunesse est appelée à s'emparer des claviers, des lignes de code et des outils numériques pour devenir les architectes de la reconstruction nationale.
                """.trimIndent(),
                contentHt = """
                    1. Yon gwo fòs ki grandi nan mitan difikilte :
                    Jèn Ayisyen yo gen anpil enèji, anpil entèlijans ak anpil kreyativite nan men yo. Menm lè lavi a difisil chak jou, jèn nou yo toujou vle aprann epi yo pa janm pè goumen pou lavi miyò.
                    
                    2. Mesaj debaz AJ-TECH pou tout jèn :
                    « Nou fò, nou gen anpil kapasite. Ann kontinye goumen pou nou rive nan somè a. Anyen pa fasil san travay. Mèsi ak jèn Ayisyen yo. »
                    Pawòl sa a se pa pawòl piblisite, se yon rapèl pou tout moun konnen lavni peyi a chita sou disiplin, sou travay di chak jou san fè bri epi sou refize bese bra.
                    
                    3. Transfòme difikilte an fòs pou bati :
                    Olye nou dekouraje devan sitiyasyon an, tout jèn yo dwe pran klavye yo, ekri bon kòd epi sèvi ak teknoloji pou bati yon nouvo peyi kote tout moun ka viv byen.
                """.trimIndent(),
                plannedStartPage = 369,
                plannedEndPage = 372,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 84 : La diaspora et le transfert de compétences ====================
            BookChapter(
                id = "ch_6_84",
                chapterNumber = 84,
                partId = "part_6",
                titleFr = "Chapitre 84 — La diaspora et le transfert de compétences",
                titleHt = "Chapit 84 — Dyaspora a ak pataje konesans (Transfert de compétences)",
                subtitleFr = "Mentorat à distance, revues de projets, ponts académiques et réseaux internationaux",
                subtitleHt = "Gide jèn yo a distans, verifye pwojè, bati pon ak inivèsite ak gwo rezo nan mond lan",
                summaryFr = "Mécanismes de collaboration entre experts haïtiens de l'étranger et étudiants locaux pour élever le niveau d'ingénierie.",
                summaryHt = "Fason ayisyen k ap travay nan gwo konpayi deyò ka ede jèn nan peyi a aprann pi byen epi fè bon kòd.",
                contentFr = """
                    1. La diaspora comme vivier mondial de compétences :
                    Des milliers d'ingénieurs, universitaires et professionnels haïtiens occupent des postes stratégiques dans les pôles technologiques aux États-Unis, au Canada, en France et dans la Caraïbe.
                    
                    2. Formes concrètes de transmission de savoirs envisagées :
                    - Séances de mentorat technique régulières en visioconférence pour accompagner les débutants ;
                    - Revues de code (Code Reviews) sur les projets open source pour transmettre les bonnes pratiques de production ;
                    - Animation d'ateliers thématiques spécialisés (sécurité, cloud, architectures réactives) ;
                    - Connexion des talents locaux avec des opportunités professionnelles internationales.
                    
                    3. Transparence sur les partenariats :
                    Ces initiatives constituent des objectifs de développement communautaire et d'alliances futures. Aucun accord formel ou programme institutionnel permanent n'est actuellement déployé.
                """.trimIndent(),
                contentHt = """
                    1. Dyaspora a chaje ak gwo espesyalis :
                    Gen plizyè milye enjenyè, pwofesè inivèsite ak ekspè ayisyen k ap travay nan pi gwo konpayi teknoloji nan peyi Etazini, Kanada, Lafrans ak nan Karayib la.
                    
                    2. Fason yo ka ede jèn yo pi devan :
                    - Fè ti sesyon konsèy sou entènèt pou gide jèn k ap kòmanse yo ;
                    - Gade epi verifye kòd jèn yo ekri pou moutre yo jan gwo konpayi travay ;
                    - Fè bèl atelye espesyal sou sekirite, cloud ak gwo sistèm lojisyèl ;
                    - Ede bon jèn ki konn travay jwenn bon opòtinite travay sou entènèt.
                    
                    3. Verite sou patenarya sa yo :
                    Plan sa yo se relasyon ak kolaborasyon n ap chache bati ti pa ti pa. Nou pa gen okenn gwo pwogram ofisyèl ki deja siyen jodi a (Sa se : Pou defini / An kou konsepsyon).
                """.trimIndent(),
                plannedStartPage = 373,
                plannedEndPage = 376,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 85 : Former les créateurs de demain ====================
            BookChapter(
                id = "ch_6_85",
                chapterNumber = 85,
                partId = "part_6",
                titleFr = "Chapitre 85 — Former les créateurs de demain",
                titleHt = "Chapit 85 — Fòme moun ki pral kreye demen",
                subtitleFr = "De la consommation d'applications à la conception de systèmes souverains",
                subtitleHt = "Soti nan moun k ap sèlman itilize lojisyèl lòt moun rive nan bati pwòp sistèm pa nou",
                summaryFr = "Transition éducative vers la formation de concepteurs, d'architectes et d'inventeurs capables de bâtir l'autonomie nationale.",
                summaryHt = "Fason pou chanje edikasyon pou n pa sèlman fòme moun k ap klike sou telefòn, men fòme moun ki konn bati teknoloji.",
                contentFr = """
                    1. Dépasser la simple alphabétisation numérique :
                    Savoir utiliser un traitement de texte ou naviguer sur les réseaux sociaux ne constitue pas une compétence d'ingénierie. L'ambition éducative d'AJ-TECH est de former des créateurs de systèmes et non de simples utilisateurs finaux.
                    
                    2. Les compétences clés du bâtisseur logiciel :
                    - Compréhension intime des structures de données et des algorithmes fondamentaux ;
                    - Maîtrise des protocoles de communication réseau et des architectures distribuées ;
                    - Sensibilité au design centré sur l'utilisateur (UI/UX) et à l'accessibilité universelle ;
                    - Culture de la sécurité dès la conception (Security by Design).
                    
                    3. Bâtir pour durer et servir la société :
                    Former des créateurs implique de leur inculquer le sens de la responsabilité sociale : concevoir des logiciels utiles, éthiques et pérennes au service du bien commun.
                """.trimIndent(),
                contentHt = """
                    1. Depase senp nivo itilize telefòn :
                    Konnen kijan pou tape yon lèt oswa gade videyo sou rezo sosyal se pa sa ki fè w enjenyè. Objektif nou se fòme jèn ki konn bati pwòp sistèm pa yo, pa sèlman moun k ap sèvi ak sa lòt nasyon fè.
                    
                    2. Sa yon bon moun k ap bati dwe konnen :
                    - Byen konprann kijan òdinatè klase epi trete done yo ;
                    - Konnen kijan rezo ak entènèt kominike ant aparèy yo ;
                    - Konn desine bèl ekran ki fasil pou tout moun itilize san traka ;
                    - Pwoteje kòd la depi premye jou pou pèsonn pa ka pirate l.
                    
                    3. Bati pou sèvi pèp la tout bon :
                    Fòme jèn yo pou yo gen konsyans : kreye lojisyèl ki itil peyi a, ki respekte prensip moral epi ki la pou ede tout moun viv pi byen.
                """.trimIndent(),
                plannedStartPage = 377,
                plannedEndPage = 380,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 86 : Inclusion numérique et égalité des chances ====================
            BookChapter(
                id = "ch_6_86",
                chapterNumber = 86,
                partId = "part_6",
                titleFr = "Chapitre 86 — Inclusion numérique et égalité des chances",
                titleHt = "Chapit 86 — Tout moun jwenn chans (Enklizyon nimerik)",
                subtitleFr = "Égalité femmes-hommes, inclusion des provinces et accessibilité pour les personnes en situation de handicap",
                subtitleHt = "Chans pou medam yo, opòtinite pou moun nan pwovens ak zouti pou moun ki gen andikap",
                summaryFr = "Principes d'équité territoriale, de parité et d'accessibilité universelle dans l'accès aux compétences technologiques.",
                summaryHt = "Prensip pou pèmèt tout moun, fanm kou gason, moun lavil kou moun andeyò ak moun ki enfim jwenn menm chans nan teknoloji.",
                contentFr = """
                    1. La technologie comme vecteur d'égalité ou de creusement des inégalités :
                    Si elle n'est pas guidée par des principes d'équité stricts, la révolution numérique risque d'accentuer les disparités existantes entre la capitale et les départements ruraux, ou entre les genres.
                    
                    2. L'accès des femmes aux carrières technologiques :
                    L'écosystème promeut activement la participation des femmes dans le développement logiciel, la recherche et l'entrepreneuriat à travers des modèles inspirants et des environnements d'apprentissage bienveillants et sécurisés.
                    
                    3. Décentralisation territoriale :
                    Le génie et le talent ne s'arrêtent pas aux frontières de Port-au-Prince. Les outils d'AJ-TECH sont conçus pour être utilisables et déployables avec la même efficacité à Fort-Liberté, Jérémie, Hinche ou Port-de-Paix.
                    
                    4. Accessibilité pour les personnes en situation de handicap :
                    Intégration systématique des standards d'accessibilité (lecteurs d'écran TalkBack, contrastes renforcés, cibles tactiles larges) dans toutes les interfaces éducatives.
                """.trimIndent(),
                contentHt = """
                    1. Teknoloji dwe bay tout moun chans :
                    Si nou pa veye byen, teknoloji a ka fè moun ki deja gen mwayen vin pi rich epi kite lòt moun dèyè. Nou dwe asire tout moun jwenn menm opòtinite.
                    
                    2. Ankouraje medam yo nan metye teknoloji :
                    Nou vle wè anpil tifi ak medam k ap ekri kòd, k ap dirije pwojè epi k ap kreye bèl konpayi teknoloji nan peyi a.
                    
                    3. Bay tout pwovens yo menm valè :
                    Talan ak entèlijans pa rete nan Pòtoprens sèlman. Zouti AJ-TECH yo fèt pou nenpòt jèn nan Fòlibète, Jeremi, Ench oswa Pòdpè ka itilize yo menm jan san difikilte.
                    
                    4. Fasilite pou moun ki gen andikap :
                    Tout zouti edikasyon nou yo dwe respekte règleman pou moun ki pa wè byen oswa ki enfim ka itilize yo gras ak zouti ki li tèks yo pou yo.
                """.trimIndent(),
                plannedStartPage = 381,
                plannedEndPage = 384,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 87 : Langues, culture et technologie ====================
            BookChapter(
                id = "ch_6_87",
                chapterNumber = 87,
                partId = "part_6",
                titleFr = "Chapitre 87 — Langues, culture et technologie",
                titleHt = "Chapit 87 — Lang, kilti ak teknoloji",
                subtitleFr = "Kreyòl Ayisyen, Français, Anglais : le trilinguisme stratégique dans l'apprentissage technologique",
                subtitleHt = "Kreyòl Ayisyen, Fransè, Angle : twa lang pou louvri tout pòt nan teknoloji",
                summaryFr = "Analyse du rôle des langues dans la transmission du savoir technique et plaidoyer pour un Kreyòl technologique rigoureux.",
                summaryHt = "Analiz sou wòl lang yo nan aprann enfòmatik ak jan lang Kreyòl Ayisyen an dwe sèvi kòm bon zouti konesans.",
                contentFr = """
                    1. Le Kreyòl Ayisyen comme langue de transmission universelle :
                    Le Kreyòl Ayisyen est la langue partagée par 100 % de la population nationale. Une technologie qui exclut le créole exclut de facto la majorité des citoyens. AJ-TECH intègre le créole comme langue première dans toutes ses entités, ses interfaces et sa documentation.
                    
                    2. Le Français comme langue institutionnelle et juridique :
                    Le Français demeure un pont précieux vers le monde francophone international, la recherche universitaire et les échanges institutionnels officiels.
                    
                    3. L'Anglais comme langue globale de l'ingénierie :
                    L'Anglais est la lingua franca mondiale de l'informatique : toute la documentation officielle, les spécifications de compilateurs et les bibliothèques open source sont rédigées en anglais. La maîtrise de l'anglais technique est donc indispensable pour l'autonomie des développeurs.
                    
                    4. Le trilinguisme pragmatique :
                    Comprendre le concept en Kreyòl pour une clarté mentale absolue, l'articuler en Français pour les échanges régionaux, et le coder en Anglais pour les standards industriels mondiaux.
                """.trimIndent(),
                contentHt = """
                    1. Kreyòl Ayisyen se lang tout moun nan peyi a :
                    Kreyòl Ayisyen se sèl lang tout 100 % popilasyon an pale ak konprann. Nenpòt teknoloji ki pa pale kreyòl ap mete pifò pèp la deyò. Se poutèt sa AJ-TECH mete Kreyòl Ayisyen an premye nan tout aplikasyon ak liv li yo.
                    
                    2. Fransè pou lwa ak relasyon ofisyèl :
                    Lang fransè a enpòtan pou nou pale ak lòt peyi frankofòn, pou dokiman legal ak inivèsite.
                    
                    3. Angle kòm lang entènasyonal enfòmatik :
                    Lang angle se lang tout devlopè sou latè itilize : tout dokiman lojisyèl ak zouti kòd ekri an angle. Yon bon devlopè dwe konn li angle teknik pou l pa bloke.
                    
                    4. Fòs nan pale 3 lang sa yo ansanm :
                    Konprann leson an byen klè nan lang Kreyòl manman nou, kapab eksplike l an Fransè, epi ekri kòd la an Angle pou l mache sou tout estanda entènasyonal yo.
                """.trimIndent(),
                plannedStartPage = 385,
                plannedEndPage = 387,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 88 : Créer une génération de développeurs haïtiens ====================
            BookChapter(
                id = "ch_6_88",
                chapterNumber = 88,
                partId = "part_6",
                titleFr = "Chapitre 88 — Créer une génération de développeurs haïtiens",
                titleHt = "Chapit 88 — Kreye yon gwo jenerasyon devlopè ayisyen",
                subtitleFr = "Parcours d'apprentissage progressif : du débutant absolu à l'architecte logiciel chevronné",
                subtitleHt = "Chemen aprann etap pa etap : soti nan moun ki fenk kòmanse rive nan gwo enjenyè",
                summaryFr = "Feuille de route pédagogique détaillée pour guider un apprenant depuis ses premières lignes de code jusqu'au niveau d'ingénieur confirmé.",
                summaryHt = "Gid detaye pou mennen yon elèv soti nan premye ti liy kòd li ekri rive nan nivo yon gwo espesyalis.",
                contentFr = """
                    1. Les 7 étapes du parcours de montée en compétences :
                    
                    - Étape 1 : Débutant & Pensée logique : Algorithmique fondamentale, variables, boucles, conditions et raisonnement déductif.
                    - Étape 2 : Fondamentaux du code : Maîtrise d'un premier langage structuré (Kotlin, Python ou JavaScript), typage strict et programmation orientée objet.
                    - Étape 3 : Pratique intensive & Git : Gestion de versions avec Git, écriture de tests unitaires et manipulation de structures de données.
                    - Étape 4 : Projets complets & Architecture : Conception d'applications de bout en bout avec séparation des couches (MVVM, Clean Architecture) et persistance locale.
                    - Étape 5 : Spécialisation technique : Approfondissement en développement mobile (Jetpack Compose), backend sécurisé, cloud distribué ou intelligence artificielle.
                    - Étape 6 : Professionnalisation : Travail collaboratif en équipe agile, revue de code par les pairs, intégration continue (CI/CD) et optimisation de performance.
                    - Étape 7 : Entrepreneuriat & Leadership : Création de ses propres produits logiciels, audit de sécurité et transmission des connaissances aux nouvelles promotions.
                """.trimIndent(),
                contentHt = """
                    1. 7 gwo etap pou vin yon bon devlopè :
                    
                    - Etap 1 : Moun ki fenk kòmanse ak lespri lojik : Aprann kijan pou bay òdinatè lòd, kalkil debaz ak kondisyon senp.
                    - Etap 2 : Premye langaj kòd : Byen metrize yon bon langaj solid (Kotlin, Python oswa JavaScript) ak kijan pou estriktire done yo.
                    - Etap 3 : Pratik ak Git : Aprann sere kòd sou Git, fè tès sou machin pou verifye si kòd la pa gen erè.
                    - Etap 4 : Bati gwo pwojè nèt : Kreye yon aplikasyon soti nan kòmansman rive nan bout li ak bon separasyon nan kòd la (MVVM).
                    - Etap 5 : Chwazi yon domèn espesyal : Vin ekspè nan aplikasyon mobil (Jetpack Compose), nan gwo sèvè sekirite oswa nan Entèlijans Atifisyèl.
                    - Etap 6 : Travay tankou yon pwofesyonèl : Travay an ekip, verifye kòd lòt moun, fè kòd la kouri rapid san ralanti telefòn.
                    - Etap 7 : Kreye biznis ak gide lòt moun : Bati pwòp lojisyèl pa w pou vann, verifye sekirite epi anseye lòt jèn k ap monte yo.
                """.trimIndent(),
                plannedStartPage = 388,
                plannedEndPage = 390,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 89 : Éducation, innovation et entrepreneuriat ====================
            BookChapter(
                id = "ch_6_89",
                chapterNumber = 89,
                partId = "part_6",
                titleFr = "Chapitre 89 — Éducation, innovation et entrepreneuriat",
                titleHt = "Chapit 89 — Edikasyon, inovasyon ak antreprenarya",
                subtitleFr = "Transformer les compétences acquises en solutions concrètes, startups et emplois durables",
                subtitleHt = "Transfòme sa w aprann an bon zouti itil, kreye konpayi ak bon travay dirab",
                summaryFr = "Passerelle entre la formation technique et l'action économique : comment l'éducation nourrit l'écosystème d'innovation.",
                summaryHt = "Fason sa jèn yo aprann nan lekòl dwe sèvi pou kreye nouvo biznis ak sèvis ki itil sosyete a.",
                contentFr = """
                    1. Le savoir comme matière première économique :
                    L'éducation n'est pas une fin en soi : sa valeur suprême réside dans sa capacité à être transformée en action concrète, en innovations utiles et en valeur économique pour le pays.
                    
                    2. Les débouchés de la formation numérique :
                    - Création de logiciels utiles répondant aux besoins locaux (santé, gestion foncière, éducation) ;
                    - Travail indépendant (freelancing) exportant des services à haute valeur ajoutée sans fuite des cerveaux ;
                    - Lancement de startups technologiques viables fondées sur le modèle du bootstrapping ;
                    - Modernisation des PME et des institutions publiques grâce à l'intégration de solutions sur mesure.
                    
                    3. Le cercle vertueux du savoir :
                    Chaque développeur formé qui réussit à fonder une entreprise ou à trouver un emploi de haut niveau devient un mentor, un employeur et un modèle pour les générations suivantes.
                """.trimIndent(),
                contentHt = """
                    1. Konesans se pi gwo materyo pou kreye richès :
                    Aprann pa sifi poukont li : pi gwo valè konesans se lè w transfòme sa w konnen an zouti pratik ki rezoud pwoblèm tout bon nan peyi a.
                    
                    2. Sa jèn ki byen fòme yo ka fè :
                    - Kreye bon lojisyèl pou ede lopital, lekòl ak jere tè nan peyi a ;
                    - Travay sou entènèt pou konpayi etranje pou fè bèl lajan rantre nan peyi a ;
                    - Kreye pwòp ti konpayi pa yo san fè dèt ;
                    - Ede ti biznis ak biwo leta modènize fason y ap travay.
                    
                    3. Yon chenn konesans k ap grandi toutan :
                    Chak jèn ki reyisi nan teknoloji vin tounen yon modèl ak yon gid pou anseye epi bay lòt jèn k ap monte yo travay.
                """.trimIndent(),
                plannedStartPage = 391,
                plannedEndPage = 393,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 90 : La stratégie éducative 2026–2035 ====================
            BookChapter(
                id = "ch_6_90",
                chapterNumber = 90,
                partId = "part_6",
                titleFr = "Chapitre 90 — La stratégie éducative 2026–2035",
                titleHt = "Chapit 90 — Plan estrateji edikasyon 2026–2035",
                subtitleFr = "Jalons décennaux : structuration des cours, prototypage d'EDUKA, montée en puissance et rayonnement",
                subtitleHt = "Gwo etap sou 10 lane : prepare leson, teste EDUKA, elaji lekòl yo epi fè non Ayiti briye",
                summaryFr = "Feuille de route décennale pour la construction progressive de l'infrastructure éducative et humaine d'AJ-TECH.",
                summaryHt = "Plan travay sou 10 lane pou devlope zouti edikasyon ak fòmasyon jèn yo etap pa etap.",
                contentFr = """
                    1. Nature prospective des jalons :
                    Les étapes ci-dessous constituent des objectifs d'ingénierie et de développement pédagogique non contractuels.
                    
                    2. Les quatre phases du plan éducatif 2026–2035 :
                    
                    - Phase 1 (2026–2027) — Fondations & Contenus de référence :
                      - Rédaction et structuration des modules de base en Kreyòl Ayisyen et Français ;
                      - Prototypage de l'application éducative EDUKA en mode hors-ligne ;
                      - Formalisation des référentiels de compétences pour EDH.
                    
                    - Phase 2 (2028–2030) — Développement des outils & Tests pilotes :
                      - Expérimentation pilote d'EDUKA auprès de groupes d'apprenants volontaires ;
                      - Premiers ateliers techniques communautaires sous l'égide d'AJ-Dev ;
                      - Établissement des premiers contacts avec des enseignants de la diaspora.
                    
                    - Phase 3 (2031–2033) — Expansion & Partenariats potentiels :
                      - Déploiement élargi d'EDUKA dans des centres communautaires et bibliothèques ;
                      - Structuration des premiers cursus spécialisés d'EDH ;
                      - Intégration de modules d'intelligence artificielle pédagogique personnalisée.
                    
                    - Phase 4 (2034–2035) — Rayonnement & Autonomie nationale :
                      - Consolidation d'un réseau de milliers de développeurs et créateurs formés ;
                      - Reconnaissance régionale de l'excellence de la formation technologique haïtienne ;
                      - Contribution majeure à la souveraineté intellectuelle et industrielle d'Haïti.
                    
                    3. Conclusion de la Partie VI :
                    La véritable richesse d'une nation ne gît ni dans ses sous-sols ni dans ses discours, mais dans la vigueur intellectuelle, le savoir-faire technique et la dignité de sa jeunesse laborieuse.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan edikasyon sa a vle di :
                    Dat ak etap sa yo se yon gid travay ak yon vizyon estratejik, se pa yon pwomès ki fèt deja.
                    
                    2. Kat gwo faz nan plan edikasyon 2026–2035 lan :
                    
                    - Faz 1 (2026–2027) — Bati baz yo ak prepare leson :
                      - Ekri epi byen estriktire premye leson yo an Kreyòl Ayisyen ak an Fransè ;
                      - Bati premye vèsyon tès EDUKA ki mache san entènèt ;
                      - Prepare tout sa lekòl EDH la pral anseye.
                    
                    - Faz 2 (2028–2030) — Bati zouti ak fè premye tès :
                      - Fè tès sou EDUKA ak elèv k ap ede nou verifye kijan l ap mache ;
                      - Fè premye ti atelye pratik pou aprann ekri kòd ak AJ-Dev ;
                      - Kòmanse pale ak pwofesè nan dyaspora a pou yo pote konesans yo.
                    
                    - Faz 3 (2031–2033) — Elaji epi jwenn patenarya :
                      - Mete EDUKA nan plis bibliyotèk ak sant jèn nan tout peyi a ;
                      - Kòmanse premye gwo klas espesyal pou lekòl EDH ;
                      - Mete zouti Entèlijans Atifisyèl pou ede chak elèv aprann nan nivo pa l.
                    
                    - Faz 4 (2034–2035) — Fòme gwo espesyalis epi fè peyi a briye :
                      - Genyen plizyè milye bon devlopè ak enjenyè ki byen fòme nan peyi a ;
                      - Tout lòt peyi nan Karayib la rekonèt bon jan kalite jèn ayisyen nan teknoloji ;
                      - Ede Ayiti vin yon peyi ki mèt tèt li nan zafè syans ak lojisyèl.
                    
                    3. Konklizyon Pati VI la :
                    Pi gwo richès yon peyi se pa sa ki anba tè a oswa gwo bèl diskou, men se nan entèlijans, nan konpetans ak nan kouraj tout jèn k ap travay di pou peyi yo.
                """.trimIndent(),
                plannedStartPage = 394,
                plannedEndPage = 395,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
