package cc.samlab.wellness.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import cc.samlab.wellness.R


data class Day(
    @StringRes val dayNumber: Int,
    @StringRes val title: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int,
)

object Days {
    val DaysList = listOf(
        Day(
            dayNumber = R.string.day_1,
            title = R.string.title_1,
            imageRes = R.drawable.img1,
            descriptionRes = R.string.text_1,
        ),
        Day(
            dayNumber = R.string.day_2,
            title = R.string.title_2,
            imageRes = R.drawable.img2,
            descriptionRes = R.string.text_2,
        ),
        Day(
            dayNumber = R.string.day_3,
            title = R.string.title_3,
            imageRes = R.drawable.img3,
            descriptionRes = R.string.text_3,
        ),
        Day(
            dayNumber = R.string.day_4,
            title = R.string.title_4,
            imageRes = R.drawable.img4,
            descriptionRes = R.string.text_4,
        ),
        Day(
            dayNumber = R.string.day_5,
            title = R.string.title_5,
            imageRes = R.drawable.img5,
            descriptionRes = R.string.text_5,
        ),
        Day(
            dayNumber = R.string.day_6,
            title = R.string.title_6,
            imageRes = R.drawable.img6,
            descriptionRes = R.string.text_6,
        ),
        Day(
            dayNumber = R.string.day_7,
            title = R.string.title_7,
            imageRes = R.drawable.img7,
            descriptionRes = R.string.text_7,
        ),
        Day(
            dayNumber = R.string.day_8,
            title = R.string.title_8,
            imageRes = R.drawable.img8,
            descriptionRes = R.string.text_8,
        ),
        Day(
            dayNumber = R.string.day_9,
            title = R.string.title_9,
            imageRes = R.drawable.img9,
            descriptionRes = R.string.text_9,
        ),
        Day(
            dayNumber = R.string.day_10,
            title = R.string.title_10,
            imageRes = R.drawable.img10,
            descriptionRes = R.string.text_10,
        ),
        Day(
            dayNumber = R.string.day_11,
            title = R.string.title_11,
            imageRes = R.drawable.img11,
            descriptionRes = R.string.text_11,
        ),
        Day(
            dayNumber = R.string.day_12,
            title = R.string.title_12,
            imageRes = R.drawable.img12,
            descriptionRes = R.string.text_12,
        ),
        Day(
            dayNumber = R.string.day_13,
            title = R.string.title_13,
            imageRes = R.drawable.img13,
            descriptionRes = R.string.text_13,
        ),
        Day(
            dayNumber = R.string.day_14,
            title = R.string.title_14,
            imageRes = R.drawable.img14,
            descriptionRes = R.string.text_14,
        ),
        Day(
            dayNumber = R.string.day_15,
            title = R.string.title_15,
            imageRes = R.drawable.img15,
            descriptionRes = R.string.text_15,
        ),
        Day(
            dayNumber = R.string.day_16,
            title = R.string.title_16,
            imageRes = R.drawable.img16,
            descriptionRes = R.string.text_16,
        ),
        Day(
            dayNumber = R.string.day_17,
            title = R.string.title_17,
            imageRes = R.drawable.img17,
            descriptionRes = R.string.text_17,
        ),
        Day(
            dayNumber = R.string.day_18,
            title = R.string.title_18,
            imageRes = R.drawable.img18,
            descriptionRes = R.string.text_18,
        ),
        Day(
            dayNumber = R.string.day_19,
            title = R.string.title_19,
            imageRes = R.drawable.img19,
            descriptionRes = R.string.text_19,
        ),
        Day(
            dayNumber = R.string.day_20,
            title = R.string.title_20,
            imageRes = R.drawable.img20,
            descriptionRes = R.string.text_20,
        ),
        Day(
            dayNumber = R.string.day_21,
            title = R.string.title_21,
            imageRes = R.drawable.img21,
            descriptionRes = R.string.text_21,
        ),
        Day(
            dayNumber = R.string.day_22,
            title = R.string.title_22,
            imageRes = R.drawable.img22,
            descriptionRes = R.string.text_22,
        ),
        Day(
            dayNumber = R.string.day_23,
            title = R.string.title_23,
            imageRes = R.drawable.img23,
            descriptionRes = R.string.text_23,
        ),
        Day(
            dayNumber = R.string.day_24,
            title = R.string.title_24,
            imageRes = R.drawable.img24,
            descriptionRes = R.string.text_24,
        ),
        Day(
            dayNumber = R.string.day_25,
            title = R.string.title_25,
            imageRes = R.drawable.img25,
            descriptionRes = R.string.text_25,
        ),
        Day(
            dayNumber = R.string.day_26,
            title = R.string.title_26,
            imageRes = R.drawable.img26,
            descriptionRes = R.string.text_26,
        ),
        Day(
            dayNumber = R.string.day_27,
            title = R.string.title_27,
            imageRes = R.drawable.img27,
            descriptionRes = R.string.text_27,
        ),
        Day(
            dayNumber = R.string.day_28,
            title = R.string.title_28,
            imageRes = R.drawable.img28,
            descriptionRes = R.string.text_28,
        ),
        Day(
            dayNumber = R.string.day_29,
            title = R.string.title_29,
            imageRes = R.drawable.img29,
            descriptionRes = R.string.text_29,
        ),
        Day(
            dayNumber = R.string.day_30,
            title = R.string.title_30,
            imageRes = R.drawable.img30,
            descriptionRes = R.string.text_30,
        )
    )
}
