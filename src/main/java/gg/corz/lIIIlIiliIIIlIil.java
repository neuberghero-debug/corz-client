package gg.corz;

import java.nio.ByteBuffer;
import org.joml.Matrix4f;

public final class lIIIlIiliIIIlIil {
   public boolean iiiiliIIil;
   public float IliiliIIil;
   public static final int liIiliIIil = 64;
   public float lIiiliIIil;
   public float IlliliIIil;
   public float IiiiliIIil;
   public float lIliliIIil;
   public final Matrix4f IIIIiiIIil = new Matrix4f();
   public float iIliliIIil;
   public float illiliIIil;
   public float lliiliIIil;
   public float lililiIIil;
   public float llliliIIil;
   public float IIiiliIIil;
   public float iliiliIIil;
   public static final int iiIiliIIil = 80;
   public float iIiiliIIil;
   public static final int IiIiliIIil = 144;
   public float IililiIIil;
   public boolean liiiliIIil;
   public float IIliliIIil;
   public float iililiIIil;

   public void IliIlllilIi(int rgb) {
      this.llliliIIil = (float)(rgb >> 16 & 0xFF) / 255.0F;
      this.illiliIIil = (float)(rgb >> 8 & 0xFF) / 255.0F;
      this.IililiIIil = (float)(rgb & 0xFF) / 255.0F;
   }

   public void liiiIIllIl(ByteBuffer buf) {
      buf.putFloat(0, this.IIliliIIil);
      buf.putFloat(4, this.lIliliIIil);
      buf.putFloat(8, this.iIliliIIil);
      buf.putFloat(12, this.IlliliIIil);
      buf.putFloat(16, this.llliliIIil);
      buf.putFloat(20, this.illiliIIil);
      buf.putFloat(24, this.IililiIIil);
      buf.putFloat(28, this.lililiIIil);
      buf.putFloat(32, this.iililiIIil);
      buf.putFloat(36, this.IIiiliIIil);
      buf.putFloat(40, this.lIiiliIIil);
      buf.putFloat(44, this.iIiiliIIil);
      buf.putFloat(48, this.IliiliIIil);
      buf.putFloat(52, this.lliiliIIil);
      buf.putFloat(56, this.iliiliIIil);
      buf.putFloat(60, this.IiiiliIIil);
      buf.putFloat(64, this.liiiliIIil ? 1.0F : 0.0F);
      buf.putFloat(68, this.iiiiliIIil && !this.liiiliIIil ? 1.0F : 0.0F);
      buf.putFloat(72, 0.0F);
      buf.putFloat(76, 0.0F);
      this.IIIIiiIIil.get(80, buf);
   }
}
