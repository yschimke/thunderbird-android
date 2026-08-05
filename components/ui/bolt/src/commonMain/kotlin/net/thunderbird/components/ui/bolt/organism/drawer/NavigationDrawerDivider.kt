package net.thunderbird.components.ui.bolt.organism.drawer

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.thunderbird.components.ui.bolt.PreviewWithThemes

@Composable
fun NavigationDrawerDivider(
    modifier: Modifier = Modifier,
) {
    NavigationDrawerItemLayout(
        modifier = modifier,
    ) { paddingValues ->
        HorizontalDivider(
            modifier = Modifier
                .padding(paddingValues),
        )
    }
}

@Preview(showBackground = true)
@Composable
internal fun NavigationDrawerDividerPreview() {
    PreviewWithThemes {
        NavigationDrawerDivider()
    }
}
