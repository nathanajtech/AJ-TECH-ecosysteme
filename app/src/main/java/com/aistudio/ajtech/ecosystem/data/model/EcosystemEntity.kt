package com.aistudio.ajtech.ecosystem.data.model

import androidx.compose.ui.graphics.Color
import com.aistudio.ajtech.ecosystem.ui.theme.StatusBlue
import com.aistudio.ajtech.ecosystem.ui.theme.StatusGreen
import com.aistudio.ajtech.ecosystem.ui.theme.StatusWhite
import com.aistudio.ajtech.ecosystem.ui.theme.StatusYellow

enum class EntityStatus(
    val labelFr: String,
    val labelHt: String,
    val color: Color,
    val symbol: String
) {
    OPERATIONAL("Opérationnel", "Operasyonèl", StatusGreen, "🟢"),
    IN_DEVELOPMENT("En développement / Prototype", "An devlopman / Pwototip", StatusYellow, "🟡"),
    CONCEPT("Concept", "Konsèp", StatusBlue, "🔵"),
    PLANNED("Planifié", "Planifye", StatusWhite, "⚪");

    val label: String get() = labelFr
    fun label(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) labelFr else labelHt
}

/**
 * Entité officielle de l'écosystème AJ-TECH normalisée selon la structure éditoriale en 18 rubriques.
 */
data class EcosystemEntity(
    // 1. Nom
    val id: String,
    val name: String,
    val taglineFr: String,
    val taglineHt: String,

    // 2. Statut actuel
    val status: EntityStatus,

    // 3. Origine du concept
    val originFr: String,
    val originHt: String,

    // 4. Mission
    val missionFr: String,
    val missionHt: String,

    // 5. Vision
    val visionFr: String,
    val visionHt: String,

    // 6. Problème résolu
    val problemFr: String,
    val problemHt: String,

    // 7. Solution proposée
    val solutionFr: String,
    val solutionHt: String,

    // 8. Public cible
    val targetAudienceFr: String,
    val targetAudienceHt: String,

    // 9. Fonctionnalités principales
    val featuresFr: List<String>,
    val featuresHt: List<String>,

    // 10. Architecture technique
    val architectureFr: String,
    val architectureHt: String,

    // 11. Technologies envisagées
    val techStackFr: List<String>,
    val techStackHt: List<String>,

    // 12. Intelligence artificielle
    val aiRoleFr: String,
    val aiRoleHt: String,

    // 13. Sécurité
    val securityFr: String,
    val securityHt: String,

    // 14. Modèle économique
    val businessModelFr: String,
    val businessModelHt: String,

    // 15. Intégration avec AJ-TECH
    val ajTechIntegrationFr: String,
    val ajTechIntegrationHt: String,

    // 16. Relations avec les autres entités
    val relatedEntitiesFr: String,
    val relatedEntitiesHt: String,

    // 17. Feuille de route 2026–2035
    val roadmapFr: List<String>,
    val roadmapHt: List<String>,

    // 18. Perspectives internationales
    val internationalOutlooksFr: String,
    val internationalOutlooksHt: String,

    // Spécificités PWA le cas échéant
    val isPwa: Boolean = false,
    val pwaDetailsFr: String? = null,
    val pwaDetailsHt: String? = null
) {
    // Helpers bilingues pour les 18 rubriques
    fun tagline(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) taglineFr else taglineHt
    fun origin(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) originFr else originHt
    fun mission(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) missionFr else missionHt
    fun vision(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) visionFr else visionHt
    fun problem(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) problemFr else problemHt
    fun solution(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) solutionFr else solutionHt
    fun targetAudience(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) targetAudienceFr else targetAudienceHt
    fun features(lang: BookLanguage): List<String> = if (lang == BookLanguage.FRENCH) featuresFr else featuresHt
    fun architecture(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) architectureFr else architectureHt
    fun techStack(lang: BookLanguage): List<String> = if (lang == BookLanguage.FRENCH) techStackFr else techStackHt
    fun aiRole(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) aiRoleFr else aiRoleHt
    fun security(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) securityFr else securityHt
    fun businessModel(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) businessModelFr else businessModelHt
    fun ajTechIntegration(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) ajTechIntegrationFr else ajTechIntegrationHt
    fun relatedEntities(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) relatedEntitiesFr else relatedEntitiesHt
    fun roadmap(lang: BookLanguage): List<String> = if (lang == BookLanguage.FRENCH) roadmapFr else roadmapHt
    fun internationalOutlooks(lang: BookLanguage): String = if (lang == BookLanguage.FRENCH) internationalOutlooksFr else internationalOutlooksHt
    fun pwaDetails(lang: BookLanguage): String? = if (lang == BookLanguage.FRENCH) pwaDetailsFr else pwaDetailsHt

    // Rétrocompatibilité directe pour les propriétés existantes
    val tagline: String get() = taglineFr
    val description: String get() = originFr
    val mission: String get() = missionFr
    val vision: String get() = visionFr
    val problem: String get() = problemFr
    val solution: String get() = solutionFr
    val targetAudience: String get() = targetAudienceFr
    val features: List<String> get() = featuresFr
    val techStack: List<String> get() = techStackFr
    val roadmap: List<String> get() = roadmapFr
    val pwaDetails: String? get() = pwaDetailsFr
}
