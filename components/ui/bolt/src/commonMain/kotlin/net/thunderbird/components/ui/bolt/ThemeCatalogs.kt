package net.thunderbird.components.ui.bolt

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider
import ee.schimke.composeai.preview.ThemeCatalog

@ThemeCatalog(name = "Thunderbird Light", group = "Thunderbird")
class ThunderbirdLightThemeCatalog : PreviewWrapperProvider {
    @Composable
    override fun Wrap(content: @Composable () -> Unit) {
        PreviewWithThemeCatalog(
            themeType = PreviewThemeType.THUNDERBIRD,
            isDarkTheme = false,
            content = content,
        )
    }
}

@ThemeCatalog(name = "Thunderbird Dark", group = "Thunderbird")
class ThunderbirdDarkThemeCatalog : PreviewWrapperProvider {
    @Composable
    override fun Wrap(content: @Composable () -> Unit) {
        PreviewWithThemeCatalog(
            themeType = PreviewThemeType.THUNDERBIRD,
            isDarkTheme = true,
            content = content,
        )
    }
}

@ThemeCatalog(name = "K-9 Mail Light", group = "K-9 Mail")
class K9MailLightThemeCatalog : PreviewWrapperProvider {
    @Composable
    override fun Wrap(content: @Composable () -> Unit) {
        PreviewWithThemeCatalog(
            themeType = PreviewThemeType.K9MAIL,
            isDarkTheme = false,
            content = content,
        )
    }
}

@ThemeCatalog(name = "K-9 Mail Dark", group = "K-9 Mail")
class K9MailDarkThemeCatalog : PreviewWrapperProvider {
    @Composable
    override fun Wrap(content: @Composable () -> Unit) {
        PreviewWithThemeCatalog(
            themeType = PreviewThemeType.K9MAIL,
            isDarkTheme = true,
            content = content,
        )
    }
}
