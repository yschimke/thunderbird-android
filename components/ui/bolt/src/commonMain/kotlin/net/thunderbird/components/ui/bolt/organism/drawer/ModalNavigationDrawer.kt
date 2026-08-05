package net.thunderbird.components.ui.bolt.organism.drawer

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.thunderbird.components.ui.bolt.PreviewWithThemeLightDark
import net.thunderbird.components.ui.bolt.atom.button.ButtonText
import net.thunderbird.components.ui.bolt.atom.text.TextBodyMedium
import androidx.compose.material3.ModalNavigationDrawer as Material3ModalNavigationDrawer

@Composable
fun ModalNavigationDrawer(
    drawerContent: @Composable (closeDrawer: () -> Unit) -> Unit,
    modifier: Modifier = Modifier,
    gesturesEnabled: Boolean = true,
    content: @Composable (openDrawer: () -> Unit) -> Unit,
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val openDrawer: () -> Unit = { scope.launch { drawerState.open() } }
    val closeDrawer: () -> Unit = {
        scope.launch {
            delay(DRAWER_CLOSE_DELAY)
            drawerState.close()
        }
    }

    Material3ModalNavigationDrawer(
        drawerContent = { drawerContent(closeDrawer) },
        modifier = modifier,
        drawerState = drawerState,
        gesturesEnabled = gesturesEnabled,
        content = { content(openDrawer) },
    )
}

/**
 * Delay before closing the drawer to avoid the drawer being closed immediately and give time
 * for the ripple effect to finish.
 */
private const val DRAWER_CLOSE_DELAY = 250L

@PreviewLightDark
@Composable
internal fun ModalNavigationDrawerPreview() {
    PreviewWithThemeLightDark {
        ModalNavigationDrawer(
            drawerContent = {
                ModalDrawerSheet {
                    NavigationDrawerHeadline(title = "Folders")
                    TextBodyMedium(text = "Inbox")
                }
            },
        ) { openDrawer ->
            ButtonText(text = "Open drawer", onClick = openDrawer)
        }
    }
}
