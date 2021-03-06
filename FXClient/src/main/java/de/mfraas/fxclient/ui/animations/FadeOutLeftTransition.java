package de.mfraas.fxclient.ui.animations;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.TimelineBuilder;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Created by marcelfraas on 18.02.17.
 */

@SuppressWarnings("deprecation")
public class FadeOutLeftTransition extends AnimationConfig {
    /**
     * Create new FadeInUpTransition
     *
     * @param node The node to affect
     */
    public FadeOutLeftTransition(final Node node) {
        super(
                node,
                TimelineBuilder.create()
                        .keyFrames(
                                new KeyFrame(Duration.millis(0),
                                        new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                                        new KeyValue(node.translateXProperty(), 20, WEB_EASE)
                                ),
                                new KeyFrame(Duration.millis(1000),
                                        new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                                        new KeyValue(node.translateXProperty(), -20, WEB_EASE)
                                )
                        )
                        .build()
        );
        setCycleDuration(Duration.seconds(0));
        setDelay(Duration.seconds(0));
        node.toFront();
    }
}
