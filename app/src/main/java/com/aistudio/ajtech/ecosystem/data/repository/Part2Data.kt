package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE II — PHILOSOPHIE, MISSION, VISION ET VALEURS
 * Chapitres 13 à 24
 * Contenu éditorial maître — Source officielle de référence.
 */
object Part2Data {

    val part2: BookPart = BookPart(
        id = "part_2",
        partNumber = 2,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE II — PHILOSOPHIE, MISSION, VISION ET VALEURS",
        titleHt = "PATI II — FILOZOFI, MISYON, VIZYON AK VALÈ",
        subtitleFr = "Les principes directeurs, l'éthique et les fondements de notre engagement",
        subtitleHt = "Prensip k ap gide nou, etik ak baz angajman nou pou lavni",
        plannedPages = "pp. 31–46 (Pagination provisoire — à confirmer lors de la mise en page finale)",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 13 : La philosophie d'AJ-TECH ====================
            BookChapter(
                id = "ch_2_13",
                chapterNumber = 13,
                partId = "part_2",
                titleFr = "Chapitre 13 — La philosophie d'AJ-TECH",
                titleHt = "Chapit 13 — Filozofi AJ-TECH",
                subtitleFr = "L'innovation par la contrainte, l'apprentissage continu et le pragmatisme",
                subtitleHt = "Inovasyon nan mitan difikilte, aprantisaj san rete ak pratik",
                summaryFr = "Les fondements philosophiques d'AJ-TECH : transformer chaque contrainte en opportunité d'ingénierie, cultiver la souveraineté intellectuelle et concevoir des technologies utiles au bien commun.",
                summaryHt = "Prensip filozofik debaz AJ-TECH : transfòme chak pwoblèm an bonjan zouti, aprann poukont nou epi kreye teknoloji ki itil tout moun.",
                contentFr = """
                    La philosophie d'AJ-TECH ne relève pas d'une théorie abstraite déconnectée des réalités, mais d'une réflexion forgée sur le terrain, au cœur des défis quotidiens de Port-au-Prince. Elle repose sur la certitude que la contrainte n'est pas un frein, mais le catalyseur suprême de l'inventivité.
                    
                    Face aux pénuries énergétiques, aux limitations de bande passante et au manque d'infrastructures lourdes, notre doctrine s'articule autour de principes clairs :
                    1. Le pragmatisme absolu : préférer un logiciel sobre, léger et immédiatement fonctionnel à des systèmes surdimensionnés et inadaptés ;
                    2. L'apprentissage permanent : considérer chaque développeur comme un artisan intellectuel en formation continue ;
                    3. La responsabilité éthique : veiller à ce que chaque ligne de code serve directement le progrès des personnes et des organisations haïtiennes ;
                    4. La transparence institutionnelle : nous nous définissons rigoureusement comme une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet.
                    
                    Cette philosophie est le fil conducteur qui guide le développement de chacune de nos initiatives.
                """.trimIndent(),
                contentHt = """
                    Filozofi AJ-TECH pa soti nan gwo teyori nan liv sèlman, men nan leson nou tire sou teren an, nan mitan tout defi chak jou nan Pòtoprens. Li chita sou yon konviksyon solid : difikilte se pa yon baryè, men se pi gwo sous entèlijans ak kreyativite.
                    
                    Devan pwoblèm kouran, difikilte entènèt ak mank gwo enfrastrikti, prensip nou yo trè klè :
                    1. Solisyon pratik avan tout bagay : prefere yon lojisyèl ki senp, ki lejè epi ki mache touswit pase gwo sistèm konplike ki pa adapte ak reyalite a ;
                    2. Aprann san rete : konsidere chak devlopè tankou yon moun k ap ogmante konesans li chak jou ;
                    3. Responsablite moral : veye pou chak moso kòd nou ekri itil sitwayen yo ak tout antrepriz nan peyi a ;
                    4. Transparans total : nou defini tèt nou aklè kòm yon antrepriz anbisye k ap konstwi ki dokimante vwayaj li nan tout verite pandan l ap monte nan somè a.
                    
                    Filozofi sa a se bousòl ki gide tout pwojè n ap bati nan ekosistèm nan.
                """.trimIndent(),
                plannedStartPage = 31,
                plannedEndPage = 32,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 14 : L'innovation haïtienne au service du monde ====================
            BookChapter(
                id = "ch_2_14",
                chapterNumber = 14,
                partId = "part_2",
                titleFr = "Chapitre 14 — L'innovation haïtienne au service du monde",
                titleHt = "Chapit 14 — Inovasyon ayisyen nan sèvis lemonn",
                subtitleFr = "La devise officielle et la portée universelle de notre ingénierie",
                subtitleHt = "Deviz ofisyèl la ak valè inovasyon nou pou tout latè",
                summaryFr = "Explication de la devise officielle d'AJ-TECH : comment concevoir des solutions robustes pour Haïti crée naturellement des standards logiciels d'excellence pour le marché mondial.",
                summaryHt = "Eksplikasyon sou deviz ofisyèl AJ-TECH la : kijan kreye lojisyèl solid pou Ayiti pèmèt nou bay tout lemonn bonjan zouti modèn.",
                contentFr = """
                    La devise officielle d'AJ-TECH proclame avec fierté :
                    « L'innovation haïtienne au service du monde. »
                    
                    Cette formulation exprime une réalité technique fondamentale : si un logiciel est conçu selon les principes de frugalité, d'extrême légèreté et de résilience hors-ligne (Offline-First) pour fonctionner sans faille dans le contexte haïtien, il possède intrinsèquement les qualités requises pour conquérir n'importe quel marché à l'international.
                    
                    Notre démarche renverse la perspective traditionnelle de l'assistance : Haïti ne doit pas seulement consommer les technologies créées ailleurs, mais devenir une terre d'ingénierie et d'innovation capable d'exporter ses solutions, ses protocoles et ses modèles logiciels vers la Caraïbe, l'Afrique, les Amériques et l'Europe.
                """.trimIndent(),
                contentHt = """
                    Deviz ofisyèl AJ-TECH la di avèk anpil fyète :
                    « Inovasyon ayisyen nan sèvis lemonn » (L'innovation haïtienne au service du monde).
                    
                    Pawòl sa a gen yon gwo sans teknik dèyè l : si yon lojisyèl fèt pou l lejè, pou l pa gaspiye memwa, epi pou l mache byen san entènèt (Offline-First) nan kondisyon Ayiti, li gen tout kalite ki nesesè pou l reyisi nenpòt kote sou latè.
                    
                    Vizyon nou kraze vye lide ki vle fè konprann Ayiti la sèlman pou achte sa lòt moun fè : peyi nou dwe tounen yon kote k ap kreye bonjan teknoloji, k ap vann sèvis enfòmatik ak lojisyèl bay tout Karayib la, Amerik Latin, Afrik ak tout lòt kontinan yo.
                """.trimIndent(),
                plannedStartPage = 32,
                plannedEndPage = 33,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 15 : La mission ====================
            BookChapter(
                id = "ch_2_15",
                chapterNumber = 15,
                partId = "part_2",
                titleFr = "Chapitre 15 — La mission",
                titleHt = "Chapit 15 — Misyon an",
                subtitleFr = "Mettre Haïti sur l'échelle mondiale et faciliter l'accès de tous à la technologie",
                subtitleHt = "Mete Ayiti sou echèl mondyal epi fasilite tout moun jwenn aksè ak teknoloji",
                summaryFr = "La double mission fondamentale d'AJ-TECH : hisser Haïti parmi les nations productrices de technologie et démocratiser les outils numériques pour chaque citoyen.",
                summaryHt = "De gwo misyon fondamantal AJ-TECH : mete Ayiti nan ran peyi ki kreye teknoloji epi pèmèt chak sitwayen jwenn bon zouti nimerik.",
                contentFr = """
                    La mission institutionnelle d'AJ-TECH est clairement énoncée :
                    « Mettre Haïti sur l'échelle mondiale dans la technologie et faciliter l'accès de tous à la technologie. »
                    
                    Cette mission comporte deux dimensions indissociables :
                    - L'élévation globale : bâtir une réputation d'excellence technique pour les ingénieurs et créateurs haïtiens, en produisant des applications conformes aux plus hauts standards industriels internationaux ;
                    - La démocratisation locale : éliminer les barrières de coût, de connectivité et de complexité afin que chaque étudiant, commerçant, artisan et citoyen puisse tirer parti des outils numériques pour développer ses activités.
                    
                    Cette mission guide l'allocation de chaque ressource et chaque choix d'ingénierie au sein de l'entreprise.
                """.trimIndent(),
                contentHt = """
                    Misyon ofisyèl AJ-TECH ekri aklè pou tout moun konnen :
                    « Mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a. »
                    
                    Misyon sa a gen de gwo poto mitan :
                    - Fè non peyi a briye nan lemonn : montre bon nivo konesans ak kapasite enjenyè ak kreyatè ayisyen yo genyen, nan kreye lojisyèl ki respekte pi gwo estanda entènasyonal yo ;
                    - Louvri teknoloji pou tout sitwayen : kraze baryè pri twò chè, difikilte entènèt ak lojisyèl konplike, pou chak etidyan, machann, atizan ak tout moun ka jwenn zouti pou amelyore lavi yo.
                    
                    Misyon sa a se li k ap dirije chak desizyon ak chak liy kòd n ap pwodui nan antrepriz la.
                """.trimIndent(),
                plannedStartPage = 34,
                plannedEndPage = 35,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 16 : La vision 2035 ====================
            BookChapter(
                id = "ch_2_16",
                chapterNumber = 16,
                partId = "part_2",
                titleFr = "Chapitre 16 — La vision 2035",
                titleHt = "Chapit 16 — Vizyon 2035 lan",
                subtitleFr = "Devenir un géant de la technologie pas à pas",
                subtitleHt = "Vin tounen yon jeyan nan teknoloji etap pa etap",
                summaryFr = "La feuille de route décennale (2026–2035) pour bâtir un écosystème technologique souverain, complet et respecté mondialement.",
                summaryHt = "Plan 10 lane (2026–2035) pou bati yon ekosistèm nimerik nasyonal ki solid, endepandan epi respekte nan tout mond lan.",
                contentFr = """
                    La vision d'AJ-TECH à l'horizon 2035 est ambitieuse et méthodique :
                    « Devenir un géant de la technologie. »
                    
                    Cette ambition ne relève pas de la prétention, mais d'un plan de travail rigoureux échelonné sur une décennie :
                    - Phase 1 (2026–2027) : Fondation et validation des architectures pilotes (consolidation de la PWA AJ-Task, standardisation des bibliothèques de code, formation initiale) ;
                    - Phase 2 (2028–2030) : Déploiement des solutions structurantes (éducation avec EDUKA, énergie avec EDH, productivité et commerce) ;
                    - Phase 3 (2031–2035) : Établissement du cloud souverain, expansion internationale et reconnaissance mondiale des services AJ-.
                    
                    Chaque phase est abordée avec la rigueur d'une entreprise en construction qui avance avec persévérance et humilité.
                """.trimIndent(),
                contentHt = """
                    Vizyon AJ-TECH pou lane 2035 chita sou yon gwo objektif ki bati ak disiplin :
                    « Vin tounen yon jeyan nan teknoloji. »
                    
                    Gwo anbisyon sa a se pa pawòl anlè, se yon plan travay estratejik sou 10 lane :
                    - Premye Faz (2026–2027) : Mete baz yo epi valide premye lojisyèl tès yo (amelyore PWA AJ-Task, prepare bibliyotèk kòd, kòmanse fòmasyon) ;
                    - Dezyèm Faz (2028–2030) : Louvri gwo zouti enpòtan yo (edikasyon ak EDUKA, enèji ak EDH, komès ak jesyon travay) ;
                    - Twazyèm Faz (2031–2035) : Bati cloud nasyonal la, elaji sèvis yo lòt bò dlo epi fè lemonn rekonèt ekosistèm AJ- la.
                    
                    Nou travay sou chak etap avèk pasyans, disiplin ak imilite yon antrepriz k ap bati chak jou.
                """.trimIndent(),
                plannedStartPage = 35,
                plannedEndPage = 36,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 17 : L'accessibilité technologique ====================
            BookChapter(
                id = "ch_2_17",
                chapterNumber = 17,
                partId = "part_2",
                titleFr = "Chapitre 17 — L'accessibilité technologique",
                titleHt = "Chapit 17 — Fasilite aksè nan teknoloji",
                subtitleFr = "Concevoir pour tous les citoyens sans barrière matérielle ou financière",
                subtitleHt = "Kreye pou tout sitwayen san baryè materyèl oswa lajan",
                summaryFr = "L'exigence d'accessibilité numérique : interfaces bilingues (FR/HT), compatibilité avec les appareils d'entrée de gamme et fonctionnement garanti à basse bande passante.",
                summaryHt = "Kondisyon pou teknoloji rive jwenn tout moun : lang Franse ak Kreyòl Ayisyen, mache sou ti telefòn senp epi fonksyone menm ak koneksyon fèb.",
                contentFr = """
                    L'accessibilité n'est pas une option esthétique pour AJ-TECH, c'est une exigence d'ingénierie fondamentale. Un produit numérique qui ne peut être utilisé que par une infime minorité aisée disposant d'équipements de pointe manque sa cible sociétale.
                    
                    Notre engagement pour l'accessibilité se traduit par :
                    - L'optimisation extrême des performances pour les smartphones modestes ;
                    - Le support bilingue intégral en Français et Kreyòl Ayisyen ;
                    - L'architecture Offline-First permettant une utilisation ininterrompue sans connexion permanente ;
                    - Des interfaces utilisateur intuitives réduisant la fracture numérique pour les personnes peu familières des outils informatiques.
                """.trimIndent(),
                contentHt = """
                    Pou AJ-TECH, fasilite aksè nan teknoloji se pa yon senp chwa, se yon obligasyon nan jan n ap kode. Yon lojisyèl ki mache sèlman pou yon ti gwoup moun ki gen gwo telefòn chè pa itil peyi a vre.
                    
                    Angajman nou pou mete teknoloji nan men tout moun chita sou :
                    - Fè aplikasyon yo lejè pou yo kouri vit sou nenpòt ti smartphone senp ;
                    - Mete tout tèks ak fonksyon an Franse ak Kreyòl Ayisyen ;
                    - Adopte prensip Offline-First pou moun ka travay menm lè pa gen entènèt ;
                    - Kreye ekran ki senp e klè pou nenpòt moun ka sèvi avè yo fasil san yo pa bezwen gwo diplòm enfòmatik.
                """.trimIndent(),
                plannedStartPage = 37,
                plannedEndPage = 38,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 18 : La souveraineté numérique ====================
            BookChapter(
                id = "ch_2_18",
                chapterNumber = 18,
                partId = "part_2",
                titleFr = "Chapitre 18 — La souveraineté numérique",
                titleHt = "Chapit 18 — Souverènte nimerik",
                subtitleFr = "Maîtriser nos données, nos infrastructures et notre code",
                subtitleHt = "Metrize done nou, enfrastrikti nou ak kòd nou",
                summaryFr = "La souveraineté numérique comme pilier d'indépendance nationale : protection des données stratégiques, réduction de la dépendance externe et développement de compétences logicielles locales.",
                summaryHt = "Souverènte nimerik kòm kle pou libète peyi a : pwoteje done enpòtan yo, sispann depann totalman de lòt peyi epi metrize kòd la lokalman.",
                contentFr = """
                    La souveraineté numérique constitue la condition sine qua non de l'autonomie économique et culturelle au XXIe siècle. Dépendre entièrement de plateformes étrangères pour gérer l'éducation, le commerce, les communications et l'administration expose un pays à une vulnérabilité critique.
                    
                    Bâtir la souveraineté numérique haïtienne implique :
                    - La maîtrise du code source de nos outils essentiels ;
                    - La protection et la territorialisation des données citoyennes et institutionnelles ;
                    - L'émergence d'une communauté nationale d'architectes logiciels capables d'assurer la maintenance et l'évolution des systèmes sans dépendre d'acteurs extérieurs.
                """.trimIndent(),
                contentHt = """
                    Souverènte nimerik se kle pou libète ekonomik ak kiltirèl nan 21yèm syèk la. Lè yon peyi depann totalman de platfòm lòt bò dlo pou jere lekòl, komès, kominikasyon ak administrasyon l, li mete tèt li anba gwo danje.
                    
                    Bati yon vrè souverènte nimerik pou Ayiti mande pou nou :
                    - Metrize kòd sous zouti prensipal nou yo ;
                    - Pwoteje done sitwayen yo ak enstitisyon yo pou yo pa nan men etranje san kontwòl ;
                    - Fòme yon gwo kominote enjenyè ayisyen ki kapab repare, amelyore epi devlope nouvo sistèm poukont yo.
                """.trimIndent(),
                plannedStartPage = 38,
                plannedEndPage = 39,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 19 : L'éthique technologique ====================
            BookChapter(
                id = "ch_2_19",
                chapterNumber = 19,
                partId = "part_2",
                titleFr = "Chapitre 19 — L'éthique technologique",
                titleHt = "Chapit 19 — Etik teknolojik",
                subtitleFr = "Transparence, vérité opérationnelle et respect des utilisateurs",
                subtitleHt = "Transparans, verite sou nivo travay la ak respè pou itilizatè yo",
                summaryFr = "Les règles déontologiques d'AJ-TECH : vérité stricte sur le statut réel des projets, protection absolue de la vie privée et rejet des manipulations commerciales.",
                summaryHt = "Règ etik ak disiplin AJ-TECH : toujou di laverite sou eta reyèl chak pwojè, pwoteje lavi prive moun epi refize tout fo pwomès.",
                contentFr = """
                    L'éthique technologique n'est pas un discours de circonstance, mais une discipline quotidienne appliquée à chaque décision technique et managériale.
                    
                    Nos engagements éthiques majeurs sont :
                    1. La vérité sur nos statuts : ne jamais présenter un concept comme un produit fini, ni un prototype en test pilote comme une solution commercialisée ;
                    2. Le respect de la vie privée : minimiser la collecte de données, refuser la revente d'informations personnelles et chiffrer les données sensibles ;
                    3. L'usage loyal de l'intelligence artificielle : mobiliser l'IA pour augmenter la productivité et l'apprentissage, jamais pour tromper ou désinformer.
                """.trimIndent(),
                contentHt = """
                    Etik teknolojik se pa bèl pawòl pou fè plezi, se yon disiplin chak jou nan fason n ap ekri kòd ak jan n ap dirije antrepriz la.
                    
                    Gwo angajman etik nou yo se :
                    1. Di laverite sou nivo travay la : pa janm pran yon senp lide (konsèp) pou yon lojisyèl ki fini, ni pran yon pwototip k ap teste pou yon bagay k ap vann ;
                    2. Respekte lavi prive moun : pa ranmase done moun san rezon, refize vann enfòmasyon pèsonèl epi pwoteje tout done enpòtan ;
                    3. Bon itilizasyon entèlijans atifisyèl (IA) : sèvi ak IA pou aprann pi vit ak travay pi byen, men pa janm pou twonpe moun oswa fè manti.
                """.trimIndent(),
                plannedStartPage = 39,
                plannedEndPage = 40,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 20 : Le travail avant le prestige ====================
            BookChapter(
                id = "ch_2_20",
                chapterNumber = 20,
                partId = "part_2",
                titleFr = "Chapitre 20 — Le travail avant le prestige",
                titleHt = "Chapit 20 — Travay anvan parèt",
                subtitleFr = "Privilégier la solidité du code et les résultats mesurables au paraître",
                subtitleHt = "Mete fòs sou bon kalite kòd ak rezilta reyèl olye de fè wè",
                summaryFr = "Le culte du travail bien fait : préférer la rigueur discrète du développement et des tests à l'agitation superficielle et aux prétentions prématurées.",
                summaryHt = "Valè travay byen fèt : chwazi pase tan kode epi teste lojisyèl yo olye de fè bèl diskou san rezilta konkrè.",
                contentFr = """
                    Dans l'univers technologique contemporain, le piège le plus fréquent consiste à rechercher la notoriété avant d'avoir bâti des fondations solides. AJ-TECH rejette catégoriquement cette dérive.
                    
                    Notre culture privilégie :
                    - L'artisanat du code : passer des heures à nettoyer une base logicielle, à optimiser une requête et à corriger des bugs silencieux plutôt que de multiplier les annonces sensationnalistes ;
                    - La patience constructive : accepter que les grandes réalisations nécessitent des années d'efforts continus dans l'ombre avant de produire leurs pleins effets ;
                    - Le respect du travail bien fait : évaluer les progrès à l'aune de la stabilité réelle des systèmes et de la satisfaction concrète des usagers.
                """.trimIndent(),
                contentHt = """
                    Nan mond teknoloji jodi a, anpil moun tonbe nan pyèj chèche fè bri ak pran pòz anvan menm yo gen yon bon pwodwi nan men yo. AJ-TECH refize konpòtman sa a nèt.
                    
                    Kilti travay nou chita sou :
                    - Renmen travay kòd la byen : pase anpil tan ap netwaye kòd la, repare ti erè kache epi rann aplikasyon an pi rapid olye de fè gwo bèl diskou ;
                    - Pasyans nan konstriksyon : konprann gwo bagay mande anpil ane travay di san bri anvan rezilta yo parèt aklè ;
                    - Respè pou travay byen fèt : mezire avansman nou sou jan sistèm yo mache byen ak jan moun ki sèvi avè yo satisfè.
                """.trimIndent(),
                plannedStartPage = 41,
                plannedEndPage = 42,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 21 : L'apprentissage permanent ====================
            BookChapter(
                id = "ch_2_21",
                chapterNumber = 21,
                partId = "part_2",
                titleFr = "Chapitre 21 — L'apprentissage permanent",
                titleHt = "Chapit 21 — Aprann tout tan san rete",
                subtitleFr = "L'autodidaxie comme moteur d'adaptation et de maîtrise technique",
                subtitleHt = "Aprann poukont ou kòm gwo motè pou metrize teknoloji",
                summaryFr = "L'importance de l'auto-formation continue face à l'accélération technologique mondiale, l'intelligence artificielle et l'évolution des architectures.",
                summaryHt = "Enpòtans pou kontinye aprann chak jou devan gwo vitès teknoloji a, entèlijans atifisyèl ak nouvo metòd pwogramasyon.",
                contentFr = """
                    La technologie évolue à un rythme vertigineux. Ce qui était à la pointe hier devient obsolète demain. Dans ce contexte, la compétence la plus précieuse d'un bâtisseur technologique n'est pas la maîtrise d'un langage particulier, mais sa capacité à apprendre vite et en continu.
                    
                    AJ-TECH érige l'apprentissage autodidacte en culture centrale :
                    - Se former sans attendre : explorer les documentations techniques, expérimenter de nouveaux paradigmes et maîtriser les outils modernes (PWA, cloud, IA) ;
                    - Partager le savoir : documenter minutieusement ses découvertes pour hisser le niveau collectif de l'écosystème ;
                    - Cultiver l'humilité intellectuelle : reconnaître ce qu'on ignore et consacrer le temps nécessaire à son assimilation approfondie.
                """.trimIndent(),
                contentHt = """
                    Teknoloji ap kouri ak yon vitès terib. Sa ki te nouvo yè ka vin fin vye granmoun demen. Nan sitiyasyon sa a, pi gwo kalite yon enjenyè se pa sèlman konnen yon langaj kòd, men se kapasite pou l aprann vit tout sa k ap chanje.
                    
                    AJ-TECH mete aprann poukont ou nan sant kilti l :
                    - Fòme tèt ou san tann pèsonn : li bon dokimantasyon teknik, teste nouvo zouti epi metrize teknoloji modèn yo (PWA, cloud, IA) ;
                    - Pataje sa w konnen : ekri tout sa w dekouvri pou ede tout lòt jèn nan kominote a monte nan nivo ;
                    - Rete ak lespri ouvè : rekonèt sa w pa konnen epi pran tan pou etidye l jiskaske w metrize l nèt.
                """.trimIndent(),
                plannedStartPage = 43,
                plannedEndPage = 44,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 22 : La jeunesse haïtienne ====================
            BookChapter(
                id = "ch_2_22",
                chapterNumber = 22,
                partId = "part_2",
                titleFr = "Chapitre 22 — La jeunesse haïtienne",
                titleHt = "Chapit 22 — Jèn ayisyen yo",
                subtitleFr = "Le capital le plus précieux et l'énergie créatrice de notre avenir",
                subtitleHt = "Pi gwo richès peyi a ak fòs k ap bati lavni nou",
                summaryFr = "La jeunesse haïtienne comme cœur battant d'AJ-TECH : son potentiel d'innovation, sa résilience exceptionnelle et son rôle central dans la transformation numérique.",
                summaryHt = "Jèn ayisyen yo kòm kè ak nanm AJ-TECH : entèlijans yo, fòs kouraj yo ak gwo wòl yo genyen pou chanje figi peyi a ak teknoloji.",
                contentFr = """
                    La véritable richesse d'Haïti ne réside pas dans ses ressources matérielles, mais dans sa jeunesse : vive, résiliente, créative et passionnée de technologie.
                    
                    AJ-TECH s'adresse en priorité à cette jeunesse pour lui dire :
                    « Vous êtes forts, vous avez d'immenses capacités. Ne laissez personne vous convaincre que la technologie d'excellence est hors de votre portée. »
                    
                    Notre vocation est d'offrir à ces jeunes des outils d'apprentissage rigoureux, des projets concrets sur lesquels exercer leurs talents, et une perspective d'avenir digne au sein de leur propre pays.
                """.trimIndent(),
                contentHt = """
                    Vrè richès Ayiti pa chita nan gwo mwayen materyèl, men nan jèn li yo : jèn ki entèlijan, ki gen kouraj, ki kreyatif epi ki pasyone pou teknoloji.
                    
                    AJ-TECH voye yon mesaj klè bay tout jèn sa yo :
                    « Nou fò, nou gen anpil kapasite. Pa janm kite okenn moun fè nou kwè nou pa ka kreye pi bon teknoloji nan mond lan. »
                    
                    Misyon nou se bay jèn sa yo bon zouti pou yo etidye, bon pwojè konkrè pou yo pratike talan yo, epi yon bèl espwa pou yo reyisi lakay yo nan diyite.
                """.trimIndent(),
                plannedStartPage = 44,
                plannedEndPage = 45,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 23 : Construire avec les Haïtiens ====================
            BookChapter(
                id = "ch_2_23",
                chapterNumber = 23,
                partId = "part_2",
                titleFr = "Chapitre 23 — Construire avec les Haïtiens",
                titleHt = "Chapit 23 — Bati ansanm ak tout Ayisyen",
                subtitleFr = "Union des forces locales et de la diaspora pour un impact durable",
                subtitleHt = "Mete fòs lokal yo ak dyaspora a ansanm pou yon gwo chanjman k ap dire",
                summaryFr = "L'approche participative et collaborative : bâtir un écosystème ouvert unissant les talents d'Haïti et de la diaspora dans une vision commune.",
                summaryHt = "Fason nou travay ansanm : bati yon ekosistèm louvri ki rasanble tout konpetans Ayiti ak dyaspora a nan menm vizyon an.",
                contentFr = """
                    Aucune transformation technologique durable ne peut être l'œuvre d'un individu isolé. AJ-TECH repose sur une vision collaborative et inclusive : construire avec et pour les Haïtiens, sur le territoire national et dans la diaspora.
                    
                    Cette démarche collaborative s'incarne par :
                    - L'écoute attentive des retours des premiers utilisateurs pilotes d'AJ-Task ;
                    - La création d'espaces d'échange ouverts pour les développeurs, étudiants et passionnés de technologie ;
                    - L'intégration active des compétences, des réseaux et de l'expérience de la diaspora haïtienne répartie à travers le monde.
                """.trimIndent(),
                contentHt = """
                    Okenn gwo chanjman teknolojik k ap dire pa ka fèt pa yon sèl moun poukont li. AJ-TECH chita sou yon vizyon kote tout moun mete men : bati ansanm ak tout Ayisyen, kit yo nan peyi a kit yo nan dyaspora a.
                    
                    Kolaborasyon sa a parèt aklè nan :
                    - Koute avèk atansyon tout konsèy moun k ap teste premye vèsyon AJ-Task yo ;
                    - Louvri espas pou devlopè, etidyan ak moun ki renmen kòd ka pale epi travay ansanm ;
                    - Mete fòs ak tout konesans, eksperyans ak kontak frè ak sè nou yo nan dyaspora a genyen toupatou sou latè.
                """.trimIndent(),
                plannedStartPage = 45,
                plannedEndPage = 46,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 24 : Les valeurs fondamentales ====================
            BookChapter(
                id = "ch_2_24",
                chapterNumber = 24,
                partId = "part_2",
                titleFr = "Chapitre 24 — Les valeurs fondamentales",
                titleHt = "Chapit 24 — Valè fondamantal yo",
                subtitleFr = "Travail, persévérance, intégrité, excellence et foi dans l'avenir",
                subtitleHt = "Travay, pèseverans, entegrite, ekselans ak konfyans nan lavni",
                summaryFr = "Récapitulation des valeurs cardinales scellant la Partie II : la charte morale qui cimente l'engagement d'AJ-TECH vers le sommet.",
                summaryHt = "Rezime gwo valè fondamantal ki fèmen Pati II a : angajman moral ki cimente vwayaj AJ-TECH la nan wout pou rive nan somè a.",
                contentFr = """
                    La Partie II de cet ouvrage se conclut par la réaffirmation solennelle des cinq valeurs cardinales qui forment le ciment d'AJ-TECH :
                    
                    1. Le Travail : l'effort constant et la rigueur d'exécution comme unique fondement de la réussite ;
                    2. La Persévérance : la force d'âme qui permet de surmonter chaque obstacle sans jamais renoncer ;
                    3. L'Intégrité : l'honnêteté intellectuelle et la transparence absolue dans la conduite de nos projets ;
                    4. L'Excellence : le refus du compromis sur la qualité et la robustesse de notre code ;
                    5. La Foi dans l'avenir : la certitude inébranlable qu'Haïti a toute sa place parmi les grandes nations technologiques de ce siècle.
                    
                    « Rien n'est facile sans le travail. Continuons de lutter pour arriver au sommet. »
                """.trimIndent(),
                contentHt = """
                    Pati II liv sa a fini avèk gwo rapèl senk valè prensipal ki fè tout fòs AJ-TECH :
                    
                    1. Travay : fè efò chak jou ak disiplin kòm sèl vrè chemen pou reyisi ;
                    2. Pèseverans : kouraj pou n pa janm dekouraje devan okenn difikilte ;
                    3. Entegrite : di laverite tout tan epi rete transparan nan tout sa n ap fè ;
                    4. Ekselans : refize travay koutba epi toujou chèche pi bon kalite nan kòd nou ;
                    5. Konfyans nan lavni : konviksyon solid Ayiti gen tout plas li nan mitan gwo nasyon teknolojik yo nan syèk sa a.
                    
                    « Anyen pa fasil san travay. Ann kontinye goumen pou nou rive nan somè a. »
                """.trimIndent(),
                plannedStartPage = 46,
                plannedEndPage = 46,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
