package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE IX — INNOVATION, PRODUITS NUMÉRIQUES ET TRANSFORMATION DES SECTEURS
 * Chapitres 122 à 136 (Exactement 15 chapitres sur la conception de produits adaptés à Haïti,
 * l'UX, le mobile, le commerce, les services financiers, la santé, l'éducation, la cartographie,
 * les médias, l'entrepreneuriat, les plateformes, l'interopérabilité, la mesure d'impact réel
 * et la stratégie d'innovation 2026–2035).
 */
object Part9Data {

    val part9: BookPart = BookPart(
        id = "part_9",
        partNumber = 9,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE IX — INNOVATION, PRODUITS NUMÉRIQUES ET TRANSFORMATION DES SECTEURS",
        titleHt = "PATI IX — INOVASYON, PWODUI NIMERIK AK TRANSFÒMASYON SEKTÈ YO",
        subtitleFr = "Créer des solutions adaptées aux réalités haïtiennes et transformer les usages par la technologie",
        subtitleHt = "Kreye solisyon ki adapte ak reyalite Ayiti epi transfòme fason moun sèvi ak teknoloji",
        plannedPages = "pp. 167–182",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 122 : Transformer les problèmes en solutions numériques ====================
            BookChapter(
                id = "ch_9_122",
                chapterNumber = 122,
                partId = "part_9",
                titleFr = "Chapitre 122 — Transformer les problèmes en solutions numériques",
                titleHt = "Chapit 122 — Transfòme pwoblèm yo an solisyon nimerik",
                subtitleFr = "De l'observation du terrain à la conception centrée utilisateur : transformer les contraintes réelles en opportunités d'ingénierie",
                subtitleHt = "Soti nan gade reyalite sou teren an pou rive nan konsepsyon pou itilizatè : transfòme difikilte an bèl solisyon kòd",
                summaryFr = "Méthode rigoureuse d'observation des besoins réels en Haïti et transformation d'une contrainte quotidienne en produit d'innovation numérique utile, ergonomique et accessible.",
                summaryHt = "Metòd pou gade vrè bezwen moun genyen an Ayiti epi transfòme yon pwoblèm chak jou an yon bon aplikasyon inovasyon ki itil, fasil pou sèvi epi ouvè pou tout moun nan transfòmasyon nimerik la.",
                contentFr = """
                    1. L'observation directe du terrain haïtien :
                    L'innovation numérique authentique ne naît pas dans un laboratoire abstrait, mais au contact direct des réalités vécues. En Haïti, copier mécaniquement des modèles logiciels conçus pour la Silicon Valley ou l'Europe conduit inévitablement à l'échec. L'ingénieur doit observer le marché informel, les files d'attente, l'intermittence des flux d'énergie et les habitudes spontanées des citoyens sur leurs téléphones.

                    2. La conception centrée utilisateur (User-Centered Design) :
                    Chaque problème observé doit être traduit en exigences logicielles concrètes :
                    - Réduire au strict minimum le nombre d'écrans pour accomplir une action vitale ;
                    - Préserver l'intégralité des données en mémoire locale avant toute tentative d'envoi sur le réseau ;
                    - Fournir un retour visuel instantané et limpide en Kreyòl et en Français ;
                    - Rendre l'application utilisable d'une seule main dans les transports collectifs (tap-taps).

                    3. Transformer le besoin en produit logiciel viable :
                    L'exemple fondateur d'AJ-Task illustre ce principe : plutôt que de concevoir un gestionnaire de projet surchargé de diagrammes complexes inadaptés aux artisans locaux, AJ-TECH a créé un outil léger, instantané et résilient, capable d'ordonner le travail quotidien sans exiger de connexion Internet permanente.

                    4. Règle de transparence et validation empirique :
                    Une idée séduisante sur papier n'est pas encore un produit. AJ-TECH s'interdit d'affirmer qu'un problème est résolu tant que la solution n'a pas été éprouvée par des usagers tests indépendants. La transformation numérique doit être mesurée par les frictions quotidiennes qu'elle élimine concrètement.
                """.trimIndent(),
                contentHt = """
                    1. Gade reyalite Ayiti a ak de je nou :
                    Vrè inovasyon an pa fèt nan bèl biwo fèmen, men nan gade kijan moun ap viv chak jou sou teren an. Lè yon moun kopye lojisyèl ki fèt pou peyi etranje san reflechi, li toujou kraze nan men li. Enjenyè a dwe gade kijan machann yo ap travay nan mache, kijan moun fè liy, kijan kouran koupe, ak kijan moun sèvi ak ti telefòn yo.

                    2. Bati lojisyèl pou vrè moun k ap sèvi avè l :
                    Chak gwo pwoblèm nou wè dwe tounen yon solisyon klè nan kòd la :
                    - Fè aplikasyon an mande mwens ti klike posib pou fè yon travay enpòtan ;
                    - Sove tout sa itilizatè a ekri sou memwa telefòn lan anvan menm li chèche entènèt ;
                    - Bay repons vit ki pale ni an Kreyòl ni an Fransè san konplikasyon ;
                    - Pèmèt moun sèvi ak aplikasyon an ak yon sèl men menm anndan yon tap-tap k ap souke.

                    3. Soti nan bezwen an pou rive nan yon bon aplikasyon :
                    Bèl egzanp AJ-Task montre sa byen : olye nou te bati yon gwo zouti konplike pou gwo biwo ki pa janm koupe kouran, AJ-TECH kreye yon ti zouti lejè, rapid ki ede atizan ak antreprenè òganize travay yo chak jou san bezwen entènèt tout tan.

                    4. Prensip verite aklè :
                    Yon bèl lide nan tèt pa vle di yon pwodui fini. AJ-TECH pa janm di yon pwoblèm rezoud toutotan moun sou teren an pa fin teste solisyon an epi wè li mache tout bon. Vrè transfòmasyon nimerik la se retire mizè nan kò moun yo chak jou.
                """.trimIndent(),
                plannedStartPage = 167,
                plannedEndPage = 168,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 123 : Concevoir des produits adaptés à Haïti ====================
            BookChapter(
                id = "ch_9_123",
                chapterNumber = 123,
                partId = "part_9",
                titleFr = "Chapitre 123 — Concevoir des produits adaptés à Haïti",
                titleHt = "Chapit 123 — Konsepsyon pwodui ki adapte ak Ayiti",
                subtitleFr = "Frugalité, connectivité intermittente, contraintes énergétiques et inclusion des appareils modestes",
                subtitleHt = "Aparèy ki pa koute chè, entènèt ki koupe souvan, mank kouran ak aplikasyon ki lejè pou tout moun",
                summaryFr = "Prise en compte fondamentale des contraintes locales haïtiennes dans l'architecture logicielle : bande passante rare, énergie instable, coût des téléphones et accessibilité linguistique.",
                summaryHt = "Fason pou pwograme lojisyèl ki mache byen nan reyalite Ayiti : entènèt ki ralanti, kouran ki koupe souvan, telefòn ki pa gen anpil memwa ak lang Kreyòl.",
                contentFr = """
                    1. Les sept contraintes structurelles de l'environnement haïtien :
                    Toute équipe d'ingénierie opérant en Haïti doit impérativement concevoir ses systèmes en intégrant dès la première ligne de code :
                    - L'intermittence sévère du réseau de télécommunications et le coût prohibitif des forfaits données cellulaires ;
                    - L'instabilité du réseau électrique imposant une frugalité absolue dans la consommation de batterie ;
                    - L'hétérogénéité d'un parc de terminaux dominé par des smartphones Android d'entrée de gamme dotés de 1 à 2 Go de RAM ;
                    - La barrière de la littératie numérique et l'impératif d'un guidage visuel par icônes explicites ;
                    - Le multilinguisme réel de la société, exigeant une parité parfaite entre le Français et le Kreyòl Ayisyen ;
                    - La prédominance des transactions en espèces et l'absence quasi-totale de cartes bancaires internationales ;
                    - L'indisponibilité fréquente de maintenance matérielle professionnelle.

                    2. Principes architecturaux de frugalité :
                    Face à ces contraintes, les logiciels AJ-TECH adoptent des règles strictes : poids des bundles JavaScript inférieur à 500 Ko, exécution des opérations critiques en local via SQLite/Room ou IndexedDB, synchronisation par paquets compressés lorsque le réseau réapparaît, et absence totale d'animations superflues énergivores.

                    3. Souveraineté de l'usage :
                    Une application qui cesse de fonctionner dès que le modem s'éteint n'est pas un progrès pour Haïti. Le paradigme Offline-First d'AJ-TECH fait de l'appareil local le centre de gravité des données, libérant le citoyen de la dépendance aux infrastructures distantes.
                """.trimIndent(),
                contentHt = """
                    1. Sèt gwo reyalite Ayiti enjenyè a dwe respekte :
                    Nenpòt moun k ap devlope lojisyèl nan peyi a dwe mete sèt bagay sa yo nan tèt li depi premye jou :
                    - Entènèt ki koupe souvan epi pri megabit ki koute chè anpil pou pèp la ;
                    - Mank kouran ki mande pou aplikasyon an pa vide batri telefòn lan vit ;
                    - Pifò moun gen ti telefòn Android senp ki gen sèlman 1 oswa 2 Go RAM ;
                    - Anpil moun poko abitye ak gwo tèm konplike nan telefòn, yo bezwen bon desen ak ti foto klè ;
                    - Moun yo pale ni Kreyòl ni Fransè, aplikasyon an dwe pale de lang sa yo san mank ;
                    - Pifò moun sèvi ak kòb papye nan men yo, yo pa gen kat labank etranje ;
                    - Lè yon aparèy gen pwoblèm, li pa fasil pou jwenn bon pyès pou repare l.

                    2. Metòd travay pou aplikasyon rete lejè :
                    Pou reponn ak defi sa yo, lojisyèl AJ-TECH yo gen règ fèm : gwosè kòd la dwe piti anpil, tout gwo travay fèt anndan telefòn lan sou baz done lokal (SQLite oswa IndexedDB), epi done yo vwayaje sèlman lè gen bon koneksyon san gaspiye megabit.

                    3. Otonomi pou tout itilizatè yo :
                    Yon aplikasyon ki fèmen lepli vit kouran koupe oswa entènèt ale pa itil pèp la anyen. Prensip Offline-First AJ-TECH la mete tout fòs la anndan aparèy la an premye, pou sitwayen an ka travay lib san depann sou sèvè lòt bò dlo.
                """.trimIndent(),
                plannedStartPage = 168,
                plannedEndPage = 169,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 124 : L’expérience utilisateur au cœur de l’innovation ====================
            BookChapter(
                id = "ch_9_124",
                chapterNumber = 124,
                partId = "part_9",
                titleFr = "Chapitre 124 — L’expérience utilisateur au cœur de l’innovation",
                titleHt = "Chapit 124 — Eksperyans itilizatè a nan kè inovasyon an",
                subtitleFr = "Simplicité radicale, design inclusif, accessibilité tactile et interfaces véritablement bilingues",
                subtitleHt = "Senplisite total, bèl desen klè, fasilite pou manyen ak ekran ki pale Kreyòl ak Fransè san fòse",
                summaryFr = "L'expérience utilisateur (UX) comme pilier de la confiance et de l'adoption numérique : éliminer les frictions cognitives, respecter les standards d'accessibilité (touch targets 48dp) et soigner la localisation bilingue.",
                summaryHt = "Eksperyans itilizatè a kòm prensip fondamantal pou bay moun konfyans : retire tout konplikasyon, respekte bon estanda ekran ak bèl tradiksyon natirèl an Kreyòl nan kad bon inovasyon an.",
                contentFr = """
                    1. La primauté de l'ergonomie sur la complexité technique :
                    L'excellence d'un produit logiciel ne se juge pas au nombre de bibliothèques importées, mais à la fluidité avec laquelle un utilisateur accomplit sa tâche sans hésitation ni frustration. En Haïti, où l'apprentissage informatique est souvent autodidacte, l'expérience utilisateur doit être d'une clarté absolue.

                    2. Les standards de design d'AJ-TECH :
                    - Cibles tactiles généreuses : boutons et éléments interactifs calibrés à un minimum strict de 48dp x 48dp pour éviter toute erreur de frappe sur écran réduit ou en déplacement ;
                    - Lisibilité sous fort ensoleillement : contraste élevé conforme aux directives WCAG 2.1 niveau AAA et typographie optimisée ;
                    - Rétroaction immédiate : chaque appui sur l'écran déclenche un retour tactile ou visuel perceptible (ondulation Material Ripple), confirmant instantanément l'action à l'utilisateur ;
                    - Clarté des statuts : indicateurs visuels sans ambiguïté signalant si les données sont sauvegardées en local ou synchronisées avec le cloud.

                    3. Le bilinguisme créole-français comme exigence de respect et d'efficacité :
                    Pour AJ-TECH, le Kreyòl Ayisyen n'est pas un simple ajout cosmétique ou une traduction approximative par automate. Il s'agit d'une langue de travail de premier rang, rédigée dans une syntaxe naturelle et respectueuse des nuances culturelles. Tout formulaire, message d'erreur ou infobulle est conçu simultanément en Français et en Kreyòl.

                    4. Inclusion universelle :
                    L'accessibilité numérique englobe les utilisateurs malvoyants, les débutants du smartphone et les aînés. Des libellés explicites (`contentDescription`) accompagnent chaque icône, garantissant la compatibilité totale avec les lecteurs d'écran (TalkBack).
                """.trimIndent(),
                contentHt = """
                    1. Fasilite pou moun sèvi pi enpòtan pase gwo kòd konplike :
                    Valè yon bon aplikasyon pa depann sou konbyen gwo mo teknik ki ladan l, men sou kijan nenpòt moun ka sèvi avè l san tèt chaje e san mande pèsonn èd. An Ayiti, kote pifò jèn aprann telefòn poukont yo, eksperyans itilizatè a dwe klè kou dlo kòk.

                    2. Bonjan estanda desen nan AJ-TECH :
                    - Bouton ki laj ase pou dwèt : tout bouton dwe mezire omwen 48dp x 48dp pou moun pa peze a kote, menm lè y ap mache nan lari ;
                    - Ekran klè menm anba solèy cho : koulè ki gen bon kontras pou moun ka li san fann je yo ;
                    - Repons rapid : lepli vit ou touche ekran an, li fè yon ti mouvman oswa yon ti limyè pou montre li konprann lòd la ;
                    - Montre tout bagay aklè : ti senbòl ki montre si enfòmasyon an sove nan telefòn lan oswa si l voye sou entènèt deja.

                    3. De lang ofisyèl : Kreyòl ak Fransè sou menm pye egal :
                    Pou AJ-TECH, Kreyòl Ayisyen an pa yon senp ti tradiksyon machin kopye. Se vrè lang manman nou, li dwe ekri nan bon kreyòl natirèl, kòrèk epi senp. Tout mesaj erè ak tout bouton fèt nan de lang yo san fòse.

                    4. Pwoteje tout kalite moun :
                    Tout moun dwe ka sèvi ak zouti yo : moun ki gen pwoblèm je, granmoun, ak moun ki fèk gen yon ti telefòn nan men yo. Chak ti foto oswa bouton gen eksplikasyon klè pou lektè vwa ka li l bay moun ki pa wè byen.
                """.trimIndent(),
                plannedStartPage = 169,
                plannedEndPage = 170,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 125 : Le mobile comme plateforme de transformation ====================
            BookChapter(
                id = "ch_9_125",
                chapterNumber = 125,
                partId = "part_9",
                titleFr = "Chapitre 125 — Le mobile comme plateforme de transformation",
                titleHt = "Chapit 125 — Telefòn mobil kòm platfòm transfòmasyon",
                subtitleFr = "Le smartphone comme terminal universel en Haïti : PWA légères, applications Android natives et consommation minimale de données",
                subtitleHt = "Telefòn entèlijan kòm prensipal zouti tout Ayisyen : PWA lejè, aplikasyon Android ak konsomasyon minimòm megabit",
                summaryFr = "Analyse du smartphone comme vecteur exclusif d'accès aux services numériques pour l'immense majorité des Haïtiens : primauté des PWA et des applications Android optimisées.",
                summaryHt = "Analiz sou wòl telefòn mobil kòm sèl zouti pifò Ayisyen genyen pou konekte : enpòtans aplikasyon PWA ak Android ki pa pran twòp espas pou ede nan transfòmasyon nimerik la.",
                contentFr = """
                    1. Le mobile-first radical comme nécessité sociologique :
                    En Haïti, la révolution informatique n'est pas passée par l'ordinateur de bureau. Le smartphone représente pour plus de 90% des internautes la porte d'entrée unique vers l'information, le travail collaboratif, le commerce et l'éducation. Concevoir pour le mobile n'est donc pas une option ergonomique, c'est l'unique voie de transformation numérique viable.

                    2. La dualité stratégique PWA / Android natif chez AJ-TECH :
                    - Les Progressive Web Apps (PWA) : Première brique de diffusion universelle. Elles s'installent en un clic directement depuis le navigateur, contournent les lourdeurs des boutiques d'applications, consomment une fraction de mégaoctet et garantissent le fonctionnement hors ligne grâce aux Service Workers et au cache IndexedDB ;
                    - Les applications Android natives sous Jetpack Compose : Réservées aux fonctionnalités exigeant un accès matériel approfondi (capteurs, notifications système prioritaires, stockage chiffré haute sécurité). Elles sont développées selon une architecture Clean et modulaire, limitant l'empreinte mémoire pour préserver les ressources de l'appareil.

                    3. Optimisation drastique des échanges réseau :
                    Chaque transfert réseau implique un coût financier direct pour l'usager haïtien. Les applications AJ-TECH appliquent la compression systématique des images en WebP/AVIF, proscrivent le rechargement complet des pages, et s'appuient sur des requêtes différentielles (seules les modifications récentes sont téléchargées).

                    4. Résilience énergétique :
                    En minimisant les tâches de fond non essentielles et les requêtes périodiques intempestives (polling réseau), nos logiciels protègent l'autonomie de la batterie des usagers, conscience aiguë des contraintes de recharge en milieu urbain et rural.
                """.trimIndent(),
                contentHt = """
                    1. Telefòn mobil se sèl zouti pou pifò Ayisyen :
                    An Ayiti, moun yo pa t pase nan faz gwo òdinatè biwo anvan yo jwenn teknoloji. Se telefòn entèlijan ki sèl zouti plis pase 90% moun genyen pou aprann, travay, voye kòb ak kominike. Se poutèt sa, nenpòt bon pwojè teknoloji dwe panse sou telefòn mobil an premye.

                    2. De gwo zouti AJ-TECH chwazi pou bati lojisyèl yo :
                    - PWA (Progressive Web Apps) : Aplikasyon ki louvri nan navigatè a epi ki ka enstale sou telefòn lan san pase nan gwo magazen ki mande anpil megabit. Yo lejè anpil, yo travay san entènèt grasa memwa kach IndexedDB ;
                    - Aplikasyon Android natif ak Jetpack Compose : Nou itilize l lè nou bezwen kontwole tout pyès telefòn lan nèt (notifikasyon ijan, sekirite done nan memwa telefòn). Kòd la fèt byen pwòp pou l pa janm ralanti telefòn lan.

                    3. Pa gaspiye megabit itilizatè a :
                    Chak fwa yon aplikasyon telechaje yon bagay sou entènèt, se kòb li retire nan pòch sitwayen an. Se poutèt sa lojisyèl AJ-TECH yo minimize tout imaj, yo pa janm telechaje sa ki pa nesesè, epi yo chache sèlman ti enfòmasyon ki chanje depi dènye fwa a.

                    4. Pwoteje batri a :
                    Paske nou konnen kijan kouran difisil pou jwenn nan peyi a, lojisyèl nou yo pa janm kite aplikasyon an ap vire pou granmesi nan background lè telefòn lan fèmen. Sa pèmèt batri a dire pi lontan pou moun ka fè sa ki enpòtan.
                """.trimIndent(),
                plannedStartPage = 170,
                plannedEndPage = 171,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 126 : Le commerce numérique et les nouveaux usages ====================
            BookChapter(
                id = "ch_9_126",
                chapterNumber = 126,
                partId = "part_9",
                titleFr = "Chapitre 126 — Le commerce numérique et les nouveaux usages",
                titleHt = "Chapit 126 — Komès nimerik ak nouvo fason moun itilize teknoloji",
                subtitleFr = "Catalogues virtuels, commande locale, circuits courts et bâtir la confiance dans les transactions",
                subtitleHt = "Katalòg sou telefòn, kòmann lokal, konekte machann ak achtè epi bati konfyans nan komès",
                summaryFr = "Les mutations du commerce haïtien à l'ère numérique : opportunités d'AJ-Commerce, vitrines numériques pour marchands locaux et défis de la livraison et de la confiance.",
                summaryHt = "Chanjman nan jan komès fèt an Ayiti : opòtinite pou AJ-Commerce, montre machandiz sou telefòn epi regle kesyon livrezon ak konfyans nan komès nimerik la.",
                contentFr = """
                    1. Le paysage commercial haïtien en mutation :
                    Le commerce de détail en Haïti est caractérisé par un secteur informel dynamique mais pénalisé par l'absence de traçabilité, la vulnérabilité des stocks physiques et les contraintes de déplacement en milieu urbain. Le commerce numérique offre une opportunité historique de désenclaver les artisans, producteurs agricoles et petits commerçants.

                    2. La proposition de valeur d'AJ-Commerce :
                    AJ-Commerce a été conçu comme une vitrine modulaire permettant aux entrepreneurs haïtiens de digitaliser facilement leur inventaire :
                    - Publication de catalogues légers consultables hors ligne une fois préchargés ;
                    - Enregistrement des commandes locales avec accusé de réception instantané ;
                    - Gestion simplifiée des stocks sans recourir à des progiciels lourds et onéreux ;
                    - Facilitation des circuits courts entre producteurs ruraux et acheteurs urbains.

                    3. L'impératif de la confiance et de la sécurité transactionnelle :
                    Le principal obstacle à l'adoption du commerce numérique n'est pas technologique, mais psychologique : la peur de la fraude et de la non-livraison. AJ-Commerce privilégie la transparence : profils marchands vérifiés, historique visible des transactions et canaux de messagerie directe pour convenir du point de remise.

                    4. Clarté sur le niveau de maturité :
                    AJ-Commerce est actuellement au stade de prototype d'ingénierie et de cadre conceptuel. Aucune plateforme commerciale grand public n'est ouverte avec encaissement automatisé à ce jour. Les tests actuels portent sur des catalogues pilotes fermés pour éprouver la résilience de la synchronisation.
                """.trimIndent(),
                contentHt = """
                    1. Kijan komès ap chanje an Ayiti :
                    Pifò komès nan peyi a fèt nan men ti machann ak ti antrepriz ki pa gen zouti nimerik pou swiv sa yo vann, sa yo gen nan depo, oswa pou jwenn kliyan pi lwen. Komès nimerik la bay yon bèl chans pou atizan, kiltivatè ak boutik ka montre sa yo genyen bay tout moun san yo pa bezwen depanse gwo kòb.

                    2. Kisa AJ-Commerce prepare pou ede :
                    AJ-Commerce se yon zouti nimerik ki fèt pou ede machann yo mete pwodui yo sou telefòn fasilman :
                    - Mete yon ti katalòg pwòp ke kliyan ka gade menm san entènèt yon fwa li fin chaje ;
                    - Pran kòmann kliyan yo byen rapid ak yon ti resi klè sou telefòn lan ;
                    - Jere sa ki rete nan depo a san bezwen gwo lojisyèl lou ki koute chè ;
                    - Ede moun nan pwovens vann machandiz dirèkteman bay moun nan gwo vil yo.

                    3. Bati konfyans pou moun pa pè :
                    Gwo difikilte nan komès sou entènèt an Ayiti se pa lojisyèl la, se laperèz pou moun pa pèdi kòb yo oswa pou yo pa livre machandiz la. Se poutèt sa AJ-Commerce baze sou idantite klè machann yo, istwa kòmann yo ki vizib, ak posiblite pou achtè ak machann pale dirèkteman sou ki kote y ap remèt machandiz la.

                    4. Verite sou eta pwojè a :
                    Kounye a, AJ-Commerce se yon prototip ak yon plan teknik n ap teste anndan ekip la. Pa gen okenn gwo sit komès ki louvri pou tout piblik k ap pran kòb kounye a. Tout bagay ap prepare ti pa ti pa avèk prekosyon.
                """.trimIndent(),
                plannedStartPage = 171,
                plannedEndPage = 172,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 127 : Les services financiers numériques ====================
            BookChapter(
                id = "ch_9_127",
                chapterNumber = 127,
                partId = "part_9",
                titleFr = "Chapitre 127 — Les services financiers numériques",
                titleHt = "Chapit 127 — Sèvis finansye nimerik",
                subtitleFr = "Inclusion financière, portefeuille électronique sécurisé, micro-paiements et respect du cadre réglementaire",
                subtitleHt = "Enklizyon finansye, bous nimerik ki byen sekirize, ti peman rapid ak respè tout lwa lajan nan peyi a",
                summaryFr = "Le potentiel transformateur de l'inclusion financière numérique en Haïti : les projets AJ-Pay et AJ-Wallet, les contraintes de conformité BRH et la sécurité cryptographique.",
                summaryHt = "Gwo wòl sèvis finansye nimerik pou ede tout moun jwenn sèvis labank : pwojè AJ-Pay ak AJ-Wallet, sekirite ak respè lwa BRH sou lajan ak finans.",
                contentFr = """
                    1. L'état de l'inclusion financière en Haïti :
                    Moins d'un quart de la population adulte dispose d'un compte bancaire traditionnel. Cette exclusion contraint des millions de ménages à dépendre du numéraire liquide, avec des risques majeurs de perte, de vol et de dépréciation monétaire. Les services financiers numériques constituent le levier le plus puissant pour démocratiser l'épargne, faciliter les transferts familiaux et stimuler l'économie de proximité.

                    2. La vision modulaire AJ-Pay et AJ-Wallet :
                    - AJ-Wallet : Concept de portefeuille numérique souverain, conçu pour stocker de la valeur en toute sécurité, autoriser des transferts de pair à pair instantanés et conserver un registre infalsifiable des transactions ;
                    - AJ-Pay : Passerelle d'interconnexion technique prévue pour s'intégrer harmonieusement aux services de monnaie électronique existants (MonCash, Natcash), aux banques commerciales et aux terminaux de paiement physiques.

                    3. Cryptographie et conformité légale rigoureuse :
                    La manipulation de flux financiers exige une rigueur absolue :
                    - Chiffrement asymétrique de grade bancaire (clé privée stockée dans l'enclave sécurisée de l'appareil Android) ;
                    - Authentification biométrique ou double facteur pour toute transaction sortante ;
                    - Respect scrupuleux des directives de la Banque de la République d'Haïti (BRH) et des réglementations anti-blanchiment (AML/KYC).

                    4. Positionnement transparent et honnête :
                    AJ-TECH ne prétend en aucun cas opérer comme un établissement de crédit, une banque ou une institution de microfinance agréée. AJ-Pay et AJ-Wallet sont des projets de recherche et d'architecture logicielle inscrits dans la feuille de route 2026–2035, dont le déploiement opérationnel sera strictement conditionné à l'obtention des autorisations réglementaires nationales.
                """.trimIndent(),
                contentHt = """
                    1. Difikilte pifò Ayisyen genyen pou jwenn sèvis labank :
                    Mwens pase yon ka nan granmoun nan peyi a gen yon kont labank. Sa fòse plizyè milyon moun mache ak kòb papye nan pòch yo, sa ki ka lakòz vòl, pèt ak gwo danje. Sèvis finansye sou telefòn se pi gwo zouti ki ka ede moun sere ti kòb yo, voye lajan bay fanmi yo epi ede ti biznis nan katye yo mache.

                    2. Vizyon AJ-Pay ak AJ-Wallet :
                    - AJ-Wallet : Konsèp yon bous nimerik ki byen sekirize sou telefòn lan, pou moun ka kenbe ti lajan yo an sekirite, voye bay zanmi byen vit epi wè tout sa yo depanse aklè ;
                    - AJ-Pay : Yon pon teknoloji k ap prepare pou konekte ak tout lòt sèvis lajan ki egziste nan peyi a (MonCash, Natcash) ak labank yo, pou fasilite peman tout kote.

                    3. Gwo sekirite kòd ak respè lwa BRH :
                    Lè w ap manyen kesyon lajan, ou pa ka fè neglijans :
                    - Kle sekirite kòd ki sere byen fon anndan ti pyès espesyal telefòn lan pou pèsonn pa ka vòlè l ;
                    - Mandé anpwent dwèt oswa de modpas anvan nenpòt kòb deplase ;
                    - Respekte tout lwa ak règleman Bank Repiblik d Ayiti (BRH) fikse sou lajan ak idantite moun.

                    4. Verite aklè san manti :
                    AJ-TECH pa yon bank ni yon kès popilè kounye a. AJ-Pay ak AJ-Wallet se pwojè rechèch ak konsepsyon lojisyèl ki nan plan travay 2026–2035 lan. Yo p ap janm louvri pou pran lajan moun san tout otorizasyon ak papye legal Leta bay selon lalwa.
                """.trimIndent(),
                plannedStartPage = 172,
                plannedEndPage = 173,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 128 : La santé numérique et l’innovation responsable ====================
            BookChapter(
                id = "ch_9_128",
                chapterNumber = 128,
                partId = "part_9",
                titleFr = "Chapitre 128 — La santé numérique et l’innovation responsable",
                titleHt = "Chapit 128 — Sante nimerik ak inovasyon responsab",
                subtitleFr = "Information médicale préventive, dossiers de santé locaux, orientation des patients et éthique biomédicale",
                subtitleHt = "Konsèy prevansyon sante, kaye sante sou telefòn, gide malad yo ak respè sekrè medikal",
                summaryFr = "L'application des technologies numériques à la santé publique en Haïti : orientation d'AJ-Bioklin, confidentialité stricte des données médicales et non-substitution au médecin.",
                summaryHt = "Wòl teknoloji pou ede lasante an Ayiti : vizyon AJ-Bioklin, pwoteje sekrè malad yo ak prensip klè li pa janm ranplase yon doktè.",
                contentFr = """
                    1. L'état critique du système de santé et l'apport du numérique :
                    Le système sanitaire haïtien fait face à une pénurie aiguë de personnels soignants, à la concentration des spécialistes dans la capitale et à l'absence de dossiers médicaux centralisés. Face à cette détresse, la santé numérique doit intervenir avec prudence et responsabilité : non pour remplacer le clinicien, mais pour outiller le citoyen en information validée et fluidifier son orientation.

                    2. La vocation d'AJ-Bioklin :
                    AJ-Bioklin a été modélisé comme un assistant numérique de prévention et de suivi personnel :
                    - Carnet de santé numérique individuel stocké en local (vaccinations, antécédents, constantes vitales de base) ;
                    - Fiches de sensibilisation préventive en Kreyòl et en Français sur les maladies endémiques (choléra, paludisme, dengue, hypertension) ;
                    - Annuaire d'orientation répertoriant les centres hospitaliers, cliniques de quartier et pharmacies de garde ;
                    - Rappels de prises médicamenteuses pour les patients atteints d'affections chroniques.

                    3. Confidentialité absolue et souveraineté biomédicale :
                    Les données médicales constituent la catégorie d'informations la plus intime et vulnérable. AJ-TECH applique le principe du chiffrement de bout en bout : aucune information sanitaire n'est collectée sans consentement explicite, et aucune donnée médicale n'est revendue ni exploitée à des fins commerciales.

                    4. Limite déontologique formelle :
                    AJ-Bioklin n'est pas un service médical opérationnel et ne pose aucun diagnostic clinique automatisé. En cas d'urgence, l'application oriente immédiatement l'usager vers les structures de soins agréées les plus proches. Tout contenu informatif fait l'objet de protocoles de relecture par des professionnels de santé diplômés.
                """.trimIndent(),
                contentHt = """
                    1. Difikilte lasante an Ayiti ak sa teknoloji ka pote :
                    Lopital ak doktè yo pa anpil nan peyi a, pifò espesyalis yo nan gwo vil yo sèlman, epi pa gen bon jan kaye sante pou swiv malad yo. Nan sitiyasyon sa a, teknoloji a dwe ede avèk anpil prekosyon : li pa la pou ranplase yon doktè, men pou bay sitwayen an bon konsèy prevansyon epi gide l kote ki gen swen.

                    2. Misyon AJ-Bioklin prepare :
                    AJ-Bioklin se yon zouti nimerik pou prevansyon ak swivi sante chak jou :
                    - Yon ti kaye sante sou telefòn moun lan (vaksen, maladi li te genyen, tansyon) ki sere an sekirite ;
                    - Ti fich konsèy senp ni an Kreyòl ni an Fransè sou fason pou evite kolera, malarya, deng ak tansyon wo ;
                    - Lis sant sante, lopital ak famasi ki pi pre kote moun lan ye a ;
                    - Ti rapèl sou telefòn pou moun ki bwè remèd chak jou pa bliye lè pou yo pran yo.

                    3. Sekrè total sou sante moun yo :
                    Enfòmasyon sou sante yon moun se bagay ki pi prive ki genyen. AJ-TECH mete gwo kadna sou done sa yo : pèsonn pa ka wè enfòmasyon sante w san bèl otorizasyon pa w, epi nou p ap janm vann done sa yo bay okenn konpayi.

                    4. Prensip klè ak etik :
                    AJ-Bioklin pa yon lopital k ap fonksyone kounye a epi li pa janm bay dyagnostik oswa preskri remèd tankou se te yon doktè. Si yon moun gen gwo ijans, aplikasyon an di l touswit kouri al nan pi pre lopital ki gen doktè reyèl ki kalifye pou sa.
                """.trimIndent(),
                plannedStartPage = 173,
                plannedEndPage = 174,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 129 : L’éducation numérique comme levier de transformation ====================
            BookChapter(
                id = "ch_9_129",
                chapterNumber = 129,
                partId = "part_9",
                titleFr = "Chapitre 129 — L’éducation numérique comme levier de transformation",
                titleHt = "Chapit 129 — Edikasyon nimerik kòm yon zouti transfòmasyon",
                subtitleFr = "Apprentissage hybride, manuels bilingues numérisés, exercices adaptatifs et inclusion pédagogique",
                subtitleHt = "Aprann nan klas ak sou telefòn, liv lekòl nimerik nan de lang, egzèsis ki adapte ak elèv yo",
                summaryFr = "L'éducation comme clé de voûte du développement national : rôle conjoint des plateformes EDUKA, EDH et des outils interactifs d'AJ-TECH pour démocratiser le savoir.",
                summaryHt = "Edikasyon kòm prensipal motè pou devlope peyi a : wòl platfòm endepandan EDUKA ak EDH ansanm ak zouti AJ-TECH pou pataje konesans ak tout jèn.",
                contentFr = """
                    1. Le déficit éducatif structurel et l'urgence numérique :
                    Le coût prohibitif des manuels scolaires importés, l'inégalité d'accès aux enseignants qualifiés entre les provinces et la capitale, et le manque d'équipements scientifiques freinent le potentiel intellectuel de la jeunesse. L'éducation numérique représente la voie la plus rapide pour mutualiser les meilleures ressources pédagogiques et briser la barrière géographique.

                    2. Les trois composantes éducatives de l'écosystème :
                    - EDUKA : Plateforme éducative ouverte, conçue pour diffuser gratuitement des cours structurés, des résumés de programmes officiels et des banques d'exercices résolus pour l'enseignement fondamental et secondaire ;
                    - EDH (École du Développement d'Haïti) : Institution dédiée à la formation professionnelle d'élite en ingénierie logicielle, cybersécurité, design d'interface et gestion de projet technique ;
                    - AJ-MathQuest : Application ludo-éducative interactive développée pour réconcilier les élèves avec les mathématiques, le calcul mental et la logique algorithmique dès le plus jeune âge.

                    3. Statut d'indépendance d'EDUKA et d'EDH :
                    Conformément à notre charte fondamentale, EDUKA et EDH demeurent des entités citoyennes indépendantes, sans le préfixe commercial AJ-, afin de préserver leur vocation de bien commun académique ouvert à tous les partenariats universitaires et scolaires.

                    4. Pédagogie bilingue et fonctionnement hors ligne :
                    Les contenus pédagogiques sont systématiquement proposés en Français et en Kreyòl Ayisyen. Les modules de cours peuvent être téléchargés lors d'une connexion temporaire à l'école ou dans un lieu public, puis révisés intégralement hors ligne à la maison sans consommer de données.
                """.trimIndent(),
                contentHt = """
                    1. Difikilte lekòl an Ayiti ak repons nimerik la :
                    Pri liv lekòl ki koute chè anpil, mank bon pwofesè nan pwovens yo ak mank laboratwa syans bloke anpil bèl jèn ki gen gwo entèlijans. Zouti nimerik se pi bon mwayen ki ka pèmèt tout elèv jwenn menm bon leson ak bon liv, kèlkeswa kote yo rete nan peyi a.

                    2. Twa gwo poto edikasyon nan ekosistèm nan :
                    - EDUKA : Yon bèl platfòm ouvè pou tout moun ki bay leson gratis, rezime pwogram ofisyèl Leta ak egzèsis prepare pou tout elèv lekòl fondamantal ak segondè ;
                    - EDH (École du Développement d'Haïti) : Yon gwo lekòl fòmasyon teknik pou aprann jèn yo vin gwo enjenyè kòd, ekspè sekirite enfòmatik ak responsab pwojè teknoloji ;
                    - AJ-MathQuest : Yon ti jwèt edikatif sou telefòn ki ede timoun yo renmen matematik, konte vit nan tèt yo epi konprann lojik enfòmatik depi yo tou piti.

                    3. Endepandans EDUKA ak EDH :
                    Jan règ nou yo toujou di l, EDUKA ak EDH rete de gwo antite endepandan san mete prefiks komèsyal AJ-, pou yo rete tankou yon patrimwàn pou tout lekòl ak inivèsite nan peyi a san distenksyon.

                    4. Aprann nan de lang epi san entènèt :
                    Tout leson yo ekri ni an Fransè ni an Kreyòl Ayisyen. Elèv yo ka telechaje yon chapit leson lè yo jwenn yon ti kouran oswa yon ti wifi nan lekòl la, epi yo ka etidye tout nwit lakay yo san yo pa bezwen entènèt ditou.
                """.trimIndent(),
                plannedStartPage = 174,
                plannedEndPage = 175,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 130 : Les villes, les cartes et les données territoriales ====================
            BookChapter(
                id = "ch_9_130",
                chapterNumber = 130,
                partId = "part_9",
                titleFr = "Chapitre 130 — Les villes, les cartes et les données territoriales",
                titleHt = "Chapit 130 — Vil yo, kat yo ak done teritoryal yo",
                subtitleFr = "Données géographiques ouvertes, repérage urbain, mobilité citoyenne et potentiel stratégique d'AJ-Maps",
                subtitleHt = "Done jewografik ouvè, konnen vil yo, transpò piblik ak gwo vizyon estratejik pou AJ-Maps",
                summaryFr = "L'importance stratégique de la cartographie et de la géolocalisation en Haïti : orientation d'AJ-Maps, cartographie participative et aide à la décision territoriale.",
                summaryHt = "Enpòtans estratejik kat jeyografik ak adrès an Ayiti : vizyon AJ-Maps, patisipasyon tout moun pou trase kat vil yo ak ede planifye devlopman.",
                contentFr = """
                    1. L'obscurité cartographique et ses conséquences économiques :
                    En Haïti, la grande majorité des rues, ruelles et quartiers informels ne disposent pas d'un système d'adressage normalisé reconnu par les géants technologiques étrangers. Cette lacune paralyse la logistique de livraison, retarde l'intervention des services d'urgence (pompiers, ambulances), complique l'acheminement des secours lors de catastrophes naturelles et limite la planification de l'urbanisme.

                    2. L'approche collaborative et souveraine d'AJ-Maps :
                    AJ-Maps a été imaginé comme un service cartographique et spatial adapté aux réalités territoriales locales :
                    - Valorisation des contributions citoyennes issues d'OpenStreetMap (OSM) pour enrichir la précision des tracés ;
                    - Système de repérage hybride associant coordonnées GPS et repères visuels coutumiers (carrefours emblématiques, églises, marchés, arbres centenaires) ;
                    - Cartographie communautaire des lignes et stations de tap-taps pour faciliter la mobilité urbaine et périurbaine ;
                    - Fonctionnement en cache spatial déconnecté : consultation des plans de quartiers sans dépendre d'une connexion 4G.

                    3. Données ouvertes et aide à la décision publique :
                    Les données cartographiques compilées par AJ-Maps ont vocation à être partagées avec les municipalités, les universités et les organisations citoyennes pour identifier les zones à risques de glissement de terrain ou d'inondation, et optimiser l'implantation des futurs services publics.

                    4. Positionnement transparent :
                    AJ-Maps est actuellement un projet en phase d'étude méthodologique et de cadrage technique. Il n'existe pas à ce jour de flotte de véhicules de cartographie ni d'infrastructure GPS autonome active sous la marque AJ-Maps. L'effort se concentre sur les protocoles de saisie communautaire et les briques logicielles open-source.
                """.trimIndent(),
                contentHt = """
                    1. Pwoblèm mank bon kat ak adrès nan vil yo :
                    An Ayiti, anpil lari, koridò ak zòn pa gen nimewo kay ni non ofisyèl sou gwo kat konpayi etranje yo fè. Sa fè li trè difisil pou livrezon fèt, pou ponpye oswa anbilans jwenn yon moun ki nan bezwen rapid, epi pou Leta planifye kijan pou ranje vil yo lè gen inondasyon oswa tranblemanntè.

                    2. Jan AJ-Maps vle ede regle pwoblèm sa a :
                    AJ-Maps se yon pwojè kat jeyografik ki panse pou reyalite peyi nou an :
                    - Sèvi ak travay tout sitwayen ki mete konesans yo nan OpenStreetMap (OSM) pou trase tout ti lari ;
                    - Idantifye kote yo pa sèlman ak nimewo, men ak kote moun konnen byen (bò legliz la, nan kafou a, bò pye bwa a) ;
                    - Trase wout machin ak estasyon tap-tap pou ede moun konnen kijan pou yo deplase nan vil la san pèdi ;
                    - Kat ki ka travay san entènèt : gade kat katye a sou telefòn lan menm lè pa gen rezo.

                    3. Pataje enfòmasyon pou ede tout kominote a :
                    Tout bèl enfòmasyon sa yo dwe pataje ak meri yo, lekòl yo ak inivèsite yo pou ede yo konnen ki kote dlo ka monte lè lapli tonbe, ak ki kote ki pi bon pou mete yon nouvo sant sante oswa yon ponp dlo.

                    4. Verite aklè sou eta pwojè a :
                    Kounye a, AJ-Maps se yon rechèch sou papye ak yon etid teknik sou fason pou mete done yo ansanm. AJ-TECH pa gen okenn machin ki sou wout ap pran foto kat kounye a, ni okenn gwo satelit pa nou. Nou baze tout travay la sou bon zouti ouvè (open-source) k ap prepare pou pi devan.
                """.trimIndent(),
                plannedStartPage = 175,
                plannedEndPage = 176,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 131 : Les médias, la culture et la création numérique ====================
            BookChapter(
                id = "ch_9_131",
                chapterNumber = 131,
                partId = "part_9",
                titleFr = "Chapitre 131 — Les médias, la culture et la création numérique",
                titleHt = "Chapit 131 — Medya, kilti ak kreyasyon nimerik",
                subtitleFr = "Rayonnement du patrimoine culturel haïtien, création multimédia, monétisation des artistes et outils de diffusion",
                subtitleHt = "Fè kilti ayisyen an briye nan mond lan, kreyasyon odyo ak video, ede atis yo touche epi zouti difizyon",
                summaryFr = "La valorisation de la culture et de la créativité haïtienne par le numérique : le rôle d'AJ-Studio et d'AJ-Chat dans l'émergence d'une économie créative nationale.",
                summaryHt = "Kijan teknoloji ka ede kilti ak bèl talan ayisyen yo grandi : wòl AJ-Studio ak AJ-Chat pou kreye yon vrè ekonomi kiltirèl nimerik.",
                contentFr = """
                    1. La puissance culturelle d'Haïti à l'ère numérique :
                    Haïti est une nation de créateurs : musique (compas, racine, rap kreyòl), littérature, peinture, sculpture et conte oral constituent un patrimoine d'une richesse exceptionnelle. Pourtant, la grande majorité des artistes haïtiens demeurent privés des fruits économiques de leur œuvre, captée par des intermédiaires étrangers ou pillée par l'absence de circuits légaux de distribution numérique.

                    2. Les modules créatifs et d'échange de l'écosystème :
                    - AJ-Studio : Boîte à outils légère pour les créateurs de contenu, axée sur le montage multimédia frugal, la mise en page de publications bilingues et le traitement d'images sans recours à des logiciels étrangers surpayés ;
                    - AJ-Chat : Espace de messagerie instantanée sécurisée et de canaux communautaires thématiques, pensé pour connecter les créateurs avec leur audience de manière directe, sans algorithmes opaques de censure commerciale.

                    3. Défendre la juste rémunération des artistes :
                    L'objectif à long terme est d'adosser ces plateformes culturelles aux briques de micro-paiement (AJ-Pay/AJ-Wallet) pour permettre aux auditeurs et lecteurs en Haïti et au sein de la diaspora de rétribuer directement les artistes en direct, sans déduction abusive de commissions.

                    4. Transparence absolue sur l'infrastructure actuelle :
                    AJ-TECH ne possède aucun catalogue de droits musicaux, aucune audience chiffrée de diffusion multimédia, ni revenus de streaming déclarés à ce stade. AJ-Studio et AJ-Chat relèvent de la modélisation architecturale et du prototypage de protocoles sécurisés pour la feuille de route 2026–2035.
                """.trimIndent(),
                contentHt = """
                    1. Gwo fòs kilti Ayiti a nan mond nimerik la :
                    Peyi Dayiti gen yon gwo richès nan kilti l : mizik konpa, rasin, rap kreyòl, bèl tablo penti, bèl liv ak istwa bouch an bouch. Men pifò atis ayisyen pa janm jwenn vrè kòb travay yo merite, paske se gwo konpayi etranje ki pran lajan an oswa paske moun telechaje mizik yo san yo pa peye yon goud.

                    2. Zouti kreyasyon ak kominikasyon nan ekosistèm nan :
                    - AJ-Studio : Yon ti bwat zouti lejè sou telefòn ki ede jèn k ap kreye foto, mizik ak videyo travay byen vit san yo pa bezwen achte gwo lojisyèl etranje ki koute twòp kòb ;
                    - AJ-Chat : Yon aplikasyon mesaj sekirize ak ti gwoup espesyal kote atis ak moun k ap kreye ka pale dirèkteman ak fanatik yo san gwo konpayi pa bloke mesaj yo.

                    3. Ede atis yo touche kòb travay yo :
                    Rèv nou pou pi devan se konekte zouti sa yo ak sèvis peman sou telefòn (AJ-Pay/AJ-Wallet), pou nenpòt moun kit li an Ayiti oswa nan dyaspora a ka voye yon ti kòb dirèkteman bay atis li renmen an san gaspiye nan gwo komisyon.

                    4. Verite aklè san gonfle zafè :
                    AJ-TECH pa gen okenn gwo katalòg mizik ki siyen papye kounye a, ni okenn gwo kantite moun k ap koute mizik sou sèvè nou jodi a. AJ-Studio ak AJ-Chat se plan travay ak prototip lojisyèl n ap devlope nan kad plan 2026–2035 lan.
                """.trimIndent(),
                plannedStartPage = 176,
                plannedEndPage = 177,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 132 : L’entrepreneuriat numérique et les petites entreprises ====================
            BookChapter(
                id = "ch_9_132",
                chapterNumber = 132,
                partId = "part_9",
                titleFr = "Chapitre 132 — L’entrepreneuriat numérique et les petites entreprises",
                titleHt = "Chapit 132 — Antreprenarya nimerik ak ti antrepriz yo",
                subtitleFr = "Digitalisation des micro-entreprises, gestion quotidienne, devis, facturation et productivité avec AJ-Biz et AJ-Task",
                subtitleHt = "Teknoloji pou ti komèsan ak antreprenè : jere kès, fè fakti, ogmante pwodiktivite ak AJ-Biz ak AJ-Task",
                summaryFr = "L'accompagnement des petites entreprises haïtiennes vers le numérique : outils de gestion simples avec AJ-Biz, organisation des tâches avec AJ-Task et création de valeur locale.",
                summaryHt = "Ede ti biznis ayisyen yo sèvi ak teknoloji pou yo grandi : zouti jesyon senp ak AJ-Biz, òganizasyon travay ak AJ-Task epi kreye richès nan peyi a.",
                contentFr = """
                    1. La réalité du tissu entrepreneurial haïtien :
                    En Haïti, plus de 85% de l'activité économique repose sur des micro-entrepreneurs, des artisans indépendants et de petites structures familiales. Pour la majorité de ces acteurs, la comptabilité se fait encore sur des calepins papier exposés aux pertes et aux incendies, et la gestion du temps demeure empirique. L'accès à des outils numériques légers représente un levier de productivité spectaculaire.

                    2. La synergie opérationnelle AJ-Task et AJ-Biz :
                    - AJ-Task : Fournit la discipline d'exécution quotidienne. L'entrepreneur planifie ses chantiers, suit ses commandes en cours, organise les livraisons et coche ses tâches accomplies en totale autonomie déconnectée ;
                    - AJ-Biz : Conçu pour digitaliser la gestion commerciale de base : édition de devis clairs en gourdes et dollars, émission de reçus numériques partageables via messagerie instantanée, et calcul automatisé des marges et du flux de trésorerie quotidien.

                    3. Une approche pédagogique sans jargon :
                    L'outil ne doit jamais être plus compliqué que le problème qu'il prétend résoudre. AJ-Biz et AJ-Task éliminent le vocabulaire comptable abstrait pour adopter des termes concrets, compréhensibles par tout gestionnaire de boutique ou d'atelier.

                    4. Frugalité et pérennité des données d'entreprise :
                    Toutes les données commerciales enregistrées restent sous la garde exclusive de l'entrepreneur, stockées dans la mémoire locale de son terminal avec possibilité d'exportation au format texte/CSV à tout moment. Aucune obligation de payer un abonnement mensuel contraignant pour accéder à son propre historique de travail.
                """.trimIndent(),
                contentHt = """
                    1. Jan ti biznis yo ap fonksyone an Ayiti :
                    Plis pase 85% ekonomi peyi a se ti machann, atizan, bòs mason, mekanisyen ak ti boutik fanmi k ap goumen chak jou. Pifò nan yo toujou ekri sa yo vann sou ti kaye papye ki ka chire, pèdi oswa pran dlo. Lè nou ba yo bon ti zouti sou telefòn yo, sa ede yo travay pi vit epi pa pèdi lajan yo.

                    2. Kijan AJ-Task ak AJ-Biz travay ansanm pou ede :
                    - AJ-Task : Ede antreprenè a òganize tout jounen travay li. Li ekri kisa pou l fè an premye, ki kòmann ki dwe livre, epi li koche sa l fini san li pa bezwen entènèt ditou ;
                    - AJ-Biz : Fèt pou ede ti biznis la fè fakti klè nan kòb goud oswa dola, bay kliyan an yon ti resi sou telefòn, epi kalkile konbyen kòb ki antre ak konbyen benefis ki fèt nan jounen an.

                    3. Pale senp san gwo mo difisil :
                    Yon zouti pa dwe janm pi konplike pase travay moun lan ap fè a. AJ-Biz ak AJ-Task retire tout gwo mo teknik konpabilite pou pale nan langaj senp ke nenpòt ti komèsan ka konprann touswit.

                    4. Pwoteje done ti biznis yo :
                    Tout sa yon antreprenè ekri nan aplikasyon an rete nan telefòn li anba kontwòl li sèlman. Li ka soti tout enfòmasyon yo nenpòt lè li vle san pèdi anyen, epi san li pa oblije peye gwo abònman chak mwa pou l wè pwòp papye biznis pa l.
                """.trimIndent(),
                plannedStartPage = 177,
                plannedEndPage = 178,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 133 : Les plateformes et les effets de réseau ====================
            BookChapter(
                id = "ch_9_133",
                chapterNumber = 133,
                partId = "part_9",
                titleFr = "Chapitre 133 — Les plateformes et les effets de réseau",
                titleHt = "Chapit 133 — Platfòm yo ak efè rezo yo",
                subtitleFr = "Dynamique d'adoption, marchés bilatéraux, modération communautaire, confiance et gouvernance équitable",
                subtitleHt = "Kijan moun kòmanse sèvi ak yon rezo, konekte achtè ak machann, kontwole move konpòtman ak bon gouvènans",
                summaryFr = "Comprendre les mécanismes économiques des plateformes et des effets de réseau dans un marché émergent : surmonter le problème de la poule et de l'œuf, modérer les abus et protéger la communauté.",
                summaryHt = "Konprann kijan gwo platfòm grandi grasa efè rezo : kijan pou atire premye itilizatè yo, evite fo kont ak move zak epi pwoteje tout moun.",
                contentFr = """
                    1. La dynamique des effets de réseau dans un marché émergent :
                    Une plateforme numérique crée un effet de réseau direct lorsque la valeur du service pour chaque participant s'accroît à mesure que de nouveaux usagers la rejoignent. Dans un contexte comme Haïti, cet effet est décuplé par la force des liens familiaux et communautaires, mais il se heurte à une difficulté initiale majeure : le problème du démarrage à froid (Cold Start Problem).

                    2. Surmonter l'impasse du démarrage :
                    Comment attirer des marchands s'il n'y a pas encore d'acheteurs, et comment convaincre des acheteurs si l'offre est inexistante ? La stratégie d'AJ-TECH consiste à conférer à chaque produit une valeur unilatérale immédiate en mode autonome :
                    - AJ-Task est d'abord utile à l'usager individuel pour ses propres tâches ;
                    - AJ-Commerce permet d'abord au boutiquier de tenir son inventaire personnel ;
                    - C'est seulement dans un second temps que la mise en réseau apporte le multiplicateur de valeur collaborative.

                    3. Modération, confiance et sécurité collective :
                    Dans les environnements numériques naissants, la prolifération des faux profils, du harcèlement et des tentatives d'escroquerie peut anéantir la confiance naissante. L'écosystème AJ-TECH met en place des garde-fous stricts : validation communautaire, signalement transparent des comportements frauduleux et exclusion irrévocable des acteurs malveillants.

                    4. Rejet du modèle prédateur des monopoles fermés :
                    Les géants technologiques mondiaux enferment souvent leurs usagers dans des écosystèmes propriétaires étanches (Walled Gardens). AJ-TECH défend une doctrine inverse : des plateformes ouvertes, fondées sur des protocoles d'échange documentés, où l'utilisateur conserve la propriété intégrale de son identité et de ses données.
                """.trimIndent(),
                contentHt = """
                    1. Kisa efè rezo vle di nan yon peyi k ap devlope :
                    Yon platfòm nimerik vin gen plis valè lè gen plis moun k ap sèvi avè l. An Ayiti, paske moun yo renmen ede fanmi ak zanmi, yon bon zouti ka gaye vit anpil. Men gen yon gwo difikilte nan kòmansman : kijan pou atire premye moun yo si poko gen lòt moun sou rezo a ?

                    2. Kijan AJ-TECH regle pwoblèm premye jou a :
                    Kijan w ka atire machann si poko gen achtè, e kijan achtè ap vin gade si pa gen machandiz ? Estrateji AJ-TECH se fè chak aplikasyon itil pou yon sèl moun an premye menm si pa gen lòt moun sou rezo a :
                    - AJ-Task itil yon sèl moun touswit pou jere travay pa l ;
                    - AJ-Commerce ede yon machann kontwole kisa l gen nan depo l poukont li ;
                    - Se apre sa, lè tout moun fin mete zouti a nan telefòn yo, rezo a vin mete yo an kontak pou bay plis fòs.

                    3. Kontwole move moun pou pwoteje kominote a :
                    Lè yon nouvo rezo louvri, si moun pa fè atansyon, vòlè ak koken ka kreye fo kont pou twonpe inosan. Pou anpeche sa, AJ-TECH mete bonjan kontwòl : verifye idantite moun yo, pèmèt moun denonse sa k pa mache, epi retire tout fo kont touswit pou tout moun ka santi yo an sekirite.

                    4. Refize bloke moun nan yon sèl sistèm fèmen :
                    Gwo konpayi nan mond lan renmen fèmen moun nan sistèm pa yo pou yo pa ka ale lòt kote. Prensip pa nou nan AJ-TECH se kreye platfòm ouvè kote chak moun lib, kote ou se mèt tout sa w ekri ak tout enfòmasyon sou lavi w.
                """.trimIndent(),
                plannedStartPage = 178,
                plannedEndPage = 179,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 134 : Interopérabilité et écosystèmes numériques ====================
            BookChapter(
                id = "ch_9_134",
                chapterNumber = 134,
                partId = "part_9",
                titleFr = "Chapitre 134 — Interopérabilité et écosystèmes numériques",
                titleHt = "Chapit 134 — Entèoperabilite ak ekosistèm nimerik",
                subtitleFr = "Standards ouverts, APIs modulaires, synchronisation des données et intégration fluide entre entités",
                subtitleHt = "Estanda ouvè, API ki konekte fasil, senkronizasyon done ak kominikasyon pwòp ant tout aplikasyon yo",
                summaryFr = "L'interopérabilité comme clé de voûte de l'écosystème AJ-TECH : formats ouverts, protocoles d'échanges sécurisés (REST/JSON), authentification unifiée et élimination des silos.",
                summaryHt = "Entèoperabilite kòm gwo poto mitan ekosistèm AJ-TECH la : fòma ouvè, koneksyon API an sekirite, yon sèl idantite pwoteje epi pèmèt aplikasyon yo pale ansanm san baryè.",
                contentFr = """
                    1. Le fléau des silos technologiques :
                    L'un des échecs historiques de l'informatisation réside dans la prolifération de logiciels fermés, incapables de communiquer entre eux. L'interopérabilité désigne l'aptitude fondamentale de systèmes et d'organisations distincts à fonctionner conjointement sans intervention manuelle complexe.

                    2. Les piliers techniques de l'interopérabilité chez AJ-TECH :
                    Pour que les 22 entités forment un écosystème cohérent et non une juxtaposition disparate d'applications, AJ-TECH applique des règles rigoureuses :
                    - Protocoles standardisés : Échanges basés sur les normes REST, des structures de données JSON validées par des schémas stricts et des spécifications OpenAPI documentées ;
                    - Identité numérique souveraine et transversale : Un compte unique sécurisé permettant de naviguer harmonieusement entre AJ-Task, AJ-Learn et les autres modules sans multiplier les mots de passe ;
                    - Schémas de synchronisation résilients : Mécanismes d'horodatage logique (Vector Clocks) et de résolution automatique de conflits de données en cas de modifications concurrentes hors ligne.

                    3. Architecture décentralisée et découplage :
                    L'interopérabilité ne doit pas créer de dépendance critique (Single Point of Failure). Si le module central de paiement ou de messagerie subit une indisponibilité temporaire, chaque application individuelle doit continuer de fonctionner en mode dégradé localement sans bloquer l'utilisateur.

                    4. Ouverture vers l'écosystème externe national :
                    À terme, les APIs d'AJ-TECH ont vocation à être documentées pour permettre aux développeurs tiers formés à l'EDH ou dans les universités partenaires d'enrichir l'écosystème de leurs propres modules innovants.
                """.trimIndent(),
                contentHt = """
                    1. Danje aplikasyon ki pa ka pale ansanm :
                    Youn nan pi gwo erè nan enfòmatik se lè yon konpayi bati anpil ti lojisyèl ki chak rete nan kwen pa yo san yo pa ka pataje okenn enfòmasyon. Entèoperabilite se kapasite pou diferan aplikasyon travay men nan men byen fasil san moun pa oblije kopye enfòmasyon alamen.

                    2. Gwo règ teknik pou lojisyèl AJ-TECH pale ansanm :
                    Pou tout 22 antite yo ka mache tankou yon sèl fanmi solid, AJ-TECH fikse bon prensip :
                    - Kominikasyon estanda : Sèvi ak metòd REST ak fòma JSON ke tout bon enjenyè rekonèt epi ki byen dokimante ;
                    - Yon sèl idantite sekirize : Yon sèl kont solid ki pèmèt sitwayen an pase soti nan AJ-Task pou l ale nan AJ-Learn san li pa bezwen tape 10 modpas diferan ;
                    - Ranje erè done poukont yo : Si de moun chanje yon menm enfòmasyon pandan yo pa t gen entènèt, sistèm nan konnen kijan pou l ranje sa pwòp lepli vit rezo a tounen.

                    3. Chak aplikasyon dwe ka kanpe sou de pye l :
                    Lè aplikasyon yo konekte ansanm, sa pa dwe vle di si youn bloke tout lòt yo dwe tonbe. Si sèvis mesaj la oswa sèvis peman an gen yon ti pann, AJ-Task dwe kontinye travay sou telefòn lan san pwoblèm pou moun pa janm bloke.

                    4. Ouvèti pou lòt jèn devlopè nan peyi a :
                    Plan nou se ekri tout eksplikasyon kòd sa yo byen klè pou nenpòt jèn etidyan ki soti nan EDH oswa nan lòt inivèsite ka vin bati pwòp bèl ti zouti pa yo ki konekte sou ekosistèm nan.
                """.trimIndent(),
                plannedStartPage = 179,
                plannedEndPage = 180,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 135 : Mesurer l’impact réel de l’innovation ====================
            BookChapter(
                id = "ch_9_135",
                chapterNumber = 135,
                partId = "part_9",
                titleFr = "Chapitre 135 — Mesurer l’impact réel de l’innovation",
                titleHt = "Chapit 135 — Mezire vrè enpak inovasyon an",
                subtitleFr = "Indicateurs d'usage réels contre vanity metrics : mesurer l'utilité sociale, l'adoption effective et la résilience",
                subtitleHt = "Vrè chif sou sèvis ki itil moun kont fo chif parèt : mezire kijan moun sèvi ak lojisyèl yo tout bon",
                summaryFr = "Méthodologie d'évaluation rigoureuse de l'impact technologique : distinguer l'ambition déclarée de l'adoption prouvée sur le terrain, rejeter les métriques de vanité et privilégier la création de valeur durable.",
                summaryHt = "Metòd solid pou mezire rezilta travay teknoloji a : fè diferans ant rèv ak reyalite sou teren an, refize bay manti sou chif epi chèche vrè sèvis ki dire.",
                contentFr = """
                    1. Rejeter les métriques de vanité (Vanity Metrics) :
                    Dans l'industrie numérique mondiale, l'illusion du succès est souvent mesurée à l'aune d'indicateurs trompeurs : nombre de téléchargements cumulés sans rétention, pages vues gonflées artificiellement, ou valorisations spéculatives déconnectées de la réalité. En Haïti, pays où les ressources sont rares et précieuses, AJ-TECH récuse fermement cette culture de l'artifice.

                    2. Les indicateurs d'impact authentiques adoptés par AJ-TECH :
                    Pour évaluer si une innovation produit une transformation tangible, nous privilégions des critères d'utilité réelle :
                    - L'usage actif et récurrent : L'application est-elle utilisée régulièrement chaque semaine par le citoyen pour son travail ou ses études ?
                    - Le taux de résilience hors ligne : Quel pourcentage des fonctionnalités critiques reste pleinement opérationnel en l'absence totale de réseau ?
                    - L'économie de ressources : Combien de mégaoctets de données et de minutes de batterie notre optimisation a-t-elle épargnés à l'utilisateur ?
                    - L'accomplissement effectif : Combien de tâches ont été menées à leur terme grâce à AJ-Task, ou combien d'heures d'études ont été concrétisées sur EDUKA ?

                    3. L'impact économique et social sur la communauté :
                    L'innovation technologique n'est pas une fin en soi. Sa justification ultime réside dans l'amélioration concrète des conditions de vie : gain de temps pour l'artisan, sécurisation des économies du commerçant, baisse du coût de l'éducation pour les familles et renforcement de l'autonomie nationale.

                    4. Honnêteté intellectuelle et acceptation lucide des limites :
                    Une entreprise ambitieuse en construction doit savoir regarder ses métriques avec sévérité. Si une fonctionnalité n'est pas adoptée par les usagers tests, nous n'invoquons pas des prétextes : nous analysons l'échec, nous écoutons les retours du terrain, et nous refactorisons le code jusqu'à ce qu'il serve réellement son public.
                """.trimIndent(),
                contentHt = """
                    1. Pa kite fo chif parèt twonpe nou :
                    Nan mond teknoloji a, anpil moun renmen vante tèt yo ak chif ki pa vle di anyen : kantite moun ki te telechaje yon aplikasyon men ki efase l jou apre a, oswa bèl chif ki pa pote anyen nan lavi pèsonn. Nan yon peyi tankou Ayiti kote kòb ak tan pa fasil pou jwenn, AJ-TECH refize rantre nan jwèt bèl parèt sa a.

                    2. Vrè mezi nou itilize pou wè si travay la bon :
                    Pou nou konnen si yon aplikasyon ap ede moun tout bon, nou gade kat gwo bagay :
                    - Èske moun nan sèvi ak lojisyèl la tout bon chak semèn pou travay li oswa lekòl li ?
                    - Èske lojisyèl la kontinye travay byen menm lè pa gen entènèt ditou ?
                    - Konbyen megabit ak konbyen batri lojisyèl la fè itilizatè a epaye grasa bon kòd ki lejè ?
                    - Konbyen travay ki te kòmanse epi ki te fini tout bon grasa AJ-Task, oswa konbyen leson elèv yo te etidye sou EDUKA ?

                    3. Chanjman reyèl nan lavi pèp la :
                    Teknoloji se pa pou fè bèl diskou. Sèl rezon li egziste se pou ede lavi moun vin pi fasil : ede yon bòs mason pa pèdi tan, pwoteje ti kòb yon machann, ede paran yo depanse mwens nan liv lekòl, epi fè peyi a vin pi djanm.

                    4. Di laverite menm lè yon bagay pa mache :
                    Lè yon antrepriz ap bati tèt li avèk disiplin, li dwe gen kouraj gade verite a nan je. Si nou mete yon ti bouton oswa yon sèvis epi moun sou teren an pa renmen l, nou pa kache sa : nou koute sa yo di nou, nou korije kòd la, epi nou travay pi di jiskaske zouti a vin itil moun yo tout bon.
                """.trimIndent(),
                plannedStartPage = 180,
                plannedEndPage = 181,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 136 : Construire l’innovation AJ-TECH 2026–2035 ====================
            BookChapter(
                id = "ch_9_136",
                chapterNumber = 136,
                partId = "part_9",
                titleFr = "Chapitre 136 — Construire l’innovation AJ-TECH 2026–2035",
                titleHt = "Chapit 136 — Konstwi inovasyon AJ-TECH 2026–2035",
                subtitleFr = "Feuille de route décennale de l'innovation et de la transformation des secteurs en Haïti",
                subtitleHt = "Plan travay sou 10 lane pou transfòme tout gwo sektè nan peyi d Ayiti ak bonjan inovasyon",
                summaryFr = "Feuille de route stratégique 2026–2035 pour l'innovation et la transformation sectorielle : les quatre phases d'exécution, la discipline méthodologique et l'engagement envers la nation haïtienne.",
                summaryHt = "Plan estratejik 2026–2035 pou fè inovasyon nan tout sektè yo : kat gwo etap travay, disiplin nan kòd la ak angajman pou peyi Dayiti nan transfòmasyon nimerik la.",
                contentFr = """
                    1. Vocation et rigueur de la feuille de route :
                    La transformation numérique d'une nation ne s'improvise pas par des coups d'éclat éphémères. Elle exige une vision stratégique claire, découpée en jalons temporels réalistes et mesurables. Cette feuille de route décennale ne promet pas de résultats commerciaux magiques garantis, mais formalise l'engagement d'ingénierie et de persévérance d'AJ-TECH pour les années 2026 à 2035.

                    2. Les quatre grandes phases de la transformation sectorielle 2026–2035 :

                    - Phase 1 (2026–2027) — Consolidation des fondations et validation des prototypes :
                      - Stabilisation de la PWA AJ-Task comme standard de productivité locale hors ligne ;
                      - Spécification détaillée et prototypage contrôlé des catalogues marchands d'AJ-Commerce ;
                      - Déploiement des premières ressources éducatives bilingues sur EDUKA et amorçage des modules EDH ;
                      - Publication intégrale et transparente des spécifications architecturales du livre.

                    - Phase 2 (2028–2030) — Déploiement des premiers pilotes et interopérabilité :
                      - Expérimentation de la passerelle d'interconnexion technique AJ-Pay avec les systèmes existants ;
                      - Tests fermés du carnet de prévention médicale AJ-Bioklin sous supervision de praticiens agréés ;
                      - Intégration des protocoles d'échange de données entre les différentes entités logicielles ;
                      - Premières formations intensives d'ingénieurs au sein des cursus techniques nationaux.

                    - Phase 3 (2031–2033) — Écosystème sectoriel intégré et maturité des plateformes :
                      - Généralisation des outils de gestion pour les petites entreprises avec AJ-Biz ;
                      - Mise en service des modules de cartographie participative sous AJ-Maps ;
                      - Consolidation institutionnelle d'un pôle d'ingénierie logicielle durable et financièrement autonome ;
                      - Évaluation rigoureuse et publique de l'impact socio-économique réel généré.

                    - Phase 4 (2034–2035) — Pleine souveraineté technologique et modèle exportable :
                      - Aboutissement de la cartographie des 22 entités interconnectées au service d'Haïti ;
                      - Autonomie technologique complète et capacité de concevoir des solutions logicielles frugales exportables dans toute la Caraïbe et les pays émergents ;
                      - Affirmation solennelle de notre devise nationale : « L'innovation haïtienne au service du monde ».

                    3. Conclusion de la Partie IX :
                    « Vision, Technologie et Avenir. » Avec le courage de l'effort, la transparence dans les actes et le refus absolu de la médiocrité, nous continuerons de coder chaque jour pour hisser Haïti jusqu'au sommet de l'ingénierie contemporaine.
                """.trimIndent(),
                contentHt = """
                    1. Yon bousòl travay sou 10 lane :
                    Transfòmasyon nimerik yon peyi pa fèt nan kouri san konprann ni nan fè bri san travay. Li mande yon gwo plan klè ki gen etap byen kalkile. Plan sa a pa fè fo pwomès sou siksè rapid san travay, men li fikse angajman solid AJ-TECH pou 10 lane k ap vini yo ant 2026 ak 2035.

                    2. Kat gwo etap nan plan inovasyon 2026–2035 lan :

                    - Faz 1 (2026–2027) — Bati fondasyon yo epi teste premye zouti yo :
                      - Fè PWA AJ-Task la vin pi djanm kòm prensipal zouti travay ki mache san entènèt ;
                      - Ekri tout plan teknik epi fè premye ti tès sou katalòg komès pou AJ-Commerce ;
                      - Mete premye bèl leson lekòl nan de lang sou EDUKA epi kòmanse prepare kou pou EDH ;
                      - Pibliye tout liv ak tout dokiman sa yo pou tout moun wè kijan n ap travay.

                    - Faz 2 (2028–2030) — Fè premye gwo tès an dirèk epi konekte lojisyèl yo :
                      - Fè premye ti tès teknik sou fason pou konekte sèvis peman AJ-Pay ak lòt sistèm ki egziste deja ;
                      - Fè ti tès byen kontwole sou kaye sante AJ-Bioklin anba konsèy bon doktè ki kalifye ;
                      - Pèmèt aplikasyon yo kòmanse pataje enfòmasyon byen fasil grasa bonjan estanda API ;
                      - Fòme premye gwo ekip jèn enjenyè ayisyen nan bonjan kòd ak sekirite nimerik.

                    - Faz 3 (2031–2033) — Mete tout sèvis yo mache ansanm byen solid :
                      - Ede tout ti boutik ak ti antrepriz sèvi ak AJ-Biz pou yo pa janm nan dezòd nan kès yo ;
                      - Kòmanse mete kat jeyografik AJ-Maps yo disponib pou ede moun jwenn kote yo prale pi vit ;
                      - Fè antrepriz la kanpe sou de pye l san bezwen depann sou èd lòt bò dlo ;
                      - Fè gwo rapò onèt sou sa zouti yo chanje tout bon nan lavi sitwayen yo.

                    - Faz 4 (2034–2035) — Libète total nan teknoloji ak egzanp pou tout lemonn :
                      - Tout 22 antite yo ap mache ansanm nan benefis peyi Dayiti ;
                      - Peyi a vin gen pwòp enjenyè pa l ki metrize tout zouti kòd epi ki ka ede lòt peyi nan Karayib la bati bon teknoloji ki pa koute chè ;
                      - Kanpe byen wo pou defann bèl deviz nou an : « Inovasyon ayisyen nan sèvis lemonn ».

                    3. Konklizyon Pati IX la :
                    « Vision, Technologie et Avenir. » Avèk kouraj pou nou travay di, onètete nan tout sa n ap fè, ak refi total pou nou fè travay kòbòy, n ap kontinye ekri bon kòd chak jou pou mennen Ayiti nan pi wo somè teknoloji sou latè.
                """.trimIndent(),
                plannedStartPage = 181,
                plannedEndPage = 182,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
