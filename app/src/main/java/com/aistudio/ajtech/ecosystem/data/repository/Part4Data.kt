package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE IV — ARCHITECTURE TECHNOLOGIQUE D'AJ-TECH
 * Chapitres 47 à 61 (Exactement 15 chapitres d'ingénierie logicielle et infrastructure).
 * Pagination : pp. 75–94 (Pagination provisoire — à confirmer lors de la mise en page finale).
 */
object Part4Data {

    val part4: BookPart = BookPart(
        id = "part_4",
        partNumber = 4,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE IV — ARCHITECTURE TECHNOLOGIQUE",
        titleHt = "PATI IV — ACHITEKTI TEKNOLOJIK AJ-TECH",
        subtitleFr = "Ingénierie logicielle, protocoles, robustesse offline et vision d'infrastructure 2026–2035",
        subtitleHt = "Enjenyri lojisyèl, pwotokòl, fonksyone san entènèt ak plan enfrastrikti 2026–2035",
        plannedPages = "pp. 75–94",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 47 : L'architecture comme fondation ====================
            BookChapter(
                id = "ch_4_47",
                chapterNumber = 47,
                partId = "part_4",
                titleFr = "Chapitre 47 — L'architecture comme fondation",
                titleHt = "Chapit 47 — Achitekti kòm fondasyon",
                subtitleFr = "Une conception logicielle cohérente, modulaire et adaptée aux réalités haïtiennes",
                subtitleHt = "Yon konsepsyon lojisyèl ki klè, modilè epi ki adapte ak reyalite peyi d Ayiti",
                summaryFr = "Présentation des principes architecturaux fondamentaux garantissant la modularité, la robustesse et l'adéquation au contexte infrastructurel haïtien.",
                summaryHt = "Prezantasyon gwo prensip achitekti ki garanti sistèm nan byen separe, solid epi adapte ak kontèks difisil Ayiti a.",
                contentFr = """
                    1. L'architecture au cœur de la pérennité :
                    Une architecture logicielle n'est pas un simple assemblage d'outils techniques à la mode ; elle constitue la colonne vertébrale garantissant qu'un système peut grandir sans s'effondrer sous son propre poids. Pour AJ-TECH, concevoir l'architecture comme fondation signifie bâtir des structures claires, documentées et découpées en responsabilités précises.
                    
                    2. Adaptation aux réalités haïtiennes :
                    Développer en Haïti impose des contraintes spécifiques que les architectures occidentales traditionnelles ignorent souvent :
                    - Instabilité énergétique récurrente et coupures d'électricité ;
                    - Connectivité internet intermittente, coûteuse ou à bande passante réduite ;
                    - Hétérogénéité du parc de terminaux mobiles avec prédominance d'appareils aux ressources mémoires limitées.
                    L'architecture d'AJ-TECH intègre ces contraintes dès le premier jour par la légèreté du code, l'autonomie locale et la résilience matérielle.
                    
                    3. Modularité et découplage :
                    Chaque composant applicatif est conçu comme une brique indépendante reliée par des interfaces stables. Cette modularité permet de faire évoluer un sous-système (par exemple le moteur de stockage ou l'interface utilisateur) sans risquer de déstabiliser l'ensemble de l'écosystème des 22 entités.
                    
                    4. Trajectoire d'évolution transparente :
                    - 🟢 Opérationnel : Architecture modulaire de l'application compagnon mobile (Kotlin, Jetpack Compose, MVVM) ;
                    - 🟡 En développement / Prototype : Architecture PWA pour AJ-Task ;
                    - 🔵 Concept : Passerelle unifiée d'interconnexion de l'écosystème ;
                    - ⚪ Vision future : Infrastructure décentralisée multisite sur le territoire national.
                """.trimIndent(),
                contentHt = """
                    1. Achitekti se fondasyon tout bagay :
                    Yon bon achitekti lojisyèl se pa sèlman chwazi dènye zouti alamòd yo ; se fondasyon ki pèmèt yon sistèm grandi san li pa kraze. Pou AJ-TECH, konsidere achitekti a kòm yon fondasyon vle di kreye estrikti ki klè, byen dokimante epi kote chak pati gen yon wòl egzak.
                    
                    2. Adapte ak reyalite peyi d Ayiti :
                    Kreye lojisyèl pou Ayiti mande pou nou pran an kont difikilte espesyal ki genyen nan peyi a :
                    - Kouran ki koupe souvan ak pwoblèm enèji ;
                    - Entènèt ki pa toujou la, ki koute chè oswa ki pa gen gwo debi ;
                    - Telefòn ki pa gen gwo memwa oswa gwo processeur.
                    Achitekti AJ-TECH la pran tout bagay sa yo an kont depi nan premye liy kòd la gras ak yon kòd ki lejè epi ki kapab travay san entènèt.
                    
                    3. Sistèm modilè ki separe byen :
                    Chak pati nan aplikasyon an fèt tankou yon blòk endepandan ki konekte ak lòt yo gras ak kòmand klè. Sa pèmèt nou chanje yon pati nan kòd la san nou pa kraze rès 22 antite yo.
                    
                    4. Eta reyèl pwojè a an tout transparans :
                    - 🟢 Sa k ap mache jodi a : Achitekti modilè aplikasyon referans lan (Kotlin, Compose, MVVM) ;
                    - 🟡 Pwototip k ap devlope : Achitekti PWA pou AJ-Task ;
                    - 🔵 Konsèp : Pòtay inifye pou konekte tout sistèm nan ;
                    - ⚪ Vizyon pou lavni : Enfrastrikti distribye nan plizyè zòn nan peyi a.
                """.trimIndent(),
                plannedStartPage = 75,
                plannedEndPage = 76,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 48 : Progressive Web Apps et accessibilité ====================
            BookChapter(
                id = "ch_4_48",
                chapterNumber = 48,
                partId = "part_4",
                titleFr = "Chapitre 48 — Progressive Web Apps et accessibilité",
                titleHt = "Chapit 48 — Progressive Web Apps ak aksè pou tout moun",
                subtitleFr = "PWA, installation universelle, responsive design, faible consommation et multiplateforme",
                subtitleHt = "PWA, enstalasyon fasil sou tout aparèy, konsepsyon fleksib ak lekti pou tout moun",
                summaryFr = "Exploration du modèle Progressive Web App (PWA) garantissant l'accès universel, l'installation sans friction et la frugalité numérique.",
                summaryHt = "Eksplikasyon sou fason PWA pèmèt aplikasyon yo louvri sou nenpòt aparèy san telechajman lou epi san gaspiye entènèt.",
                contentFr = """
                    1. Le modèle Progressive Web App (PWA) :
                    Une PWA combine le meilleur du Web et des applications natives. Accessible directement via une simple URL, elle offre une expérience fluide, peut être installée sur l'écran d'accueil sans passer par des magasins d'applications lourds, et fonctionne même en cas de rupture de réseau.
                    
                    2. Frugalité et faible consommation :
                    Dans le contexte haïtien où le coût des données mobiles (data) pèse lourdement sur le budget des utilisateurs, les PWA permettent une réduction drastique de la taille des téléchargements (souvent moins de 5 Mo contre 50 à 100 Mo pour une application native classique) et optimisent la consommation de batterie.
                    
                    3. Responsive Design et accessibilité universelle :
                    L'interface s'adapte automatiquement à toutes les résolutions : smartphones d'entrée de gamme, tablettes, ordinateurs de bureau ou navigateurs allégés. L'accessibilité inclut également le respect des contrastes de couleurs, la taille minimale des zones tactiles (≥48dp) et la compatibilité avec les lecteurs d'écran.
                    
                    4. Application concrète au sein d'AJ-TECH :
                    - 🟢 Opérationnel : Principes d'accessibilité et de design réactif dans l'application compagnon Android ;
                    - 🟡 En développement / Prototype : Prototype PWA d'AJ-Task avec Service Workers et manifeste web pour installation directe ;
                    - ⚪ Vision future : Déploiement multiplateforme universel des interfaces de gestion citoyenne et éducative.
                """.trimIndent(),
                contentHt = """
                    1. Kisa yon PWA (Progressive Web App) ye :
                    Yon PWA pran sa ki pi bon nan sitwèb ak aplikasyon telefòn. Li louvri fasil nan navigatè a gras ak yon lyen, li ka enstale sou ekran telefòn nan san pase pa magazen aplikasyon lou, epi li mache menm lè pa gen rezo.
                    
                    2. Ekonomi entènèt ak batri :
                    Nan peyi d Ayiti kote pri megabayt chè anpil, PWA ede moun telechaje aplikasyon ki peze mwens pase 5 Mo olye de gwo fichye 100 Mo, epi li pa fini batri telefòn nan rapid.
                    
                    3. Konsepsyon ki adapte ak tout kalite ekran :
                    Ekran an adapte otomatikman kit se sou yon ti telefòn senp, yon tablèt oswa yon gwo òdinatè. Nou mete bouton ki fasil pou peze ak dwèt (omwen 48dp), bèl koulè ki pa fatige je, epi sipò pou moun ki gen pwoblèm vizyon.
                    
                    4. Eta pwojè a nan AJ-TECH :
                    - 🟢 Sa k ap mache jodi a : Prensip aksè ak bèl ekran ki adapte nan aplikasyon Android referans lan ;
                    - 🟡 Pwototip k ap devlope : Pwototip PWA pou AJ-Task ak Service Workers pou enstale dirèkteman ;
                    - ⚪ Vizyon pou lavni : PWA disponib pou tout sistèm lekòl ak sèvis piblik yo.
                """.trimIndent(),
                plannedStartPage = 76,
                plannedEndPage = 77,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 49 : L'approche Offline-First ====================
            BookChapter(
                id = "ch_4_49",
                chapterNumber = 49,
                partId = "part_4",
                titleFr = "Chapitre 49 — L'approche Offline-First",
                titleHt = "Chapit 49 — Apwòch Offline-First",
                subtitleFr = "Garantir des applications pleinement fonctionnelles malgré les connexions faibles ou interrompues",
                subtitleHt = "Fè aplikasyon yo fonksyone nèt ale menm lè pa gen kouran oswa entènèt",
                summaryFr = "Principes d'ingénierie Offline-First : considérer la connectivité comme une amélioration temporaire et non un prérequis obligatoire.",
                summaryHt = "Prensip Offline-First : konsidere entènèt kòm yon bonis k ap pase, pandan tout travay aplikasyon an fèt sou aparèy la an premye.",
                contentFr = """
                    1. Le paradigme Offline-First :
                    Dans les architectures traditionnelles, l'application effectue une requête au serveur distant pour chaque action utilisateur et bloque l'interface si la connexion échoue. L'approche Offline-First inverse fondamentalement ce modèle : toute opération (lecture, écriture, modification) s'exécute d'abord localement sur l'appareil de l'utilisateur avec zéro latence.
                    
                    2. Une nécessité absolue en Haïti :
                    En contexte haïtien, l'absence de réseau n'est pas une anomalie passagère, mais un état nominal fréquent. Une application qui affiche un écran blanc ou un cercle de chargement infini dès que la 4G faiblit est inutilisable au quotidien. Avec l'Offline-First, l'utilisateur continue de gérer ses tâches, lire ses cours ou consulter ses fiches sans interruption.
                    
                    3. Architecture des Service Workers et de la mise en cache :
                    Le Service Worker intercepte toutes les requêtes réseau au niveau du navigateur, servant les ressources critiques depuis le cache local (Cache Storage API) et garantissant un démarrage instantané en mode hors-ligne.
                    
                    4. Trajectoire d'implémentation :
                    - 🟢 Opérationnel : Fonctionnement 100% autonome et hors-ligne de l'application compagnon Android (corpus complet de 165 chapitres embarqué) ;
                    - 🟡 En développement / Prototype : Cache intelligent Service Worker dans le prototype AJ-Task ;
                    - ⚪ Vision future : Réplication de données peer-to-peer en réseau local d'urgence (Mesh / Wi-Fi direct).
                """.trimIndent(),
                contentHt = """
                    1. Prensip Offline-First la :
                    Nan vye fason yo te konn pwograme, chak fwa yon moun klike sou yon bouton, telefòn nan oblije voye mande yon sèvè lòt bò dlo repons. Si pa gen entènèt, tout bagay bloke. Apwòch Offline-First la chanje sa nèt : tout sa w ap fè (li, ekri, chanje) fèt dirèkteman sou telefòn ou an premye san tann anyen.
                    
                    2. Yon bezwen endispansab pou Ayiti :
                    Nan peyi nou, mank entènèt se pa yon bagay ki rive pa aksidan, se yon reyalite chak jou. Yon aplikasyon ki rete ap vire nan vid depi rezo a febli pa ka sèvi moun. Gras ak Offline-First, moun nan kontinye travay, li liv li oswa jere aktivite l san pwoblèm.
                    
                    3. Kijan Service Workers ede nan sa :
                    Zouti Service Worker la aji tankou yon gadyen nan navigatè a : depi li wè pa gen entènèt, li pran paj ak fichye li te deja sere nan memwa aparèy la pou louvri aplikasyon an touswit.
                    
                    4. Eta pwojè a nan AJ-TECH :
                    - 🟢 Sa k ap mache jodi a : Aplikasyon Android referans lan mache 100% san bezwen yon grenn koneksyon entènèt ;
                    - 🟡 Pwototip k ap devlope : Sistèm kach Service Worker nan pwototip AJ-Task ;
                    - ⚪ Vizyon pou lavni : Pataje done dirèkteman ant de telefòn san pase sou entènèt (Wi-Fi lokal).
                """.trimIndent(),
                plannedStartPage = 77,
                plannedEndPage = 79,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 50 : Stockage local et IndexedDB ====================
            BookChapter(
                id = "ch_4_50",
                chapterNumber = 50,
                partId = "part_4",
                titleFr = "Chapitre 50 — Stockage local et IndexedDB",
                titleHt = "Chapit 50 — Depo lokal ak IndexedDB",
                subtitleFr = "Persistance robuste, moteurs de bases de données locales, cache et intégrité",
                subtitleHt = "Sere done sou aparèy la, baz done lokal, memwa kach ak sekirite enfòmasyon yo",
                summaryFr = "Étude des mécanismes de persistance locale : IndexedDB sur le Web/PWA, Room et DataStore sur Android pour des données fiables et résilientes.",
                summaryHt = "Eksplikasyon sou kijan nou sere done sou aparèy la ak IndexedDB sou wèb epi Room sou Android pou anyen pa janm pèdi.",
                contentFr = """
                    1. Les impératifs de la persistance locale :
                    Pour soutenir l'approche Offline-First, le stockage local doit offrir des garanties ACID (Atomicité, Cohérence, Isolation, Durabilité), une capacité volumétrique suffisante et des temps d'accès quasi instantanés, sans risque de corruption lors d'un arrêt brutal de l'appareil.
                    
                    2. IndexedDB pour l'environnement Web et PWA :
                    IndexedDB est une base de données NoSQL transactionnelle et asynchrone intégrée nativement dans les navigateurs modernes. Elle permet de stocker des objets structurés complexes, des index de recherche et des volumes significatifs de données sans bloquer le fil d'exécution principal (UI Thread).
                    
                    3. Room et DataStore pour l'écosystème Android natif :
                    Sur plateforme Android native, AJ-TECH privilégie la bibliothèque Room (couche d'abstraction SQLite sécurisée au typage) et Jetpack DataStore pour les préférences utilisateurs et les configurations de langue bilingue.
                    
                    4. État des technologies et intégrité :
                    - 🟢 Opérationnel : Modèles de données immuables typés et gestionnaires de session dans l'application compagnon ;
                    - 🟡 En développement / Prototype : Schéma IndexedDB avec clés auto-générées pour les tâches d'AJ-Task ;
                    - ⚪ Vision future : Chiffrement matériel AES-256 transparent de l'ensemble des bases locales embarquées.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa depo lokal la enpòtan konsa :
                    Pou yon aplikasyon ka travay san entènèt, fòk li gen yon bon kote pou l sere done yo sou aparèy la. Depo sa a dwe solid, li dwe rapid, epi menm si telefòn nan ta etenn britsoukou paske batri a fini, okenn done pa dwe pèdi oswa gate.
                    
                    2. IndexedDB sou entènèt ak PWA :
                    IndexedDB se yon vrè ti baz done ki andedan navigatè a. Li pèmèt aplikasyon an sere anpil enfòmasyon san l pa ralanti telefòn nan, epi li ka klase done yo pou jwenn yo fasil.
                    
                    3. Room ak DataStore sou Android :
                    Pou aplikasyon Android yo, nou itilize Room (ki bati sou SQLite) ak DataStore pou sere chwa itilizatè a (tankou lang Kreyòl oswa Fransè) an sekirite.
                    
                    4. Eta pwojè a an tout transparans :
                    - 🟢 Sa k ap mache jodi a : Modèl done ki pa ka gate ak depo memwa nan aplikasyon Android referans lan ;
                    - 🟡 Pwototip k ap devlope : Estrikti IndexedDB pou sere lis travay nan AJ-Task ;
                    - ⚪ Vizyon pou lavni : Chifreman otomatik pou tout baz done lokal yo pou pèsonn pa ka vòlè done yo.
                """.trimIndent(),
                plannedStartPage = 79,
                plannedEndPage = 80,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 51 : Synchronisation et gestion des conflits ====================
            BookChapter(
                id = "ch_4_51",
                chapterNumber = 51,
                partId = "part_4",
                titleFr = "Chapitre 51 — Synchronisation et gestion des conflits",
                titleHt = "Chapit 51 — Senkronizasyon ak jesyon konfli",
                subtitleFr = "Synchronisation locale/cloud, résolution de conflits, cohérence à terme et reprise sur reconnexion",
                subtitleHt = "Konekte done lokal ak sèvè, rezoud lè gen de moun ki chanje menm bagay la, ak rekoneksyon",
                summaryFr = "Mécanismes de synchronisation bidirectionnelle résiliente et stratégies de résolution de conflits pour maintenir la cohérence des données.",
                summaryHt = "Fason pou voye done sou sèvè lè entènèt retounen san anyen pa efase pa erè lè plizyè moun ap travay.",
                contentFr = """
                    1. La problématique de la synchronisation asynchrone :
                    Dès lors que plusieurs appareils modifient des données en mode déconnecté, la reconnexion au réseau pose le défi critique de la réconciliation : quelles modifications prévalent ? Comment fusionner les changements sans écraser de données légitimes ?
                    
                    2. Stratégies de réconciliation :
                    - Horodatage vectoriel et réplication optimiste : application immédiate en local, puis mise en file d'attente sécurisée pour envoi différé ;
                    - Stratégie du « Last Write Wins » (LWW) pour les entités simples : la dernière mise à jour validée par l'horloge logique l'emporte ;
                    - Structures CRDT (Conflict-free Replicated Data Types) pour les documents collaboratifs complexes (notes, inventaires).
                    
                    3. Reprise après reconnexion (Background Sync API) :
                    L'architecture prévoit l'écoute des événements de connectivité du système d'exploitation. Dès qu'un réseau stable est détecté, un travailleur d'arrière-plan (WorkManager sur Android, Background Sync sur Web) vide la file de synchronisation de manière transparente.
                    
                    4. Niveau de maturité :
                    - 🟢 Opérationnel : Détection de l'état réseau et navigation fluide hors-ligne ;
                    - 🟡 En développement / Prototype : File d'attente d'actions locales pour réémission différée dans AJ-Task ;
                    - ⚪ Vision future : Algorithmes de consensus distribué pour synchronisation multi-nœuds régionaux.
                """.trimIndent(),
                contentHt = """
                    1. Pwoblèm senkronizasyon lè pa gen entènèt tout tan :
                    Lè yon moun travay sou telefòn li san entènèt epi yon lòt moun fè menm bagay la sou yon lòt aparèy, lè entènèt la retounen, sistèm nan dwe konnen ki enfòmasyon ki bon pou l pa efase travay pèsonn pa erè.
                    
                    2. Fason pou rezoud konfli nan done yo :
                    - Mete lè ak dat sou chak chanjman : aplikasyon an anrejistre chanjman an touswit sou telefòn nan, epi li mete l nan yon lis pou voye l pita ;
                    - Règ dènye chanjman ki fèt la : pou bagay senp, dènye moun ki modifye a se vèsyon l lan ki rete ;
                    - Zouti avanse CRDT : pou dokiman kote plizyè moun ap ekri ansanm san youn pa kraze travay lòt.
                    
                    3. Retounen voye done lè rezo a parèt :
                    Sistèm nan veye lè entènèt la retounen. Kou rezo a bon, yon ti pwogram nan background (WorkManager sou Android oswa Background Sync sou wèb) voye tout sa ki te anreta san deranje itilizatè a.
                    
                    4. Nivo avansman an tout verite :
                    - 🟢 Sa k ap mache jodi a : Deteksyon rezo ak aplikasyon ki fonksyone nèt offline ;
                    - 🟡 Pwototip k ap devlope : Lis aksyon ki pare pou voye lè koneksyon retounen nan AJ-Task ;
                    - ⚪ Vizyon pou lavni : Senkronizasyon konplè ant tout sèvè nan divès depatman nan peyi a.
                """.trimIndent(),
                plannedStartPage = 80,
                plannedEndPage = 82,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 52 : API REST et services numériques ====================
            BookChapter(
                id = "ch_4_52",
                chapterNumber = 52,
                partId = "part_4",
                titleFr = "Chapitre 52 — API REST et services numériques",
                titleHt = "Chapit 52 — API REST ak sèvis nimerik",
                subtitleFr = "Communication inter-applications, contrats d'interface, sécurité des endpoints et versionnement",
                subtitleHt = "Kominikasyon ant aplikasyon yo, estanda API, sekirite pòt antre yo ak jesyon vèsyon",
                summaryFr = "Conception des interfaces de programmation applicative (API REST) reliant les 22 entités d'AJ-TECH avec sécurité, clarté et frugalité.",
                summaryHt = "Fason nou bati API REST pou pèmèt 22 antite AJ-TECH yo pale ansanm nan sekirite ak bon jan estanda.",
                contentFr = """
                    1. Les APIs comme artères de l'écosystème :
                    Les interfaces de programmation applicative et les services API REST permettent aux 22 entités de l'écosystème de dialoguer de façon standardisée sans créer de dépendances monolithiques enchevêtrées.
                    
                    2. Principes de conception RESTful chez AJ-TECH :
                    - Utilisation sémantique stricte des verbes HTTP (GET, POST, PUT, PATCH, DELETE) au sein de chaque API REST ;
                    - Formats de données JSON épurés et compressés (GZIP/Brotli) pour minimiser la consommation de bande passante ;
                    - Codes de statut HTTP normalisés (200 OK, 201 Created, 400 Bad Request, 401 Unauthorized, 404 Not Found, 500 Error) ;
                    - Pagination obligatoire pour toutes les listes de données volumineuses.
                    
                    3. Authentification et sécurité des points d'accès :
                    Chaque requête protégée requiert un jeton cryptographique éphémère (JWT / OAuth2). Les points d'entrée appliquent une limitation de débit (Rate Limiting) pour prévenir les attaques par déni de service et les abus.
                    
                    4. Versionnement et rétrocompatibilité :
                    Pour garantir que les anciennes versions d'applications mobiles continuent de fonctionner sans forcer des mises à jour coûteuses en data pour les utilisateurs, les services API REST intègrent un versionnement explicite dans l'URI (`/api/v1/`, `/api/v2/`).
                """.trimIndent(),
                contentHt = """
                    1. Wòl API yo nan ekosistèm nan :
                    Sèvis API REST (Application Programming Interface) se tankou wout ki pèmèt 22 antite yo pale youn ak lòt san youn pa depann twòp de lòt nan yon sèl gwo blòk difisil pou repare.
                    
                    2. Prensip REST nou respekte :
                    - Itilize kòmand estanda HTTP (GET pou li, POST pou kreye, PUT/PATCH pou chanje, DELETE pou efase) nan tout API REST nou yo ;
                    - Fòma done JSON ki lejè anpil pou pa gaspiye entènèt moun yo ;
                    - Mesaj erè klè ak kòd estanda entènasyonal ;
                    - Koupe lis ki long yo an ti paj pou yo pa lou pou ouvri.
                    
                    3. Sekirite ak kontwòl aksè :
                    Tout kominikasyon ki gen done prive mande yon kle sekirite espesyal (Token JWT). Gen baryè pou anpeche moun atake oswa voye twòp demann pou bloke sistèm nan.
                    
                    4. Jesyon vèsyon pou pa bloke ansyen telefòn :
                    Nou mete nimewo vèsyon nan lyen API REST yo (`/api/v1/`) pou menm si nou mete nouvo zouti, moun ki gen ansyen vèsyon aplikasyon an ka kontinye sèvi avè l san pwoblèm.
                """.trimIndent(),
                plannedStartPage = 82,
                plannedEndPage = 83,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 53 : Architecture modulaire de l'écosystème ====================
            BookChapter(
                id = "ch_4_53",
                chapterNumber = 53,
                partId = "part_4",
                titleFr = "Chapitre 53 — Architecture modulaire de l'écosystème",
                titleHt = "Chapit 53 — Achitekti modilè ekosistèm nan",
                subtitleFr = "Modules indépendants, interfaces standardisées, réutilisation et réduction de la dette technique",
                subtitleHt = "Blòk kòd ki endepandan, zouti pataje, re-itilize sa k bon epi evite kòd sal",
                summaryFr = "Organisation architecturale en modules autonomes et réutilisables au sein des 22 entités pour assurer la robustesse et la maintenabilité.",
                summaryHt = "Fason nou òganize kòd la an ti moso endepandan pou fasilite devlopman tout 22 antite yo san konplikasyon.",
                contentFr = """
                    1. Le piège du monolithe face à la complexité :
                    Développer un écosystème ambitieux de 22 entités sans une rigoureuse modularité conduit inévitablement à un code « spaghetti » où la moindre modification sur une entité (comme AJ-Pay) risque de casser une entité non liée (comme AJ-Learn).
                    
                    2. Piliers de la modularisation :
                    - Isolation des domaines : chaque entité dispose de ses propres modèles et logiques métiers ;
                    - Modules partagés (Shared Core) : mutualisation des utilitaires universels (thème de design M3, gestionnaires de dates, algorithmes de normalisation bilingue, composants d'accessibilité) ;
                    - Inversion de dépendance : les modules de haut niveau ne dépendent pas des modules de bas niveau, mais d'abstractions (interfaces).
                    
                    3. Architecture des repositories dans le Livre Compagnon :
                    L'application de référence démontre concrètement cette modularité : le corpus littéraire est scindé en modules autonomes (`Part1Data` à `Part11Data`) agrégés par un `BookRepository` unifié, évitant les fichiers géants et optimisant les temps de compilation Gradle.
                    
                    4. État de mise en œuvre :
                    - 🟢 Opérationnel : Découpage modulaire strict de l'application Android et de ses référentiels de données ;
                    - 🟡 En développement / Prototype : Bibliothèque de composants UI partagés pour le Web ;
                    - ⚪ Vision future : Architecture en micro-frontends et microservices conteneurisés pour l'ensemble des plateformes cloud.
                """.trimIndent(),
                contentHt = """
                    1. Danje ki genyen lè tout bagay melanje nan yon sèl gwo blòk :
                    Bati yon gwo ekosistèm ki gen 22 antite mande anpil lòd nan kòd la. Si tout bagay melanje, yon ti chanjman nan AJ-Pay ka vin kraze AJ-Learn san pèsonn pa konprann poukisa.
                    
                    2. Prensip modilarite nou aplike :
                    - Chak pwojè apa : chak antite gen règ pa l ak fason pa l pou fonksyone ;
                    - Zouti pataje (Core) : nou mete ansanm sa tout moun bezwen (koulè, fason pou ekri dat, zouti pou jere Kreyòl ak Fransè) ;
                    - Pwoteje kòd la : pati ki pi enpòtan yo pa dwe depann de ti detay ki ka chanje nenpòt lè.
                    
                    3. Egzanp pratik nan aplikasyon liv sa a :
                    Aplikasyon n ap li a montre sa byen : olye nou mete tout liv la nan yon sèl gwo fichye ki t ap twò lou, nou separe l an plizyè modil (`Part1Data` rive `Part11Data`) epi `BookRepository` mete yo ansanm san fòse.
                    
                    4. Nivo avansman aktyèl la :
                    - 🟢 Sa k ap mache jodi a : Separasyon kòd la an modil pwòp nan aplikasyon Android referans lan ;
                    - 🟡 Pwototip k ap devlope : Bibliyotèk bèl bouton ak eleman grafik pataje sou wèb ;
                    - ⚪ Vizyon pou lavni : Mikwosèvis ak ti blòk kòd ki ka travay sou nenpòt gwo sèvè nan nwaj la.
                """.trimIndent(),
                plannedStartPage = 83,
                plannedEndPage = 85,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 54 : Applications Android et Jetpack Compose ====================
            BookChapter(
                id = "ch_4_54",
                chapterNumber = 54,
                partId = "part_4",
                titleFr = "Chapitre 54 — Applications Android et Jetpack Compose",
                titleHt = "Chapit 54 — Aplikasyon Android ak Jetpack Compose",
                subtitleFr = "Kotlin, Jetpack Compose, Material 3, MVVM, gestion d'état et accessibilité native",
                subtitleHt = "Kotlin, Jetpack Compose, Material 3, achitekti MVVM, jesyon eta ak lekti fasil",
                summaryFr = "Ingénierie de l'application native Android : paradigme déclaratif Jetpack Compose, architecture MVVM et respect strict des standards Material 3.",
                summaryHt = "Eksplikasyon sou fason nou bati aplikasyon Android la ak Kotlin, Jetpack Compose ak MVVM pou l bèl, rapid epi fasil pou itilize.",
                contentFr = """
                    1. Le choix de Kotlin et de Jetpack Compose :
                    Pour les applications mobiles natives, AJ-TECH adopte Kotlin et Jetpack Compose. Ce framework moderne remplace les anciens fichiers de mise en page XML par une approche déclarative où l'interface réagit directement aux flux de données immuables.
                    
                    2. L'architecture MVVM (Model-View-ViewModel) :
                    - Model : Représente les entités de données pures et immuables (`BookChapter`, `EcosystemEntity`) ;
                    - ViewModel : Détient et expose l'état de l'interface via des flux réactifs (`StateFlow`), protégeant l'état des reconstitutions d'écran lors des rotations ;
                    - View (Composables) : Fonctions pures décrivant l'affichage en fonction de l'état fourni, sans logique métier directe.
                    
                    3. Respect rigoureux de Material 3 :
                    L'application compagnon applique la charte graphique officielle d'AJ-TECH :
                    - Bleu Nuit Institutionnel (`#0A192F`), Or Solaire (`#FFD700`), Rouge Haïtien (`#D21034`) ;
                    - Typographie soignée favorisant la lisibilité prolongée du créole haïtien et du français ;
                    - Cibles tactiles d'au moins 48dp conformes aux normes d'accessibilité Android.
                    
                    4. Performance et fluidité :
                    Utilisation de `LazyColumn` avec des clés stables (`key = { it.id }`) pour un défilement à 60/120 images par seconde même sur des listes comprenant des centaines de chapitres ou d'entités.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou chwazi Kotlin ak Jetpack Compose :
                    Pou aplikasyon Android yo, AJ-TECH chwazi Kotlin ak Jetpack Compose. Fason modèn sa a pèmèt nou desine ekran yo ak kòd senp kote ekran an chanje otomatikman lepli vit ke done yo chanje, san kouri dèyè vye fichye XML konplike.
                    
                    2. Achitekti MVVM (Model-View-ViewModel) :
                    - Model : Done yo menm ki pa ka chanje san kontwòl (`BookChapter`, `EcosystemEntity`) ;
                    - ViewModel : Pati ki kenbe eta ekran an pou l pa pèdi lè w vire telefòn nan ;
                    - View (Composables) : Ti moso kòd ki montre bèl bouton, tèks ak imaj sou ekran an.
                    
                    3. Respekte estanda Material 3 :
                    Aplikasyon referans lan gen bèl koulè ofisyèl AJ-TECH yo :
                    - Ble Nwa Pwofon (`#0A192F`), Lò Solèy (`#FFD700`), Wouj Ayisyen (`#D21034`) ;
                    - Bèl lèt ki klè pou moun ka li liv la swa an Kreyòl swa an Fransè san je yo pa fatige ;
                    - Bouton omwen 48dp pou fasil peze ak dwèt.
                    
                    4. Vitès ak jan l glise byen sou ekran :
                    Itilize `LazyColumn` ak kle espesyal pou ekran an pa janm bloke oswa ralanti menm lè gen plizyè santèn chapit oswa antite k ap desann.
                """.trimIndent(),
                plannedStartPage = 85,
                plannedEndPage = 87,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 55 : Cloud et infrastructure numérique ====================
            BookChapter(
                id = "ch_4_55",
                chapterNumber = 55,
                partId = "part_4",
                titleFr = "Chapitre 55 — Cloud et infrastructure numérique",
                titleHt = "Chapit 55 — Cloud ak enfrastrikti nimerik",
                subtitleFr = "Cloud computing, hébergement, stockage distribué, disponibilité et maîtrise des coûts",
                subtitleHt = "Teknoloji Cloud, kote yo sere done sou entènèt, sekirite ak kontwòl depans",
                summaryFr = "Panorama des architectures cloud contemporaines et des impératifs d'ingénierie pour héberger des services numériques fiables et économiques.",
                summaryHt = "Eksplikasyon sou kijan enfrastrikti cloud fonksyone ak fason pou jere sèvè san fè twòp depans.",
                contentFr = """
                    1. Fondements du Cloud Computing :
                    Le cloud computing permet de louer à la demande des capacités de calcul (CPU/GPU), du stockage d'objets, des bases de données managées et des réseaux sécurisés sans devoir acquérir et maintenir des serveurs physiques dès le premier jour.
                    
                    2. Modèles de déploiement et conteneurisation :
                    Pour éviter tout verrouillage propriétaire (Vendor Lock-in), AJ-TECH préconise des architectures basées sur des standards ouverts :
                    - Conteneurisation Docker pour encapsuler chaque service avec ses dépendances exactes ;
                    - Orchestration légère pour assurer la haute disponibilité et le redémarrage automatique en cas de défaillance ;
                    - Déploiement sans serveur (Serverless) pour les micro-tâches à exécution ponctuelle afin de réduire les coûts opérationnels.
                    
                    3. Maîtrise des coûts dans une économie en émergence :
                    L'infrastructure doit être calibrée avec une rigueur financière absolue. Chaque dollar investi dans l'hébergement doit correspondre à une valeur d'usage réelle, en exploitant d'abord les quotas gratuits et les architectures frugales avant toute montée en charge.
                    
                    4. État d'avancement réel :
                    - 🟢 Opérationnel : Architecture 100% autonome locale ne générant aucun coût serveur pour l'application compagnon ;
                    - 🔵 Concept : Schéma d'infrastructure conteneurisée pour les futurs backends d'AJ-Task et AJ-Pay ;
                    - ⚪ Vision future : grappe de serveurs distribués à l'échelle régionale.
                """.trimIndent(),
                contentHt = """
                    1. Kisa Cloud Computing vle di :
                    Cloud la se lwe espas nan gwo òdinatè (sèvè) lòt bò dlo pou sere done, kouri pwogram ak jere baz done san ou pa bezwen achte gwo machin ki chè anpil depi premye jou a.
                    
                    2. Fason pou kòd la pa bloke nan men yon sèl konpayi :
                    Pou AJ-TECH pa janm depann de yon sèl founisè sèvè, nou itilize zouti estanda ouvè :
                    - Bwat Docker pou mete chak pwogram ak tout sa l bezwen pou l mache ;
                    - Sistèm ki relanse pwogram nan otomatikman si yon ti machin ta vin gen pwoblèm ;
                    - Pwogram Serverless ki kouri sèlman lè gen moun ki mande yon bagay pou pa peye sèvè k ap vire pou anyen.
                    
                    3. Jere kòb ak bidjè a byen :
                    Fòk nou kalkile chak kòb nou depanse nan enfrastrikti ak anpil atansyon. Nou kòmanse ak sa k gratis oswa ki pa koute chè anvan nou grandi.
                    
                    4. Eta pwojè a an tout verite :
                    - 🟢 Sa k ap mache jodi a : Aplikasyon referans lan mache 100% sou aparèy la san depanse yon goud nan sèvè ;
                    - 🔵 Konsèp : Plan teknik pou sèvè backend AJ-Task ak AJ-Pay ;
                    - ⚪ Vizyon pou lavni : Rezo gwo sèvè nan peyi a ak nan Karayib la.
                """.trimIndent(),
                plannedStartPage = 87,
                plannedEndPage = 88,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 56 : Vers un cloud souverain haïtien ====================
            BookChapter(
                id = "ch_4_56",
                chapterNumber = 56,
                partId = "part_4",
                titleFr = "Chapitre 56 — Vers un cloud souverain haïtien",
                titleHt = "Chapit 56 — Vè yon cloud souvren ayisyen",
                subtitleFr = "Souveraineté numérique, hébergement local, centres de données et résilience territoriale",
                subtitleHt = "Souverènte nimerik, kenbe done lakay nou, sant sèvè ak sekirite nasyonal",
                summaryFr = "Vision prospective et feuille de route pour l'émergence d'une infrastructure cloud souveraine implantée sur le sol haïtien.",
                summaryHt = "Gwo vizyon ak plan pou pi devan pou Ayiti ka gen pwòp gwo sant sèvè pa l pou pwoteje done nasyonal yo.",
                contentFr = """
                    1. L'enjeu stratégique de la souveraineté numérique :
                    Un pays dont 100% des données citoyennes, bancaires, médicales et éducatives sont hébergées sur des serveurs étrangers dépend entièrement de la bienveillance d'acteurs tiers et des liaisons sous-marines internationales. La souveraineté numérique est une condition incontournable de la souveraineté nationale au XXIe siècle.
                    
                    2. Une vision et une trajectoire future (Transparence) :
                    Il convient d'être parfaitement clair et transparent : AJ-TECH ne dispose pas aujourd'hui d'un cloud souverain physique opérationnel. Ce projet (AJ-Cloud) représente un cap stratégique décennal (2026–2035) nécessitant des investissements majeurs en génie électrique, solaire, refroidissement et télécommunications.
                    
                    3. Les défis d'un datacenter sur le sol haïtien :
                    - Autonomie énergétique 24/7 : couplage solaire photovoltaïque, batteries industrielles et groupes électrogènes de secours ;
                    - Connectivité redondante : multiples sorties fibre optique et liaisons satellitaires géostationnaires / LEO ;
                    - Sécurité physique et protection contre les catastrophes naturelles (séismes, cyclones).
                    
                    4. Feuille de route progressive :
                    - 2026–2028 : Études de faisabilité technique et micro-datacenters pilotes à faible consommation ;
                    - 2029–2032 : Déploiement du premier centre de données éco-responsable certifié en Haïti ;
                    - 2033–2035 : Interconnexion des institutions publiques et privées haïtiennes au sein du cloud souverain AJ-Cloud.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa souverènte nimerik la enpòtan pou peyi a :
                    Yon peyi kote tout done labank, lopital, lekòl ak leta sere lòt bò dlo nan men etranje se yon peyi ki pa gen kontwòl sou avni l. Si kab anba lanmè a ta koupe, tout bagay rete bloke. Se poutèt sa nou dwe travay pou n ka gen pwòp sèvè pa nou lakay nou.
                    
                    2. Yon vizyon ak yon objektif pou pi devan (San manti) :
                    Nou dwe di sa aklè san kache anyen : AJ-TECH pa gen yon gwo sant sèvè souvren ki deja konstwi jodi a. Pwojè sa a (AJ-Cloud) se yon gwo vizyon pou 10 lane k ap vini yo (2026–2035) ki pral mande anpil kòb, bon kouran solèy ak gwo enjenyè.
                    
                    3. Defi pou bati yon sant sèvè an Ayiti :
                    - Kouran 24 sou 24 : panno solèy, gwo batri ak dèlko pou sèvè yo pa janm etenn ;
                    - Entènèt ki gen plizyè wout sekirite : plizyè liy fib optik ak satelit ;
                    - Pwoteje batiman an kont tranblemanntè ak siklòn.
                    
                    4. Plan etap pa etap :
                    - 2026–2028 : Fè etid teknik epi teste premye ti sèvè ki pa pran anpil kouran ;
                    - 2029–2032 : Bati premye vrè ti sant sèvè solè nan peyi a ;
                    - 2033–2035 : Konekte lekòl, lopital ak biznis yo sou AJ-Cloud.
                """.trimIndent(),
                plannedStartPage = 88,
                plannedEndPage = 89,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 57 : Sécurité dès la conception ====================
            BookChapter(
                id = "ch_4_57",
                chapterNumber = 57,
                partId = "part_4",
                titleFr = "Chapitre 57 — Sécurité dès la conception",
                titleHt = "Chapit 57 — Sekirite depi nan konsepsyon",
                subtitleFr = "Security by Design, authentification, autorisation, chiffrement, gestion des secrets et moindre privilège",
                subtitleHt = "Sekirite depi nan premye liy kòd la, otantifikasyon, chifreman ak pwoteje sekrè",
                summaryFr = "Principes fondamentaux de sécurité logicielle appliqués dès l'architecture pour protéger les applications et les utilisateurs.",
                summaryHt = "Prensip sekirite lojisyèl depi nan kòmansman pou anpeche moun pirate oswa vòlè enfòmasyon nan sistèm nan.",
                contentFr = """
                    1. Le principe du « Security by Design » :
                    La sécurité ne doit jamais être ajoutée comme un vernis superficiel à la fin du développement ; elle doit être pensée, intégrée et auditée dès la première esquisse architecturale. Chaque ligne de code est écrite avec l'hypothèse qu'elle pourrait être ciblée par des attaques.
                    
                    2. Les piliers de la sécurité chez AJ-TECH :
                    - Authentification forte et gestion des sessions : mots de passe hachés avec des algorithmes modernes (Argon2 / bcrypt) et support futur de l'authentification multi-facteurs (MFA / passkeys) ;
                    - Autorisation stricte basée sur les rôles (RBAC) et principe du moindre privilège : chaque composant ne dispose que des droits strictement nécessaires à son exécution ;
                    - Chiffrement systématique : HTTPS/TLS 1.3 obligatoire pour toutes les communications réseau et chiffrement au repos (AES-256) pour les données sensibles ;
                    - Gestion rigoureuse des secrets : aucune clé d'API, aucun mot de passe ni certificat en clair dans le code source ou les dépôts Git.
                    
                    3. Validation rigoureuse des entrées :
                    Toutes les entrées utilisateurs sont systématiquement assainies et validées côté client et côté serveur afin d'éradiquer les failles d'injection (SQL, XSS, injection de commandes).
                    
                    4. État d'implémentation :
                    - 🟢 Opérationnel : Code source exempt de secrets codés en dur, typage fort prévenant les fuites mémoires et injections ;
                    - 🟡 En développement / Prototype : Protocoles d'authentification sécurisés pour AJ-Task ;
                    - ⚪ Vision future : Centre des opérations de sécurité (SOC) national surveillant les flux de l'écosystème.
                """.trimIndent(),
                contentHt = """
                    1. Prensip sekirite depi nan kòmansman (Security by Design) :
                    Sekirite se pa yon bagay ou vin ajoute nan fen yon pwojè tankou yon kouch penti ; fòk li panse depi nan premye liy kòd la. Chak pati nan lojisyèl la fèt kòmsi ta gen moun ki pral eseye atake l.
                    
                    2. Poto mitan sekirite nan AJ-TECH :
                    - Otantifikasyon solid : modpas yo byen kache ak algoritm Argon2/bcrypt epi prepare pou teknoloji modèn tankou kle MFA ;
                    - Kontwòl sou ki moun ki gen dwa fè kisa : chak itilizatè oswa pwogram gen dwa sèlman sou sa l bezwen pou l travay la ;
                    - Chifreman tout kote : HTTPS/TLS pou tout sa k ap pase sou rezo a ak AES-256 pou done ki sere sou machin yo ;
                    - Pa janm ekri modpas nan kòd la : okenn kle sekrè pa dwe janm parèt nan fichye kòd piblik yo.
                    
                    3. Netwaye tout sa itilizatè a tape :
                    Tout tèks yon moun tape nan yon bwat dwe verifye byen pou moun pa ka voye move kòd (atak XSS oswa SQL) pou kraze sistèm nan.
                    
                    4. Eta pwojè a jodi a :
                    - 🟢 Sa k ap mache jodi a : Kòd la pwòp, li pa gen okenn kle sekrè ki ekri an kachèt ;
                    - 🟡 Pwototip k ap devlope : Sistèm otantifikasyon pwoteje pou AJ-Task ;
                    - ⚪ Vizyon pou lavni : Ekip espesyalis ayisyen k ap veye sekirite tout rezo AJ-TECH la 24 sou 24.
                """.trimIndent(),
                plannedStartPage = 89,
                plannedEndPage = 90,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 58 : Protection des données et vie privée ====================
            BookChapter(
                id = "ch_4_58",
                chapterNumber = 58,
                partId = "part_4",
                titleFr = "Chapitre 58 — Protection des données et vie privée",
                titleHt = "Chapit 58 — Pwoteksyon done ak vi prive",
                subtitleFr = "Données personnelles, minimisation, consentement explicite, chiffrement, transparence et éthique",
                subtitleHt = "Pwoteksyon enfòmasyon pèsonèl moun, pran sèlman sa k nesesè, respè ak transparans",
                summaryFr = "Politique et principes techniques garantissant le respect scrupuleux de la vie privée et la souveraineté des utilisateurs sur leurs données.",
                summaryHt = "Prensip etik ak teknik pou asire AJ-TECH pa janm vann oswa abize enfòmasyon pèsonèl itilizatè yo.",
                contentFr = """
                    1. La protection de la vie privée comme droit inaliénable :
                    À l'ère de l'économie de la surveillance et du capitalisme de données, AJ-TECH fait le choix éthique résolu de considérer les données personnelles non comme une marchandise à monétiser, mais comme un dépôt sacré appartenant exclusivement à l'utilisateur.
                    
                    2. Les règles de gouvernance des données :
                    - Principe de minimisation : l'application ne collecte que les données strictement indispensables à son bon fonctionnement fonctionnel ;
                    - Consentement clair et explicite : aucune collecte opaque, aucun pistage publicitaire tiers, aucune revente d'informations ;
                    - Droit d'accès, d'exportation et de suppression : l'utilisateur conserve la pleine propriété de ses données et peut les exporter ou les effacer à tout moment ;
                    - Stockage local privilégié : toutes les données personnelles restent sur l'appareil de l'utilisateur tant qu'une synchronisation distante n'est pas explicitement demandée.
                    
                    3. Transparence algorithmique :
                    Les critères de classement, de recherche ou d'assistance algorithmique sont documentés et compréhensibles, sans « boîtes noires » discriminatoires.
                    
                    4. Engagement écosystémique :
                    Ces principes s'appliquent à l'ensemble des 22 entités d'AJ-TECH, de la simple application de tâches (AJ-Task) aux futures solutions financières (AJ-Pay) et éducatives (EDUKA).
                """.trimIndent(),
                contentHt = """
                    1. Respekte lavi prive moun se yon prensip sakre :
                    Pandan anpil gwo konpayi ap fè komès ak done moun sou entènèt, AJ-TECH pran desizyon fèm pou l pa janm vann enfòmasyon moun. Done yon itilizatè se pou li sèlman yo ye.
                    
                    2. Règ nou fikse pou jere enfòmasyon moun :
                    - Pran sèlman sa k nesesè : aplikasyon an pa mande anyen ki pa gen rapò ak travay l ap fè a ;
                    - Moun nan dwe dakò klè : nou pa mete okenn ti espyon nan aplikasyon an pou veye moun ;
                    - Dwa pou efase tout bagay : itilizatè a ka retire tout enfòmasyon sou li nenpòt lè li vle ;
                    - Sere sou telefòn nan an premye : tout sa w fè rete sou aparèy ou an toutotan ou pa chwazi voye l sou entènèt.
                    
                    3. Eksplikasyon klè sou jan kòd la travay :
                    Nou pa gen anyen kache : moun konnen kijan rechèch la ak zouti yo fonksyone san okenn paspouki.
                    
                    4. Angajman pou tout 22 antite yo :
                    Règ sa yo se pou tout pwojè nan AJ-TECH, kit se sou AJ-Task, sou EDUKA oswa sou solisyon lajan tankou AJ-Pay.
                """.trimIndent(),
                plannedStartPage = 90,
                plannedEndPage = 91,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 59 : Performance et optimisation ====================
            BookChapter(
                id = "ch_4_59",
                chapterNumber = 59,
                partId = "part_4",
                titleFr = "Chapitre 59 — Performance et optimisation",
                titleHt = "Chapit 59 — Pèfòmans ak optimizasyon",
                subtitleFr = "Temps de chargement, gestion mémoire, CPU, cache intelligent, compression et frugalité",
                subtitleHt = "Vitès ouvèti, jesyon memwa ak processeur, kach entèlijan ak respè pou ti telefòn yo",
                summaryFr = "Méthodes d'optimisation logicielle garantissant une réactivité maximale et une consommation minimale sur tous types de terminaux.",
                summaryHt = "Teknik pou fè lojisyèl yo louvri rapid epi mache byen menm sou telefòn ki pa gen gwo kapasite.",
                contentFr = """
                    1. La performance comme composante de l'accessibilité :
                    Une application lente ou consommant excessivement de mémoire exclut de facto les utilisateurs disposant d'appareils modestes ou usagés. Chez AJ-TECH, l'optimisation n'est pas un luxe pour appareils haut de gamme, mais un devoir d'inclusivité.
                    
                    2. Techniques d'optimisation concrètes :
                    - Optimisation du rendu graphique : utilisation de `Canvas` avec tracé direct (`drawLine()`, `drawRect()`) pour les visualisations complexes plutôt que d'empiler des dizaines de composants Composable imbriqués ;
                    - Stabilité des recompositions Compose : typage immuable des modèles de données et utilisation systématique de `remember` et `derivedStateOf` pour éviter les calculs redondants ;
                    - Réduction de l'empreinte mémoire : compression des ressources textuelles, suppression des bibliothèques superflues et chargement paresseux (Lazy Loading) des listes étendues ;
                    - Réseau frugal : compression des flux et élimination des requêtes d'arrière-plan inutiles pour préserver la batterie.
                    
                    3. Métriques et profils de performance :
                    Suivi strict du temps de démarrage à froid (Cold Start < 1 seconde), de la fluidité à 60 images/seconde et du maintien de la consommation RAM sous les seuils critiques des appareils à 2 Go de mémoire.
                """.trimIndent(),
                contentHt = """
                    1. Fè aplikasyon an rapid se yon fason pou ede tout moun :
                    Si yon aplikasyon lou oswa li pran twòp memwa, moun ki gen ti telefòn senp p ap ka sèvi avè l. Nan AJ-TECH, nou travay di pou kòd nou an lejè pou nenpòt moun ka sèvi avè l san difikilte.
                    
                    2. Fason nou optimize kòd la tout bon vre :
                    - Desine dirèkteman ak Canvas : nou itilize zouti grafik dirèk tankou `drawLine()` pou bèl fòm olye nou anpile twòp kouch sou ekran an ;
                    - Re-itilize sa k nan memwa : nou itilize `remember` nan Compose pou telefòn nan pa rekalkile menm bagay la dis fwa ;
                    - Pa gaspiye memwa : retire tout kòd ki pa sèvi anyen epi louvri chapit yo sèlman lè moun nan ap li yo ;
                    - Pa fini batri moun yo : pa kite pwogram nan ap vire san rezon nan background.
                    
                    3. Egzijans sou vitès la :
                    Aplikasyon an dwe louvri nan mwens pase yon segonn epi li dwe glise byen sou ekran an san sakad menm sou telefòn ki gen sèlman 2 Go memwa RAM.
                """.trimIndent(),
                plannedStartPage = 91,
                plannedEndPage = 92,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 60 : Qualité logicielle et tests ====================
            BookChapter(
                id = "ch_4_60",
                chapterNumber = 60,
                partId = "part_4",
                titleFr = "Chapitre 60 — Qualité logicielle et tests",
                titleHt = "Chapit 60 — Kalite lojisyèl ak tès",
                subtitleFr = "Tests unitaires, intégration, tests UI, Robolectric, non-régression, CI/CD et revues de code",
                subtitleHt = "Tès sou kòd la, tès Robolectric sou machin, verifye si anyen pa kraze ak bon jan kalite",
                summaryFr = "Stratégie globale d'assurance qualité logicielle : tests automatisés rapides, non-régression et rigueur d'ingénierie continue.",
                summaryHt = "Fason nou teste kòd la regilyèman pou nou asire tout bagay ap mache byen epi okenn nouvo chanjman pa kraze sa k te deja la.",
                contentFr = """
                    1. La qualité comme culture d'ingénierie :
                    Bâtir un écosystème technologique digne de confiance exige une discipline sans faille. Un bogue dans une application éducative perturbe un cours ; un bogue dans une application financière ou médicale peut avoir des conséquences critiques.
                    
                    2. La pyramide des tests chez AJ-TECH :
                    - Tests unitaires rapides (JUnit) : validation systématique de la logique métier pure, du calcul des métriques et des algorithmes de recherche bilingue en quelques millisecondes ;
                    - Tests d'intégration locaux sur JVM avec Robolectric : émulation fidèle de l'environnement Android sans la lenteur d'un émulateur physique lourd, permettant de valider les flux utilisateurs critiques (CUJ) ;
                    - Tests d'intégrité du corpus : vérification automatisée de l'exhaustivité des 165 chapitres, de la correspondance stricte des identifiants et de l'équilibre des contenus français et créole.
                    
                    3. Automatisation et intégration continue (CI/CD) :
                    Chaque modification du code déclenche automatiquement la compilation du projet (`compile_applet`) et l'exécution complète de la suite de tests (`gradle :app:testDebugUnitTest`), interdisant tout déploiement en cas d'échec.
                    
                    4. Bilan de la suite de tests actuelle :
                    - 🟢 Opérationnel : 100% de succès sur la suite de tests Robolectric et unitaires couvrant les 22 entités et la navigation séquentielle intégrale.
                """.trimIndent(),
                contentHt = """
                    1. Bon kalite lojisyèl se yon prensip debaz :
                    Pou moun ka fè AJ-TECH konfyans, fòk nou pa travay nan kouri. Yon erè nan yon aplikasyon lekòl ka deranje yon klas ; yon erè nan yon zouti lajan oswa sante ka lakòz gwo pwoblèm.
                    
                    2. Kalite tès nou fè sou kòd la :
                    - Ti tès rapid (JUnit) : verifye kalkil ak motè rechèch la nan yon fraksyon segonn ;
                    - Tès Robolectric sou machin : verifye tout fonksyon Android yo byen vit san nou pa bezwen tann gwo emilatè lou ;
                    - Tès sou tout liv la : zouti otomatik ki verifye si tout 165 chapit yo la, si nimewo yo kòrèk epi si tèks Kreyòl ak Fransè yo byen ekri.
                    
                    3. Tès otomatik chak fwa nou chanje yon bagay :
                    Chak fwa nou modifye kòd la, sistèm nan kouri tout tès yo nèt (`gradle :app:testDebugUnitTest`) pou wè si anyen pa kraze anvan nou pibliye nouvo vèsyon an.
                    
                    4. Rezilta jodi a :
                    - 🟢 Sa k ap mache jodi a : Tout tès yo pase 100% vèt sou tout 22 antite yo ak tout paj nan liv la.
                """.trimIndent(),
                plannedStartPage = 92,
                plannedEndPage = 93,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 61 : Une architecture prête pour l'avenir ====================
            BookChapter(
                id = "ch_4_61",
                chapterNumber = 61,
                partId = "part_4",
                titleFr = "Chapitre 61 — Une architecture prête pour l'avenir",
                titleHt = "Chapit 61 — Yon achitekti ki pare pou lavni",
                subtitleFr = "APIs, intelligence artificielle, cloud, scalabilité, interopérabilité et vision 2026–2035",
                subtitleHt = "API, entèlijans atifisyèl, cloud, kapasite pou grandi ak vizyon 2026–2035",
                summaryFr = "Synthèse architecturale et perspectives d'avenir : bâtir une base solide et progressive pour faire grandir l'écosystème AJ-TECH vers 2035.",
                summaryHt = "Konklizyon sou achitekti a ak gwo vizyon pou lavni : bati yon fondasyon solid ki pare pou fè ekosistèm AJ-TECH la grandi rive nan 2035.",
                contentFr = """
                    1. Synthèse de la fondation architecturale :
                    L'objectif premier d'AJ-TECH n'est pas de chercher immédiatement la complexité technique pour impressionner, mais d'établir une base d'ingénierie saine, solide, modulaire et parfaitement documentée. C'est cette rigueur initiale qui permettra à l'écosystème de traverser les décennies sans devenir obsolète.
                    
                    2. L'intégration harmonieuse des technologies émergentes :
                    - Intelligence Artificielle éthique : intégration de modules d'assistance contextuelle au service de l'apprentissage (EDUKA) et de la productivité (AJ-Task) sans compromettre la vie privée ;
                    - Interopérabilité étendue : ouverture d'APIs publiques et de kits de développement (SDKs) permettant aux développeurs et startups de la communauté haïtienne de bâtir leurs propres solutions sur le socle AJ-TECH ;
                    - Scalabilité horizontale : capacité d'absorber des millions de transactions et de consultations sans refonte structurelle.
                    
                    3. La vision décennale 2026–2035 :
                    L'architecture technologique détaillée dans ces 15 chapitres constitue le plan directeur de la renaissance numérique haïtienne. De l'application mobile autonome aux futurs centres de données nationaux, le chemin est tracé avec clarté, lucidité et détermination.
                    
                    4. Conclusion de la Partie IV :
                    « L'innovation haïtienne au service du monde » n'est pas un slogan abstrait, c'est un engagement d'ingénierie qui commence par des fondations logicielles irréprochables.
                """.trimIndent(),
                contentHt = """
                    1. Rezime sou fondasyon achitekti a :
                    Objektif prensipal AJ-TECH se pa chèche fè bagay ki twò konplike pou montre moun, men se bati yon fondasyon solid, pwòp, byen separe epi byen dokimante. Se bon travay sa a ki pral pèmèt ekosistèm nan grandi pandan plizyè dizèn ane san l pa janm demode.
                    
                    2. Prepare pou nouvo teknoloji k ap vini yo :
                    - Entèlijans Atifisyèl responsab : mete zouti entèlijan pou ede moun aprann pi byen (EDUKA) ak travay pi vit (AJ-Task) san vòlè done pèsonn ;
                    - Louvri zouti pou lòt jèn pwogramè : bay lòt devlopè ayisyen API ak zouti pou yo ka bati pwòp solisyon pa yo sou baz AJ-TECH ;
                    - Kapasite pou grandi : yon sistèm ki pare pou resevwa plizyè milyon moun san l pa janm tonbe an pann.
                    
                    3. Vizyon pou 10 lane k ap vini yo (2026–2035) :
                    Achitekti nou prezante nan 15 chapit sa yo se gid ki pral mennen chanjman nimerik peyi d Ayiti. Soti nan ti aplikasyon ki mache san entènèt jodi a rive nan gwo sèvè nasyonal demen, wout la trase ak fòs, sajès ak detèminasyon.
                    
                    4. Konklizyon Pati IV la :
                    « Inovasyon ayisyen nan sèvis lemonn » se pa yon senp bèl fraz, se yon angajman solid nan kòd la ki kòmanse ak yon bèl achitekti ki pa ka kraze.
                """.trimIndent(),
                plannedStartPage = 93,
                plannedEndPage = 94,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
