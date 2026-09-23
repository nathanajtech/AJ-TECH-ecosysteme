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
            subtitleFr = "Dédicace, Remerciements, Préface, Manifeste, Bio, Avant-propos et Introduction générale",
            subtitleHt = "Dedikas, Remèsiman, Prefas, Manifès, Byo, Avan-pwopo ak Entwodiksyon jeneral",
            plannedPages = "pp. 1–14 (Pagination provisoire — à confirmer lors de la mise en page finale)",
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
                    plannedEndPage = 8,
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
                    plannedStartPage = 9,
                    plannedEndPage = 10,
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
                    plannedStartPage = 11,
                    plannedEndPage = 12,
                    estimatedReadMinutes = 2,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_avant_propos",
                    chapterNumber = 6,
                    partId = "part_front",
                    titleFr = "Avant-propos",
                    titleHt = "Avan-pwopo",
                    subtitleFr = "Pourquoi documenter AJ-TECH dès aujourd'hui : transparence, méthode et vision",
                    subtitleHt = "Poukisa dokimante AJ-TECH depi jodi a : transparans, metòd ak vizyon",
                    summaryFr = "Explication des motifs de cet ouvrage : poser un jalon durable, documenter le processus de construction en temps réel, expliciter la frontière entre prototype et vision, et s'engager avec transparence envers la communauté haïtienne pour la décennie 2026–2035.",
                    summaryHt = "Eksplikasyon sou rezon ki fè liv sa a fèt : kite yon tras solid sou pakou a, dokimante konstriksyon an an dirèk, montre diferans ant prototip ak vizyon, epi pran angajman ak pèp la pou peryòd 2026–2035 lan.",
                    contentFr = """
                        Pourquoi entreprendre la rédaction d'un ouvrage de cette envergure au moment même où l'écosystème AJ-TECH est en pleine phase de fondation ?
                        
                        La réponse tient en un principe fondamental : documenter pour construire durablement. Trop souvent, les initiatives technologiques et entrepreneuriales dans les pays émergents s'éteignent sans laisser de traces méthodologiques, de spécifications claires ou de doctrine accessible aux générations futures. Documenter AJ-TECH dès aujourd'hui, c'est poser un acte de transmission, d'exigence intellectuelle et de responsabilité publique.
                        
                        Cet avant-propos pose une règle absolue qui gouverne chaque page de ce livre : la transparence totale.
                        Nous établissons une distinction formelle et rigoureuse entre quatre niveaux de maturité :
                        1. Ce qui est opérationnel : les solutions logicielles effectivement déployées, testées et utilisables (comme la PWA AJ-Task) ;
                        2. Ce qui est en développement ou au stade de prototype : les architectures en cours de codage et d'expérimentation ;
                        3. Ce qui relève du concept d'ingénierie : les modèles fonctionnels spécifiés mais pas encore implémentés ;
                        4. Ce qui constitue la vision stratégique : les perspectives planifiées pour la décennie 2026–2035.
                        
                        Nous ne cherchons pas à embellir artificiellement la réalité. Bâtir des solutions technologiques robustes à Port-au-Prince exige de se confronter quotidiennement aux contraintes d'énergie, de bande passante et d'isolement infrastructurel. Ce livre est un appel à bâtir ensemble — avec les ingénieurs, les étudiants, les enseignants, la diaspora et tous les citoyens haïtiens — un édifice technologique digne, pérenne et respecté dans le monde entier.
                    """.trimIndent(),
                    contentHt = """
                        Poukisa nou deside ekri yon gwo liv konsa nan moman menm kote ekosistèm AJ-TECH la ap mete premye baz li yo ?
                        
                        Repons lan chita sou yon prensip senp : dokimante pou nou ka bati yon bagay k ap dire. Twò souvan, bèl inisyativ teknoloji disparèt san yo pa kite tras, san plan klè, san zouti pou jenerasyon k ap vini yo ka aprann sou yo. Lè nou dokimante AJ-TECH depi kounye a, nou chwazi transmèt konesans, mete disiplin nan travay nou epi pran responsablite nou devan tout sosyete a.
                        
                        Avan-pwopo sa a fikse yon prensip fondamantal ki travèse tout liv la : transparans total.
                        Nou fè yon diferans klè ant kat nivo nan pwojè nou yo :
                        1. Sa ki fonksyonèl kounye a : lojisyèl ki deja devlope, teste epi moun ka itilize (tankou PWA AJ-Task) ;
                        2. Sa k ap devlope oswa ki nan faz prototip : lojisyèl ekip la ap kode epi teste kounye a ;
                        3. Sa ki nan faz konsepsyon : plan teknik ak modèl ki fin ekri men ki poko kode ;
                        4. Sa ki fè pati vizyon estratejik la : gwo objektif nou fikse pou peryòd 2026–2035 lan.
                        
                        Nou pa la pou nou fè bèl diskou ki pa gen anyen dèyè yo. Bati teknoloji nan Pòtoprens mande pou nou gade verite a nan je : pwoblèm kouran, difikilte entènèt ak mank enfrastrikti. Liv sa a se yon envitasyon pou tout Ayisyen — enjenyè, etidyan, pwofesè, dyaspora ak tout sitwayen — pou nou mete men ansanm pou bati yon vrè souverènte teknolojik pou peyi nou.
                    """.trimIndent(),
                    plannedStartPage = 13,
                    plannedEndPage = 13,
                    estimatedReadMinutes = 3,
                    status = BookContentStatus.AVAILABLE
                ),
                BookChapter(
                    id = "front_introduction",
                    chapterNumber = 7,
                    partId = "part_front",
                    titleFr = "Introduction générale",
                    titleHt = "Entwodiksyon jeneral",
                    subtitleFr = "AJ-TECH et l'émergence d'un écosystème numérique souverain",
                    subtitleHt = "AJ-TECH ak nesans yon ekosistèm nimerik nasyonal",
                    summaryFr = "Présentation globale d'AJ-TECH, du contexte technologique haïtien, de la mission et de la vision 2026–2035, du slogan, de la devise 'L'innovation haïtienne au service du monde', des 22 entités, de la structure des Parties I à XI et des engagements de transparence sur l'état réel des projets.",
                    summaryHt = "Prezantasyon jeneral AJ-TECH, kontèks teknoloji an Ayiti, misyon ak vizyon 2026–2035, eslogan, deviz 'Inovasyon ayisyen nan sèvis lemonn', 22 antite yo, plan Pati I rive XI ak angajman klè sou eta chak pwojè.",
                    contentFr = """
                        AJ-TECH est une initiative technologique et entrepreneuriale née en 2025 à Port-au-Prince, avec une conviction centrale : l'indépendance économique et le progrès social d'Haïti au XXIe siècle reposent sur sa capacité à produire, maîtriser et exporter ses propres technologies.
                        
                        Le contexte haïtien est caractérisé par des défis structurels majeurs mais également par une jeunesse vibrante, créative et avide d'opportunités. Face à ces réalités, la mission d'AJ-TECH est de mettre Haïti sur l'échiquier mondial de la technologie et de démocratiser l'accès aux outils numériques pour l'ensemble des citoyens. Notre vision à l'horizon 2035 est d'établir un réseau d'ingénierie et de services logiciels complet, souverain, interopérable et résilient.
                        
                        Notre slogan : 'Vision, Technologie et Avenir'.
                        Notre devise immuable : 'L'innovation haïtienne au service du monde'.
                        
                        Cet ouvrage détaille les 22 entités qui composent la cartographie de notre écosystème, réparties en pôles complémentaires : logiciels utilitaires (AJ-Task), éducation et transmission du savoir (EDUKA, AJ-Learn, AJ-MathQuest), infrastructures et énergie (EDH, AJ-Cloud), santé, bien-être et services citoyens (AJ-Bioklin, AJ-Fitness, AJ-Tè), économie, finance et accompagnement (AJ-Pay, AJ-Wallet, AJ-Commerce, AJ-Biz), communication, médias et création (AJ-Chat, AJ-Meet, AJ-Mail, AJ-Studio, AJ-Dev), cartographie et assistance intelligente (AJ-Maps, AJ-Assistant), ainsi que le pôle philanthropique et d'inclusion numérique (AJ-Fondation) articulés autour de la maison-mère (AJ-TECH).
                        
                        La structure du livre est articulée en 11 Parties thématiques et progressives :
                        - Partie I : Genèse et fondation d'AJ-TECH (le point de départ et le parcours fondateur) ;
                        - Partie II : Philosophie, mission, vision et valeurs cardinales ;
                        - Partie III : Les 22 entités de l'écosystème AJ-TECH (fiches d'ingénierie complètes) ;
                        - Partie IV : Architecture technologique (PWA, Offline-First, IndexedDB, Cloud souverain) ;
                        - Partie V : Économie, entrepreneuriat et modèle d'affaires ;
                        - Partie VI : Éducation, compétences et capital humain ;
                        - Partie VII : Sécurité, souveraineté numérique et confiance ;
                        - Partie VIII : Intelligence artificielle, innovation et avenir ;
                        - Partie IX : Rayonnement, diaspora et ouverture internationale ;
                        - Partie X : Gouvernance, organisation et construction d'une entreprise technologique ;
                        - Partie XI : Horizon 2035 : Construire l’avenir numérique haïtien ;
                        - Annexes : Fiche technique de l'application et Glossaire technologique bilingue (pp. 215–218).
                        
                        Conformément à notre charte d'honnêteté intellectuelle, chaque projet est rigoureusement identifié selon son statut réel (Opérationnel, En développement / Prototype, Concept, Planifié). Ce livre constitue notre feuille de route ouverte, partagée et assumée pour bâtir l'avenir numérique d'Haïti.
                    """.trimIndent(),
                    contentHt = """
                        AJ-TECH se yon inisyativ teknolojik ak antreprenaryal ki fèt an 2025 nan Pòtoprens, avèk yon gwo konviksyon : libète ekonomik ak devlopman sosyal peyi d Ayiti nan 21yèm syèk la depann sou kapasite nou pou nou kreye, metrize epi vann pwòp teknoloji pa nou bay lemonn.
                        
                        Sitiyasyon peyi a prezante anpil gwo defi men li genyen tou yon jènès ki gen anpil entèlijans, pasyon ak volonte pou aprann. Nan kontèks sa a, misyon AJ-TECH se mete Ayiti sou kat mondyal teknoloji a epi fè zouti dijital yo rive nan men tout moun san distenksyon. Vizyon nou pou 2035 se bati yon rezo lojisyèl ak sèvis konplè, endepandan, solid epi ki mache menm nan kondisyon ki pi difisil yo.
                        
                        Eslogan nou : 'Vision, Technologie et Avenir'.
                        Deviz nou ki p ap janm chanje : 'Inovasyon ayisyen nan sèvis lemonn'.
                        
                        Liv sa a prezante 22 antite ki fòme kat jewografik ekosistèm nou an : lojisyèl pratik (AJ-Task), edikasyon ak fòmasyon (EDUKA, AJ-Learn, AJ-MathQuest), enfrastrikti ak enèji (EDH, AJ-Cloud), sante, byennèt ak sèvis (AJ-Bioklin, AJ-Fitness, AJ-Tè), ekonomi, finans ak biznis (AJ-Pay, AJ-Wallet, AJ-Commerce, AJ-Biz), kominikasyon, medya ak kreyasyon (AJ-Chat, AJ-Meet, AJ-Mail, AJ-Studio, AJ-Dev), katografi ak asistans entèlijan (AJ-Maps, AJ-Assistant), san bliye poto filantwopik ak enklizyon dijital (AJ-Fondation) anba lidèchip manman konpayi an (AJ-TECH).
                        
                        Estrikti liv la òganize an 11 Gwo Pati konsekitif :
                        - Pati I : Jenèz ak fondasyon AJ-TECH (kòmansman ak pakou fondatè a) ;
                        - Pati II : Filozofi, misyon, vizyon ak valè fondamantal ;
                        - Pati III : 22 antite nan ekosistèm AJ-TECH la (fich teknik konplè) ;
                        - Pati IV : Achitekti teknolojik (PWA, Offline-First, IndexedDB, Cloud nasyonal) ;
                        - Pati V : Ekonomi, antreprenarya ak modèl biznis ;
                        - Pati VI : Edikasyon, konpetans ak kapital imen ;
                        - Pati VII : Sekirite, souverènte nimerik ak konfyans ;
                        - Pati VIII : Entèlijans atifisyèl, inovasyon ak lavni ;
                        - Pati IX : Prezans nan lemonn, dyaspora ak kouvèti entènasyonal ;
                        - Pati X : Gouvènans, òganizasyon ak konstriksyon yon antrepriz teknoloji ;
                        - Pati XI : Orizon 2035 : Konstwi lavni nimerik Ayiti ;
                        - Anèks : Fich teknik aplikasyon an ak Glosè teknolojik bileng (pp. 215–218).
                        
                        Dapre prensip transparans nou an, chak pwojè prezante avèk eta reyèl li (Fonksyonèl, Nan devlopman / Prototip, Konsepsyon, Planifye). Liv sa a se gid estratejik nou pou nou tout bati lavni nimerik Ayiti ansanm.
                    """.trimIndent(),
                    plannedStartPage = 14,
                    plannedEndPage = 14,
                    estimatedReadMinutes = 4,
                    status = BookContentStatus.AVAILABLE
                )
            )
        ),

        // ==================== PARTIE I ====================
        Part1Data.part1,

        // ==================== PARTIE II ====================
        Part2Data.part2,

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
        Part8Data.part8,

        // ==================== PARTIE IX ====================
        Part9Data.part9,

        // ==================== PARTIE X ====================
        Part10Data.part10,

        // ==================== PARTIE XI ====================
        Part11Data.part11,

        // ==================== ANNEXES ====================
        AnnexesData.partAnnexes
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
