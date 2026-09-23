package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE VI — ÉDUCATION, COMPÉTENCES ET CAPITAL HUMAIN
 * Chapitres 77 à 91 (Exactement 15 chapitres d'analyse éducative, formation technique, autodidaxie et stratégie 2026–2035).
 */
object Part6Data {

    val part6: BookPart = BookPart(
        id = "part_6",
        partNumber = 6,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE VI — Éducation, compétences et capital humain",
        titleHt = "PATI VI — Edikasyon, Konpetans ak Kapital Imèn",
        subtitleFr = "Formation d'une génération de bâtisseurs, autodidaxie, intelligence artificielle et stratégie 2026–2035",
        subtitleHt = "Fòmasyon yon jenerasyon moun k ap bati, aprantisaj poukont ou, entèlijans atifisyèl ak estrateji 2026–2035",
        plannedPages = "pp. 115–134",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 77 : L'éducation comme fondation du développement numérique ====================
            BookChapter(
                id = "ch_6_77",
                chapterNumber = 77,
                partId = "part_6",
                titleFr = "Chapitre 77 — L'éducation comme fondation du développement numérique",
                titleHt = "Chapit 77 — Edikasyon kòm fondasyon devlopman nimerik",
                subtitleFr = "Souveraineté cognitive, transformation des cursus et démocratisation du savoir",
                subtitleHt = "Endepandans nan lespri, transfòmasyon pwogram lekòl ak pataje konesans pou tout moun",
                summaryFr = "Analyse du rôle fondamental de l'éducation dans l'émancipation technologique d'Haïti et les conditions requises pour une alphabétisation numérique universelle.",
                summaryHt = "Analiz sou wòl fondamantal edikasyon jwe nan libète teknolojik Ayiti ak sa ki nesesè pou tout moun konn sèvi ak zouti nimerik.",
                contentFr = """
                    1. L'impératif de la souveraineté cognitive :
                    Aucune nation ne peut bâtir une indépendance économique ou technologique durable sans maîtriser préalablement les savoirs qui la sous-tendent. En Haïti, l'éducation numérique ne doit pas être perçue comme un luxe pédagogique ou une discipline accessoire, mais comme la pierre angulaire de la reconstruction nationale.

                    2. Diagnostic du système éducatif contemporain :
                    Le paysage scolaire haïtien souffre de fractures profondes :
                    - Disparités territoriales aiguës entre la zone métropolitaine de Port-au-Prince et les départements provinciaux ;
                    - Rareté des infrastructures de base (électricité fiable, salles informatiques, connectivité Internet) ;
                    - Pénurie d'enseignants formés aux méthodes pédagogiques modernes et à l'informatique appliquée ;
                    - Prédominance de méthodes d'apprentissage passives fondées sur la mémorisation mécanique plutôt que sur la résolution active de problèmes.

                    3. Les quatre piliers d'une éducation numérique émancipatrice :
                    Pour opérer une rupture féconde, l'enseignement technologique doit reposer sur :
                    - La pensée algorithmique dès le cycle fondamental : apprendre à décomposer un problème complexe en sous-ensembles logiques simples ;
                    - L'expérimentation pratique continue : privilégier la manipulation, le codage réel et la construction d'artefacts fonctionnels ;
                    - La bilinguisation intégrale des supports : enseigner en Kreyòl Ayisyen pour l'assimilation conceptuelle profonde et en Français/Anglais pour l'ouverture internationale ;
                    - L'adaptation aux contraintes réelles : concevoir des curricula fonctionnant hors-ligne et sur des terminaux à faibles ressources.

                    4. L'engagement d'AJ-TECH :
                    AJ-TECH place le capital humain au sommet de ses priorités. Tous les logiciels de l'écosystème sont pensés pour être des vecteurs d'apprentissage, dotés d'interfaces pédagogiques et de documentations exhaustives ouvertes à la jeunesse.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa edikasyon se premye kondisyon pou nou lib :
                    Okenn peyi pa ka gen libète ekonomik oswa teknolojik si pèp li a pa metrize konesans ki kreye teknoloji a. Ann Ayiti, edikasyon nimerik se pa yon senp ti opsyon nan lekòl, se fondasyon sou kote tout rekonstriksyon nasyonal la dwe chita.

                    2. Gwo difikilte lekòl yo genyen jodi a :
                    Sistèm lekòl nou an ap fè fas ak gwo pwoblèm :
                    - Gwo diferans ant lavil Pòtoprens ak tout lòt vil pwovens yo ;
                    - Mank kouran, mank sal enfòmatik ak mank koneksyon entènèt nan lekòl yo ;
                    - Pa gen ase pwofesè ki byen fòme nan zafè lojisyèl ak nouvo metòd ansèyman ;
                    - Twòp aprann leson pa kè san elèv yo pa konprann ni pratike kijan pou rezoud pwoblèm lavi a.

                    3. 4 poto mitan pou bonjan edikasyon teknolojik :
                    Pou nou chanje sa tout bon vre, fòmasyon an dwe genyen :
                    - Lespri lojik depi nan ti klas : aprann separe yon gwo pwoblèm an ti moso senp ;
                    - Fè pratik toutbon : kite elèv yo manyen òdinatè, ekri kòd epi bati zouti k ap mache ;
                    - Sèvi ak lang Kreyòl Ayisyen an : pou tout timoun konprann prensip yo byen nan lespri yo, san bliye Fransè ak Angle pou ouvri pòt sou mond lan ;
                    - Zouti ki mache san kouran ni entènèt tout tan : adapte tout leson pou ti aparèy senp.

                    4. Angajman AJ-TECH pou jèn yo :
                    Pou AJ-TECH, fòme moun se pi gwo richès. Tout lojisyèl nan ekosistèm nan fèt pou aprann moun, ak bèl gid ki byen eksplike pou tout jèn Ayisyen ka aprann bati.
                """.trimIndent(),
                plannedStartPage = 115,
                plannedEndPage = 116,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 78 : L'autodidaxie et l'apprentissage continu ====================
            BookChapter(
                id = "ch_6_78",
                chapterNumber = 78,
                partId = "part_6",
                titleFr = "Chapitre 78 — L'autodidaxie et l'apprentissage continu",
                titleHt = "Chapit 78 — Aprantisaj poukont ou ak fòmasyon kontinyèl",
                subtitleFr = "Discipline personnelle, lecture de documentation et culture de la recherche autonome",
                subtitleHt = "Disiplin pèsonèl, li dokiman ofisyèl ak fason pou chèche konesans poukont ou",
                summaryFr = "Méthodologie rigoureuse de l'apprentissage en autodidacte en informatique : forger ses compétences par l'erreur, la documentation officielle et la pratique constante.",
                summaryHt = "Bonjan metòd pou moun k ap aprann teknoloji poukont yo : aprann nan erè, li dokiman teknik epi pratike chak jou.",
                contentFr = """
                    1. L'autodidaxie comme moteur d'excellence :
                    Dans l'industrie technologique mondiale, une part prépondérante des meilleures avancées provient de passionnés ayant développé leurs compétences par auto-formation. En Haïti, où l'accès aux instituts spécialisés est restreint par des barrières financières et géographiques, l'autodidaxie est une force d'émancipation majeure.

                    2. Les trois piliers de la méthode autodidacte rigoureuse :
                    - L'art de lire la documentation officielle : Refuser la dépendance aux résumés superficiels et acquérir le réflexe de consulter directement les spécifications de compilateurs, les RFC et les documentations de référence (Kotlin, Android, Web APIs) ;
                    - La valorisation de l'erreur comme instrument d'apprentissage : Analyser les messages du compilateur (Stack Traces) non comme des échecs, mais comme des indications précises sur l'état de la mémoire ou de la logique ;
                    - Le développement par petits incréments reproductibles : Écrire du code pas à pas, tester chaque fonction isolément et vérifier les hypothèses avant d'ajouter de la complexité.

                    3. L'apprentissage continu face à l'obsolescence technologique :
                    L'informatique évolue à un rythme exponentiel. Un langage ou un framework appris aujourd'hui sera profondément transformé dans cinq ans. L'autodidacte n'apprend pas simplement une technologie donnée : il apprend à apprendre.

                    4. Témoignage de la démarche AJ-TECH :
                    La genèse d'AJ-TECH elle-même repose sur des milliers d'heures d'étude autodidacte nocturne, de lecture patiente de standards ouverts et d'expérimentations menées dans des conditions matérielles spartiates.
                """.trimIndent(),
                contentHt = """
                    1. Aprann poukont ou se pi gwo fòs :
                    Nan tout mond teknoloji a, anpil nan pi bon devlopè yo se moun ki te aprann poukont yo grasa pasyon ak volonte. Ann Ayiti, kote li difisil pou tout moun jwenn gwo inivèsite, kapasite pou aprann poukont ou se pi gwo zam pou w avanse.

                    2. 3 gwo règ pou aprann poukont ou kòrèkteman :
                    - Li dokiman ofisyèl yo : Pa sèlman gade ti bout videyo kout sou YouTube, men pran abitid li liv ak dokiman orijinal kote tout règ lojisyèl yo ekri aklè ;
                    - Aprann nan erè ou fè : Lè òdinatè a voye yon erè (Stack Trace), se pa yon echèk, se yon mesaj klè k ap di w ki kote nan memwa a oswa nan kalkil la ki gen yon pwoblèm ;
                    - Avanse ti pa ti pa : Ekri kòd la moso pa moso, teste chak ti fonksyon pou asire w li mache anvan w mete plis bagay.

                    3. Fòmasyon kontinyèl paske teknoloji a toujou ap chanje :
                    Enfòmatik ap mache ak yon vitès san parèy. Sa w aprann jodi a ap chanje nan 5 ane k ap vini yo. Yon bon devlopè pa sèlman aprann yon sèl zouti : li aprann kijan pou l toujou aprann nouvo bagay fasil.

                    4. Eksperyans fondasyon AJ-TECH :
                    Tout ekosistèm AJ-TECH la fèt grasa plizyè milye èdtan etid poukont nou lannwit, lekti dokiman teknik ak tès kòd nan mitan tout kalite difikilte kouran ak mwayen.
                """.trimIndent(),
                plannedStartPage = 116,
                plannedEndPage = 117,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 79 : Former une nouvelle génération de développeurs haïtiens ====================
            BookChapter(
                id = "ch_6_79",
                chapterNumber = 79,
                partId = "part_6",
                titleFr = "Chapitre 79 — Former une nouvelle génération de développeurs haïtiens",
                titleHt = "Chapit 79 — Fòme yon nouvo jenerasyon devlopè ayisyen",
                subtitleFr = "Du consommateur passif au concepteur de systèmes souverains",
                subtitleHt = "Soti nan moun k ap sèlman itilize lojisyèl rive nan moun k ap bati pwòp sistèm pa yo",
                summaryFr = "Stratégie de formation intensive pour transformer la jeunesse haïtienne en créateurs de logiciels de classe mondiale, maîtrisant les architectures modernes.",
                summaryHt = "Estrateji fòmasyon solid pou ede jèn Ayisyen yo vin gwo enjenyè lojisyèl ki konn bati gwo sistèm modèn pou peyi a ak lemonn.",
                contentFr = """
                    1. Le passage de l'usage passif à la création active :
                    La jeunesse haïtienne consomme massivement les réseaux sociaux et les applications mobiles étrangères. L'enjeu historique est d'inverser cette polarité : transformer cette énergie consommatrice en capacité productive d'ingénierie logicielle.

                    2. Les compétences fondamentales du développeur moderne :
                    Pour rivaliser avec les standards internationaux, un développeur doit maîtriser :
                    - La rigueur algorithmique et la complexité temporelle/spatiale (notations Big O) ;
                    - La programmation fortement typée et orientée objet/fonctionnelle (Kotlin, TypeScript, Rust) ;
                    - L'architecture logicielle propre (Clean Architecture, MVVM, flux unidirectionnels MVI) ;
                    - La persistance locale sécurisée et la synchronisation distribuée (SQLite/Room, IndexedDB) ;
                    - Les pratiques de test automatisé (tests unitaires, Robolectric, intégration continue).

                    3. L'exigence de la qualité logicielle :
                    Un code ne doit pas seulement 'fonctionner' : il doit être lisible, maintenable, testé, documenté et sobre en consommation d'énergie et de bande passante. C'est cette exigence qui fait la différence entre un bricolage éphémère et un produit industriel pérenne.

                    4. Le rôle catalyseur d'AJ-TECH :
                    À travers ses référentiels ouverts et ses composants modulaires, AJ-TECH propose un cadre pratique d'apprentissage permettant aux étudiants d'étudier du code réel de production.
                """.trimIndent(),
                contentHt = """
                    1. Soti nan klike sou telefòn rive nan kreye pwòp zouti pa nou :
                    Jèn Ayisyen yo pase anpil tan ap sèvi ak rezo sosyal ak aplikasyon lòt nasyon fè. Pi gwo defi jodi a se chanje sa : fè jèn nou yo vin moun ki konn kode, ki konn kreye epi ki konn bati lojisyèl.

                    2. Sa yon bon devlopè modèn dwe metrize :
                    Pou nivo nou ka egal ak tout lòt peyi sou latè, yon devlopè dwe konnen :
                    - Lojik kalkil solid ak jan pou fè kòd la kouri rapid san gaspiye memwa ;
                    - Langaj kòd ki pwoteje kont erè (Kotlin, TypeScript, Rust) ;
                    - Bonjan estrikti lojisyèl (Clean Architecture, MVVM) kote chak pati nan kòd la fè yon sèl travay klè ;
                    - Jan pou sere done sou aparèy la an sekirite (Room, SQLite, IndexedDB) ;
                    - Fè tès sou machin pou verifye si kòd la pa gen fay anvan li rive nan men itilizatè yo.

                    3. Egzijans pou kòd la gen bon kalite :
                    Yon lojisyèl pa dwe sèlman mache : li dwe byen ekri, fasil pou lòt moun li, gen bon tès, epi li pa dwe manje twòp batri ni twòp megabay. Se sa k fè diferans ant yon ti travay k ap kraze demen ak yon gwo lojisyèl k ap dire 20 ane.

                    4. Wòl AJ-TECH pou ede jèn yo :
                    Gras ak dokiman ak kòd sous ouvè li yo, AJ-TECH bay tout jèn etidyan yon bonjan modèl pou yo wè kijan vrè lojisyèl pwofesyonèl fèt.
                """.trimIndent(),
                plannedStartPage = 117,
                plannedEndPage = 118,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 80 : Les compétences numériques essentielles ====================
            BookChapter(
                id = "ch_6_80",
                chapterNumber = 80,
                partId = "part_6",
                titleFr = "Chapitre 80 — Les compétences numériques essentielles",
                titleHt = "Chapit 80 — Konpetans nimerik ki esansyèl yo",
                subtitleFr = "Socle technique, pensée critique, culture des données et hygiène de sécurité",
                subtitleHt = "Konesans teknik de baz, lespri kritik, konprann done ak bon abitid sekirite",
                summaryFr = "Cartographie des compétences indispensables pour naviguer, travailler et créer efficacement dans l'économie numérique contemporaine.",
                summaryHt = "Lis tout konesans ak ladrès ki nesesè pou yon moun ka travay, pwoteje tèt li epi kreye nan mond teknoloji jodi a.",
                contentFr = """
                    1. La matrice des compétences du XXIe siècle :
                    La simple maîtrise d'une suite bureautique ne suffit plus. L'économie contemporaine exige une pyramide de compétences articulée en plusieurs strates complémentaires :
                    - Niveau 1 : Maîtrise des outils fondamentaux (systèmes d'exploitation, navigation avancée, gestion sécurisée des identifiants) ;
                    - Niveau 2 : Hygiène de sécurité numérique (reconnaissance des menaces de phishing, authentification multi-facteurs, chiffrement des échanges) ;
                    - Niveau 3 : Culture des données et esprit critique (capacité à évaluer la véracité d'une information, structuration de tableaux de données, compréhension des algorithmes de recommandation) ;
                    - Niveau 4 : Automatisation et logique informatique (scripts élémentaires, utilisation raisonnée des API, intégration d'outils d'intelligence artificielle).

                    2. Les compétences humaines transversales (Soft Skills) :
                    Le savoir technique n'a de valeur que s'il s'accompagne de compétences relationnelles indispensables :
                    - Communication technique claire et concise, à l'oral comme à l'écrit ;
                    - Travail collaboratif asynchrone au sein d'équipes distribuées ;
                    - Capacité d'adaptation face aux imprévus d'infrastructure ;
                    - Rigueur éthique et respect de la vie privée des utilisateurs.

                    3. Adapter les compétences au contexte haïtien :
                    En Haïti, la résilience opérationnelle (savoir travailler hors-ligne, optimiser les transferts de données, sauvegarder systématiquement son travail) constitue une méta-compétence vitale.
                """.trimIndent(),
                contentHt = """
                    1. Nivo konesans yon moun bezwen nan 21yèm syèk la :
                    Konnen tape yon lèt sou Word pa sifi ankò. Jodi a, yon sitwayen oswa yon travayè bezwen plizyè nivo konesans :
                    - Nivo 1 : Metrize zouti debaz yo (sistèm òdinatè, navige byen sou entènèt, jere modpas an sekirite) ;
                    - Nivo 2 : Bon abitid sekirite (rekonèt vye pyèj ak magouy sou entènèt, mete de nivo sekirite sou kont ou, pwoteje mesaj ou) ;
                    - Nivo 3 : Konprann done ak lespri kritik (konnen si yon nouvèl se manti, klase enfòmasyon nan bèl tablo, konprann kijan rezo sosyal yo fonksyone) ;
                    - Nivo 4 : Otomatizasyon (ekri ti kòd pou fè travay repetitif pi vit, konnen kijan aplikasyon pale youn ak lòt).

                    2. Bèl kalite nan fason w travay ak lòt moun (Soft Skills) :
                    Konesans teknik la pa itil anpil si w pa gen bon konpòtman :
                    - Kominike byen klè san pale anpil, ni nan bouch ni nan ekri ;
                    - Travay an ekip ak moun ki lwen sou entènèt ;
                    - Konn adapte w lè gen pann kouran oswa entènèt bloke ;
                    - Respekte prensip moral ak sekirite done moun k ap itilize zouti w yo.

                    3. Konpetans espesyal pou reyalite Ayiti a :
                    Ann Ayiti, konnen kijan pou travay san entènèt, kijan pou fè ti megabay ou pa fini vit, epi toujou sove travay ou sou plizyè aparèy, se yon gwo konpetans ki sove lavi pwofesyonèl ou.
                """.trimIndent(),
                plannedStartPage = 118,
                plannedEndPage = 120,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 81 : Apprendre à programmer avec des ressources limitées ====================
            BookChapter(
                id = "ch_6_81",
                chapterNumber = 81,
                partId = "part_6",
                titleFr = "Chapitre 81 — Apprendre à programmer avec des ressources limitées",
                titleHt = "Chapit 81 — Aprann pwograme ak ti resous",
                subtitleFr = "Optimisation matérielle, environnements locaux, énergie solaire et résilience",
                subtitleHt = "Sèvi byen ak ti materyèl, travay san entènèt, enèji solè ak kouraj pou pa abandone",
                summaryFr = "Guide pratique et méthodologique pour apprendre le développement logiciel dans des conditions de coupures de courant, de connexions lentes et de matériel modeste.",
                summaryHt = "Gid pratik sou fason pou aprann ekri kòd lè w pa gen gwo òdinatè, lè kouran koupe toutan epi lè kat entènèt la chè.",
                contentFr = """
                    1. La réalité matérielle de l'apprenant haïtien :
                    Contrairement aux étudiants des pays industrialisés qui disposent de connexions fibrées illimitées et de machines de dernière génération, l'étudiant haïtien doit composer avec des ordinateurs reconditionnés, une alimentation électrique intermittente et des forfaits de données mobiles coûteux.

                    2. Stratégies d'optimisation de l'environnement de développement :
                    - L'installation complète de documentation hors-ligne (outils type Zeal, DevDocs hors-ligne, man pages) ;
                    - L'utilisation d'éditeurs de code légers (VS Code optimisé, micro, vim, geany) sur les machines à mémoire vive restreinte (2 à 4 Go de RAM) ;
                    - La mise en cache agressive des dépendances et bibliothèques (Gradle offline mode, npm cache local, dépôts locaux partagés par clé USB) ;
                    - L'optimisation énergétique : régler la luminosité de l'écran, couper les processus d'arrière-plan inutiles et recharger ses batteries sur de petits panneaux solaires ou onduleurs.

                    3. La puissance de l'écriture sur papier et de la simulation mentale :
                    Quand l'énergie vient à manquer, l'apprentissage ne s'arrête pas : écrire des algorithmes sur un cahier, simuler l'état des variables à la main et concevoir l'architecture avant de toucher au clavier forge une discipline d'ingénierie d'une rigueur exceptionnelle.

                    4. L'ingénierie sous contrainte comme avantage compétitif :
                    Développer sous contrainte oblige à concevoir des logiciels sobres, rapides et résistants. Un développeur formé dans ces conditions est naturellement immunisé contre le gaspillage de ressources et conçoit des systèmes universellement performants.
                """.trimIndent(),
                contentHt = """
                    1. Reyalite yon jèn k ap aprann kode an Ayiti :
                    Pandan jèn lòt bò dlo gen gwo òdinatè tou nèf ak entènèt gwo vitès san limit, yon etidyan ayisyen souvan gen yon ti òdinatè dezyèm men, kouran ki koupe chak moman epi megabay ki koute anpil kòb.

                    2. Bonjan teknik pou travay ak ti mwayen :
                    - Telechaje tout dokiman sou òdinatè a pou li yo san entènèt (zouti tankou DevDocs oswa liv PDF) ;
                    - Sèvi ak ti pwogram lejè pou ekri kòd (VS Code ki pa lou, vim, geany) pou ti machin ki gen 2 a 4 GB RAM pa bloke ;
                    - Sove tout bibliyotèk ak dosye sou kle USB pou pataje ak lòt zanmi san bezwen telechaje yo plizyè fwa ;
                    - Byen jere batri ak kouran : bese limyè ekran an, fèmen tout pwogram ki pa itil, epi chaje aparèy yo sou ti panèl solè oswa envèsè.

                    3. Fòs ekri kòd sou papye ak reflechi nan tèt :
                    Lè pa gen kouran, ou pa bezwen kwaze bra w : ekri kalkil ak plan kòd la nan yon kaye, kalkile nan tèt ou kijan varyab yo ap chanje, epi prepare tout plan aplikasyon an anvan w menm limen òdinatè a. Sa bay lespri w yon gwo fòs lojik.

                    4. Fòmasyon nan difikilte se yon gwo avantaj :
                    Lè w aprann kode nan difikilte, ou pa janm fè kòd ki lou oswa k ap gaspiye resous. Yon devlopè ki fòme konsa konn kijan pou kreye lojisyèl ki rapid e ki ka mache sou nenpòt ti aparèy nan lemonn antye.
                """.trimIndent(),
                plannedStartPage = 120,
                plannedEndPage = 121,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 82 : L'intelligence artificielle comme outil d'apprentissage ====================
            BookChapter(
                id = "ch_6_82",
                chapterNumber = 82,
                partId = "part_6",
                titleFr = "Chapitre 82 — L'intelligence artificielle comme outil d'apprentissage",
                titleHt = "Chapit 82 — Entèlijans atifisyèl kòm zouti pou aprann",
                subtitleFr = "Tuteur personnalisé, reformulation bilingue, esprit critique et pièges de la dépendance",
                subtitleHt = "Pwofesè pèsonèl, re-eksplike an kreyòl, lespri kritik ak danje pou pa vin parese",
                summaryFr = "Analyse lucide de l'utilisation de l'IA générative comme accélérateur pédagogique individuel, avec les règles éthiques et cognitives pour éviter l'atrophie intellectuelle.",
                summaryHt = "Gid klè sou fason pou itilize Entèlijans Atifisyèl tankou yon gid pou ede w aprann pi vit, san w pa kite l panse nan plas ou.",
                contentFr = """
                    1. L'IA comme tuteur universel 24h/24 :
                    L'avènement des modèles de langage avancés transforme radicalement l'apprentissage autonome. Pour un étudiant isolé en province, l'IA offre un interlocuteur pédagogique capable de décomposer une notion mathématique, d'expliquer une erreur de syntaxe ou de traduire des concepts complexes en Kreyòl Ayisyen.

                    2. Les trois usages vertueux de l'IA pour l'apprenant :
                    - L'explication socratique : Demander au modèle de poser des questions directrices plutôt que de donner la réponse brute ;
                    - La génération d'exercices progressifs : Créer des problèmes d'algorithmique adaptés exactement au niveau actuel de l'étudiant ;
                    - La revue critique de code : Soumettre son propre code pour obtenir des suggestions d'optimisation, de sécurité et de conformité aux standards.

                    3. Les trois pièges mortels pour la progression cognitive :
                    - Le copier-coller aveugle : Insérer du code généré sans en comprendre chaque ligne détruit la capacité d'apprentissage ;
                    - L'illusion de compétence : Croire que l'on sait coder simplement parce que l'IA a produit un script fonctionnel ;
                    - La passivité intellectuelle face aux erreurs : Accepter des explications inexactes (hallucinations) sans les vérifier dans la documentation officielle.

                    4. La doctrine AJ-TECH :
                    L'IA est un amplificateur de l'intelligence humaine, jamais un substitut à l'effort personnel. La maîtrise réelle reste celle qui réside dans l'esprit du concepteur.
                """.trimIndent(),
                contentHt = """
                    1. IA tankou yon pwofesè ki toujou disponib :
                    Nouvo zouti Entèlijans Atifisyèl yo chanje tout fason moun aprann. Pou yon jèn ki poukont li nan yon zòn andeyò, IA a ka sèvi kòm yon pwofesè ki la toutan pou re-eksplike yon leson ki difisil, ede jwenn yon erè nan kòd oswa tradui gwo liv teknik an Kreyòl Ayisyen.

                    2. 3 bon fason pou sèvi ak IA pou aprann :
                    - Mande l poze w kesyon : Olye w mande l ba w repons devwa a tout kuit, mande l poze w kesyon pou ede w jwenn repons lan poukont ou ;
                    - Fè l prepare bon egzèsis pou ou : Mande l kreye ti pwoblèm pratik ki nan nivo pa w pou w ka antrene ;
                    - Fè l verifye kòd ou ekri : Montre l kòd ou fin fè a pou l di w si gen fason pou fè l pi rapid, pi pwòp epi pi an sekirite.

                    3. 3 gwo danje ki ka kraze lespri w :
                    - Kopye kole san konprann : Pran kòd IA ba w mete nan pwojè w san w pa konprann chak liy ap anpeche w janm vin yon bon enjenyè ;
                    - Pran pòz ou konnen pandan se zouti a ki fè tout bagay : Kwè ou konn kode paske IA a ba w yon solisyon se yon gwo manti w ap fè tèt ou ;
                    - Kwè tout sa l di san verifye : Zouti sa yo konn fè erè epi di manti ak anpil asirans (hallucinations), kidonk ou dwe toujou verifye nan bon liv.

                    4. Prensip AJ-TECH sou IA :
                    Entèlijans Atifisyèl la pou ede entèlijans moun grandi, li pa la pou ranplase travay ak efò lespri pa w. Vrè konesans lan se sa ki rete nan tèt ou.
                """.trimIndent(),
                plannedStartPage = 121,
                plannedEndPage = 122,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 83 : AJ-EDU et les plateformes éducatives numériques ====================
            BookChapter(
                id = "ch_6_83",
                chapterNumber = 83,
                partId = "part_6",
                titleFr = "Chapitre 83 — AJ-EDU et les plateformes éducatives numériques",
                titleHt = "Chapit 83 — AJ-EDU ak platfòm edikasyon nimerik yo",
                subtitleFr = "Pôle éducatif unifié, architecture hors-ligne et statut de conception",
                subtitleHt = "Poto fòmasyon nasyonal, zouti ki mache san entènèt ak nivo konsepsyon li ye",
                summaryFr = "Présentation du pôle éducatif AJ-EDU, sa vocation d'infrastructure pédagogique numérique et son statut transparent de concept au sein de l'écosystème.",
                summaryHt = "Prezantasyon poto edikasyon AJ-EDU, sa li vle pote pou fòmasyon jèn yo ak verite sou nivo konsepsyon li ye jodi a.",
                contentFr = """
                    1. Identité et mission d'AJ-EDU :
                    Au sein de l'architecture générale d'AJ-TECH, AJ-EDU constitue le pôle fédérateur des initiatives éducatives numériques. Sa mission est de concevoir des environnements d'apprentissage ouverts, interactifs et adaptés aux réalités technologiques et linguistiques d'Haïti.

                    2. Transparence absolue sur le statut d'AJ-EDU :
                    Conformément aux principes de rigueur d'AJ-TECH, le pôle AJ-EDU est officiellement classé sous le statut de « CONCEPT / EN DÉVELOPPEMENT INITIAL ».
                    - Aucun cours commercialisé n'est déployé à ce jour ;
                    - Aucun partenariat ministériel ou universitaire n'est revendiqué ;
                    - Aucun effectif d'étudiants n'est fictivement affiché ;
                    - Les modules décrits correspondent aux spécifications d'ingénierie et aux prototypes en cours d'élaboration.

                    3. Architecture technique des plateformes envisagées :
                    Les outils développés sous l'égide d'AJ-EDU reposent sur les standards :
                    - Architecture Offline-First intégrale (PWA avec stockage local IndexedDB/Cache Storage) ;
                    - Distribution de paquets de cours compressés synchronisables en point à point ou via clés USB ;
                    - Moteur d'évaluation d'exercices exécuté côté client sans dépendance à un serveur distant ;
                    - Interface entièrement bilingue Kreyòl Ayisyen / Français.

                    4. Complémentarité avec les entités de l'écosystème :
                    AJ-EDU s'articule avec AJ-Learn (mini-cours interactifs) et AJ-MathQuest (logique mathématique ludique) pour offrir un continuum d'apprentissage de l'enfance à l'âge adulte.
                """.trimIndent(),
                contentHt = """
                    1. Misyon ak vizyon AJ-EDU :
                    Nan tout gwo plan AJ-TECH la, AJ-EDU se branch ki rasanble tout zouti edikasyon nimerik yo. Misyon l se kreye bèl espas pou moun aprann sou òdinatè ak telefòn, nan bonjan lang Kreyòl ak Fransè, san bezwen gwo mwayen.

                    2. Verite total sou nivo pwojè AJ-EDU ye jodi a :
                    Dapre prensip transparans AJ-TECH toujou defann, AJ-EDU anrejistre ofisyèlman nan nivo « KONSÈP / KÒMANSMAN DEVLOPMAN ».
                    - Nou pa gen okenn kou n ap vann kounye a ;
                    - Nou pa gen okenn kontra ofisyèl ak leta oswa ak inivèsite jodi a ;
                    - Nou pa envante okenn fo chif sou kantite elèv ;
                    - Tout sa ki ekri la a se plan teknik ak ti vèsyon tès n ap prepare.

                    3. Kijan zouti sa yo ap bati sou plan teknik :
                    Platfòm AJ-EDU yo ap fèt sou prensip solid :
                    - Mache 100 % san entènèt (PWA ak done ki sove dirèkteman nan memwa aparèy la) ;
                    - Leson ki byen sere an ti dosye lejè moun ka pataje sou kle USB oswa Bluetooth ;
                    - Tès ak koreksyon egzèsis ki fèt dirèkteman sou telefòn lan san bezwen voye anyen sou sèvè lwen ;
                    - Tout ekran ak leson yo disponib ni an Kreyòl Ayisyen ni an Fransè.

                    4. Jan l ap travay ak lòt pwojè yo :
                    AJ-EDU ap mache men nan men ak AJ-Learn (ti leson kout) ak AJ-MathQuest (jwèt pou aprann matematik ak lojik) pou ede tout moun grandi nan konesans depi yo piti.
                """.trimIndent(),
                plannedStartPage = 123,
                plannedEndPage = 124,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 84 : EDUKA et la transformation de l'éducation ====================
            BookChapter(
                id = "ch_6_84",
                chapterNumber = 84,
                partId = "part_6",
                titleFr = "Chapitre 84 — EDUKA et la transformation de l'éducation",
                titleHt = "Chapit 84 — EDUKA ak transfòmasyon edikasyon",
                subtitleFr = "Plateforme d'apprentissage modulaire, soutien scolaire et statut officiel",
                subtitleHt = "Platfòm leson pa modil, èd pou elèv lekòl ak estati ofisyèl li genyen",
                summaryFr = "Spécifications de l'entité EDUKA : plateforme d'apprentissage scolaire modulaire adaptée aux écoles haïtiennes, sous son statut strict de concept.",
                summaryHt = "Detay sou pwojè EDUKA : yon zouti pou ede elèv lekòl konprann leson yo pi byen, anba estati konsèp li genyen toutbon.",
                contentFr = """
                    1. Dénomination officielle et vocation d'EDUKA :
                    L'entité EDUKA porte son nom officiel sans modification. Elle a pour vocation de devenir un système d'apprentissage scolaire interactif couvrant les matières fondamentales (mathématiques, sciences, langues, technologie) adaptées aux programmes pédagogiques haïtiens.

                    2. Statut officiel de l'entité :
                    EDUKA est au statut « CONCEPT / PROTOTYPE EN CONCEPTION ». Elle ne constitue pas actuellement une plateforme déployée dans les établissements scolaires ni un service public officiel.

                    3. Architecture pédagogique modulaire :
                    Le modèle fonctionnel d'EDUKA repose sur :
                    - Des micro-leçons de 5 à 10 minutes combinant texte explicatif, schémas vectoriels et exemples contextualisés à la réalité haïtienne ;
                    - Des séries d'exercices autocorrectifs permettant à l'élève d'identifier ses lacunes sans jugement ;
                    - Un tableau de bord d'auto-évaluation hors-ligne permettant de mesurer sa progression au fil des semaines ;
                    - Des fiches de révision téléchargeables et imprimables pour les zones sans écran.

                    4. La vision d'un partenariat avec les éducateurs :
                    À l'avenir, EDUKA prévoit d'intégrer des contributions directes d'enseignants, de pédagogues et de linguistes haïtiens afin de garantir la rigueur des contenus et leur totale adéquation culturelle et académique.
                """.trimIndent(),
                contentHt = """
                    1. Non ofisyèl ak misyon EDUKA :
                    Pwojè EDUKA kenbe non ofisyèl sa a san chanjman. Li fèt pou l vin yon gwo zouti edikasyon ki gen leson sou tout matyè enpòtan (matematik, syans, lang, teknoloji) ki prepare espesyalman pou elèv lekòl ann Ayiti.

                    2. Nivo pwojè a ye jodi a :
                    EDUKA nan nivo « KONSÈP / PROTOTIP AN KONSEPSYON ». Li poko yon zouti ki enstale nan lekòl yo jodi a ni li poko yon sèvis leta ofisyèl (Tout sa se bagay n ap prepare ti pa ti pa).

                    3. Fason leson yo prepare an ti moso (modilè) :
                    Plan teknik EDUKA chita sou :
                    - Ti leson kout 5 a 10 minit ki gen tèks senp, bèl desen ak egzanp sou reyalite lavi an Ayiti ;
                    - Egzèsis ki korije tèt yo otomatikman pou elèv la ka wè kote l te fè erè san pèsonn pa pase l nan betiz ;
                    - Yon ti espas sou telefòn lan ki montre l kijan l ap vanse chak semèn menm san entènèt ;
                    - Ti fich rezime leson moun ka enprime sou papye pou zòn ki pa gen òdinatè.

                    4. Travay ak pwofesè yo pi devan :
                    Lè pwojè a va fin pare, nou ta renmen travay dirèkteman ak pwofesè lekòl ak moun ki konn pedagoji an Ayiti pou asire tout leson yo gen bon kalite kòrèk.
                """.trimIndent(),
                plannedStartPage = 124,
                plannedEndPage = 125,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 85 : EDH et la formation technologique en Haïti ====================
            BookChapter(
                id = "ch_6_85",
                chapterNumber = 85,
                partId = "part_6",
                titleFr = "Chapitre 85 — EDH et la formation technologique en Haïti",
                titleHt = "Chapit 85 — EDH ak fòmasyon teknolojik ann Ayiti",
                subtitleFr = "L'École Du Digital d'Haïti : projet d'académie d'élite et transparence",
                subtitleHt = "Lekòl Dijital Ayiti (EDH) : pwojè pou yon gwo akademi fòmasyon ak transparans",
                summaryFr = "Présentation de l'entité EDH (École Du Digital d'Haïti) : ambition de formation d'excellence en ingénierie logicielle et statut strict de concept.",
                summaryHt = "Prezantasyon pwojè EDH (École Du Digital d'Haïti) : vizyon pou fòme gwo espesyalis lojisyèl ak nivo konsèp li genyen toutbon jodi a.",
                contentFr = """
                    1. Dénomination officielle et distinction :
                    L'entité EDH désigne expressément l'« École Du Digital d'Haïti ». Cette dénomination officielle est strictement maintenue (sans préfixe « AJ- »). Elle ne doit pas être confondue avec des entreprises publiques d'énergie.

                    2. Statut officiel et transparence institutionnelle :
                    EDH est officiellement classée au statut de « CONCEPT ».
                    - Aucun campus physique n'est ouvert à ce jour ;
                    - Aucun corps enseignant salarié permanent n'est constitué ;
                    - Aucun diplôme d'État ou accréditation universitaire n'est actuellement délivré ;
                    - Les cursus présentés constituent la feuille de route pédagogique de long terme.

                    3. Vocation et filières d'excellence envisagées :
                    EDH a pour ambition de former les cadres techniques de haut niveau nécessaires à la souveraineté numérique du pays :
                    - Ingénierie des systèmes distribués et cloud souverain ;
                    - Cybersécurité défensive et audit de vulnérabilités ;
                    - Architecture de bases de données et persistance locale résiliente ;
                    - Développement d'applications sécurisées et intelligence artificielle appliquée.

                    4. Pédagogie par la pratique intensive :
                    Le modèle d'EDH repose sur l'immersion par projets réels : les étudiants ne passent pas leurs années à réciter des théories abstraites, mais à concevoir, tester et déployer des applications utiles à la collectivité haïtienne.
                """.trimIndent(),
                contentHt = """
                    1. Non ofisyèl pwojè a :
                    Non ofisyèl EDH vle di « École Du Digital d'Haïti » (Lekòl Dijital Ayiti). Nou kenbe non sa a egzakteman konsa san mete « AJ- » devan l, epi li pa gen anyen pou wè ak konpayi kouran leta a.

                    2. Nivo pwojè a ye jodi a ak verite klè :
                    EDH anrejistre ofisyèlman nan nivo « KONSÈP ».
                    - Li poko gen yon gwo bilding lekòl ki louvri jodi a ;
                    - Li poko gen pwofesè sou kontra regilye kounye a ;
                    - Li poko ap bay okenn diplòm leta oswa diplòm inivèsite kounye a ;
                    - Tout pwogram leson ki prezante yo se plan travay pou pi devan.

                    3. Gwo metye EDH vle anseye pi devan :
                    Lekòl sa a fèt nan lide pou prepare jèn Ayisyen nan pi gwo metye teknoloji ki difisil :
                    - Enjenyè k ap bati gwo sistèm sèvè ak nwaj nasyonal (Cloud) ;
                    - Espesyalis k ap pwoteje sistèm kont pirate (Cybersécurité) ;
                    - Moun k ap kreye gwo baz done solid ki pa ka pèdi ;
                    - Moun k ap devlope lojisyèl sekirize ak zouti Entèlijans Atifisyèl.

                    4. Aprann nan fè gwo pwojè toutbon :
                    Prensip lekòl EDH la se pa chita ap repete bèl teyori sèlman, men se mete men nan kòd la pou bati vrè aplikasyon ki rezoud pwoblèm toutbon pou sosyete ayisyen an.
                """.trimIndent(),
                plannedStartPage = 126,
                plannedEndPage = 127,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 86 : Former au-delà du code ====================
            BookChapter(
                id = "ch_6_86",
                chapterNumber = 86,
                partId = "part_6",
                titleFr = "Chapitre 86 — Former au-delà du code",
                titleHt = "Chapit 86 — Fòme moun pi lwen pase kòd",
                subtitleFr = "Éthique, pensée critique, design d'expérience utilisateur et culture produit",
                subtitleHt = "Prensip moral, lespri kritik, bèl konsepsyon pou itilizatè ak lespri bati bon pwodui",
                summaryFr = "L'ingénierie logicielle ne se limite pas à la syntaxe : importance de l'éthique, de la psychologie utilisateur (UX), du droit numérique et de la responsabilité civique.",
                summaryHt = "Fè lojisyèl pa sèlman ekri kòd : enpòtans prensip moral, konprann sa itilizatè a bezwen (UX), respekte lwa ak responsablite anvè sosyete a.",
                contentFr = """
                    1. Le code comme simple moyen, le produit comme finalité :
                    Un développeur qui ne maîtrise que la syntaxe d'un langage reste un exécutant technique. Un véritable bâtisseur d'écosystème comprend pourquoi il écrit chaque ligne de code, pour qui il la conçoit et quel impact social elle produit.

                    2. Les quatre piliers de la formation intégrale :
                    - L'éthique et la protection des libertés fondamentales : Refuser de concevoir des mécanismes de manipulation psychologique (Dark Patterns), respecter la confidentialité des données personnelles et protéger l'autonomie des utilisateurs ;
                    - Le Design d'expérience utilisateur (UI/UX) : Concevoir des interfaces intuitives, esthétiques et accessibles aux personnes peu familiarisées avec le numérique ou en situation d'illettrisme fonctionnel ;
                    - La culture produit et la viabilité économique : Évaluer la valeur ajoutée réelle d'une fonctionnalité avant de la développer, mesurer son coût d'exploitation et garantir sa durabilité ;
                    - Le droit du numérique et la propriété intellectuelle : Comprendre les licences open source (MIT, Apache, GPL), respecter le droit d'auteur et naviguer dans les cadres réglementaires.

                    3. L'ingénieur comme citoyen éclairé :
                    En Haïti plus qu'ailleurs, les professionnels de la technologie doivent porter des valeurs d'intégrité, de patriotisme économique et de solidarité pour mettre leurs compétences au service du bien commun.
                """.trimIndent(),
                contentHt = """
                    1. Kòd se sèlman yon zouti, se sèvi moun ki pi enpòtan :
                    Yon moun ki sèlman konn ekri kòd se yon senp egzekitan. Yon vrè enjenyè ki vle chanje peyi l dwe konprann poukisa l ap ekri chak liy, pou ki moun l ap fè l, epi ki bon bagay sa pral pote nan lavi moun yo.

                    2. 4 gwo branch konesans pou konplete kòd la :
                    - Prensip moral ak pwoteksyon libète moun : Refize kreye pyèj nan lojisyèl pou twonpe itilizatè, pwoteje sekrè ak vi prive moun, epi pa janm vann done moun ;
                    - Bèl desen fasil pou itilize (UI/UX) : Fè ekran ki klè, ki bèl e ki tèlman senp pou nenpòt moun, menm sa ki pa konn li byen, ka sèvi ak yo fasil ;
                    - Lespri bati bon pwodui ki ka dire : Gade si sa w ap devlope a itil toutbon anvan w pèdi tan kode l, kalkile sa l ap koute epi asire l ka viv lontan ;
                    - Lwa sou teknoloji ak pwopriyete entèlektyèl : Konprann règ lisans lojisyèl ouvè yo (MIT, Apache), respekte travay lòt moun epi mache dwat devan lwa.

                    3. Enjenyè a dwe yon bon sitwayen modèl :
                    Ann Ayiti plis toujou, moun k ap travay nan teknoloji dwe gen prensip onètete, renmen peyi yo, epi sèvi ak entèlijans yo pou ede tout sosyete a vanse.
                """.trimIndent(),
                plannedStartPage = 127,
                plannedEndPage = 128,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 87 : Certification, portfolio et employabilité ====================
            BookChapter(
                id = "ch_6_87",
                chapterNumber = 87,
                partId = "part_6",
                titleFr = "Chapitre 87 — Certification, portfolio et employabilité",
                titleHt = "Chapit 87 — Sètifikasyon, pòtfolyo ak kapasite pou jwenn travay",
                subtitleFr = "La preuve par le code : dépôts publics, projets déployés et insertion professionnelle",
                subtitleHt = "Prèv pa kòd ou ekri : pwojè sou Git, aplikasyon k ap mache ak jwenn bon travay",
                summaryFr = "Stratégies pour valoriser ses compétences sur le marché de l'emploi : pourquoi un portfolio de projets fonctionnels surpasse un diplôme théorique sans pratique.",
                summaryHt = "Fason pou montre sa w konn fè pou jwenn travay fasil : poukisa bèl pwojè ki deja ap mache pi fò pase yon senp papye diplòm san pratik.",
                contentFr = """
                    1. Le paradigme de la preuve par la pratique :
                    Dans le secteur technologique moderne, les recruteurs et donneurs d'ordre internationaux n'accordent qu'une importance secondaire aux titres académiques non vérifiables. Ce qui compte de manière décisive, c'est la preuve tangible de la compétence : le code écrit, testé et déployé.

                    2. Les trois composantes d'un portfolio professionnel solide :
                    - Des dépôts GitHub/GitLab publics et soignés : Un historique de commits clair, des README détaillés en plusieurs langues, des diagrammes d'architecture et des tests automatisés démontrant la rigueur du développeur ;
                    - Des applications fonctionnelles déployées en production : Des liens directs vers des PWA ou APK testables immédiatement par les recruteurs ;
                    - Des articles techniques ou contributions open source : Démontrer sa capacité à expliquer un problème technique complexe et à collaborer avec la communauté mondiale.

                    3. Les opportunités d'insertion professionnelle pour les talents haïtiens :
                    - Le télétravail international (Remote Work) : Exporter des services d'ingénierie vers des entreprises étrangères tout en vivant en Haïti et en injectant des devises dans l'économie locale ;
                    - Le freelancing spécialisé : Proposer des expertises pointues (interfaces mobiles Jetpack Compose, sécurité, optimisation offline) sur les plateformes professionnelles ;
                    - L'entrepreneuriat de service : Accompagner la numérisation des commerces, cliniques et écoles locales.

                    4. La transparence d'AJ-TECH :
                    AJ-TECH ne délivre pas de certifications mercantiles illusoires. L'écosystème préconise la maîtrise authentique démontrée par des réalisations concrètes et vérifiables par tous.
                """.trimIndent(),
                contentHt = """
                    1. Montre sa w konn fè toutbon vre :
                    Nan mond teknoloji a jodi a, gwo konpayi k ap anplwaye moun pa sèlman gade bèl papye diplòm. Sa ki pi enpòtan pou yo, se wè prèv toutbon sou sa w konn fè : kòd ou deja ekri, teste epi ki deja ap fonksyone.

                    2. 3 bagay yon bon dosye travay (portfolio) dwe genyen :
                    - Paj Git (GitHub/GitLab) ki byen pwòp : Kòd ki byen estriktire, bon ti liv esplikasyon (README) an plizyè lang, ak tès ki montre ou travay ak anpil swen ;
                    - Aplikasyon k ap fonksyone toutbon sou entènèt : Lyen kote moun ka klike pou teste aplikasyon w lan dirèkteman sou telefòn yo ;
                    - Ti atik teknik oswa èd ou bay nan pwojè ouvè : Sa montre ou konn kominike byen epi ou ka travay ak lòt devlopè nan lemonn antye.

                    3. Bèl opòtinite travay pou jèn Ayisyen :
                    - Travay a distans sou entènèt (Remote Work) : Travay pou konpayi lòt bò dlo pandan w rete nan peyi w, sa k pèmèt bon lajan rantre nan ekonomi nasyonal la ;
                    - Travay kòm endepandan (Freelance) : Vann sèvis espesyal ou (fè bèl aplikasyon mobil Jetpack Compose, sekirite) bay moun ki bezwen sa ;
                    - Kreye pwòp ti biznis sèvis ou : Ede ti boutik, doktè ak lekòl nan zòn pa w modènize fason y ap travay.

                    4. Pozisyon klè AJ-TECH :
                    AJ-TECH pa la pou vann fo diplòm oswa papye ki pa gen anyen dèyè yo. Nou kwè nan vrè konpetans ki chita sou bèl travay ou fè ak men w ke nenpòt moun ka verifye.
                """.trimIndent(),
                plannedStartPage = 128,
                plannedEndPage = 130,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 88 : La transmission des connaissances ====================
            BookChapter(
                id = "ch_6_88",
                chapterNumber = 88,
                partId = "part_6",
                titleFr = "Chapitre 88 — La transmission des connaissances",
                titleHt = "Chapit 88 — Transmisyon konesans",
                subtitleFr = "Mentorat, pair-programmation, culture du partage et documentation ouverte",
                subtitleHt = "Gide lòt moun, kode de pa de, pataje konesans ak dokiman ouvè pou tout moun",
                summaryFr = "Pourquoi la transmission généreuse du savoir est le seul moyen de démultiplier les compétences et de pérenniser un écosystème technologique national.",
                summaryHt = "Poukisa pataje sa w konnen san sere konesans se sèl fason pou fè yon jenerasyon grandi epi asire lavni teknoloji nan peyi a.",
                contentFr = """
                    1. Le savoir non partagé s'éteint :
                    Dans de nombreuses cultures techniques émergentes, la tentation existe de garder jalousement ses connaissances comme un privilège individuel. AJ-TECH combat vigoureusement cette attitude stérile : la véritable puissance d'une communauté réside dans sa capacité à transmettre vite et bien à ceux qui suivent.

                    2. Les mécanismes concrets de transmission communautaire :
                    - Le mentorat individuel : Chaque développeur ayant atteint un niveau intermédiaire ou avancé s'engage moralement à guider au moins deux débutants dans leur apprentissage ;
                    - La programmation en binôme (Pair Programming) : Travailler à deux sur un même problème pour transmettre en direct les réflexes d'ingénierie, les raccourcis de débogage et la méthode d'analyse ;
                    - La rédaction de documentation en Kreyòl Ayisyen : Documenter les algorithmes et les architectures dans la langue maternelle pour briser les barrières de la compréhension ;
                    - L'animation d'ateliers techniques ouverts : Organiser des sessions pratiques d'échange de compétences au sein des universités, centres communautaires et espaces associatifs.

                    3. L'effet multiplicateur du capital humain :
                    Si un ingénieur forme dix développeurs, et que chacun d'eux en forme dix à son tour, une communauté de dix mille bâtisseurs peut émerger en moins d'une décennie. C'est sur cette dynamique exponentielle que repose la vision AJ-TECH 2026–2035.
                """.trimIndent(),
                contentHt = """
                    1. Konesans ou sere nan ti bwat se konesans ki mouri :
                    Twò souvan, gen moun ki panse si yo kache sa yo konnen y ap vin pi enpòtan. AJ-TECH kwè egzakteman lekontrè : pi gwo fòs yon kominote se lè moun ki konnen yo prese montre moun k ap monte yo pou tout moun ka grandi ansanm.

                    2. Bonjan fason pou transmèt konesans :
                    - Gide jèn k ap kòmanse (Mentorat) : Chak devlopè ki deja gen yon ti eksperyans dwe pran angajman pou l ede omwen de lòt jèn k ap kòmanse ;
                    - Kode de pa de (Pair Programming) : Chita de moun sou menm òdinatè pou rezoud yon pwoblèm, sa pèmèt youn aprann ti sekrè ak bon abitid lòt la rapid ;
                    - Ekri dokiman teknik an Kreyòl Ayisyen : Eksplike kòd ak sistèm yo nan lang manman nou pou tout moun ka konprann fasil san baryè langaj ;
                    - Fè bèl ti atelye pratik : Fè ti rankont nan lekòl, inivèsite ak sant kominotè pou pataje eksperyans sou fason pou devlope lojisyèl.

                    3. Fòs yon konesans k ap miltipliye :
                    Si yon sèl enjenyè fòme 10 jèn, epi chak jèn sa yo fòme 10 lòt jèn, nou ka gen plis pase 10 000 bon enjenyè nan mwens pase 10 lane. Se sou gwo fòs sa a vizyon AJ-TECH 2026–2035 lan chita.
                """.trimIndent(),
                plannedStartPage = 130,
                plannedEndPage = 131,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 89 : Former pour entreprendre et innover ====================
            BookChapter(
                id = "ch_6_89",
                chapterNumber = 89,
                partId = "part_6",
                titleFr = "Chapitre 89 — Former pour entreprendre et innover",
                titleHt = "Chapit 89 — Fòme moun pou antreprann ak inove",
                subtitleFr = "Passerelle entre compétences techniques, création d'entreprises et impact local",
                subtitleHt = "Pon ant konesans teknik, kreye pwòp biznis ak chanje lavi nan zòn kote w rete a",
                summaryFr = "Comment orienter l'apprentissage technologique vers la création de valeur entrepreneuriale et l'innovation appliquée aux défis concrets de la société haïtienne.",
                summaryHt = "Kijan pou fè sa jèn yo aprann nan kòd sèvi pou kreye nouvo antrepriz, kreye travay epi rezoud gwo pwoblèm peyi a.",
                contentFr = """
                    1. La formation technique comme tremplin entrepreneurial :
                    Apprendre à programmer ne doit pas avoir pour seul horizon la recherche d'un emploi salarié. En Haïti, où le tissu industriel est encore embryonnaire, les développeurs doivent être formés à devenir les créateurs de leurs propres entreprises technologiques.

                    2. Les dimensions de la formation à l'entrepreneuriat technologique :
                    - L'identification des problèmes réels à haute valeur : Détecter les inefficacités quotidiennes (transport, traçabilité agricole, encaissement, gestion de dossiers médicaux) et concevoir des solutions logicielles adaptées ;
                    - Le bootstrapping rigoureux : Lancer son produit avec des capitaux minimes en misant sur l'efficacité du code, la sobriété des infrastructures et la génération précoce de revenus réels ;
                    - L'art de la relation client : Écouter les retours utilisateurs, adapter continuellement le produit et bâtir une relation de confiance durable ;
                    - La gestion financière saine : Séparer strictement les finances personnelles de celles de l'entreprise, réinvestir les bénéfices et maintenir une trésorerie prudente.

                    3. L'innovation frugale (Jugaad) :
                    Innover en Haïti ne signifie pas copier aveuglément la Silicon Valley, mais inventer des modèles inédits fonctionnant avec peu d'énergie, peu de bande passante et un coût d'accès dérisoire pour la population.

                    4. L'articulation avec AJ-Biz et AJ-Fondation :
                    AJ-Biz apporte le cadre méthodologique pour l'accompagnement des structures commerciales naissantes, tandis qu'AJ-Fondation œuvre pour l'inclusion des publics défavorisés, garantissant un développement économique équilibré et solidaire.
                """.trimIndent(),
                contentHt = """
                    1. Aprann kòd pou ka kreye pwòp antrepriz pa w :
                    Objektif aprann ekri lojisyèl pa dwe sèlman pou tann lòt moun ba w travay. Ann Ayiti, kote pa gen anpil gwo izin, devlopè yo dwe aprann kijan pou yo fonde pwòp konpayi pa yo pou kreye travay pou lòt moun.

                    2. Sa yon jèn dwe aprann pou l vin yon bon antreprenè nan teknoloji :
                    - Chèche rezoud vrè pwoblèm ki bay moun traka : Gade difikilte nan transpò, agrikilti, lopital oswa komès epi bati bon ti lojisyèl pou ranje sa ;
                    - Bati ak ti mwayen (Bootstrapping) : Kòmanse biznis la ak ti kòb nan men w, fè kòd la mache byen san depanse gwo lajan nan sèvè chè ;
                    - Koute kliyan yo ak anpil atansyon : Tande sa moun ki itilize aplikasyon an ap di pou amelyore l chak jou epi kenbe konfyans yo ;
                    - Byen jere lajan biznis la : Pa janm melanje kòb pèsonèl ou ak kòb konpayi an, epi toujou mete kòb sou kote pou fè pwojè a grandi.

                    3. Fè bèl inovasyon ak ti resous (Inovasyon Frijal) :
                    Inove an Ayiti se pa kopye sa k ap fèt nan gwo peyi rich, men se envante solisyon espesyal ki mache ak ti kouran, ti entènèt epi ki pa koute chè pou pèp la.

                    4. Wòl AJ-Biz ak AJ-Fondation :
                    AJ-Biz bay bon konsèy pou ede ti biznis teknoloji yo grandi, pandan AJ-Fondation ap travay pou ede moun ki nan zòn ki pi pòv yo jwenn chans aprann, pou tout moun ka vanse ansanm.
                """.trimIndent(),
                plannedStartPage = 131,
                plannedEndPage = 132,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 90 : Le capital humain haïtien face au monde ====================
            BookChapter(
                id = "ch_6_90",
                chapterNumber = 90,
                partId = "part_6",
                titleFr = "Chapitre 90 — Le capital humain haïtien face au monde",
                titleHt = "Chapit 90 — Kapital imen ayisyen an devan mond lan",
                subtitleFr = "Compétitivité internationale, dignité, diaspora et rayonnement global",
                subtitleHt = "Konpetans sou plan entènasyonal, diyite, dyaspora ak fè peyi a briye toupatou",
                summaryFr = "Positionnement des talents haïtiens sur l'échiquier technologique mondial : valorisation du génie national, liens avec la diaspora et affirmation de notre dignité.",
                summaryHt = "Pozisyon jèn Ayisyen nan mitan gwo espesyalis teknoloji nan mond lan : montre fòs entèlijans nou, travay ak dyaspora a epi leve diyite nasyon an.",
                contentFr = """
                    1. La fin du complexe d'infériorité technologique :
                    L'histoire a trop souvent confiné Haïti au rôle de récepteur passif d'aide humanitaire ou de consommateur de technologies étrangères. La jeunesse haïtienne possède le même potentiel cognitif, la même inventivité et la même rigueur que la jeunesse de n'importe quel continent.

                    2. Les atouts distinctifs du profil haïtien dans la tech mondiale :
                    - La résilience hors norme : Habitué à résoudre des pannes d'infrastructure complexes, le développeur haïtien ne panique jamais devant l'imprévu technique ;
                    - Le multilinguisme naturel : La maîtrise conjointe du Kreyòl Ayisyen, du Français et de l'Anglais technique constitue un atout de communication international majeur ;
                    - La créativité sous contrainte : Une capacité exceptionnelle à optimiser les ressources et à imaginer des architectures légères et élégantes ;
                    - Le sens profond de la solidarité communautaire.

                    3. L'alliance stratégique avec la diaspora haïtienne :
                    La diaspora technologique haïtienne — présente dans les plus grands centres d'ingénierie en Amérique du Nord et en Europe — constitue un pont inestimable : mentorat, retours d'expérience sur les standards de production, co-création de projets et opportunités de sous-traitance à haute valeur ajoutée.

                    4. La devise d'AJ-TECH comme boussole :
                    « L'innovation haïtienne au service du monde ». Cette devise n'est pas un voeu pieux : elle est l'affirmation résolue que les solutions logicielles conçues à Port-au-Prince ont vocation à être exportées et reconnues sur tous les continents.
                """.trimIndent(),
                contentHt = """
                    1. Nou pa enferyè ak okenn nasyon sou latè :
                    Twòp moun te vle fè konprann Ayiti la sèlman pou resevwa èd oswa pou konsome sa lòt moun fè. Jèn Ayisyen yo gen menm entèlijans, menm kapasite nan sèvo yo ak menm talan ak nenpòt jèn nan nenpòt gwo peyi sou latè.

                    2. Pi gwo fòs yon devlopè ayisyen genyen :
                    - Gwo kouraj devan difikilte : Paske li abitye rezoud gwo pwoblèm kouran ak rezo, yon enjenyè ayisyen pa janm pèdi tèt li lè yon gwo sistèm bloke ;
                    - Konnen plizyè lang : Pale Kreyòl Ayisyen, Fransè ak Angle teknik se yon gwo avantaj pou kominike ak tout mond lan ;
                    - Kreyativite nan ti mwayen : Yon gwo talan pou fè lojisyèl ki pa lou epi ki kouri rapid san gaspiye resous ;
                    - Bonjan lespri solidarite ak renmen ede lòt moun.

                    3. Travay ansanm ak frè ak sè nou yo nan dyaspora a :
                    Ayisyen k ap travay nan gwo konpayi teknoloji lòt bò dlo se yon gwo richès : yo ka bay konsèy, pataje eksperyans sou fason gwo pwojè fèt, epi ede jèn nan peyi a jwenn bèl kontra travay.

                    4. Deviz AJ-TECH la kòm gid nou :
                    « Inovasyon ayisyen nan sèvis lemonn ». Pawòl sa a se yon angajman fèm pou tout moun konnen lojisyèl nou ekri nan Pòtoprens gen bon jan kalite pou yo sèvi moun nan tout kwen sou latè.
                """.trimIndent(),
                plannedStartPage = 132,
                plannedEndPage = 133,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 91 : Une stratégie éducative AJ-TECH pour 2026–2035 ====================
            BookChapter(
                id = "ch_6_91",
                chapterNumber = 91,
                partId = "part_6",
                titleFr = "Chapitre 91 — Une stratégie éducative AJ-TECH pour 2026–2035",
                titleHt = "Chapit 91 — Yon estrateji edikasyon AJ-TECH pou 2026–2035",
                subtitleFr = "Jalons décennaux, structuration des cursus, montée en puissance et impact national",
                subtitleHt = "Gwo etap sou 10 lane, prepare bon pwogram leson, ogmante fòs nou ak chanje peyi a",
                summaryFr = "Feuille de route stratégique 2026–2035 pour l'éducation, les compétences et le capital humain au sein de l'écosystème AJ-TECH.",
                summaryHt = "Plan estratejik 2026–2035 sou fason pou devlope edikasyon, konpetans ak kapital imen nan tout ekosistèm AJ-TECH la.",
                contentFr = """
                    1. Nature prospective et rigueur de la feuille de route :
                    Les jalons présentés ci-dessous définissent les objectifs de recherche, de conception pédagogique et de développement logiciel planifiés pour la décennie 2026–2035. Ils constituent une vision directrice cohérente et non des réalisations passées.

                    2. Les quatre phases décennales de la stratégie éducative :

                    - Phase 1 (2026–2027) — Fondations méthodologiques & Contenus de référence :
                      - Structuration des référentiels de compétences pour les 7 étapes du parcours développeur ;
                      - Rédaction des cours fondamentaux bilingues (Kreyòl Ayisyen / Français) sur les bases de l'algorithmique et de la programmation moderne ;
                      - Développement des premiers prototypes d'EDUKA et d'AJ-Learn en architecture 100 % hors-ligne ;
                      - Spécification des modules d'auto-formation pour les jeunes des provinces.

                    - Phase 2 (2028–2030) — Expérimentation, outillage & Mentorat communautaire :
                      - Tests pilotes des applications éducatives auprès de groupes d'apprenants volontaires ;
                      - Mise en place des premiers réseaux d'échange de code et de mentorat technique avec la diaspora ;
                      - Consolidation des modules de spécialisation (Jetpack Compose, sécurité applicative, bases de données locales résilientes) ;
                      - Déploiement de kits d'apprentissage hors-ligne sur supports physiques (clés USB, cartes SD).

                    - Phase 3 (2031–2033) — Structuration d'EDH & Expansion territoriale :
                      - Formalisation des cursus intensifs de haut niveau sous la bannière d'EDH (École Du Digital d'Haïti) ;
                      - Intégration de modules d'intelligence artificielle pédagogique personnalisée s'exécutant sur terminal local ;
                      - Alliances éducatives avec des centres communautaires, des bibliothèques et des collectifs d'enseignants ;
                      - Émergence des premières promotions de développeurs haïtiens exportant leurs services à l'échelle internationale.

                    - Phase 4 (2034–2035) — Maturité, souveraineté cognitive & Rayonnement :
                      - Consolidation d'un réseau national de dizaines de milliers de créateurs technologiques formés et actifs ;
                      - Autonomie complète du pays dans la maintenance, l'évolution et la sécurité de ses systèmes informatiques vitaux ;
                      - Rayonnement de l'ingénierie logicielle haïtienne comme modèle d'excellence et de frugalité dans toute la Caraïbe et en Afrique francophone.

                    3. Conclusion de la Partie VI :
                    La plus grande ressource d'Haïti ne réside pas dans l'assistance extérieure, mais dans l'intelligence, la discipline et la dignité de ses enfants. En outillant la jeunesse par le savoir technique et la rigueur morale, nous forgeons les bâtisseurs invincibles du pays de demain.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan estrateji sa a ye toutbon :
                    Gwo dat ak etap ki ekri anba a se yon gid travay, yon vizyon estratejik klè sou sa nou vle bati pou peryòd 2026–2035 lan. Se pa yon bagay ki deja fini, se plan n ap travay di sou li chak jou.

                    2. 4 gwo faz nan plan edikasyon 2026–2035 lan :

                    - Faz 1 (2026–2027) — Mete baz yo ak prepare bon leson :
                      - Byen prepare tout 7 etap pou fòme yon bon devlopè soti nan zewo ;
                      - Ekri tout premye leson debaz yo an Kreyòl Ayisyen ak an Fransè sou lojik kòd ak bon prensip enfòmatik ;
                      - Bati premye ti vèsyon tès EDUKA ak AJ-Learn ki mache 100 % san entènèt ;
                      - Prepare bèl gid pou ede jèn nan tout vil pwovens yo aprann poukont yo.

                    - Faz 2 (2028–2030) — Fè tès sou zouti yo ak kreye rezo gidaj :
                      - Fè tès sou aplikasyon edikasyon yo ak jèn ki vle ede nou verifye kijan yo mache ;
                      - Kòmanse mete jèn nan peyi a an kontak ak espesyalis nan dyaspora a pou yo gide yo nan ekri bon kòd ;
                      - Ranfòse leson sou gwo metye espesyal (aplikasyon mobil Jetpack Compose, sekirite, baz done) ;
                      - Pataje leson yo sou kle USB ak kat memwa pou moun ki pa gen entènèt ka jwenn yo fasil.

                    - Faz 3 (2031–2033) — Prepare lekòl EDH epi elaji nan tout peyi a :
                      - Byen estriktire gwo fòmasyon espesyal pou lekòl EDH (École Du Digital d'Haïti) ;
                      - Mete zouti Entèlijans Atifisyèl sou telefòn pou ede chak elèv aprann nan nivo pa l ;
                      - Travay ansanm ak sant jèn, bibliyotèk ak asosyasyon pwofesè nan tout peyi a ;
                      - Wè premye gwo gwoup jèn Ayisyen k ap travay sou entènèt pou konpayi nan lemonn antye.

                    - Faz 4 (2034–2035) — Nasyon an vin mèt tèt li nan teknoloji :
                      - Genyen plizyè dizèn milye jèn gason ak jèn fi ki byen fòme epi k ap bati bèl lojisyèl nan peyi a ;
                      - Peyi a vin gen tout enjenyè li bezwen pou jere, pwoteje epi fè tout gwo sistèm enfòmatik li yo mache san depann sou lòt moun ;
                      - Lòt peyi nan Karayib la ak nan Lafrik rekonèt Ayiti kòm yon gwo modèl nan fason pou bati bèl teknoloji ki itil pèp la.

                    3. Konklizyon Pati VI la :
                    Pi gwo richès peyi d Ayiti se pa nan tann lòt moun vin ede nou, men se nan entèlijans, nan disiplin ak nan diyite tout pitit li yo. Lè nou bay jèn yo bonjan konesans teknik ak bon prensip moral, n ap bati yon jenerasyon moun vanyan k ap mennen peyi a nan somè a.
                """.trimIndent(),
                plannedStartPage = 133,
                plannedEndPage = 134,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
