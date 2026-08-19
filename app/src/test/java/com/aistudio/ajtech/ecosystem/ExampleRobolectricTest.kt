package com.aistudio.ajtech.ecosystem

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.aistudio.ajtech.ecosystem.data.model.BookLanguage
import com.aistudio.ajtech.ecosystem.data.model.EntityStatus
import com.aistudio.ajtech.ecosystem.data.repository.BookRepository
import com.aistudio.ajtech.ecosystem.data.repository.EcosystemRepository
import com.aistudio.ajtech.ecosystem.ui.navigation.NavDestination
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read app_name string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("AJ-TECH", appName)
  }

  @Test
  fun `verify ecosystem entities count is exactly 21`() {
    val entities = EcosystemRepository.entities
    assertEquals(21, entities.size)
  }

  @Test
  fun `verify EDUKA and EDH exact names and core AJ-TECH presence`() {
    val ajTech = EcosystemRepository.getEntityById("aj_tech")
    assertNotNull(ajTech)
    assertEquals("AJ-TECH", ajTech?.name)

    val eduka = EcosystemRepository.getEntityById("eduka")
    assertNotNull(eduka)
    assertEquals("EDUKA", eduka?.name)

    val edh = EcosystemRepository.getEntityById("edh")
    assertNotNull(edh)
    assertEquals("EDH", edh?.name)
  }

  @Test
  fun `verify all 21 entities have complete 18 normalized fields in FR and HT`() {
    val entities = EcosystemRepository.entities
    assertEquals(21, entities.size)

    for (entity in entities) {
      // 1. Nom
      assertTrue("Name should not be empty for ${entity.id}", entity.name.isNotBlank())
      // 2. Statut
      assertNotNull("Status required for ${entity.id}", entity.status)
      // 3. Origine
      assertTrue("Origin FR missing for ${entity.id}", entity.origin(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Origin HT missing for ${entity.id}", entity.origin(BookLanguage.KREYOL).isNotBlank())
      // 4. Mission
      assertTrue("Mission FR missing for ${entity.id}", entity.mission(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Mission HT missing for ${entity.id}", entity.mission(BookLanguage.KREYOL).isNotBlank())
      // 5. Vision
      assertTrue("Vision FR missing for ${entity.id}", entity.vision(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Vision HT missing for ${entity.id}", entity.vision(BookLanguage.KREYOL).isNotBlank())
      // 6. Problème résolu
      assertTrue("Problem FR missing for ${entity.id}", entity.problem(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Problem HT missing for ${entity.id}", entity.problem(BookLanguage.KREYOL).isNotBlank())
      // 7. Solution proposée
      assertTrue("Solution FR missing for ${entity.id}", entity.solution(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Solution HT missing for ${entity.id}", entity.solution(BookLanguage.KREYOL).isNotBlank())
      // 8. Public cible
      assertTrue("Target audience FR missing for ${entity.id}", entity.targetAudience(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Target audience HT missing for ${entity.id}", entity.targetAudience(BookLanguage.KREYOL).isNotBlank())
      // 9. Fonctionnalités
      assertTrue("Features FR missing for ${entity.id}", entity.features(BookLanguage.FRENCH).isNotEmpty())
      assertTrue("Features HT missing for ${entity.id}", entity.features(BookLanguage.KREYOL).isNotEmpty())
      // 10. Architecture
      assertTrue("Architecture FR missing for ${entity.id}", entity.architecture(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Architecture HT missing for ${entity.id}", entity.architecture(BookLanguage.KREYOL).isNotBlank())
      // 11. Technologies
      assertTrue("Tech stack FR missing for ${entity.id}", entity.techStack(BookLanguage.FRENCH).isNotEmpty())
      assertTrue("Tech stack HT missing for ${entity.id}", entity.techStack(BookLanguage.KREYOL).isNotEmpty())
      // 12. Intelligence artificielle
      assertTrue("AI role FR missing for ${entity.id}", entity.aiRole(BookLanguage.FRENCH).isNotBlank())
      assertTrue("AI role HT missing for ${entity.id}", entity.aiRole(BookLanguage.KREYOL).isNotBlank())
      // 13. Sécurité
      assertTrue("Security FR missing for ${entity.id}", entity.security(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Security HT missing for ${entity.id}", entity.security(BookLanguage.KREYOL).isNotBlank())
      // 14. Modèle économique
      assertTrue("Business model FR missing for ${entity.id}", entity.businessModel(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Business model HT missing for ${entity.id}", entity.businessModel(BookLanguage.KREYOL).isNotBlank())
      // 15. Intégration AJ-TECH
      assertTrue("AJ-TECH integration FR missing for ${entity.id}", entity.ajTechIntegration(BookLanguage.FRENCH).isNotBlank())
      assertTrue("AJ-TECH integration HT missing for ${entity.id}", entity.ajTechIntegration(BookLanguage.KREYOL).isNotBlank())
      // 16. Relations entités
      assertTrue("Related entities FR missing for ${entity.id}", entity.relatedEntities(BookLanguage.FRENCH).isNotBlank())
      assertTrue("Related entities HT missing for ${entity.id}", entity.relatedEntities(BookLanguage.KREYOL).isNotBlank())
      // 17. Feuille de route
      assertTrue("Roadmap FR missing for ${entity.id}", entity.roadmap(BookLanguage.FRENCH).isNotEmpty())
      assertTrue("Roadmap HT missing for ${entity.id}", entity.roadmap(BookLanguage.KREYOL).isNotEmpty())
      // 18. Perspectives internationales
      assertTrue("International outlooks FR missing for ${entity.id}", entity.internationalOutlooks(BookLanguage.FRENCH).isNotBlank())
      assertTrue("International outlooks HT missing for ${entity.id}", entity.internationalOutlooks(BookLanguage.KREYOL).isNotBlank())
    }
  }

  @Test
  fun `verify AJ-Task status and PWA flag`() {
    val ajTask = EcosystemRepository.getEntityById("aj_task")
    assertNotNull(ajTask)
    assertEquals("AJ-Task", ajTask?.name)
    assertEquals(EntityStatus.IN_DEVELOPMENT, ajTask?.status)
    assertTrue(ajTask?.isPwa == true)
  }

  @Test
  fun `verify book structure parts and bilingual chapters`() {
    val parts = BookRepository.parts
    assertTrue(parts.isNotEmpty())

    val allChapters = BookRepository.allChapters
    assertTrue(allChapters.size >= 12)

    val firstChapter = allChapters.first()
    assertNotNull(firstChapter)
    assertTrue(firstChapter.title(BookLanguage.FRENCH).isNotEmpty())
    assertTrue(firstChapter.title(BookLanguage.KREYOL).isNotEmpty())

    val searchResultsFr = BookRepository.searchBook("Souveraineté", BookLanguage.FRENCH)
    assertTrue(searchResultsFr.isNotEmpty())
  }

  @Test
  fun `verify navigation destinations and ecosystem status partitions`() {
    val navItems = NavDestination.items
    assertEquals(7, navItems.size)
    assertTrue(navItems.any { it.route == "home" })
    assertTrue(navItems.any { it.route == "book" })
    assertTrue(navItems.any { it.route == "ecosystem" })
    assertTrue(navItems.any { it.route == "vision" })
    assertTrue(navItems.any { it.route == "manifesto" })
    assertTrue(navItems.any { it.route == "about" })
    assertTrue(navItems.any { it.route == "edition" })

    val opCount = EcosystemRepository.getEntitiesByStatus(EntityStatus.OPERATIONAL).size
    val devCount = EcosystemRepository.getEntitiesByStatus(EntityStatus.IN_DEVELOPMENT).size
    val conceptCount = EcosystemRepository.getEntitiesByStatus(EntityStatus.CONCEPT).size
    val plannedCount = EcosystemRepository.getEntitiesByStatus(EntityStatus.PLANNED).size

    assertEquals(21, opCount + devCount + conceptCount + plannedCount)
  }
}

