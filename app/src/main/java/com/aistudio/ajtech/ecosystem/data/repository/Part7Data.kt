package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE VII — SÉCURITÉ, SOUVERAINETÉ NUMÉRIQUE ET CONFIANCE
 * Chapitres 92 à 106 (Exactement 15 chapitres d'ingénierie sécuritaire, souveraineté des données, résilience et gouvernance).
 */
object Part7Data {

    val part7: BookPart = BookPart(
        id = "part_7",
        partNumber = 7,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE VII — Sécurité, souveraineté numérique et confiance",
        titleHt = "PATI VII — Sekirite, Souvènte Nimerik ak Konfyans",
        subtitleFr = "Protection des données, défense en profondeur, résilience locale et feuille de route 2026–2035",
        subtitleHt = "Pwoteksyon done pèsonèl, defans solid, kapasite pou reziste ak plan 2026–2035",
        plannedPages = "pp. 135–150",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 92 : La sécurité comme fondation de la confiance ====================
            BookChapter(
                id = "ch_7_92",
                chapterNumber = 92,
                partId = "part_7",
                titleFr = "Chapitre 92 — La sécurité comme fondation de la confiance",
                titleHt = "Chapit 92 — Sekirite kòm fondasyon konfyans",
                subtitleFr = "Intégrité des systèmes, protection des usagers et contrat social numérique",
                subtitleHt = "Pwoteksyon itilizatè, entegrite sistèm yo ak bonjan konfyans nan zouti nimerik",
                summaryFr = "La sécurité informatique n'est pas une option technique secondaire, mais la condition sine qua non de l'adoption numérique et de la confiance citoyenne.",
                summaryHt = "Sekirite enfòmatik se pa yon ti detay anplis, se premye kondisyon ki fè moun aksepte itilize epi fè teknoloji a konfyans.",
                contentFr = """
                    1. La sécurité comme fondement du contrat social numérique :
                    Dans une société de l'information, la confiance ne se décrète pas : elle se construit par des preuves d'ingénierie irréprochables. Aucun citoyen, aucune entreprise, aucune institution publique n'adoptera durablement des outils numériques si le risque de compromission de son identité ou de vol de ses données patrimoniales dépasse le bénéfice d'usage.

                    2. Débutant à professionnel : comprendre les dimensions de la sécurité :
                    - Débutant : La sécurité commence par des réflexes d'hygiène numérique simples (mots de passe uniques, méfiance envers les messages suspects, verrouillage d'écran) ;
                    - Intermédiaire : Comprendre la triade CIA (Confidentialité, Intégrité, Disponibilité) et savoir pourquoi les sauvegardes déconnectées sauvent les systèmes ;
                    - Avancé : Modélisation des menaces (STRIDE), analyse des surfaces d'attaque et application stricte du principe de moindre privilège ;
                    - Professionnel : Architecture de défense en profondeur, cryptographie appliquée, résilience opérationnelle et conformité aux standards internationaux.

                    3. Les vulnérabilités spécifiques au contexte haïtien :
                    En Haïti, les défis d'infrastructure créent des vecteurs de risque particuliers : prédominance de versions piratées de systèmes d'exploitation, prolifération d'applications mobiles altérées (fichiers APK non officiels) et absence quasi-totale de mécanismes d'assurance cyber ou d'indemnisation des victimes.

                    4. L'engagement de transparence d'AJ-TECH :
                    AJ-TECH adopte une posture d'honnêteté intégrale : nous ne revendiquons aucun label de sécurité imaginaire, aucun bouclier magique ni aucun audit externe non réalisé. La sécurité chez AJ-TECH est un processus rigoureux, humble et continu, guidé par le respect des utilisateurs.
                """.trimIndent(),
                contentHt = """
                    1. Sekirite se fondasyon konfyans nan teknoloji :
                    Nan mond jodi a, yon moun pap janm fè yon lojisyèl konfyans si l pè pou yo pa vòlè idantite l oswa pran lajan l. Sekirite se pa yon senp bèl mo, se premye travay yon enjenyè dwe fè byen pou moun ka dòmi ak kè poze.

                    2. Soti nan kòmansman rive nan nivo pwofesyonèl :
                    - Pou moun k ap kòmanse : Sekirite kòmanse ak ti jès senp (pa janm bay modpas ou, pa klike sou nenpòt ti lyen moun voye ba ou, fèmen ekran telefòn ou) ;
                    - Nivo mwayen : Konprann 3 gwo règ yo : Sekrè enfòmasyon an (Confidentialité), Pa kite pyès moun chanje l (Intégrité), epi Asire l toujou la lè w bezwen l (Disponibilité) ;
                    - Nivo avanse : Gade tout kote pirate ka pase pou antre nan sistèm nan epi bay chak pwogram sèlman ti otorizasyon li bezwen toutbon ;
                    - Nivo pwofesyonèl : Bati defans a plizyè nivo, kode ak zouti chifreman ki solid epi pare plan pou sove sistèm nan si yon bagay ta rive.

                    3. Danje espesyal nou genyen an Ayiti :
                    Paske anpil moun pa gen gwo mwayen, yo souvan enstale ti pwogram kraze (fichye APK pirate) sou telefòn yo, kote move moun kache viris pou vòlè kont WhatsApp ak enfòmasyon pèsonèl. Lè yon moun viktim, li pa gen okenn kote pou l pote plent pou jwenn kòb li.

                    4. Verite total AJ-TECH :
                    AJ-TECH di laverite klè : nou pa envante fo sètifika sekirite ni nou pa fè gwo deklarasyon san pratik. Sekirite nan AJ-TECH se yon travay n ap fè chak jou avèk disiplin, respè ak prekosyon pou pwoteje itilizatè yo.
                """.trimIndent(),
                plannedStartPage = 135,
                plannedEndPage = 136,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 93 : Comprendre les menaces numériques ====================
            BookChapter(
                id = "ch_7_93",
                chapterNumber = 93,
                partId = "part_7",
                titleFr = "Chapitre 93 — Comprendre les menaces numériques",
                titleHt = "Chapit 93 — Konprann menas nimerik yo",
                subtitleFr = "Ingénierie sociale, malwares, attaques par déni de service et vulnérabilités locales",
                subtitleHt = "Manti pou vòlè kont (phishing), viris, atak sou sèvè ak danje sou rezo lokal",
                summaryFr = "Cartographie détaillée des cybermenaces contemporaines, des arnaques de phishing ciblant le grand public aux attaques sophistiquées visant les serveurs.",
                summaryHt = "Eksplikasyon klè sou tout kalite atak sou entènèt : soti nan fo mesaj pou pran modpas rive nan gwo atak k ap bloke sèvè.",
                contentFr = """
                    1. Typologie contemporaine des cyberattaques :
                    Pour se défendre efficacement, un développeur et un usager doivent connaître précisément le mode opératoire des agresseurs :
                    - L'ingénierie sociale et le phishing : Usurpation d'identité visuelle de services bancaires ou administratifs pour inciter la victime à livrer ses identifiants ou codes OTP ;
                    - Les malwares et ransomwares : Logiciels malveillants chiffrant les fichiers locaux ou espionnant les frappes clavier (Keyloggers) ;
                    - Les attaques par déni de service distribué (DDoS) : Submersion d'un serveur par un trafic artificiel massif dans le but d'interrompre le service ;
                    - L'interception et le rejeu (Man-in-the-Middle) : Écoute passive ou altération des communications non chiffrées sur les réseaux Wi-Fi publics.

                    2. Analyse des vecteurs critiques en Haïti :
                    - Le SIM Swapping : Réassignation frauduleuse d'une carte SIM permettant à un fraudeur d'intercepter les SMS de validation bancaire ou de messagerie ;
                    - Les Wi-Fi ouverts communautaires : Points d'accès partagés sans isolation des clients, exposant les flux réseau aux renifleurs de paquets (Sniffers) ;
                    - Les faux groupes de transfert d'argent : Exploitation de la précarité financière par de faux supports techniques sollicitant les codes d'accès.

                    3. La posture technique de protection :
                    Face à ces vecteurs, AJ-TECH applique une politique d'isolation rigoureuse : vérification systématique de l'origine des requêtes, rejet des flux non sécurisés et éducation active de la communauté d'utilisateurs.
                """.trimIndent(),
                contentHt = """
                    1. Tout kalite gwo atak ki genyen sou entènèt :
                    Pou w ka pwoteje tèt ou, ou dwe konnen kijan move moun yo travay :
                    - Pyèj ak fo mesaj (Phishing) : Moun k ap pran pòz se bank oswa yon gwo sèvis pou fè w ba yo modpas ou oswa ti kòd sekrè ou resevwa sou telefòn ;
                    - Viris ak lojisyèl malveyan (Malware / Ransomware) : Pwogram pirate ki bloke tout fichye sou òdinatè w epi ki mande lajan pou louvri yo ;
                    - Atak pou kraze sèvè (DDoS) : Voye plizyè milyon fo koneksyon an menm tan sou yon sit entènèt pou fè l tonbe epi anpeche moun sèvi avè l ;
                    - Moun ki kache nan mitan rezo a (Man-in-the-Middle) : Lè yon moun konekte sou yon Wi-Fi piblik san pwoteksyon, yon pirate ka koute tout mesaj k ap pase.

                    2. Gwo danje ki pi fò an Ayiti :
                    - Vòlè nimewo telefòn (SIM Swap) : Lè yon move moun jwenn mwayen pou pran nimewo telefòn ou pou l ka resevwa SMS bank ou oswa pran kont WhatsApp ou ;
                    - Wi-Fi nan lari san modpas : Tout moun konekte sou menm ti bwat la san pwoteksyon, sa ki pèmèt moun ki konn enfòmatik vòlè enfòmasyon lòt moun ;
                    - Fo gwoup k ap pwomèt kòb : Move moun k ap fè kòmsi y ap ede moun jwenn transfè lajan pou pran kòd sekrè yo.

                    3. Kijan AJ-TECH defann itilizatè yo :
                    Pou bloke danje sa yo, tout lojisyèl AJ-TECH yo verifye tout kote mesaj yo soti, refize koneksyon ki pa an sekirite epi toujou montre itilizatè yo kijan pou pa tonbe nan pyèj.
                """.trimIndent(),
                plannedStartPage = 136,
                plannedEndPage = 137,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 94 : La sécurité dès la conception ====================
            BookChapter(
                id = "ch_7_94",
                chapterNumber = 94,
                partId = "part_7",
                titleFr = "Chapitre 94 — La sécurité dès la conception",
                titleHt = "Chapit 94 — Sekirite depi nan konsepsyon",
                subtitleFr = "Principes du Security by Design, défense en profondeur et moindre privilège",
                subtitleHt = "Prensip Security by Design, defans a plizyè nivo ak bay ti otorizasyon strik",
                summaryFr = "Méthodologie du Security by Design : intégrer les exigences de sécurité à chaque étape du cycle de développement logiciel.",
                summaryHt = "Kijan pou konstwi sekirite depi premye jou w ap ekri plan lojisyèl la olye w eseye ranje l lè l fini.",
                contentFr = """
                    1. Le paradigme du « Security by Design » :
                    L'erreur la plus coûteuse en génie logiciel consiste à concevoir une application pour sa seule fonctionnalité, puis à tenter d'y greffer un module de sécurité juste avant le déploiement. Le principe de Security by Design exige que chaque diagramme de classes, chaque schéma de base de données et chaque flux d'interaction soit pensé dès le premier jour sous l'angle de la robustesse face aux attaques.

                    2. Les quatre lois de l'architecture défensive :
                    - Le principe du moindre privilège (Least Privilege) : Un composant, un service ou un utilisateur ne doit disposer que des permissions strictement indispensables à sa tâche immédiate ;
                    - La défense en profondeur (Defense in Depth) : Multiplier les barrières indépendantes (validation d'entrée, contrôle d'accès, chiffrement, surveillance) afin que la rupture d'une digue ne compromette pas l'ensemble ;
                    - La réduction de la surface d'attaque : Supprimer tout port ouvert, toute dépendance inutile, tout endpoint d'API obsolète ;
                    - La sécurité par la transparence et le refus de l'obscurité : Ne jamais compter sur le fait qu'un algorithme soit secret pour garantir sa sécurité (Principe de Kerckhoffs).

                    3. Mise en pratique dans le code moderne :
                    En Kotlin et Jetpack Compose, cela se traduit par le typage strict, l'immutabilité des structures de données, l'absence de chaînes de caractères codées en dur pour les secrets (utilisation stricte de BuildConfig et du fichier .env), et la validation des schémas d'entrée.
                """.trimIndent(),
                contentHt = """
                    1. Kisa 'Security by Design' vle di :
                    Pi gwo erè yon pwogramè ka fè, se kreye tout aplikasyon an san panse ak sekirite, epi lè l fini l ap eseye mete yon ti kadna sou li. 'Security by Design' vle di depi premye jou w ap desine plan lojisyèl la, ou dwe mande tèt ou : 'Kijan yon pirate ka eseye kraze sa, e kijan pou m bloke l depi nan rasin ?'

                    2. 4 gwo règ pou bati bon defans :
                    - Bay ti otorizasyon strik (Least Privilege) : Yon moso kòd oswa yon itilizatè dwe gen sèlman ti dwa li bezwen pou travay la, pa plis ;
                    - Defans a plizyè nivo (Defense in Depth) : Mete plizyè baryè separe yon fason pou si yon baryè kraze, lòt baryè yo rete kanpe solid ;
                    - Fèmen tout ti twou ki pa itil : Pa kite okenn pòt louvri sou sèvè a, retire tout vye kòd ki pa sèvi ankò ;
                    - Prensip verite aklè : Sekirite yon sistèm pa dwe chita sou kache kijan l fonksyone, men sou bonjan zouti matematik solid tout moun ka verifye.

                    3. Kijan sa fèt nan kòd la :
                    Lè n ap devlope nan Kotlin ak Jetpack Compose, nou asire tout done yo byen pwoteje, nou pa janm ekri modpas oswa kle sekrè nan kòd la dirèkteman, epi nou verifye chak ti lèt ak chak chif itilizatè a tape anvan nou aksepte l nan memwa a.
                """.trimIndent(),
                plannedStartPage = 137,
                plannedEndPage = 138,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 95 : Protection des données personnelles ====================
            BookChapter(
                id = "ch_7_95",
                chapterNumber = 95,
                partId = "part_7",
                titleFr = "Chapitre 95 — Protection des données personnelles",
                titleHt = "Chapit 95 — Pwoteksyon done pèsonèl",
                subtitleFr = "Minimisation de collecte, consentement éclairé, RGPD et standards internationaux",
                subtitleHt = "Pran sèlman done ki nesesè, mande pèmisyon klè epi respekte lwa entènasyonal yo",
                summaryFr = "Principes rigoureux de traitement des données personnelles : minimisation, droit à l'effacement, transparence et respect de la dignité humaine.",
                summaryHt = "Règ strik pou pwoteje enfòmasyon prive moun : pa ranmase enfòmasyon ki pa itil, bay moun dwa efase done yo epi toujou di verite.",
                contentFr = """
                    1. Qu'est-ce qu'une donnée personnelle ?
                    Constitue une donnée à caractère personnel toute information se rapportant à une personne physique identifiée ou identifiable : nom, prénom, numéro de téléphone, localisation géographique précise, adresse IP, identifiant d'appareil, historique de transactions ou biométrie.

                    2. Le principe fondamental de minimisation :
                    La meilleure façon de protéger une donnée contre les fuites est de ne pas la collecter. Si une fonctionnalité peut opérer sans stocker l'emplacement GPS ou sans exiger le nom réel de l'usager, ce stockage doit être proscrit. Chez AJ-TECH, la règle est formelle : minimisation absolue à la source.

                    3. Les droits fondamentaux de l'usager :
                    En s'alignant volontairement sur les standards les plus protecteurs au monde (tels que le RGPD européen), AJ-TECH respecte :
                    - Le droit à l'information claire et compréhensible (sans jargon obscur) ;
                    - Le droit d'accès et de rectification de ses données ;
                    - Le droit à l'effacement définitif (droit à l'oubli) ;
                    - Le droit à la portabilité (exporter ses données dans un format ouvert JSON/CSV).

                    4. L'auto-régulation exigeante en l'absence de cadre étatique contraignant :
                    Bien qu'Haïti ne dispose pas encore d'une autorité de régulation des données personnelles dotée de pouvoirs de sanction effectifs, AJ-TECH s'impose ces contraintes par devoir éthique et respect civique envers la population.
                """.trimIndent(),
                contentHt = """
                    1. Kisa yon enfòmasyon pèsonèl ye :
                    Yon done pèsonèl se nenpòt enfòmasyon ki ka pèmèt yo konnen kiyès ou ye : non w, nimewo telefòn ou, kote w ye sou kat jeyografik, nimewo aparèy ou, sa w te achte oswa anprent dwèt ou.

                    2. Ranje sèlman sa ki itil toutbon (Minimisation) :
                    Pi bon fason pou anpeche moun vòlè yon enfòmasyon, se pa mande moun lan li si l pa nesesè pou zouti a mache. Si yon aplikasyon ka kalkile yon bagay san li pa bezwen konnen non w oswa kote w ye, nou pa dwe janm mande w li. Se règ fèm sa a ki gide tout travay nan AJ-TECH.

                    3. Dwa tout itilizatè genyen :
                    Menm jan ak gwo lwa modèn sou latè (tankou RGPD an Ewòp), AJ-TECH defann dwa sa yo :
                    - Dwa pou konnen sa n ap fè ak enfòmasyon w yo nan yon langaj senp ;
                    - Dwa pou wè sa ki sere sou ou epi korije sa ki pa bon ;
                    - Dwa pou mande efase tout enfòmasyon sou ou nèt san rete okenn tras ;
                    - Dwa pou pran enfòmasyon w yo mete nan yon lòt zouti san baryè.

                    4. Responsablite moral nou an Ayiti :
                    Menm si Leta ayisyen poko gen yon gwo biwo k ap kontwole sa toutbon jodi a, AJ-TECH chwazi respekte tout règ strik sa yo paske se yon obligasyon moral anvè pèp nou an.
                """.trimIndent(),
                plannedStartPage = 138,
                plannedEndPage = 139,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 96 : Vie privée et responsabilité numérique ====================
            BookChapter(
                id = "ch_7_96",
                chapterNumber = 96,
                partId = "part_7",
                titleFr = "Chapitre 96 — Vie privée et responsabilité numérique",
                titleHt = "Chapit 96 — Vi prive ak responsablite nimerik",
                subtitleFr = "Refus du capitalisme de surveillance, absence de traceurs intrusifs et éthique produit",
                subtitleHt = "Refize vann done moun, pa mete espyon nan lojisyèl ak prensip moral nan biznis",
                summaryFr = "Engagement formel d'AJ-TECH contre le modèle extractif publicitaire : protection absolue de la vie privée et rejet des traceurs commerciaux.",
                summaryHt = "Angajman fèm AJ-TECH pou pa janm vann done itilizatè yo bay piblisite epi pwoteje vi prive tout moun.",
                contentFr = """
                    1. Le refus lucide du capitalisme de surveillance :
                    Le modèle économique dominant de la Silicon Valley repose sur l'extraction massive et continue des comportements humains à des fins de ciblage publicitaire et de manipulation comportementale. En Haïti, transposer ce modèle reviendrait à dépouiller les usagers de leur intimité sous prétexte de gratuité trompeuse.

                    2. Zéro traceur publicitaire tiers :
                    Les applications de l'écosystème AJ-TECH sont conçues sans SDK d'espionnage commercial (Google Ads trackers intrusifs, Meta Pixel, courtiers de données). Les seules métriques techniques recueillies sont anonymes, locales, et strictement destinées à la détection de crashs et à l'amélioration de la stabilité logicielle.

                    3. La vie privée comme condition de la liberté individuelle :
                    La vie privée n'est pas un privilège réservé à ceux qui ont 'quelque chose à cacher'. Elle est l'espace intime au sein duquel chaque être humain forge ses pensées, échange avec ses proches et préserve sa sécurité face aux abus de pouvoir économiques ou politiques.

                    4. Éduquer pour émanciper :
                    AJ-TECH intègre dans ses supports des guides concrets permettant aux citoyens d'apprendre à verrouiller leurs appareils, configurer des DNS respectueux de la vie privée et désactiver les autorisations abusives sur leurs téléphones.
                """.trimIndent(),
                contentHt = """
                    1. Refize modèl ki vann vi prive moun :
                    Anpil gwo konpayi etranje bay zouti yo 'gratis' pou yo ka espyone tout sa w ap fè epi vann enfòmasyon sa yo bay moun k ap fè piblisite. Ann Ayiti, nou pa dwe aksepte modèl sa a ki fè moun tounen yon senp machandiz.

                    2. Pa gen okenn espyon nan lojisyèl AJ-TECH yo :
                    Aplikasyon AJ-TECH yo pa gen okenn ti pwogram kache (trackers) k ap voye sa w ap fè bay lòt konpayi piblisite. Sèl ti enfòmasyon nou gade se lè lojisyèl la fè yon ti pann pou nou ka repare l pi vit, san nou pa janm konnen kiyès ou ye.

                    3. Vi prive se libète tout sitwayen :
                    Pwoteje vi prive w se pa paske w ap fè move bagay. Se paske chak moun gen dwa pou l pale ak fanmi l ak zanmi l san pa gen moun k ap koute nan twou pòt, epi pou okenn moun pa sèvi ak enfòmasyon w pou fè move zafè sou do w.

                    4. Montre moun kijan pou yo pwoteje tèt yo :
                    AJ-TECH pran angajman pou l toujou montre jèn yo ak tout popilasyon an kijan pou yo fèmen ti pèmisyon ki pa itil nan telefòn yo epi pwoteje lavi prive yo sou tout lòt rezo sosyal.
                """.trimIndent(),
                plannedStartPage = 139,
                plannedEndPage = 140,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 97 : Authentification et gestion des identités ====================
            BookChapter(
                id = "ch_7_97",
                chapterNumber = 97,
                partId = "part_7",
                titleFr = "Chapitre 97 — Authentification et gestion des identités",
                titleHt = "Chapit 97 — Otantifikasyon ak jesyon idantite",
                subtitleFr = "Hachage salé, authentification multi-facteurs (MFA), passkeys et jetons révocables",
                subtitleHt = "Sekirize modpas ak hachage, de nivo sekirite (MFA), passkeys ak jesyon sesyon",
                summaryFr = "Ingénierie de l'authentification moderne : des algorithmes de hachage robuste (Argon2, bcrypt) aux passkeys sans mot de passe.",
                summaryHt = "Kijan pou konstwi bon sistèm koneksyon : soti nan modpas ki byen kache rive nan koneksyon san modpas ki pi an sekirite.",
                contentFr = """
                    1. La fin des mots de passe en clair et des hachages obsolètes :
                    Stocker un mot de passe en texte clair dans une base de données relève de la faute professionnelle grave. Les fonctions obsolètes (MD5, SHA-1) sont également proscrites. Les standards contemporains exigent des fonctions de dérivation de clé résistantes aux attaques matérielles par GPU/ASIC (Argon2id, PBKDF2 avec sel cryptographique aléatoire de 128 bits minimum).

                    2. L'authentification multi-facteurs (MFA) :
                    Savoir (mot de passe), posséder (clé de sécurité ou application d'authentification TOTP), et être (biométrie locale via Android BiometricPrompt). Face aux vulnérabilités du SIM swapping en Haïti, les générateurs de codes TOTP temporels déconnectés (RFC 6238) sont systématiquement préférés aux SMS non sécurisés.

                    3. L'horizon des Passkeys (WebAuthn / FIDO2) :
                    L'avenir de l'authentification repose sur la cryptographie asymétrique sur puce matérielle sécurisée (Secure Element). L'utilisateur s'authentifie par son empreinte locale, et aucune clé privée ne quitte son terminal.

                    4. Gestion de sessions sécurisée et révocation :
                    Utilisation de jetons de courte durée de vie (Access Tokens) associés à des Refresh Tokens stockés dans des coffres-forts chiffrés locaux, avec mécanisme d'invalidation immédiate de session en cas de suspicion d'intrusion.
                """.trimIndent(),
                contentHt = """
                    1. Fini ak sere modpas aklè oswa ak vye sistèm kraze :
                    Yon devlopè pa dwe janm sere modpas yon moun aklè nan yon baz done. Vye kalkil tankou MD5 oswa SHA-1 pa bon ankò. Jodi a, nou dwe itilize bonjan zouti modèn (tankou Argon2id) ki melanje modpas la ak gwo chif matematik espesyal pou pesonn pa janm ka devine l.

                    2. Mete 2 nivo sekirite (MFA) :
                    Pou w byen sekirize yon kont, ou bezwen : sa w konnen (modpas ou), sa w posede (yon ti aplikasyon ki bay yon kòd ki chanje chak 30 segonn sou telefòn ou), ak sa w ye (anprent dwèt ou). Paske an Ayiti yo ka vòlè kat SIM ou, nou prefere ti aplikasyon kòd olye de voye SMS.

                    3. Konekte san modpas (Passkeys) :
                    Nouvo fason pou konekte a kounye a chita sou teknoloji ki pa bezwen modpas ditou. Se telefòn ou menm ki fè kalkil matematik la grasa anprent dwèt ou, san okenn modpas pa janm vwayaje sou entènèt la.

                    4. Jere sesyon yo ak prekosyon :
                    Lè w konekte, lojisyèl la ba w yon ti pèmisyon ki kout nan tan. Si w pèdi telefòn ou, ou ka klike yon sèl bouton pou fèmen tout koneksyon sou tout lòt aparèy imedyatman.
                """.trimIndent(),
                plannedStartPage = 140,
                plannedEndPage = 141,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 98 : Chiffrement et protection des communications ====================
            BookChapter(
                id = "ch_7_98",
                chapterNumber = 98,
                partId = "part_7",
                titleFr = "Chapitre 98 — Chiffrement et protection des communications",
                titleHt = "Chapit 98 — Chifreman ak pwoteksyon kominikasyon",
                subtitleFr = "Cryptographie symétrique/asymétrique, TLS 1.3, chiffrement de bout en bout et au repos",
                subtitleHt = "Chifre done ki sou disk, sekirize kominikasyon sou entènèt (TLS) ak mesaj kache bout a bout",
                summaryFr = "Principes et implémentations de la cryptographie : chiffrement au repos (AES-256-GCM), chiffrement en transit (TLS 1.3) et de bout en bout (E2EE).",
                summaryHt = "Teknik pou bloke vòlè pa li mesaj ou : kache done ki sere sou telefòn la epi pwoteje tout sa k ap pase sou rezo a.",
                contentFr = """
                    1. Les trois états de la donnée :
                    - Données en transit (Data in Motion) : Transitant sur le réseau via TLS 1.3 obligatoire, avec suites cryptographiques modernes interdisant les algorithmes dépréciés ;
                    - Données au repos (Data at Rest) : Stockées sur les terminaux ou les disques serveurs, protégées par AES-256-GCM avec gestion des clés via Android Keystore ou modules HSM matériels ;
                    - Données en cours de traitement (Data in Use) : Isolées en mémoire vive avec purge immédiate des variables sensibles après utilisation.

                    2. Chiffrement de bout en bout (E2EE) :
                    Pour les communications interpersonnelles (projet AJ-Chat), le principe directeur est que seuls les interlocuteurs détiennent les clés de déchiffrement. Même le serveur d'acheminement ne dispose d'aucun moyen technique de lire le contenu des échanges ou d'accéder aux fichiers joints.

                    3. Protection contre les attaques de type Man-in-the-Middle :
                    Mise en œuvre du Certificate Pinning sur les applications clientes afin d'empêcher les proxys d'interception d'émettre de faux certificats, complétée par l'obligation HSTS (HTTP Strict Transport Security) interdisant tout repli vers HTTP non chiffré.
                """.trimIndent(),
                contentHt = """
                    1. 3 fason done yo konn ye nan yon sistèm :
                    - Done k ap vwayaje sou rezo a : Yo dwe toujou vwayaje anba bonjan sekirite TLS 1.3 pou pesonn pa ka koute sa k ap pase sou fil la ;
                    - Done ki sere sou disk : Tout enfòmasyon ki rete sou telefòn lan dwe chifre ak gwo kle AES-256 pou menm si yo ta pran memwa a, yo pa ka li anyen san kle a ;
                    - Done k ap kalkile nan moman an : Lè lojisyèl la fin itilize yon modpas nan memwa RAM li, li dwe efase l imedyatman pou l pa rete trennen.

                    2. Chifreman bout a bout (E2EE) :
                    Pou zouti kominikasyon tankou AJ-Chat, sèl moun k ap pale a ak moun k ap resevwa a ki gen kle pou li mesaj la. Menm sèvè santral la pa ka li sa yo di ni gade foto yo voye.

                    3. Bloke moun k ap eseye koupe kominikasyon an :
                    Nou itilize teknik ki rele 'Certificate Pinning' pou aplikasyon an verifye li konekte ak vrè sèvè ofisyèl la toutbon, epi li refize mache si yon moun eseye mete yon fo sèvè nan mitan an pou vòlè done.
                """.trimIndent(),
                plannedStartPage = 141,
                plannedEndPage = 142,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 99 : Sécurité des applications et des API ====================
            BookChapter(
                id = "ch_7_99",
                chapterNumber = 99,
                partId = "part_7",
                titleFr = "Chapitre 99 — Sécurité des applications et des API",
                titleHt = "Chapit 99 — Sekirite aplikasyon ak API yo",
                subtitleFr = "Top 10 OWASP, validation stricte, limitation de débit (Rate Limiting) et protection des endpoints",
                subtitleHt = "Top 10 OWASP, verifye tout sa itilizatè voye, kontwole vitès requèt epi bloke pirate",
                summaryFr = "Revue approfondie des vulnérabilités applicatives majeures (OWASP) et des contre-mesures techniques indispensables côté client et serveur.",
                summaryHt = "Gid teknik sou gwo erè ki konn genyen nan lojisyèl ak kijan pou fèmen tout pòt pou pirate pa pase.",
                contentFr = """
                    1. Le Top 10 OWASP comme grille d'audit continue :
                    Tout ingénieur chez AJ-TECH doit maîtriser la liste des vulnérabilités applicatives les plus fréquentes et leurs parades :
                    - Injections (SQL, NoSQL, OS Command) : Utilisation stricte de requêtes préparées et de liaisons de paramètres (Room gère cela nativement) ;
                    - Défaillances de contrôle d'accès (BOLA / IDOR) : Vérifier que l'utilisateur connecté possède légitimement le droit d'accéder à l'objet demandé, et ne jamais se fier à un simple identifiant numérique transmis dans l'URL ;
                    - Mauvaises configurations de sécurité : Désactivation des modes debug en production, masquage des détails de traces d'erreurs (Stack Traces) aux utilisateurs ;
                    - Vulnérabilités des composants tiers : Analyse continue des CVE sur les bibliothèques importées.

                    2. Protection des points d'entrée (API Endpoints) :
                    - Validation stricte des types et schémas JSON (zod, kotlinx.serialization) ;
                    - Limitation de fréquence (Rate Limiting / Token Bucket) pour stopper les attaques par force brute ;
                    - En-têtes HTTP de durcissement (CSP, X-Frame-Options, X-Content-Type-Options) ;
                    - Politiques CORS (Cross-Origin Resource Sharing) restrictives.
                """.trimIndent(),
                contentHt = """
                    1. 10 gwo erè ki pi danjere nan lojisyèl (OWASP) :
                    Chak moun k ap ekri kòd dwe konnen gwo erè sa yo pou l pa janm fè yo :
                    - Enjeksyon SQL : Lè yon pirate tape vye kòd nan yon bwat tèks pou manipile baz done a ; nou evite sa lè nou sèvi ak zouti tankou Room ki netwaye tout tèks anvan l sove l ;
                    - Gade done lòt moun san pèmisyon (IDOR) : Lè yon moun chanje yon ti nimewo nan adrès sit la pou l wè fichye yon lòt moun ; nou dwe toujou verifye si moun nan gen dwa wè sa l mande a ;
                    - Kite enfòmasyon sekrè parèt lè gen erè : Pa janm montre gwo detay teknik kòd la bay itilizatè a lè yon bagay mache mal ;
                    - Pwogram lòt moun ki gen twou : Verifye chak jou si ti bibliyotèk nou telechaje yo pa gen vye pwoblèm sekirite ladan yo.

                    2. Pwoteje pòt antre aplikasyon an (API) :
                    - Verifye chak ti done ki antre pou asire se bon kalite lèt ak chif yo voye ;
                    - Mete kontwòl vitès pou anpeche yon machin eseye 10 000 modpas nan yon minit ;
                    - Mete bonjan baryè sou sit la pou lòt move sit entènèt pa ka vin kòmande lojisyèl la nan do itilizatè a.
                """.trimIndent(),
                plannedStartPage = 142,
                plannedEndPage = 143,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 100 : Résilience face aux réseaux instables ====================
            BookChapter(
                id = "ch_7_100",
                chapterNumber = 100,
                partId = "part_7",
                titleFr = "Chapitre 100 — Résilience face aux réseaux instables",
                titleHt = "Chapit 100 — Rezilyans devan rezo ki pa estab yo",
                subtitleFr = "Tolérance aux pannes, paquets fragmentés, coupures brutales et reprise sur incident",
                subtitleHt = "Sistèm ki pa kraze lè entènèt koupe, jere ti moso done epi reprann travay la san pèt",
                summaryFr = "Ingénierie de la résilience sous fortes contraintes d'infrastructure : comment maintenir la sécurité et l'intégrité même lors de coupures réseau répétées.",
                summaryHt = "Kijan pou asire lojisyèl la kontinye mache an sekirite menm lè entènèt ap monte desann oswa li koupe nèt.",
                contentFr = """
                    1. La réalité technique des télécommunications en Haïti :
                    Contrairement aux architectures conçues dans des pays aux réseaux fibrés redondants, un logiciel déployé en Haïti doit affronter :
                    - Des latences oscillant entre 200 ms et plus de 2 000 ms sur réseaux mobiles 3G/4G congestionnés ;
                    - Des coupures brutales de connectivité en plein milieu de requêtes HTTP transactionnelles ;
                    - Des paquets réseau corrompus ou abandonnés par des équipements intermédiaires surchargés.

                    2. Idempotence et intégrité transactionnelle :
                    Toute opération d'écriture (création de tâche, enregistrement d'état) doit être idempotente : si une requête est interrompue et rejouée automatiquement, elle ne doit jamais créer de doublon ou corrompre la base de données. L'utilisation d'identifiants uniques UUID générés côté client garantit cette propriété.

                    3. Files d'attente de synchronisation résilientes :
                    Les actions de l'usager sont d'abord enregistrées dans une file d'attente locale transactionnelle (Room). Un gestionnaire d'arrière-plan (WorkManager) tente la synchronisation dès que la connectivité redevient stable, avec un mécanisme de recul exponentiel (Exponential Backoff) évitant de surcharger le réseau lors du rétablissement.
                """.trimIndent(),
                contentHt = """
                    1. Reyalite rezo telefòn ak entènèt an Ayiti :
                    Lojisyèl ki fèt pou Ayiti pa ka panse tout bagay ap toujou mache vit tankou nan peyi rich. Isit la nou genyen :
                    - Entènèt ki ralanti anpil, kote yon senp paj ka pran plizyè segonn pou l reponn ;
                    - Entènèt ki koupe britsoukou pandan w t ap voye yon enfòmasyon enpòtan ;
                    - Done ki pèdi nan wout paske antèn yo gen twòp moun sou yo.

                    2. Pa fè menm travay la 2 fwa pa erè (Idempotence) :
                    Si yon itilizatè t ap sove yon bagay epi entènèt koupe, lè l retounen, telefòn lan ka voye l ankò san sa pa kreye yon dezyèm kopi pa erè. Nou bay chak aksyon yon ti kòd inik depi sou telefòn lan pou sèvè a konnen si l te deja resevwa l.

                    3. Ranje travay yo nan yon liy dizon (WorkManager) :
                    Tout sa w fè nan aplikasyon an anrejistre sou aparèy la an premye. Depi entènèt la tounen, telefòn lan voye yo youn pa youn dousman san li pa bloke ekran an epi san l pa kraze batri a.
                """.trimIndent(),
                plannedStartPage = 143,
                plannedEndPage = 144,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 101 : Sécurité dans une architecture Offline-First ====================
            BookChapter(
                id = "ch_7_101",
                chapterNumber = 101,
                partId = "part_7",
                titleFr = "Chapitre 101 — Sécurité dans une architecture Offline-First",
                titleHt = "Chapit 101 — Sekirite nan yon achitekti Offline-First",
                subtitleFr = "Stockage local chiffré, validation côté client et résolution sécurisée des conflits",
                subtitleHt = "Sere done sou aparèy an sekirite, tcheke done san entènèt epi regle konfli senkronizasyon",
                summaryFr = "Spécificités de sécurité propres au paradigme Offline-First : intégrité des bases locales (Room/IndexedDB), validation cryptographique et synchronisation sans confiance aveugle.",
                summaryHt = "Danje ak solisyon sekirite espesyal lè aplikasyon an mache san entènèt : pwoteje memwa lokal epi senkronize san risk.",
                contentFr = """
                    1. Le paradoxe de sécurité du modèle Offline-First :
                    Dans une architecture où le terminal de l'utilisateur détient la copie maîtresse des données en l'absence de réseau, le périmètre de sécurité ne s'arrête plus aux portes d'un serveur distant sécurisé : il s'étend sur des millions de smartphones potentiellement exposés au vol matériel ou à l'analyse locale.

                    2. Chiffrement des bases locales :
                    L'utilisation de bases de données locales (Room sur Android, IndexedDB sur PWA) doit être complétée par un chiffrement au repos transparent (SQLCipher avec clé dérivée du matériel via Android Keystore). Même en cas d'extraction physique de la mémoire flash, les données demeurent illisibles.

                    3. Résolution sécurisée des conflits de synchronisation :
                    Lorsque deux appareils modifient une même ressource hors-ligne, leur réconciliation lors de la reconnexion ne doit pas écraser les données légitimes ni permettre l'injection de données falsifiées. L'application de types de données répliqués sans conflit (CRDT) et la vérification des horodatages signés garantissent l'intégrité de l'état final.

                    4. La règle absolue : zéro confiance envers le client distant :
                    Lorsque l'application hors-ligne se reconnecte pour synchroniser ses données, le serveur central ne doit jamais accepter aveuglément les données reçues. Il réapplique l'intégralité des contrôles de validation, de droits d'accès et d'intégrité métier comme s'il s'agissait d'une requête non vérifiée.
                """.trimIndent(),
                contentHt = """
                    1. Gwo defi sekirite lè lojisyèl la mache san entènèt :
                    Paske tout done yo rete nan telefòn ou an premye, si yon moun vòlè telefòn lan oswa li eseye fouye nan memwa a, li pa dwe janm ka li sa ki ladan l. Sekirite a dwe sou aparèy la menm.

                    2. Kadnase baz done ki sou telefòn lan :
                    Nou itilize zouti espesyal (tankou SQLCipher) ki fè tout sa k ap ekri nan baz done Room lan chifre ak yon gwo kle sekrè ki kache nan yon ti pati espesyal nan processeur telefòn lan. Menm si yon vòlè ta demonte aparèy la, li pap ka li anyen.

                    3. Regle pwoblèm lè de moun chanje menm bagay la :
                    Si de moun te modifye yon menm travay pandan yo pa t gen entènèt, lè yo konekte, sistèm nan konpare vèsyon yo avèk lojik matematik san li pa kraze travay pèsonn epi san li pa kite move enfòmasyon antre.

                    4. Règ an lò : Pa janm fè machin lòt moun konfyans san verifye :
                    Lè telefòn lan rekonekte sou entènèt pou voye sa l te fè yo, sèvè a pa janm asepte yo konsa konsa. Li verifye chak liy, chak dwa ak chak siyati tankou se yon moun li wè pou premye fwa.
                """.trimIndent(),
                plannedStartPage = 144,
                plannedEndPage = 145,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 102 : Souveraineté des données et infrastructures ====================
            BookChapter(
                id = "ch_7_102",
                chapterNumber = 102,
                partId = "part_7",
                titleFr = "Chapitre 102 — Souveraineté des données et infrastructures",
                titleHt = "Chapit 102 — Souvènte done ak enfrastrikti",
                subtitleFr = "Localisation des centres de données, juridiction territoriale et indépendance énergétique",
                subtitleHt = "Kote done yo sere toutbon, lwa k ap pwoteje yo ak bezwen pou sèvè yo jwenn kouran san rete",
                summaryFr = "Analyse géopolitique et technique de la souveraineté des données : dépendance aux clouds étrangers, risques d'extraterritorialité et impératif de centres de calcul locaux.",
                summaryHt = "Poukisa sere done nan lòt peyi se yon gwo risk politik ak ekonomik, epi kijan pou prepare sant sèvè sou tè Ayiti.",
                contentFr = """
                    1. La vulnérabilité géopolitique de la dépendance numérique :
                    À l'heure actuelle, la quasi-totalité des services numériques publics et privés d'Haïti repose sur des serveurs hébergés aux États-Unis ou en Europe. Cette situation soumet l'ensemble des données des citoyens et de l'État aux législations extraterritoriales étrangères (Cloud Act, FISA) et expose le pays à un risque critique d'interruption unilatérale de service en cas de litige géopolitique.

                    2. Qu'est-ce qu'une infrastructure souveraine ?
                    Une infrastructure est souveraine lorsqu'elle répond à trois critères cumulatifs :
                    - Juridictionnelle : Soumise exclusivement aux tribunaux et lois de la République d'Haïti ;
                    - Opérationnelle : Administrée, maintenue et réparable par des ingénieurs haïtiens sans dépendance critique d'experts extérieurs ;
                    - Énergétique : Alimentée par des micro-réseaux locaux renouvelables (solaire, éolien, hydroélectrique) immunisés contre les défaillances du réseau électrique national.

                    3. Transparence absolue sur le statut d'AJ-Cloud :
                    Il est impératif d'affirmer avec la plus totale clarté qu'AJ-TECH ne possède actuellement aucun centre de données physique opérationnel sur le territoire national. L'entité AJ-Cloud est un projet d'ingénierie et une vision stratégique pour la décennie 2026–2035. Affirmer le contraire serait une tromperie intellectuelle inadmissible.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa sere tout done nou lòt bò dlo se yon danje :
                    Jodi a, prèske tout enfòmasyon Leta, bank ak inivèsite ann Ayiti sere sou sèvè ki nan peyi Etazini oswa Ewòp. Sa vle di gouvènman lòt peyi ka gade done sa yo dapre pwòp lwa pa yo, epi si ta gen yon gwo kriz entènasyonal, yo ka koupe sèvis la nenpòt lè.

                    2. Kisa yon enfrastrikti endepandan (souvren) vle di :
                    Pou nou di yon sant sèvè se pou nou toutbon, li dwe gen 3 kondisyon :
                    - Li anba lwa peyi Ayiti : Se tribinal ak lwa ayisyen sèlman ki gen dwa sou done yo ;
                    - Se enjenyè ayisyen k ap jere l : Nou dwe gen moun lakay nou ki konnen kijan pou repare chak moso sèvè san mande etranje sekou ;
                    - Li gen pwòp kouran pa l : Li dwe mache sou enèji solè ak batri pou pann kouran pa janm ka fèmen l.

                    3. Verite total sou pwojè AJ-Cloud la :
                    Nou dwe di sa aklè san kache anyen : AJ-TECH pa gen okenn gwo sant sèvè ki konstwi sou tè Ayiti jodi a. Pwojè AJ-Cloud la se yon gwo plan teknik ak yon vizyon estratejik pou ane 2026 rive 2035. Di yon lòt bagay se ta yon manti nou refize fè.
                """.trimIndent(),
                plannedStartPage = 145,
                plannedEndPage = 146,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 103 : Vers une souveraineté numérique haïtienne ====================
            BookChapter(
                id = "ch_7_103",
                chapterNumber = 103,
                partId = "part_7",
                titleFr = "Chapitre 103 — Vers une souveraineté numérique haïtienne",
                titleHt = "Chapit 103 — Vè yon souvènte nimerik ayisyen",
                subtitleFr = "Protocoles ouverts, refus du verrouillage propriétaire et interopérabilité nationale",
                subtitleHt = "Pwotokòl ouvè, refize rete prizonye nan yon sèl sistèm etranje ak libète teknolojik",
                summaryFr = "Feuille de route pour conquérir l'autonomie numérique d'Haïti par les standards ouverts, les formats libres et la formation d'ingénieurs nationaux compétents.",
                summaryHt = "Plan etap pa etap pou peyi Ayiti ka mèt pwòp teknoloji l grasa lojisyèl ouvè ak fòmasyon bonjan enjenyè.",
                contentFr = """
                    1. Une souveraineté pragmatique, non isolationniste :
                    La souveraineté numérique ne consiste pas à s'isoler du monde ni à réinventer maladroitement la roue. Elle consiste à choisir délibérément des technologies ouvertes et auditables, garantissant qu'aucune entreprise étrangère ne puisse unilatéralement couper l'accès d'Haïti à ses propres services essentiels.

                    2. Le danger mortel du verrouillage propriétaire (Vendor Lock-in) :
                    Lorsque des ministères ou des entreprises locales adoptent des logiciels propriétaires fermés, ils deviennent tributaires de licences exorbitantes annuelles payables en devises étrangères, et perdent la maîtrise de leurs formats de fichiers. L'adoption de formats ouverts (JSON, CSV, SQLite, protocoles web standards) est un impératif d'indépendance financière et technique.

                    3. L'interopérabilité comme levier républicain :
                    Tous les modules de l'écosystème AJ-TECH sont conçus selon le principe d'interopérabilité : des interfaces de programmation (API) documentées permettant à d'autres développeurs et institutions de communiquer librement avec nos outils sans dépendance captive.

                    4. Le rôle catalyseur du logiciel libre et open source :
                    En s'appuyant sur des fondations logicielles ouvertes (Linux, Android Open Source Project, Kotlin, standards W3C), la jeunesse haïtienne a accès au patrimoine universel de la science sans barrières de droits d'entrée.
                """.trimIndent(),
                contentHt = """
                    1. Yon libète teknolojik ki pa fèmen pòt sou mond lan :
                    Souvrenete nimerik pa vle di nou dwe koupe kontak ak lemonn oswa refize sa lòt moun fè. Li vle di nou chwazi zouti ouvè kote tout moun ka wè kòd la, pou okenn konpayi etranje pa janm ka fèmen zouti enpòtan peyi a sou yon kout tèt.

                    2. Danje pou w rete prizonye yon sèl konpayi (Vendor Lock-in) :
                    Lè yon biwo leta oswa yon biznis achte yon lojisyèl fèmen kote yo pa gen kòd sous la, yo oblije ap peye gwo kòb dola chak ane pou lisans. Si yon jou yo pa gen kòb la, yo pèdi tout travay yo. Sèvi ak fòma ouvè (tankou JSON, CSV, SQLite) se premye fason pou nou lib toutbon.

                    3. Zouti ki ka pale youn ak lòt (Entè-operabilite) :
                    Tout zouti nan ekosistèm AJ-TECH la fèt pou yo ka kominike fasil ak lòt lojisyèl grasa pòt antre ki byen dokimante (API), san pèsonn pa oblije rete kole sèlman sou zouti nou yo.

                    4. Fòs lojisyèl lib ak kòd ouvè pou Ayiti :
                    Gras ak lojisyèl ouvè (tankou Linux, Android ak Kotlin), tout jèn Ayisyen gen dwa aprann, manyen kòd la epi konstwi gwo sistèm san yo pa bezwen peye plizyè milye dola pou kòmanse.
                """.trimIndent(),
                plannedStartPage = 146,
                plannedEndPage = 147,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 104 : Éthique, confiance et gouvernance numérique ====================
            BookChapter(
                id = "ch_7_104",
                chapterNumber = 104,
                partId = "part_7",
                titleFr = "Chapitre 104 — Éthique, confiance et gouvernance numérique",
                titleHt = "Chapit 104 — Etik, konfyans ak gouvènans nimerik",
                subtitleFr = "Auditabilité du code, publication transparente des incidents et responsabilité sociale",
                subtitleHt = "Montre kòd la aklè, di laverite lè gen pann oswa atak epi respekte pèp la",
                summaryFr = "Principes de gouvernance et d'éthique technologique : politique de divulgation responsable des vulnérabilités, transparence radicale et respect des droits citoyens.",
                summaryHt = "Prensip moral pou moun k ap dirije lojisyèl : pa kache erè, pibliye rapò sou atak epi mete moun an premye anvan lajan.",
                contentFr = """
                    1. La gouvernance technologique comme acte moral :
                    Le pouvoir conféré aux ingénieurs et créateurs de plateformes numériques est immense : ils déterminent quelles données sont collectées, quels algorithmes régissent l'accès à l'information et quelles règles s'appliquent aux interactions humaines. Sans une boussole éthique rigoureuse, ce pouvoir bascule inévitablement dans l'exploitation.

                    2. Divulgation responsable des failles (Responsible Disclosure) :
                    AJ-TECH encourage la communauté des chercheurs en sécurité et des étudiants à tester et auditer ses interfaces. Notre charte prévoit :
                    - Un canal de communication sécurisé pour signaler toute anomalie ;
                    - L'interdiction formelle de poursuites judiciaires contre les chercheurs de bonne foi ;
                    - La publication d'un bulletin de sécurité transparent dès lors qu'un correctif a été déployé.

                    3. Honnêteté institutionnelle et communication de crise :
                    En cas d'incident de sécurité ou de compromission avérée, la doctrine d'AJ-TECH exclut toute tentative de dissimulation. L'information directe, rapide et détaillée des utilisateurs concernés constitue le premier devoir d'une organisation digne de ce nom.

                    4. Les quatre statuts transparents d'AJ-TECH :
                    Toutes les entités et fonctionnalités présentées dans cet ouvrage sont rigoureusement classées :
                    🟢 Opérationnel (déployé et fonctionnel) ;
                    🟡 Développement / Prototype (code en cours d'élaboration) ;
                    🔵 Concept (modélisation architecturale) ;
                    ⚪ Vision future (feuille de route stratégique).
                """.trimIndent(),
                contentHt = """
                    1. Gouvènans teknoloji se yon kesyon konsyans ak moral :
                    Moun k ap kreye lojisyèl gen yon gwo pouvwa nan men yo : se yo ki deside kijan done moun ap jere epi kijan sistèm yo ap fonksyone. Si yon enjenyè pa gen bon prensip moral nan kè l, li ka fasil itilize konesans li pou fè move bagay sou moun.

                    2. Fason pou rapòte fay san krentif (Responsible Disclosure) :
                    AJ-TECH ankouraje tout etidyan ak moun ki konn sekirite pou yo teste zouti nou yo. Nou gen prensip klè :
                    - Yon kote sekirize pou moun ka voye di nou si yo jwenn yon twou nan kòd la ;
                    - Nou pap janm trennen yon moun nan lajistis si l te fè tès la pou ede nou ranje l ;
                    - Depi nou fin ranje twou a, nou pibliye yon ti rapò pou remèsye moun ki te ede a.

                    3. Di laverite san kache anyen lè gen pwoblèm :
                    Si yon jou ta gen yon gwo atak oswa yon pwoblèm nan sistèm nan, prensip AJ-TECH se pale klè ak tout moun imedyatman, eksplike sa k te pase a epi montre kijan nou ranje l, san fè fo diskou.

                    4. 4 nivo verite sou chak pwojè AJ-TECH :
                    Nou toujou klase chak zouti nan bon nivo l ye toutbon :
                    🟢 Fonksyonèl (kòd la pare e l ap mache) ;
                    🟡 Nan devlopman / Prototip (n ap travay sou kòd la kounye a) ;
                    🔵 Konsèp (plan teknik la fèt) ;
                    ⚪ Vizyon pou pi devan (objektif estratejik pou lavni).
                """.trimIndent(),
                plannedStartPage = 147,
                plannedEndPage = 148,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 105 : Préparer AJ-TECH aux risques futurs ====================
            BookChapter(
                id = "ch_7_105",
                chapterNumber = 105,
                partId = "part_7",
                titleFr = "Chapitre 105 — Préparer AJ-TECH aux risques futurs",
                titleHt = "Chapit 105 — Prepare AJ-TECH pou risk lavni",
                subtitleFr = "Menaces émergentes, attaques par IA, cryptographie post-quantique et plans de continuité",
                subtitleHt = "Nouvo danje k ap vini, atak ak Entèlijans Atifisyèl ak kijan pou lojisyèl la pa janm mouri",
                summaryFr = "Anticipation des menaces de la décennie à venir : deepfakes, attaques automatisées par IA, transition post-quantique et plans de continuité d'activité (PCA/PRA).",
                summaryHt = "Gade pi lwen sou danje k ap vini nan ane k ap monte yo : atak avèk IA, vòlè vwa ak imaj, ak plan pou sèvis la pa janm kanpe.",
                contentFr = """
                    1. Les menaces cybernétiques de la décennie 2026–2035 :
                    Le paysage des cybermenaces mute à une cadence exponentielle sous l'effet de l'intelligence artificielle générative et de l'automatisation avancée :
                    - Les attaques automatisées adaptatives : Des agents logiciels capables de tester en boucle des milliers de variantes de charges utiles et de contourner les pare-feu applicatifs traditionnels ;
                    - Les fraudes par hypertrucage (Deepfakes audio et vidéo) : Usurpation sophistiquée de la voix de dirigeants ou de proches pour ordonner des transferts d'argent frauduleux ;
                    - L'empoisonnement des modèles d'IA : Injection délibérée de données biaisées ou falsifiées dans les corpus d'entraînement des systèmes d'aide à la décision.

                    2. L'impératif de la cryptographie post-quantique (PQC) :
                    L'émergence prévisible des premiers calculateurs quantiques opérationnels rendra vulnérables les algorithmes asymétriques actuels (RSA, courbes elliptiques). AJ-TECH anticipe cette transition en surveillant les standards du NIST (Kyber, Dilithium) pour intégrer progressivement des bibliothèques cryptographiques hybrides.

                    3. Plan de Continuité d'Activité (PCA) et Plan de Reprise d'Activité (PRA) :
                    Sous les contraintes géographiques et climatiques caribéennes (cyclones, séismes), la résilience exige la redondance des sauvegardes chiffrées hors-site, la documentation exhaustive des procédures de restauration et la capacité de redémarrer un système minimal en moins de 4 heures.
                """.trimIndent(),
                contentHt = """
                    1. Gwo danje k ap monte pou ane 2026 rive 2035 :
                    Mond teknoloji a ap chanje trè vit avèk nouvo zouti Entèlijans Atifisyèl yo :
                    - Atak ki fèt ak robo entèlijan : Zouti pirate ki ka chèche twou nan kòd la poukont yo epi eseye plizyè milye fason pou antre pi vit ;
                    - Fo vwa ak fo videyo moun (Deepfakes) : Move moun k ap imite vwa yon fanmi w oswa yon direktè bank pou mande fè transfè lajan vit ;
                    - Mete pwazon nan zouti IA : Moun ki mete fo enfòmasyon nan leson IA pou fè l bay manti oswa pran move desizyon.

                    2. Prepare pou nouvo kalkil matematik kap vini yo (Post-Quantum) :
                    Nan ane k ap vini yo, nouvo machin kalkil trè pwisan (ordinatè kantik) ka kraze vye sistèm chifreman nou itilize jodi a. AJ-TECH deja ap prepare pou adopte nouvo fòmil matematik ki pi solid pou done yo pa janm ka kase.

                    3. Plan pou sistèm nan pa janm mouri (PCA / PRA) :
                    Paske nou nan Karayib la kote gen siklòn ak tranblemanntè, nou dwe toujou gen kopi tout done yo ki sere an sekirite nan plizyè kote diferan, yon fason pou menm si yon gwo malè ta rive, sèvis la ka relimen nan mwens pase 4 èdtan.
                """.trimIndent(),
                plannedStartPage = 148,
                plannedEndPage = 149,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 106 : Une culture de sécurité pour 2026–2035 ====================
            BookChapter(
                id = "ch_7_106",
                chapterNumber = 106,
                partId = "part_7",
                titleFr = "Chapitre 106 — Une culture de sécurité pour 2026–2035",
                titleHt = "Chapit 106 — Yon kilti sekirite pou 2026–2035",
                subtitleFr = "Sensibilisation civique, formation continue des ingénieurs et feuille de route décennale",
                subtitleHt = "Aprann pèp la pwoteje tèt li, fòmasyon kontinyèl pou devlopè ak plan estratejik 10 ane",
                summaryFr = "Synthèse de la Partie VII : construire une véritable culture de sécurité partagée par tous les Haïtiens, adossée à une feuille de route décennale 2026–2035 réaliste et sans complaisance.",
                summaryHt = "Konklizyon Pati VII : kreye yon bon abitid sekirite nan mitan tout Ayisyen epi prezante plan travay 10 ane (2026–2035) pou defann souverènte nimerik nou.",
                contentFr = """
                    1. La sécurité comme culture humaine avant tout :
                    La sécurité informatique ne se réduit pas à une suite de protocoles mathématiques ou de pare-feu logiciels. Elle réside d'abord dans la conscience, la vigilance et les réflexes quotidiens des êtres humains qui conçoivent, administrent et utilisent les outils numériques. Le maillon le plus solide d'un système est un citoyen éduqué.

                    2. Les cinq réflexes civiques de sécurité pour chaque Haïtien :
                    - Réflexe 1 : Ne jamais divulguer un code de confirmation reçu par SMS ou application, même à un prétendu support technique ;
                    - Réflexe 2 : Utiliser des mots de passe robustes et distincts pour chaque service essentiel (gestionnaire de mots de passe) ;
                    - Réflexe 3 : Activer l'authentification à deux facteurs partout où elle est disponible ;
                    - Réflexe 4 : Mettre à jour systématiquement ses applications et son système d'exploitation dès parution des correctifs ;
                    - Réflexe 5 : Refuser le téléchargement de fichiers APK douteux ou piratés sur des canaux non vérifiés.

                    3. Feuille de route décennale de cybersécurité AJ-TECH (2026–2035) :
                    - 2026–2027 : Consolidation de l'hygiène de code sur l'ensemble des modules logiciels, intégration systématique du chiffrement local Room/SQLCipher et diffusion de guides pédagogiques bilingues ;
                    - 2028–2030 : Réalisation d'audits de sécurité tiers indépendants documentés, mise en place d'un programme public de primes aux failles (Bug Bounty) et transition vers WebAuthn/Passkeys ;
                    - 2031–2035 : Étude de faisabilité et déploiement progressif des premiers nœuds d'hébergement souverains locaux alimentés par micro-réseaux solaires résilients (vision AJ-Cloud).

                    4. L'engagement solennel d'AJ-TECH :
                    Défendre la dignité numérique de la jeunesse haïtienne, protéger ses données contre toute prédation commerciale ou étatique étrangère, et prouver qu'Haïti peut bâtir des systèmes d'information sûrs, robustes et respectés dans le monde entier.
                """.trimIndent(),
                contentHt = """
                    1. Sekirite se yon kilti nan kè moun an premye :
                    Sekirite enfòmatik se pa sèlman gwo fòmil matematik ak zouti konplike. Se anvan tout bagay bon abitid ak lespri vijilan chak moun k ap sèvi ak teknoloji a. Lè yon pèp byen konprann danje yo, li pi difisil pou nenpòt pirate twonpe l.

                    2. 5 bon refleks sekirite chak Ayisyen dwe genyen :
                    - Premye refleks : Pa janm bay pèsonn yon ti kòd sekrè ou resevwa pa SMS oswa sou WhatsApp, menm si moun lan di se direktè bank lan li ye ;
                    - Dezyèm refleks : Mete bon modpas ki long epi pa janm sèvi ak menm modpas la sou de kote diferan ;
                    - Twazyèm refleks : Limen dezyèm nivo sekirite a (MFA) sou tout kont ou genyen ;
                    - Katriyèm refleks : Mete aplikasyon w yo ak telefòn ou a jou depi yo mande sa pou fèmen vye twou ;
                    - Senkyèm refleks : Pa janm enstale ti pwogram APK moun voye ba ou nan WhatsApp oswa sou sit ou pa konnen.

                    3. Plan travay 10 ane AJ-TECH pou sekirite (2026–2035) :
                    - 2026–2027 : Netwaye tout kòd nan tout zouti nou yo, mete chifreman nan tout baz done lokal epi pibliye bonjan gid pou tout moun aprann ;
                    - 2028–2030 : Fè gwo espesyalis endepandan verifye kòd nou, peye moun ki jwenn twou nan kòd la pou ede nou ranje l (Bug Bounty), epi pase nan sistèm koneksyon san modpas (Passkeys) ;
                    - 2031–2035 : Prepare premye ti sant sèvè lokal ki mache sou panèl solè pou sere done peyi a sou tè Ayiti (vizyon AJ-Cloud).

                    4. Gwo angajman AJ-TECH anvè peyi a :
                    Pwoteje diyite tout jèn Ayisyen, pwoteje enfòmasyon yo kont nenpòt konpayi etranje ki vle espyone yo, epi montre tout latè peyi Ayiti ka kreye teknoloji ki gen pi gwo nivo sekirite ak respè.
                """.trimIndent(),
                plannedStartPage = 149,
                plannedEndPage = 150,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}
