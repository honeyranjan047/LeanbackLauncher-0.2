package com.evotest.honeyranjan.leanbacklauncher.logging;

import com.evotest.honeyranjan.leanbacklauncher.protobuf.nano.CodedOutputByteBufferNano;
import com.evotest.honeyranjan.leanbacklauncher.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;

public final class LeanbackProto$AppRankAction extends ExtendableMessageNano<LeanbackProto$AppRankAction> {
    public LeanbackProto$App[] apps;

    public LeanbackProto$AppRankAction() {
        clear();
    }

    public LeanbackProto$AppRankAction clear() {
        this.apps = LeanbackProto$App.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano output) throws IOException {
        if (this.apps != null && this.apps.length > 0) {
            for (LeanbackProto$App element : this.apps) {
                if (element != null) {
                    output.writeMessage(1, element);
                }
            }
        }
        super.writeTo(output);
    }

    protected int computeSerializedSize() {
        int size = super.computeSerializedSize();
        if (this.apps != null && this.apps.length > 0) {
            for (LeanbackProto$App element : this.apps) {
                if (element != null) {
                    size += CodedOutputByteBufferNano.computeMessageSize(1, element);
                }
            }
        }
        return size;
    }
}
