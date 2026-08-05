package net.thunderbird.components.ui.bolt.organism.drawer

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.thunderbird.components.ui.bolt.PreviewWithThemes
import net.thunderbird.components.ui.bolt.atom.text.TextBodyMedium
import net.thunderbird.components.ui.bolt.theme.BoltTheme

@Composable
fun NavigationDrawerItemLayout(
    modifier: Modifier = Modifier,
    content: @Composable (PaddingValues) -> Unit,
) {
    Row(
        modifier = Modifier
            .then(modifier)
            .padding(
                start = BoltTheme.spacings.double,
                end = BoltTheme.spacings.triple,
            ),
    ) {
        content(defaultInnerPaddingValues())
    }
}

@Preview(showBackground = true)
@Composable
internal fun NavigationDrawerItemLayoutPreview() {
    PreviewWithThemes {
        NavigationDrawerItemLayout { paddingValues ->
            TextBodyMedium(
                text = "Drawer item",
                modifier = Modifier.padding(paddingValues),
            )
        }
    }
}

@Composable
private fun defaultInnerPaddingValues(): PaddingValues {
    return PaddingValues(
        horizontal = BoltTheme.spacings.oneHalf,
    )
}
