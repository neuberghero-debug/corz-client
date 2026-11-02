package gg.corz;

import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

record iIiIIilIliIIil(ByteBuffer data, AudioFormat format) {
   private final AudioFormat lliIiilIiiliIiilIi;
   private final ByteBuffer iIiIiilIiIliIiilIi;

   public AudioFormat liiiIIllIl() {
      return this.lliIiilIiiliIiilIi;
   }

   public ByteBuffer IliIlllilIi() {
      return this.iIiIiilIiIliIiilIi;
   }

   iIiIIilIliIIil(ByteBuffer data, AudioFormat format) {
      this.iIiIiilIiIliIiilIi = data;
      this.lliIiilIiiliIiilIi = format;
   }
}
