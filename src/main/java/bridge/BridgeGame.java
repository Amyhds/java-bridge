package bridge;

import bridge.enums.GameCommandResult;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final int NO_RETRY = 0;
    private final String MATCH = "O";
    public final String MISMATCH = "X";

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public String move(String bridgeElement, String moving) {
        if (bridgeElement.equals(moving)) {
            return MATCH;
        }
        return MISMATCH;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public int retry(String gameCommand) {
        if (gameCommand.equals(GameCommandResult.RETRY.getGameCommand())) {
            return GameCommandResult.RETRY.getAttemptPlus();
        }
        return NO_RETRY;
    }
}
