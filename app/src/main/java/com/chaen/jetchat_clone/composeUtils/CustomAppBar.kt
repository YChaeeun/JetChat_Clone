package com.chaen.jetchat_clone.composeUtils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chaen.jetchat_clone.ui.theme.JetChat_CloneTheme

@Composable
fun CustomAppBar(
	modifier: Modifier = Modifier,
	content: @Composable RowScope.() -> Unit
) {
	Column {
		TopAppBar(
			modifier = modifier,
			elevation = 0.dp,
			content = { Row { content() } }
		)

		Divider()
	}
}

@Preview(showBackground = true)
@Composable
fun CustomAppBarPreview() {
	JetChat_CloneTheme {
		CustomAppBar(content = { Text("Preview") })
	}
}

@Preview(showBackground = true)
@Composable
fun CustomAppBarPreviewDark() {
	JetChat_CloneTheme(darkTheme = true) {
		CustomAppBar(content = { Text("Preview") })
	}
}