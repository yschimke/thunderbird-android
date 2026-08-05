package net.thunderbird.components.ui.bolt.organism.drawer

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import net.thunderbird.components.ui.bolt.PreviewWithThemeLightDark
import net.thunderbird.components.ui.bolt.atom.text.TextBodyMedium
import androidx.compose.material3.ModalDrawerSheet as Material3ModalDrawerSheet

@Composable
fun ModalDrawerSheet(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Material3ModalDrawerSheet(
        modifier = modifier,
        content = content,
    )
}

@PreviewLightDark
@Composable
internal fun ModalDrawerSheetPreview() {
    PreviewWithThemeLightDark {
        ModalDrawerSheet {
            NavigationDrawerHeadline(title = "Folders")
            TextBodyMedium(text = "Inbox")
            NavigationDrawerDivider()
            TextBodyMedium(text = "Settings")
        }
    }
}
