package com.chaen.jetchat_clone.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.chaen.jetchat_clone.composeUtils.CustomAppBar
import com.chaen.jetchat_clone.composeUtils.baseLineHeightModifier

@Composable
fun ProfileScreen() {
	Column(modifier = Modifier.fillMaxSize()) {
		CustomAppBar(
			content = { Row { Text("Preview") } }
		)

		/** BoxWithConstraints
		 *   - A composable that defines its own content according to the available space
		 *   - The layout will size itself to fit the content, subject to the incoming constraints
		 *   - If `propagateMinConstraints` is set to `true`, the min size set on the `BoxWithConstraints` will
		 * also be applied to the content (default = false)
		 */

		/** BoxWithConstraints
		 *   - A composable that defines its own content according to the available space
		 *   - The layout will size itself to fit the content, subject to the incoming constraints
		 *   - If `propagateMinConstraints` is set to `true`, the min size set on the `BoxWithConstraints` will
		 * also be applied to the content (default = false)
		 */

		/** Modifier.weight
		 *   - Size the element's height proportional to its weight relative to other weighted siblings
		 *   - when `fill` is true, the element will be forced to occupy the whole height allocated to it (default = true)
		 */

		/** Modifier.weight
		 *   - Size the element's height proportional to its weight relative to other weighted siblings
		 *   - when `fill` is true, the element will be forced to occupy the whole height allocated to it (default = true)
		 */
		BoxWithConstraints(modifier = Modifier.weight(1f)) {
			val scrollState = rememberScrollState()

			/** Surface
			 *   - Material Design surface
			 *   - responsible for clipping / elevation / borders / background / content color / blocking touch
			 *	 - not for handling clicks (use another overload instead)
			 */

			/** Surface
			 *   - Material Design surface
			 *   - responsible for clipping / elevation / borders / background / content color / blocking touch
			 *	 - not for handling clicks (use another overload instead)
			 */

			/** Surface
			 *   - Material Design surface
			 *   - responsible for clipping / elevation / borders / background / content color / blocking touch
			 *	 - not for handling clicks (use another overload instead)
			 */

			/** Surface
			 *   - Material Design surface
			 *   - responsible for clipping / elevation / borders / background / content color / blocking touch
			 *	 - not for handling clicks (use another overload instead)
			 */
			Surface {
				Column(
					modifier = Modifier
						.fillMaxSize()
						.verticalScroll(scrollState)) {

					ProfileInformation(this@BoxWithConstraints.maxHeight)
				}
			}
		}
	}
}

@Composable
fun ProfileInformation(containerHeight: Dp) {
	Column {
		// Spacer : empty space layout
		Spacer(modifier = Modifier.height(8.dp))

		NameAndPosition()

		ProfileProperty("Display name", "aliconors")

		ProfileProperty("Status", "Online")

		ProfileProperty("Twitter", "twitter.com/aniconor")

		ProfileProperty("TimeZone", "In your tiemzone")

		// Bottom Spacer for showing parts of the list regardless of devices, leaving content at the top
		Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
	}
}

@Composable
fun NameAndPosition() {
	Column(modifier = Modifier.padding(horizontal = 16.dp)) {
		Name("Leah")
		Position("Android Developer")
	}
}

@Composable
fun Name(name: String, modifier: Modifier = Modifier) {
	Text(
		text = name,
		modifier = modifier,
		style = MaterialTheme.typography.h5
	)
}

@Composable
fun Position(position: String, modifier: Modifier = Modifier) {
	Text(
		text = position,
		modifier = modifier,
		style = MaterialTheme.typography.body1.copy(color = Color.Gray)
	)
}

@Composable
fun ProfileProperty(title: String, content: String) {
	Column(Modifier.padding(16.dp, 16.dp, 16.dp, 0.dp)) {
		Divider()

		Text(
			text = title,
			modifier = Modifier.baseLineHeightModifier(24.dp),
			style = MaterialTheme.typography.caption
		)

		Text(
			text = content,
			modifier = Modifier.baseLineHeightModifier(24.dp),
			style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primaryVariant)
		)
	}
}