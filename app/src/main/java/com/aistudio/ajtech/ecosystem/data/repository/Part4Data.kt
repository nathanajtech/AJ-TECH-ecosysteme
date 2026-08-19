package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE IV — ARCHITECTURE TECHNOLOGIQUE D'AJ-TECH
 * Chapitres 46 à 60 (Exactement 15 chapitres d'ingénierie logicielle et infrastructure).
 */
object Part4Data {

    val part4: BookPart = BookPart(
        id = "part_4",
        partNumber = 4,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE IV — ARCHITECTURE TECHNOLOGIQUE",
        titleHt = "PATI IV — ACHITEKTI TEKNOLOJIK",
        subtitleFr = "Ingénierie logicielle, protocoles, robustesse offline et vision d'infrastructure 2026–2035",
        subtitleHt = "Enjenyri lojisyèl, pwotokòl, fonksyone san entènèt ak plan enfrastrikti 2026–2035",
        plannedPages = "pp. 231–285",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 46 : L'architecture globale d'AJ-TECH ====================
            BookChapter(
                id = "ch_4_46",
                chapterNumber = 46,
                partId = "part_4",
                titleFr = "Chapitre 46 — L'architecture globale d'AJ-TECH",
                titleHt = "Chapit 46 — Achitekti jeneral AJ-TECH",
                subtitleFr = "Fondations modulaires, séparation des responsabilités et cartographie systémique",
                subtitleHt = "Fondasyon modilè, separasyon wòl yo ak kat jeneral sistèm nan",
                summaryFr = "Vue d'ensemble de l'architecture systémique d'AJ-TECH, distinguant les briques logicielles actuelles, les prototypes et l'infrastructure cible.",
                summaryHt = "Vizyon jeneral sou achitekti sistèm AJ-TECH la, ki eksplike sa ki la kounye a, sa k nan tès ak sa ki planifye pou pi devan.",
                contentFr = """
                    1. Principes directeurs de l'architecture :
                    L'architecture logicielle d'AJ-TECH repose sur trois impératifs cardinaux : la modularité stricte, la résilience face aux pannes de connectivité (Offline-First) et l'évolutivité progressive sans dette technique toxique.
                    
                    2. Distinctions technologiques fondamentales :
                    - Technologies réellement utilisées aujourd'hui dans l'application mobile de référence : Kotlin, Jetpack Compose, Material 3, architecture MVVM (Model-View-ViewModel), repositories en mémoire typés (BookRepository, EcosystemRepository), recherche textuelle bilingue temps réel, système d'onglets de navigation Compose, suite de tests locaux JVM avec Robolectric sous le namespace « com.aistudio.ajtech.ecosystem ».
                    - Technologies présentes dans le prototype : Architecture Progressive Web App (PWA) pour AJ-Task, exploitation de Service Workers pour la mise en cache applicative et IndexedDB pour la persistance locale sur le poste client.
                    - Technologies envisagées à moyen terme : Moteurs de persistance Room / DataStore sur Android, API Gateway unifiée, microservices d'authentification centralisée (AJ-ID) et services backends conteneurisés.
                    - Technologies futures : Infrastructure physique de serveurs distribués en Haïti (AJ-Cloud), protocoles cryptographiques sur puces matérielles (HSM pour AJ-Pay/AJ-Wallet) et fédération inter-îles caribéenne.
                    
                    3. Séparation des couches logicielles :
                    L'écosystème isole rigoureusement la couche de présentation (UI déclarative réactive), la couche de domaine (logique métier et filtrage) et la couche de données (abstraction via des repositories). Cette séparation garantit que l'interface utilisateur peut être entièrement redessinée ou adaptée sans impacter la logique métier ou la structure des entités.
                    
                    4. Avantages et limites de l'architecture actuelle :
                    - Avantages : Rapidité d'exécution extrême, zéro latence réseau, indépendance énergétique et réseau totale, couverture de tests instantanée sur machine virtuelle locale.
                    - Limites actuelles : Absence actuelle de synchronisation automatique multi-appareils dans l'application compagnon, persistance limitée au cycle de vie de l'application et absence de base de données relationnelle distante en production à ce jour.
                """.trimIndent(),
                contentHt = """
                    1. Prensip debaz achitekti a :
                    Achitekti lojisyèl AJ-TECH chita sou twa gwo prensip : modilarite solid, kapasite pou travay san entènèt (Offline-First) ak posibilite pou grandi etap pa etap san kreye vye erè nan kòd la.
                    
                    2. Diferans klè nan nivo teknoloji yo :
                    - Teknoloji k ap itilize tout bon vre jodi a nan aplikasyon referans lan : Kotlin, Jetpack Compose, Material 3, achitekti MVVM (Model-View-ViewModel), depo done nan memwa (BookRepository, EcosystemRepository), rechèch tèks bileng an tan reyèl, navigasyon Compose, tès lokal sou machin ak Robolectric anba namespace « com.aistudio.ajtech.ecosystem ».
                    - Teknoloji ki nan pwototip : Achitekti Progressive Web App (PWA) pou AJ-Task, itilizasyon Service Workers pou sere paj nan navigatè a ak IndexedDB pou sere done sou machin itilizatè a.
                    - Teknoloji nou prevwa itilize talè konsa : Room ak DataStore pou sere done sou Android, API Gateway santral, mikwosèvis pou idantite inik (AJ-ID) ak sèvè backend.
                    - Teknoloji pou pi devan : Enfrastrikti sèvè fizik an Ayiti (AJ-Cloud), sekirite materyèl pou lajan (AJ-Pay/AJ-Wallet) ak koneksyon ak lòt peyi nan Karayib la.
                    
                    3. Separasyon wòl yo nan kòd la :
                    Sistèm nan separe aklè pati k ap afiche sou ekran an (UI Compose), pati ki gen règ ak lojik yo (Domain) ak pati ki kenbe done yo (Data/Repositories). Sa pèmèt nou chanje fòm ekran an san nou pa kraze règ biznis yo.
                    
                    4. Avantaj ak limit achitekti aktyèl la :
                    - Avantaj : Li rapid anpil, li pa bezwen entènèt pou l mache, li pa pran tan pou l ouvri, epi tès yo pase rapid sou òdinatè.
                    - Limit kounye a : Li poko ka voye done otomatikman soti sou yon telefòn pou al sou yon lòt, epi li poko konekte ak yon gwo baz done sou entènèt nan nivo pwodiksyon.
                """.trimIndent(),
                plannedStartPage = 231,
                plannedEndPage = 234,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 47 : Kotlin et Jetpack Compose ====================
            BookChapter(
                id = "ch_4_47",
                chapterNumber = 47,
                partId = "part_4",
                titleFr = "Chapitre 47 — Kotlin et Jetpack Compose",
                titleHt = "Chapit 47 — Kotlin ak Jetpack Compose",
                subtitleFr = "Le paradigme déclaratif moderne au service de la performance et de la lisibilité",
                subtitleHt = "Fason modèn pou kreye ekran rapid, bèl epi fasil pou modifye",
                summaryFr = "Analyse approfondie de l'utilisation de Kotlin et Jetpack Compose dans l'application AJ-TECH.",
                summaryHt = "Eksplikasyon detaye sou fason nou itilize Kotlin ak Jetpack Compose nan aplikasyon AJ-TECH la.",
                contentFr = """
                    1. Choix du langage Kotlin :
                    Kotlin a été retenu comme langage de référence pour l'application Android d'AJ-TECH en raison de sa concision, de sa sécurité vis-à-vis des pointeurs nuls (Null Safety), de la richesse de ses fonctions d'extension et du support natif des coroutines pour le traitement asynchrone non-bloquant.
                    
                    2. L'interface déclarative avec Jetpack Compose :
                    Contrairement à l'ancien paradigme XML basé sur l'impératif et la manipulation d'arbres de vues instables, Jetpack Compose décrit l'interface utilisateur comme une fonction directe de son état. Dès que l'état change, le moteur de rendu recompose uniquement les éléments visuels modifiés.
                    
                    3. Système de Design Material 3 :
                    L'application s'appuie sur la bibliothèque Material 3 (M3) pour garantir une cohérence esthétique irréprochable :
                    - Typographie hiérarchisée adaptée à la lecture prolongée d'ouvrages volumineux ;
                    - Palette dynamique respectant les contrastes d'accessibilité en mode clair et sombre ;
                    - Composants natifs optimisés : Scaffolds, TopAppBars, NavigationBars, Modals, Cards et Badges.
                    
                    4. Pratiques d'ingénierie et bonnes pratiques Compose :
                    - Découpage en fonctions composables atomiques et réutilisables ;
                    - Utilisation de paramètres immuables pour favoriser le saut de recomposition (recomposition skipping) ;
                    - Utilisation de `remember` et `derivedStateOf` pour éviter les recalculs superflus lors du défilement ou des frappes de recherche.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou chwazi langaj Kotlin :
                    Nou chwazi Kotlin kòm langaj prensipal pou aplikasyon Android AJ-TECH la paske kòd li kout, li anpeche aplikasyon an kraze sou erè vid (Null Safety), li gen bèl zouti pou trete travay an paralèl (Coroutines) san telefòn lan pa ralanti.
                    
                    2. Ekran deklaratif ak Jetpack Compose :
                    Olye nou itilize vye sistèm XML ki te konplike pou jere, Jetpack Compose pèmèt nou ekri kijan ekran an dwe parèt selon done ki disponib yo. Kou done yo chanje, se sèl ti pati ki chanje a ki re-desine sou ekran an.
                    
                    3. Sistèm Design Material 3 :
                    Aplikasyon an sèvi ak Material 3 (M3) pou l gen yon aparans pwòp ak pwofesyonèl :
                    - Ekriti ki byen klè ki fè li fasil pou li gwo liv ak atik long san je pa fatige ;
                    - Koulè ki byen separe pou moun ka wè byen ni lajounen ni lannwit ;
                    - Bonjan bouton, meni, bwat mesaj ak kat enfòmasyon ki respekte tout estanda entènasyonal yo.
                    
                    4. Bon prensip nan kòd Compose nou an :
                    - Separe chak ti moso ekran an ti moso kòd senp nou ka re-itilize ;
                    - Fè kòd la pa re-kalkile menm bagay yo plizyè fwa san rezon ;
                    - Itilize `remember` pou kalkil rechèch yo pa ralanti lè itilizatè a ap defile paj yo.
                """.trimIndent(),
                plannedStartPage = 235,
                plannedEndPage = 238,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 48 : Architecture MVVM ====================
            BookChapter(
                id = "ch_4_48",
                chapterNumber = 48,
                partId = "part_4",
                titleFr = "Chapitre 48 — Architecture MVVM",
                titleHt = "Chapit 48 — Achitekti MVVM",
                subtitleFr = "Model-View-ViewModel : flux unidirectionnel des données et séparation des rôles",
                subtitleHt = "Model-View-ViewModel : chemen done yo nan yon sèl sans ak bon lòd nan kòd la",
                summaryFr = "Présentation du pattern MVVM et du flux de données unidirectionnel (UDF) appliqué à l'écosystème AJ-TECH.",
                summaryHt = "Prezantasyon sou modèl MVVM ak jan done yo sikile nan yon sèl sans (UDF) nan aplikasyon an.",
                contentFr = """
                    1. Définition et rôle du pattern MVVM :
                    L'architecture Model-View-ViewModel (MVVM) structure le code applicatif en trois strates distinctes :
                    - Modèle (Model) : Représente les entités de données pures (BookPart, BookChapter, EcosystemEntity, MetricItem).
                    - Vue (View) : Composables Jetpack Compose purs qui observent l'état et émettent des événements utilisateurs.
                    - ViewModel : Détenteur de l'état de l'écran, insensible aux recréations d'activité, encapsulant la logique de présentation et orchestrant les interactions avec les repositories.
                    
                    2. Le flux unidirectionnel des données (UDF - Unidirectional Data Flow) :
                    Dans l'architecture AJ-TECH, les données circulent dans un sens unique :
                    - L'état (UI State) descend du ViewModel vers les Composables via des flux `StateFlow` ou `mutableStateOf`.
                    - Les événements utilisateurs (clic sur un chapitre, saisie d'un filtre, bascule linguistique FR/HT, ajout d'un signet) remontent des Composables vers le ViewModel sous forme de rappels d'événements (callbacks).
                    
                    3. Avantages pour la robustesse et la maintenabilité :
                    - Testabilité maximale : La logique métier peut être testée unitairement sans instancier le moteur graphique Android.
                    - Prévisibilité : Aucun composant d'interface ne peut modifier l'état directement de manière anarchique.
                    - Résilience aux changements de configuration : L'état de lecture, la requête de recherche et la position de défilement restent préservés.
                """.trimIndent(),
                contentHt = """
                    1. Kisa modèl MVVM ye epi ki wòl li :
                    Achitekti Model-View-ViewModel (MVVM) separe kòd aplikasyon an an twa gwo branch :
                    - Modèl (Model) : Done senp yo (chapit liv, antite, mezi estatistik).
                    - Vi (View) : Ekran Jetpack Compose ki afiche done yo epi ki tande lè itilizatè a klike.
                    - ViewModel : Pati ki kenbe eta ekran an, ki pa pèdi lè telefòn lan vire, epi ki pale ak depo done yo.
                    
                    2. Sikilasyon done yo nan yon sèl sans (UDF) :
                    Nan kòd AJ-TECH la, done yo toujou vwayaje nan yon sèl direksyon :
                    - Done yo (State) desann soti nan ViewModel la pou al sou ekran an pou afiche.
                    - Aksyon itilizatè a (klike sou yon chapit, tape nan rechèch, chanje lang FR/HT, mete yon mak-paj) monte soti sou ekran an pou al jwenn ViewModel la.
                    
                    3. Poukisa sa rann kòd la solid anpil :
                    - Li fasil pou teste : Nou ka verifye si tout kalkil yo bon san nou pa bezwen limen ekran an.
                    - Pa gen sipriz : Pa gen okenn ti bouton ki ka chanje done yo an kachèt.
                    - Pwoteksyon lè telefòn lan vire : Paj kote w t ap li a ak sa w t ap chèche a rete la menm si oryantasyon ekran an chanje.
                """.trimIndent(),
                plannedStartPage = 239,
                plannedEndPage = 242,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 49 : Données, modèles et repositories ====================
            BookChapter(
                id = "ch_4_49",
                chapterNumber = 49,
                partId = "part_4",
                titleFr = "Chapitre 49 — Données, modèles et repositories",
                titleHt = "Chapit 49 — Done, modèl ak depo done (Repositories)",
                subtitleFr = "Structuration des entités, BookRepository, EcosystemRepository et recherche bilingue",
                subtitleHt = "Fason done yo estriktire, BookRepository, EcosystemRepository ak rechèch bileng",
                summaryFr = "Documentation des modèles immuables de l'application, du découpage des repositories et de l'indexation de recherche bilingue.",
                summaryHt = "Dokimantasyon sou fòm done yo, fason nou separe depo done yo ak jan rechèch bileng lan fonksyone.",
                contentFr = """
                    1. Conception des modèles de données :
                    Tous les modèles fondamentaux de l'écosystème sont définis sous forme de `data class` Kotlin immuables (`BookPart`, `BookChapter`, `EcosystemEntity`, `TechnicalMetric`, `EntityMilestone`). L'immuabilité garantit l'absence d'effets de bord lors des lectures concurrentes et simplifie grandement les tests de non-régression.
                    
                    2. Le rôle du BookRepository et d'EcosystemRepository :
                    - `BookRepository` : Centralise l'intégralité du corpus littéraire et technique de l'ouvrage officiel, découpé en parties logiques (Part1Data, Part2Data, Part3Data, Part4Data) pour éviter les fichiers monolithiques indigestes et optimiser les temps de compilation.
                    - `EcosystemRepository` : Expose la cartographie complète des 21 entités officielles avec leurs attributs, statuts officiels, catégories sectorielles, liens de parenté et fiches techniques.
                    
                    3. Moteur de recherche textuelle bilingue :
                    L'application intègre un algorithme de recherche synchrone haute performance capable d'indexer instantanément les titres, sous-titres, résumés et contenus intégraux, simultanément en français et en créole haïtien, avec normalisation diacritique pour garantir des résultats pertinents même avec des variations d'accents.
                    
                    4. Namespace officiel :
                    L'ensemble des classes, repositories et composants d'ingénierie réside sous le namespace standardisé : `com.aistudio.ajtech.ecosystem`.
                """.trimIndent(),
                contentHt = """
                    1. Fason modèl done yo bati :
                    Tout gwo klas done yo bati ak `data class` Kotlin ki pa ka modifye an dirèk (`BookPart`, `BookChapter`, `EcosystemEntity`). Sa anpeche yon pati nan kòd la chanje done yo san lòt pati a pa konnen, epi sa rann tès yo fasil pou fè.
                    
                    2. Wòl BookRepository ak EcosystemRepository :
                    - `BookRepository` : Kenbe tout liv ofisyèl la, li separe an plizyè modil pwòp (Part1Data, Part2Data, Part3Data, Part4Data) pou kòd la pa twò lou epi pou l bati rapid nan zouti devlopman yo.
                    - `EcosystemRepository` : Bay tout enfòmasyon sou 21 antite ofisyèl yo, nivo avansman yo, kategori yo ak tout detay teknik sou yo.
                    
                    3. Motè rechèch bileng lan :
                    Aplikasyon an gen yon motè rechèch rapid ki fouye nan tit, rezime ak tout kontni an alafwa an Fransè ak an Kreyòl Ayisyen, epi ki konprann aksan yo pou moun ka jwenn sa y ap chèche a san difikilte.
                    
                    4. Namespace ofisyèl la :
                    Tout kòd ak zouti teknik yo klase anba non ofisyèl sa a : `com.aistudio.ajtech.ecosystem`.
                """.trimIndent(),
                plannedStartPage = 243,
                plannedEndPage = 246,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 50 : Applications PWA et applications mobiles ====================
            BookChapter(
                id = "ch_4_50",
                chapterNumber = 50,
                partId = "part_4",
                titleFr = "Chapitre 50 — Applications PWA et applications mobiles",
                titleHt = "Chapit 50 — Aplikasyon PWA ak aplikasyon mobil",
                subtitleFr = "PWA, Android natif, Web classique et backend serveur : distinctions et complémentarités",
                subtitleHt = "PWA, Android natif, Sitwèb klasik ak sèvè : diferans ak fason yo konplete",
                summaryFr = "Explication comparative des paradigmes applicatifs au sein d'AJ-TECH, avec focus sur le statut pilote de la PWA AJ-Task.",
                summaryHt = "Konparezon ant diferan fason pou kreye aplikasyon nan AJ-TECH, ak detay sou PWA AJ-Task ki nan tès kounye a.",
                contentFr = """
                    1. Distinctions architecturales fondamentales :
                    - Progressive Web App (PWA) : Application web moderne enrichie de Service Workers et d'un manifeste, capable de s'installer sur l'écran d'accueil sans passer par un magasin d'applications, de s'exécuter hors-ligne et de se mettre à jour instantanément.
                    - Application Android Native : Développée en Kotlin avec Jetpack Compose, accédant directement aux APIs bas niveau du système d'exploitation (capteurs, notifications système, chiffrement matériel Keystore).
                    - Application Web Classique : Pages web dépendantes d'un serveur distant, nécessitant une connexion Internet continue pour chaque interaction ou rechargement.
                    - Application Serveur (Backend) : Services d'arrière-plan exécutant la logique métier lourde, gérant les bases de données et exposant des APIs sécurisées.
                    
                    2. Le statut spécifique d'AJ-Task :
                    AJ-Task constitue aujourd'hui le prototype fonctionnel le plus avancé de l'écosystème AJ-TECH. Développé sous la forme d'une PWA Offline-First, il est actuellement en phase de test pilote restreint auprès d'utilisateurs pionniers. Ce choix a permis de valider rapidement l'ergonomie et la résilience hors-ligne sans friction de distribution.
                    
                    3. Stratégie multiplateforme d'AJ-TECH :
                    L'écosystème ne s'enferme pas dans une technologie unique : les services à large diffusion publique privilégient la légèreté des PWA, tandis que les outils de productivité avancée et les services financiers s'orientent vers des clients natifs robustes.
                """.trimIndent(),
                contentHt = """
                    1. Diferans prensipal ant kalite aplikasyon yo :
                    - Progressive Web App (PWA) : Yon aplikasyon web modèn ki gen Service Workers, ki ka enstale sou telefòn san pase nan Play Store, ki mache san entènèt epi ki mete ajou otomatikman.
                    - Aplikasyon Android Natif : Bati ak Kotlin ak Jetpack Compose, ki pale dirèkteman ak sistèm telefòn lan (kamera, notifikasyon, sekirite pyès telefòn lan).
                    - Sitwèb Klasik : Paj web senp ki bezwen entènèt tout tan pou yo ka ouvri oswa pou klike sou nenpòt bouton.
                    - Aplikasyon Sèvè (Backend) : Pwogram ki kache sou gwo òdinatè a distans pou kalkile gwo operasyon epi voye done bay telefòn yo.
                    
                    2. Ka espesyal AJ-Task la :
                    AJ-Task se pwodui ki pi avanse nan tès yo jodi a nan AJ-TECH. Li fèt kòm yon PWA ki mache san entènèt (Offline-First), epi li nan faz tès pilòt ak kèk itilizatè kounye a. Sa pèmèt nou verifye kijan moun itilize li san difikilte pou telechaje.
                    
                    3. Estrateji AJ-TECH sou plizyè aparèy :
                    Nou pa rete kole sou yon sèl zouti : sèvis pou tout moun ap itilize PWA ki lejè, pandan zouti pwofesyonèl ak zafè lajan ap bezwen aplikasyon natif ki pi an sekirite.
                """.trimIndent(),
                plannedStartPage = 247,
                plannedEndPage = 250,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 51 : Cloud, serveurs et infrastructure ====================
            BookChapter(
                id = "ch_4_51",
                chapterNumber = 51,
                partId = "part_4",
                titleFr = "Chapitre 51 — Cloud, serveurs et infrastructure",
                titleHt = "Chapit 51 — Cloud, sèvè ak enfrastrikti",
                subtitleFr = "Perspectives d'hébergement, souveraineté des données et résilience énergétique",
                subtitleHt = "Pwojè pou sèvè, pwoteksyon done nan peyi a ak jesyon kouran",
                summaryFr = "Analyse prospective de l'infrastructure d'hébergement d'AJ-TECH, distinguant l'état local actuel des ambitions cloud futures.",
                summaryHt = "Analiz sou pwojè sèvè ak cloud AJ-TECH yo, ak diferans ant sa k ap fèt sou aparèy la jodi a ak sa ki planifye pou pi devan.",
                contentFr = """
                    1. État actuel de l'infrastructure :
                    À ce stade de développement, l'application compagnon AJ-TECH fonctionne de manière autonome et auto-hébergée sur l'appareil client (On-Device Architecture). Aucun serveur cloud distant n'est requis pour la consultation de l'ouvrage, garantissant une disponibilité permanente sans dépendance d'hébergeur tiers.
                    
                    2. Perspectives futures et projet AJ-Cloud :
                    Pour les entités nécessitant de la synchronisation distante (AJ-Task en équipe, EDUKA, AJ-Mail), l'écosystème envisage le déploiement progressif d'une infrastructure cloud souveraine :
                    - Stockage d'objets sécurisé et redondant ;
                    - Moteur de synchronisation bidirectionnelle avec résolution de conflits ;
                    - Sauvegardes chiffrées automatisées ;
                    - Grappes de microservices conteneurisés hautement disponibles.
                    
                    3. Prudence et réalisme d'ingénierie :
                    Ces infrastructures serveur ne sont pas encore déployées à l'échelle commerciale et font l'objet d'études de dimensionnement technique et énergétique.
                    
                    4. Le défi de la souveraineté et de l'énergie en Haïti :
                    L'implantation future de centres de données locaux devra impérativement intégrer des sources d'énergie renouvelable (solaire, batteries de secours) et des connexions satellites redondantes pour pallier les défaillances des réseaux publics d'électricité et de télécommunications.
                """.trimIndent(),
                contentHt = """
                    1. Kote enfrastrikti a ye jodi a :
                    Kounye a, aplikasyon AJ-TECH sa a fonksyone nèt sou telefòn itilizatè a san l pa bezwen okenn sèvè deyò pou ouvri liv la. Sa fè l toujou disponib san l pa depann de okenn konpayi entènèt etranje.
                    
                    2. Pwojè pou pi devan ak AJ-Cloud :
                    Pou pwojè ki pral bezwen pataje done ant plizyè moun (AJ-Task an ekip, EDUKA, AJ-Mail), nou gen nan plan pou deplwaye yon bon enfrastrikti cloud souveren :
                    - Espas pou sere fichye an sekirite ;
                    - Motè senkronizasyon ki rezoud pwoblèm si de moun modifye menm bagay la ;
                    - Sovgad otomatik ki byen pwoteje ;
                    - Gwoup sèvè ki pa fasil tonbe an pàn.
                    
                    3. Verite ak pridans sou sa ki la :
                    Sèvè sa yo poko lanse nan nivo komèsyal jodi a, y ap etidye kijan pou yo bati yo kòrèkteman selon mwayen ak kouran ki disponib.
                    
                    4. Defi kouran ak souverènte an Ayiti :
                    Lè nou pral mete gwo sant sèvè an Ayiti, nou dwe planifye enèji solè ak gwo batri ak entènèt satelit pou sèvè yo pa janm etenn menm lè kouran leta oswa kab koupe.
                """.trimIndent(),
                plannedStartPage = 251,
                plannedEndPage = 254,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 52 : Bases de données et persistance ====================
            BookChapter(
                id = "ch_4_52",
                chapterNumber = 52,
                partId = "part_4",
                titleFr = "Chapitre 52 — Bases de données et persistance",
                titleHt = "Chapit 52 — Baz done ak fason done yo rete anrejistre",
                subtitleFr = "Du stockage local en mémoire aux moteurs relationnels et distribués",
                subtitleHt = "Soti nan depo nan memwa telefòn rive nan gwo baz done distribye",
                summaryFr = "Panorama des technologies de persistance utilisées aujourd'hui et envisagées pour les futures versions de l'écosystème.",
                summaryHt = "Eksplikasyon sou fason done yo sere jodi a ak sa nou prevwa itilize nan vèsyon k ap vini yo.",
                contentFr = """
                    1. Persistance actuelle dans l'application compagnon :
                    L'application Android actuelle exploite des structures de données en mémoire Kotlin hautement optimisées au sein de repositories modulaires (`BookRepository`, `EcosystemRepository`), complétées par des mécanismes d'état Compose pour les préférences de lecture, les signets et la progression.
                    
                    2. Technologies de persistance envisagées pour Android :
                    - Jetpack DataStore (Preferences / Proto) : Pour la persistance sécurisée des paramètres utilisateurs, du mode sombre et des clés de session légères.
                    - Room Database (SQLite) : Moteur d'abstraction relationnel pour les entités nécessitant des requêtes complexes, des filtres avancés et un cache hors-ligne volumineux.
                    
                    3. Persistance dans le prototype PWA (AJ-Task) :
                    Dans le prototype AJ-Task, les données de projets, tâches et colonnes Kanban sont persistées sur le terminal de l'utilisateur grâce à la base de données standard IndexedDB du navigateur web.
                    
                    4. Moteurs de bases de données distants envisagés :
                    Pour les futurs services backend centraux, PostgreSQL constitue le choix privilégié pour sa robustesse relationnelle, son support JSON avancé et ses extensions géospatiales (PostGIS pour AJ-Tè et AJ-Maps).
                """.trimIndent(),
                contentHt = """
                    1. Kijan done yo sere kounye a nan aplikasyon an :
                    Aplikasyon Android aktyèl la itilize modèl done nan memwa Kotlin ki optimize anpil nan depo (`BookRepository`, `EcosystemRepository`), ansanm ak sistèm eta Compose pou kenbe paj ou te ye a, mak-paj yo ak nivo lekti a.
                    
                    2. Teknoloji nou prevwa mete sou Android :
                    - Jetpack DataStore : Pou sere chwa itilizatè a (koulè nwa/blan, opsyon lekti) san sa pa lou.
                    - Room Database (SQLite) : Pou sere gwo kantite done sou telefòn lan ak rechèch konplike san entènèt.
                    
                    3. Kijan PWA AJ-Task sere done li yo :
                    Nan pwototip AJ-Task la, tout travay, lis ak tablo Kanban yo sere dirèkteman nan navigatè a gras ak baz done IndexedDB.
                    
                    4. Gwo baz done pou sèvè pi devan :
                    Pou sèvè santral yo pi devan, PostgreSQL se premye chwa nou paske li solid anpil, li jere done konplike byen epi li ka jere kat jeyografik (PostGIS pou AJ-Tè ak AJ-Maps).
                """.trimIndent(),
                plannedStartPage = 255,
                plannedEndPage = 258,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 53 : API et interopérabilité ====================
            BookChapter(
                id = "ch_4_53",
                chapterNumber = 53,
                partId = "part_4",
                titleFr = "Chapitre 53 — API et interopérabilité",
                titleHt = "Chapit 53 — API ak kominikasyon ant sistèm yo",
                subtitleFr = "Standards REST, protocoles d'échange et interfaces d'intégration de l'écosystème",
                subtitleHt = "Estanda REST, fason aplikasyon yo pale ansanm ak koneksyon nan sistèm nan",
                summaryFr = "Principes d'interopérabilité, conception d'APIs REST et communication inter-entités au sein d'AJ-TECH.",
                summaryHt = "Prensip sou kijan aplikasyon yo ap kominike ansanm gras ak API REST ak bon estanda.",
                contentFr = """
                    1. Rôle des APIs dans l'écosystème :
                    Les interfaces de programmation applicative (APIs) représentent les artères de communication reliant les 21 entités de l'écosystème, permettant l'échange sécurisé de données sans couplage rigide entre les briques logicielles.
                    
                    2. Conception des APIs REST envisagées :
                    - Verbes HTTP standardisés (GET, POST, PUT, DELETE, PATCH) ;
                    - Formats de données stricts en JSON avec validation de schéma ;
                    - Codes de statut explicites (200 OK, 201 Created, 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 500 Internal Error) ;
                    - Pagination uniforme pour les listes volumineuses.
                    
                    3. Sécurité des échanges client/serveur :
                    Les communications futures reposeront obligatoirement sur le protocole HTTPS / TLS 1.3, avec authentification par jetons sécurisés (JSON Web Tokens - JWT) à durée de vie courte et clés de rafraîchissement révocables.
                    
                    4. APIs internes vs APIs tierces :
                    - APIs internes : Protocoles optimisés pour la communication transversale entre services de l'écosystème (ex. AJ-Pay appelant AJ-ID).
                    - APIs tierces : Interfaces sécurisées et documentées ouvertes aux développeurs externes, entreprises partenaires et institutions haïtiennes pour stimuler l'innovation locale.
                """.trimIndent(),
                contentHt = """
                    1. Wòl API yo nan tout ekosistèm nan :
                    API yo se tankou wout ki pèmèt 21 antite yo pale youn ak lòt, pou yo ka pataje enfòmasyon an sekirite san youn pa depann twòp de lòt.
                    
                    2. Fason API REST yo fèt :
                    - Itilize kòmand estanda HTTP (GET, POST, PUT, DELETE) ;
                    - Fòma done JSON ki byen estriktire pou pa gen erè ;
                    - Kòd repons ki klè (200 lè l bon, 404 lè l pa jwenn li, 401 lè w pa gen dwa) ;
                    - Paginasyon pou separe gwo lis done yo an plizyè paj.
                    
                    3. Sekirite nan kominikasyon an :
                    Tout kominikasyon ant telefòn ak sèvè dwe pase nan HTTPS / TLS 1.3 ak paspò dijital (JWT) ki chanje souvan pou anpeche moun entèsepte mesaj yo.
                    
                    4. API pou nou menm vs API pou moun deyò :
                    - API entèn : Pou aplikasyon AJ-TECH yo pale vit youn ak lòt (pa egzanp AJ-Pay ki verifye idantite sou AJ-ID).
                    - API pou lòt devlopè : Zouti ki byen dokimante pou devlopè ayisyen ak biznis ka konekte sou sèvis nou yo pou kreye nouvo solisyon.
                """.trimIndent(),
                plannedStartPage = 259,
                plannedEndPage = 262,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 54 : Intelligence artificielle dans l'écosystème ====================
            BookChapter(
                id = "ch_4_54",
                chapterNumber = 54,
                partId = "part_4",
                titleFr = "Chapitre 54 — Intelligence artificielle dans l'écosystème",
                titleHt = "Chapit 54 — Entèlijans atifisyèl nan ekosistèm nan",
                subtitleFr = "Opportunités applicatives, éthique, prévention des hallucinations et responsabilité humaine",
                subtitleHt = "Opòtinite, prensip etik, anpeche radòt ak responsablite moun sou zafè IA",
                summaryFr = "Vision pragmatique et éthique de l'intégration de l'IA dans les entités d'AJ-TECH, avec garde-fous stricts.",
                summaryHt = "Vizyon klè ak responsab sou kijan nou pral itilize Entèlijans Atifisyèl nan AJ-TECH ak tout prekosyon ki nesesè.",
                contentFr = """
                    1. Cas d'usage de l'IA au sein d'AJ-TECH :
                    L'Intelligence Artificielle est envisagée comme un multiplicateur de capacités cognitives et d'efficacité :
                    - Assistance contextuelle bilingue (Français / Créole) via l'entité AJ-Assistant ;
                    - Aide à la rédaction, synthèse de documents et recherche sémantique avancée ;
                    - Tuteurs d'apprentissage adaptatifs dans AJ-Learn et EDUKA ;
                    - Automatisation de tâches répétitives et assistance au codage dans AJ-Dev ;
                    - Détection des anomalies et patterns suspects de fraude dans AJ-Pay.
                    
                    2. Garde-fous éthiques et prévention des hallucinations :
                    L'IA ne doit jamais se substituer au jugement critique humain. L'écosystème applique des principes stricts :
                    - Rejet de l'illusion de perfection : les modèles génératifs sont sujets aux hallucinations et doivent être systématiquement encadrés par des règles déterministes ;
                    - Validation humaine obligatoire (Human-in-the-Loop) pour toute décision critique juridique, financière ou éducative ;
                    - Transparence : tout contenu généré ou assisté par IA doit être clairement identifié comme tel.
                    
                    3. Confidentialité et souveraineté des données :
                    Aucune donnée sensible ou personnelle des utilisateurs haïtiens ne doit être transmise sans consentement à des modèles tiers à des fins d'entraînement non sollicité.
                """.trimIndent(),
                contentHt = """
                    1. Kijan IA ka ede nan AJ-TECH :
                    Nou konsidere Entèlijans Atifisyèl kòm yon zouti pou ede moun travay pi vit epi aprann pi byen :
                    - Asistans bileng (Fransè / Kreyòl) gras ak AJ-Assistant ;
                    - Ede ekri, fè rezime sou gwo tèks ak rechèch entèlijan ;
                    - Ede elèv yo konprann leson pi byen nan AJ-Learn ak EDUKA ;
                    - Ede devlopè ekri bon kòd pi vit nan AJ-Dev ;
                    - Detekte tranzaksyon sispèk pou evite vòl nan AJ-Pay.
                    
                    2. Règleman etik ak kontwòl sou erè IA ka fè :
                    IA pa ka ranplase konprann yon moun. Nou mete gwo baryè pou sekirite :
                    - Pa janm kwè IA pa fè erè : modèl sa yo ka envante bagay ki pa vre (hallucinations), kidonk nou dwe toujou verifye yo ;
                    - Moun dwe toujou valide (Human-in-the-Loop) anvan yo pran gwo desizyon sou lajan, lalwa oswa lekòl ;
                    - Transparans : tout sa IA ede ekri dwe make aklè pou tout moun konnen.
                    
                    3. Pwoteksyon lavi prive ak done moun :
                    Nou pa dwe janm voye done prive itilizatè ayisyen bay gwo konpayi etranje pou antrene modèl san konsantman yo.
                """.trimIndent(),
                plannedStartPage = 263,
                plannedEndPage = 266,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 55 : Sécurité applicative ====================
            BookChapter(
                id = "ch_4_55",
                chapterNumber = 55,
                partId = "part_4",
                titleFr = "Chapitre 55 — Sécurité applicative",
                titleHt = "Chapit 55 — Sekirite aplikasyon yo",
                subtitleFr = "Gestion des secrets, authentification, chiffrement et protection des données",
                subtitleHt = "Jesyon sekrè, otantifikasyon, chifreman ak pwoteksyon done itilizatè yo",
                summaryFr = "Principes d'ingénierie de sécurité pour protéger les applications et utilisateurs de l'écosystème AJ-TECH.",
                summaryHt = "Prensip sekirite enfòmatik pou pwoteje aplikasyon ak tout moun k ap itilize sistèm AJ-TECH la.",
                contentFr = """
                    1. Principes de sécurité appliqués :
                    La sécurité n'est pas une option surajoutée mais une contrainte architecturale permanente dès la première ligne de code :
                    - Principe du moindre privilège : chaque module n'accède qu'aux seules données strictement indispensables à sa fonction ;
                    - Défense en profondeur : superposition de barrières de sécurité logicielles et protocolaires.
                    
                    2. Gestion des secrets et des identifiants :
                    - Jamais de clés d'API, de jetons secrets ou de mots de passe en clair dans le code source ou dans les dépôts de versions ;
                    - Injection des variables sensibles au moment de la compilation ou via des gestionnaires de secrets sécurisés.
                    
                    3. Chiffrement et intégrité des données :
                    - Chiffrement au repos (AES-256) pour les données locales sensibles ;
                    - Chiffrement en transit via TLS 1.3 obligatoire pour tous les flux réseau ;
                    - Validation et assainissement systématique de toutes les entrées utilisateurs pour prévenir les injections de code (XSS, SQL Injection).
                    
                    4. Prudence et honnêteté sur les certifications :
                    Aucun système futur ne doit être prétendu « inviolable » ou pré-certifié (PCI-DSS, ISO 27001) avant d'avoir subi de véritables audits indépendants et formels.
                """.trimIndent(),
                contentHt = """
                    1. Prensip sekirite nou aplike yo :
                    Sekirite se pa yon bagay nou ajoute apre, se yon règ debaz depi premye liy kòd la :
                    - Bay chak pati nan kòd la sèlman dwa li bezwen pou l travay, pa plis ;
                    - Mete plizyè kouch sekirite youn dèyè lòt pou bare atakè yo.
                    
                    2. Kijan nou jere sekrè ak modpas yo :
                    - Pa janm ekri modpas, kle API oswa sekrè an klè nan kòd la oswa sou GitHub ;
                    - Mete sekrè yo nan zouti espesyal ki pwoteje yo pandan aplikasyon an ap bati.
                    
                    3. Chifreman ak pwoteksyon done yo :
                    - Fèmen done sansib yo ak kle chifreman solid (AES-256) sou telefòn lan ;
                    - Tout kominikasyon sou entènèt dwe pase nan TLS 1.3 ki an sekirite ;
                    - Netwaye epi verifye tout sa itilizatè a tape pou anpeche moun voye vye kòd pirate (XSS, SQL Injection).
                    
                    4. Onètete sou sètifika sekirite :
                    Nou pa dwe janm di yon sistèm ki nan plan deja gen sètifika entènasyonal si li poko pase nan men gwo ekspè endepandan ki teste l tout bon.
                """.trimIndent(),
                plannedStartPage = 267,
                plannedEndPage = 270,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 56 : Performance et optimisation ====================
            BookChapter(
                id = "ch_4_56",
                chapterNumber = 56,
                partId = "part_4",
                titleFr = "Chapitre 56 — Performance et optimisation",
                titleHt = "Chapit 56 — Vitès ak optimize kòd la",
                subtitleFr = "Optimisations réelles : Canvas drawLine(), LazyColumn, clés stables et gestion de la mémoire",
                subtitleHt = "Sa nou optimize tout bon vre : Canvas drawLine(), LazyColumn, kle ki pa chanje ak memwa",
                summaryFr = "Documentation technique des choix d'optimisation réels intégrés dans l'application compagnon AJ-TECH.",
                summaryHt = "Dokimantasyon teknik sou fason nou rann aplikasyon AJ-TECH la rapid epi lejè sou telefòn yo.",
                contentFr = """
                    1. Optimisations concrètement déployées dans le code :
                    L'application compagnon applique des optimisations de bas niveau pour garantir une fluidité parfaite à 60/120 FPS :
                    - Rendu Canvas optimisé : Utilisation de primitives graphiques directes `drawLine()` dans les composants de visualisation pour réduire le nombre de nœuds de mise en page (Layout Nodes) ;
                    - Réduction drastique des allocations d'objets dans les boucles de rendu pour soulager le ramasse-miettes (Garbage Collector) ;
                    - Mémorisation avec `remember` et `derivedStateOf` : Calculs de filtrage et d'indexation de recherche exécutés uniquement lorsque la requête ou les métadonnées changent.
                    
                    2. Listes virtuelles et recyclage avec LazyColumn :
                    Pour afficher le corpus de 60 chapitres et les 21 entités sans saturer la mémoire vive :
                    - Utilisation de `LazyColumn` avec des clés d'éléments stables (`key = { chapter.id }`) pour permettre à Compose de recycler et réordonner les éléments sans recomposition complète ;
                    - Chargement paresseux du contenu texte pour préserver l'empreinte mémoire sur les smartphones à ressources limitées.
                    
                    3. Optimisations futures envisagées :
                    - Compilation de profils de référence (Baseline Profiles) pour réduire le temps de démarrage à froid de 30% ;
                    - Pagination dynamique des flux de données et compression binaire des métadonnées.
                """.trimIndent(),
                contentHt = """
                    1. Sa nou optimize tout bon vre nan kòd la :
                    Aplikasyon an gen bonjan zouti optimize pou l kouri byen sou nenpòt kalite telefòn :
                    - Desen Canvas rapid : Nou itilize `drawLine()` dirèkteman pou desine bèl liy san sa pa louvri twòp kouch sou ekran an ;
                    - Evite kreye twòp ti objè san rezon pou memwa telefòn lan pa janm plen ;
                    - Itilize `remember` ak `derivedStateOf` : Nou fè kalkil rechèch yo fèt sèlman lè moun nan tape yon nouvo mo.
                    
                    2. Lis entèlijan ak LazyColumn :
                    Pou afiche 60 chapit liv la ak 21 antite yo san telefòn lan pa ralanti :
                    - Nou itilize `LazyColumn` ak kle inik sou chak chapit (`key = { chapter.id }`) pou Compose ka re-itilize ti moso ekran yo san l pa refè tout paj la ;
                    - Chaje gwo tèks yo sèlman lè itilizatè a rive sou yo pou ti telefòn ki pa gen anpil memwa ka louvri l fasil.
                    
                    3. Sa nou prevwa optimize pi devan :
                    - Kreye Baseline Profiles pou aplikasyon an ouvri 30% pi vit lè w klike sou li ;
                    - Paginasyon otomatik sou gwo lis done yo.
                """.trimIndent(),
                plannedStartPage = 271,
                plannedEndPage = 274,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 57 : Accessibilité et expérience utilisateur ====================
            BookChapter(
                id = "ch_4_57",
                chapterNumber = 57,
                partId = "part_4",
                titleFr = "Chapitre 57 — Accessibilité et expérience utilisateur",
                titleHt = "Chapit 57 — Fasilite pou tout moun itilize (Accessibilité & UX)",
                subtitleFr = "Cibles tactiles ≥48dp, TalkBack, contrastes et confort de lecture bilingue",
                subtitleHt = "Bouton ≥48dp pou dwèt, TalkBack pou moun ki pa wè byen ak lekti bileng fasil",
                summaryFr = "Standards d'accessibilité et de design inclusif appliqués dans l'interface utilisateur d'AJ-TECH.",
                summaryHt = "Estanda pou pèmèt tout kalite moun, menm moun ki gen difikilte pou wè, itilize aplikasyon an fasil.",
                contentFr = """
                    1. Principes d'inclusion et d'accessibilité numérique :
                    Pour qu'une technologie soit réellement émancipatrice, elle doit être utilisable par tous les citoyens, sans barrière physique, visuelle ou linguistique.
                    
                    2. Règles d'accessibilité appliquées dans l'application :
                    - Cibles tactiles minimales : Tous les boutons, icônes interactives et onglets respectent une zone de toucher minimale de 48dp x 48dp (`minimumInteractiveComponentSize`) pour éviter les erreurs de frappe ;
                    - Descriptions sémantiques : Présence systématique de `contentDescription` explicites sur toutes les icônes et illustrations pour la compatibilité avec le lecteur d'écran Android TalkBack ;
                    - Ratios de contraste élevés : Conformité avec les critères WCAG AA pour assurer une lisibilité optimale en plein soleil haïtien ou en environnement sombre ;
                    - Typographie dynamique : Adaptation harmonieuse aux préférences de taille de police définies par l'utilisateur au niveau du système.
                    
                    3. Expérience utilisateur bilingue native :
                    Bascule instantanée en un clic entre le Français et le Kreyòl Ayisyen sans rechargement ni perte du contexte de navigation.
                """.trimIndent(),
                contentHt = """
                    1. Prensip pou tout moun ka itilize l :
                    Pou yon teknoloji sèvi peyi a tout bon, tout moun dwe ka sèvi avè l san pwoblèm, menm moun ki gen difikilte pou wè oswa pou li.
                    
                    2. Règleman nou respekte nan ekran yo :
                    - Gwosè bouton pou dwèt : Tout bouton ak ti kote ou ka klike gen omwen 48dp x 48dp pou moun pa klike sou move kote pa erè ;
                    - Eksplikasyon pou moun ki pa wè : Tout ti desen ak bouton gen `contentDescription` pou zouti TalkBack ka li l bay moun ki avèg ;
                    - Koulè ki byen separe : Tèks yo parèt byen klè menm anba gwo solèy cho oswa nan fènwa ;
                    - Ekriti ki ka gwosi : Si itilizatè a chwazi gwo lèt nan paramèt telefòn li, aplikasyon an adapte otomatikman.
                    
                    3. Chanje lang fasil nan yon sèl klik :
                    Itilizatè a ka chanje ant Fransè ak Kreyòl Ayisyen nan yon sèl klik san paj la pa fèmen epi san l pa pèdi kote l t ap li a.
                """.trimIndent(),
                plannedStartPage = 275,
                plannedEndPage = 277,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 58 : Tests, qualité et maintenance ====================
            BookChapter(
                id = "ch_4_58",
                chapterNumber = 58,
                partId = "part_4",
                titleFr = "Chapitre 58 — Tests, qualité et maintenance",
                titleHt = "Chapit 58 — Tès, kalite ak antretyen kòd la",
                subtitleFr = "Tests unitaires, Robolectric, non-régression et limites de la validation automatique",
                subtitleHt = "Tès sou machin, Robolectric, verifye si anyen pa kraze ak limit tès otomatik yo",
                summaryFr = "Stratégie de test et d'assurance qualité du projet AJ-TECH, entre rigueur automatisée et vigilance continue.",
                summaryHt = "Estrateji pou teste kòd la epi asire bon kalite nan aplikasyon AJ-TECH la.",
                contentFr = """
                    1. Pyramide des tests dans AJ-TECH :
                    La qualité logicielle repose sur une suite de vérifications multicouches :
                    - Tests unitaires de logique métier : Validation des calculs, des filtres sectoriels et des modèles de données sans dépendance Android ;
                    - Tests Robolectric sur machine virtuelle locale JVM : Simulation réaliste de l'environnement Android permettant de tester les ViewModels, l'état Compose et les interactions de navigation sans nécessiter d'émulateur lourd ;
                    - Compilation continue et validation des types stricts.
                    
                    2. Tests de non-régression de l'écosystème :
                    Des suites de tests dédiées (`FilterAndShareRobolectricTest`) valident automatiquement que les 21 entités officielles, leurs 18 rubriques obligatoires et l'intégralité des chapitres bilingues demeurent intacts après chaque modification de code.
                    
                    3. Honnêteté et limites des tests automatisés :
                    Le succès des tests automatisés atteste de la conformité du code aux scénarios prévus, mais ne saurait garantir l'absence absolue de bugs dans des conditions réelles imprévues (variations extrêmes de matériel, coupures soudaines de batterie, etc.). La maintenance continue et les retours d'utilisateurs restent indispensables.
                """.trimIndent(),
                contentHt = """
                    1. Kijan nou teste kòd la nan AJ-TECH :
                    Nou verifye kòd la nan plizyè nivo pou n asire li pa gen erè :
                    - Tès senp sou kalkil ak lojik : Verifye si rechèch ak filtè yo ap mache kòrèkteman ;
                    - Tès Robolectric sou òdinatè (JVM) : Sa simulation yon telefòn Android pou teste ViewModels ak ekran yo san nou pa bezwen yon emilatè lou ;
                    - Verifikasyon konpilasyon pou wè si pa gen move liy kòd.
                    
                    2. Tès pou verifye si anyen pa kraze :
                    Nou gen gwo dosye tès (`FilterAndShareRobolectricTest`) ki verifye si 21 antite yo, 18 ribrik yo ak tout chapit bileng yo la kòrèkteman chak fwa nou chanje yon ti kòd.
                    
                    3. Verite sou limit tès otomatik yo :
                    Lè tout tès yo pase vèt, sa vle di kòd la respekte sa nou te prevwa a, men sa pa vle di pa ka janm gen okenn ti pwoblèm sou kèk telefòn diferan oswa lè batri a koupe sibit. Nou dwe toujou koute moun k ap itilize l yo pou kontinye amelyore l.
                """.trimIndent(),
                plannedStartPage = 278,
                plannedEndPage = 280,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 59 : Architecture évolutive 2026–2035 ====================
            BookChapter(
                id = "ch_4_59",
                chapterNumber = 59,
                partId = "part_4",
                titleFr = "Chapitre 59 — Architecture évolutive 2026–2035",
                titleHt = "Chapit 59 — Plan achitekti k ap grandi 2026–2035",
                subtitleFr = "Feuille de route technique progressive : stabilisation, persistance, cloud et maturité",
                subtitleHt = "Plan travay etap pa etap : estabilizasyon, baz done, cloud ak gwo enfrastrikti",
                summaryFr = "Feuille de route technique décennale progressive pour la montée en puissance de l'écosystème AJ-TECH.",
                summaryHt = "Plan travay sou 10 lane pou grandi achitekti teknoloji AJ-TECH la etap pa etap.",
                contentFr = """
                    1. Nature des projections décennales :
                    Les étapes ci-dessous constituent une vision d'ingénierie progressive et des repères stratégiques, et non des engagements contractuels rigides.
                    
                    2. Phases d'évolution progressive de l'architecture :
                    - 2026 — Stabilisation & Consolidation : Finalisation du socle logiciel documentaire, stabilisation de la PWA AJ-Task en bêta publique et durcissement des tests de non-régression.
                    - 2027–2028 — Persistance & Services locaux : Intégration de Room / DataStore sur Android, déploiement des premières APIs locales et formalisation des protocoles d'échange de données.
                    - 2029–2030 — Cloud souverain & APIs avancées : Prototypage et mise en service pilote d'AJ-Cloud pour la synchronisation multi-terminaux et ouverture de la passerelle d'APIs tierces.
                    - 2031–2033 — Infrastructure mature & Décentralisation : Déploiement de micro-centres de données résilients alimentés à l'énergie solaire et montée en charge des services éducatifs et cadastraux.
                    - 2034–2035 — Rayonnement & Fédérations régionales : Interconnexion avec les réseaux régionaux caribéens et valorisation du savoir-faire technologique haïtien sur les marchés internationaux.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan 10 lane sa a vle di :
                    Dat sa yo se yon gid estratejik ak yon vizyon travay, se pa yon pwomès kontra ki pa ka chanje.
                    
                    2. Etap kòman achitekti a pral grandi :
                    - 2026 — Estabilizasyon ak Konsolidasyon : Fini byen bati liv la ak aplikasyon an, mete PWA AJ-Task la disponib pou tout moun epi asire tout tès yo solid.
                    - 2027–2028 — Baz done ak Sèvis lokal : Mete baz done Room ak DataStore sou Android, prepare premye API yo pou aplikasyon yo ka pale ansanm.
                    - 2029–2030 — Cloud souveren ak gwo API : Kòmanse teste sèvè AJ-Cloud pou moun ka pataje done sou plizyè aparèy epi louvri zouti pou lòt devlopè.
                    - 2031–2033 — Enfrastrikti solid ak Enèji solè : Mete ti sant sèvè ki mache ak solè an Ayiti epi elaji sèvis pou lekòl (EDUKA) ak tè (AJ-Tè).
                    - 2034–2035 — Prezans nan Karayib la : Konekte sèvis nou yo ak lòt peyi nan Karayib la epi montre konpetans teknolojik jèn Ayisyen sou mache entènasyonal la.
                """.trimIndent(),
                plannedStartPage = 281,
                plannedEndPage = 283,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 60 : Vers une infrastructure technologique haïtienne ====================
            BookChapter(
                id = "ch_4_60",
                chapterNumber = 60,
                partId = "part_4",
                titleFr = "Chapitre 60 — Vers une infrastructure technologique haïtienne",
                titleHt = "Chapit 60 — Pou yon gwo enfrastrikti teknolojik ayisyen",
                subtitleFr = "Construire l'autonomie numérique, former des bâtisseurs et hisser Haïti sur l'échiquier mondial",
                subtitleHt = "Bati otonomi dijital, fòme moun ki konn travay epi mete Ayiti sou kat mondyal la",
                summaryFr = "Chapitre de clôture de la Partie IV exposant l'ambition d'une souveraineté technologique durable pour Haïti.",
                summaryHt = "Dènye chapit Pati IV la ki eksplike gwo rèv pou Ayiti kreye, kenbe epi ekspòte pwòp teknoloji pa l.",
                contentFr = """
                    1. L'ambition à long terme :
                    L'objectif ultime d'AJ-TECH n'est pas simplement de concevoir une collection d'applications logicielles, mais de poser méthodiquement les jalons d'une capacité technologique nationale durable en Haïti.
                    
                    2. Une ambition d'avenir, non une réalité achevée :
                    Cette vision ne doit en aucun cas être présentée comme une réalité déjà accomplie. Elle constitue un cap exigeant qui demandera des années de labeur acharné, de discipline intellectuelle, de formation rigoureuse et d'investissements patients.
                    
                    3. Les trois piliers de la souveraineté technologique :
                    - L'autonomie de conception : Former des ingénieurs et créateurs locaux capables d'architecturer, de programmer et d'auditer leurs propres systèmes sans dépendance servile ;
                    - La maîtrise des infrastructures : Développer progressivement des serveurs, des protocoles et des outils de sécurisation adaptés aux réalités environnementales et économiques du pays ;
                    - Le rayonnement international : Démontrer à la face du monde que la jeunesse haïtienne possède le talent, la rigueur et la créativité nécessaires pour exporter des solutions logicielles de premier plan.
                    
                    4. Conclusion de la Partie IV :
                    Le chemin vers le sommet est long et semé d'obstacles, mais la méthode est claire : coder avec rigueur, documenter avec honnêteté et bâtir sans relâche pour les générations futures.
                """.trimIndent(),
                contentHt = """
                    1. Gwo rèv pou pi devan :
                    Objektif final AJ-TECH se pa sèlman fè kèk aplikasyon, men se mete baz pou Ayiti gen kapasite teknik pou l kreye, jere epi kenbe pwòp teknoloji pa l pou tout tan.
                    
                    2. Yon gwo rèv k ap bati, pa yon bagay ki deja fini :
                    Nou pa dwe janm prezante rèv sa a kòm yon bagay ki deja reyalize jodi a. Se yon gwo misyon ki pral mande plizyè lane gwo travay, disiplin, etid solid ak pasyans.
                    
                    3. Twa gwo poto pou otonomi teknolojik la :
                    - Konpetans pou bati : Fòme jèn enjenyè ak devlopè ayisyen ki kapab ekri kòd, jere sistèm epi verifye sekirite san yo pa bezwen depann de lòt moun ;
                    - Kontwòl sou enfrastrikti : Bati ti pa ti pa sèvè, zouti ak rezo ki adapte ak kouran ak reyalite peyi a ;
                    - Fè Ayiti briye deyò : Montre tout mond lan ke jèn Ayisyen gen talan, lespri ak kapasite pou kreye bon zouti teknolojik ki ka sèvi lòt nasyon.
                    
                    4. Konklizyon Pati IV la :
                    Wout pou rive nan somè a long epi li gen anpil defi, men chemen an klè : ekri bon kòd ak disiplin, dokimante tout bagay nan laverite, epi travay san pran souf pou jenerasyon k ap vini yo.
                """.trimIndent(),
                plannedStartPage = 284,
                plannedEndPage = 285,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
