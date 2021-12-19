package com.chaen.jetchat_clone.composeUtils

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp

data class BaselineHeightModifier(
	val heightFromBaseLine: Dp
) : LayoutModifier {

	override fun MeasureScope.measure(measurable: Measurable, constraints: Constraints): MeasureResult {
		val textPlaceable = measurable.measure(constraints) // measure composable with given constraints

		val firstBaseLine = textPlaceable[FirstBaseline]
		val lastBaseline = textPlaceable[LastBaseline]

		val height = heightFromBaseLine.roundToPx() + lastBaseline - firstBaseLine

		/** layout(width, height)
		 *   - calculate its size and specify it by calling `layout(width, height)`
		 *   - accepts a lambda used for placing the content
		 * */
		return layout(constraints.maxWidth, height) {
			val topY = heightFromBaseLine.roundToPx() - firstBaseLine

			// position the composable to visible on the screen
			// automatically adjusts the position of the placeable based on the current layoutDirection
			textPlaceable.place(0, topY)
		}
	}
}

fun Modifier.baseLineHeightModifier(heightFromBaseline: Dp): Modifier =
	this.then(BaselineHeightModifier(heightFromBaseline))
// then()
// Concatenates this modifier with another.