package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_332;
import org.lwjgl.glfw.GLFW;

public class IiiIllIlliiIllIl {
   private final liIliIliiIliIl iIIlliIiIl = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, 0.0);
   private static final int iiiIliIiIl = 5;
   private static final int IiiIliIiIl = 4;
   private int IlIlliIiIl;
   private int IiIlliIiIl;
   private int ilIlliIiIl;
   private final iiiiIilIIIIlil lIIlliIiIl;
   private final illlIlIlIillIlIl IIIlliIiIl;
   private int llIlliIiIl;
   private static final int liiIliIiIl = 18;

   private int Illlllllilll(int t, int c1, double c2) {
      long var17 = 4059096190004416347L;
      long var19 = 4757989968383674274L;
      long var13 = 5767137358594013156L;
      long var15 = -3867879085635099385L;
      c2 = Math.max(0.0, Math.min(1.0, c2));
      var13 ^= ((long)(t >> 24 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(t >> 16 & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(t & 0xFF) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(c1 >> 24 & 0xFF) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(c1 >> 16 & 0xFF) ^ var17) & -1L >>> 32;
      var19 ^= ((long)(c1 >> 8 & 0xFF) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(c1 & 0xFF) ^ var19) & -1L >>> 32;
      return (int)((double)((int)(var13 >>> 32)) + (double)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * c2) << 24
         | (int)((double)((int)var13) + (double)((int)var17 - (int)var13) * c2) << 16
         | (int)((double)((int)(var15 >>> 32)) + (double)((int)(var19 >>> 32) - (int)(var15 >>> 32)) * c2) << 8
         | (int)((double)((int)var15) + (double)((int)var19 - (int)var15) * c2);
   }

   private int[] IilliliilIIi() {
      long var6 = -7255121403970619659L;
      long var8 = -6065428711841983978L;
      IIliiIlllIliiIll var1 = CorzClient.fontRenderer();
      var6 ^= (
            (long)Math.max(
                     (int)var1.iIlIlllllill(this.IliIlllilIi()),
                     (int)var1.iIlIlllllill(Iilllilliill<"Iilllilliill","qm+R09C39vXV7z4P+KWxX3rp4NLwaBGjR5wLQwIZFwZX5rmYhw5wzg==">())
                  )
                  << 32
               ^ var6
         )
         & -1L << 32;
      var6 ^= ((long)Math.min(this.ilIlliIiIl - 8, Math.max(56, (int)(var6 >>> 32) + 18)) ^ var6) & -1L >>> 32;
      var8 ^= ((long)(this.IlIlliIiIl + this.ilIlliIiIl - 4 - (int)var6) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(this.llIlliIiIl + this.IiIlliIiIl / 2 - 9) ^ var8) & -1L >>> 32;
      return new int[]{(int)(var8 >>> 32), (int)var8, (int)var6, 18};
   }

   public void IlIlllIlilIl(int glfwButton) {
      this.IIIlliIiIl.Iiilliiliiil(IlIiliIlllIiliIl.iIlIlllllill(glfwButton));
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   public void IIlllIlliIll(int height, int x, int y, int width) {
      this.IlIlliIiIl = height;
      this.llIlliIiIl = x;
      this.ilIlliIiIl = y;
      this.IiIlliIiIl = width;
   }

   private static String liiiIIllIl() {
      long var1 = 9058485758169882063L;
      var1 ^= ((long)((int)(System.currentTimeMillis() / 400L % 4L)) << 32 ^ var1) & -1L << 32;
      return Iilllilliill<"Iilllilliill","VFbFE+TYeMB/OVRWi50LrZTKQCqU7cvHUPhm43VBXQ08fCBUQQ==">()
         + Iilllilliill<"Iilllilliill","e3IxzUV63NeRZ/vRxj/2DC2X56pjz5vpAcjio0A=">().repeat((int)(var1 >>> 32));
   }

   private String iIlIlllllill(boolean capturing) {
      return capturing ? liiiIIllIl() : this.IliIlllilIi();
   }

   public IiiIllIlliiIllIl(illlIlIlIillIlIl height, int setting, int x, int host, int y, iiiiIilIIIIlil width) {
      this.IIIlliIiIl = height;
      this.lIIlliIiIl = width;
      this.IlIlliIiIl = setting;
      this.llIlliIiIl = x;
      this.ilIlliIiIl = host;
      this.IiIlliIiIl = y;
   }

   public boolean iliIiiliiiii(double my, double mx, int button) {
      if (button != 0) {
         return false;
      } else {
         int[] var6 = this.IilliliilIIi();
         if (my >= (double)var6[0] && my <= (double)(var6[0] + var6[2]) && mx >= (double)var6[1] && mx <= (double)(var6[1] + var6[3])) {
            this.lIIlliIiIl.IliIlllilIi(this);
            return true;
         } else {
            return false;
         }
      }
   }

   public void IIIllIIliIIl(int key) {
      this.IIIlliIiIl.Iiilliiliiil(IlIiliIlllIiliIl.IilliliilIIi(key) ? -1 : key);
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   public void lIiiIiIlilli(class_332 ctx, int mouseX, int mouseY) {
      long var32 = -5727498468624343344L;
      long var22 = -8077169092694543999L;
      long var24 = 4140235093653687993L;
      long var26 = -4148936992419272538L;
      long var28 = 2562100490991959871L;
      long var30 = -3207062955396090553L;
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      var22 ^= ((long)((int)var4.IilliliilIIi()) << 32 ^ var22) & -1L << 32;
      var4.IliIlllilIi(
         this.IIIlliIiIl.IliIlllilIi(), (float)(this.IlIlliIiIl + 4), (float)var4.IlIillIiilIi(this.llIlliIiIl, this.IiIlliIiIl), new Color(-3947581)
      );
      var22 ^= ((long)this.lIIlliIiIl.liiiIIllIl(this) ^ var22) & -1L >>> 32;
      int[] var7 = this.IilliliilIIi();
      var24 ^= ((long)var7[0] << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)var7[1] ^ var24) & -1L >>> 32;
      var26 ^= ((long)var7[2] << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)var7[3] ^ var26) & -1L >>> 32;
      var28 ^= (
            (long)(
                     mouseX >= (int)(var24 >>> 32)
                           && mouseX <= (int)(var24 >>> 32) + (int)(var26 >>> 32)
                           && mouseY >= (int)var24
                           && mouseY <= (int)var24 + (int)var26
                        ? 1
                        : 0
                  )
                  << 32
               ^ var28
         )
         & -1L << 32;
      if (Math.abs(this.iIIlliIiIl.IiIlliIliiIl() - (double)((int)(var28 >>> 32) != 0 ? 1 : 0)) > 0.01) {
         this.iIIlliIiIl.lIiiIiIlilli((int)(var28 >>> 32) != 0 ? 1.0 : 0.0);
      }

      double var13 = this.iIIlliIiIl.iIlIlllllill();
      double var15 = (int)var22 != 0 ? 1.0 : var13;
      var28 ^= ((long)this.Illlllllilll(-15461350, -14737624, var13) ^ var28) & -1L >>> 32;
      var30 ^= ((long)IIIiiIillIIiiIil.IlIillIiilIi(var15) << 32 ^ var30) & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(ctx, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32), (int)var26, 5, (int)var28, (int)(var30 >>> 32));
      String var19 = this.iIlIlllllill((boolean)((int)var22));
      var30 ^= ((long)((int)var22 != 0 ? IlIIilIlllIIilIl.lliiIlliIl : this.Illlllllilll(-1, IlIIilIlllIIilIl.lliiIlliIl, var13 * 0.8)) ^ var30) & -1L >>> 32;
      var32 ^= ((long)((int)var4.iIlIlllllill(var19)) << 32 ^ var32) & -1L << 32;
      var4.IliIlllilIi(
         var19,
         (float)((int)(var24 >>> 32) + ((int)(var26 >>> 32) - (int)(var32 >>> 32)) / 2),
         (float)var4.IlIillIiilIi((int)var24, (int)var26),
         new Color((int)var30, true)
      );
   }

   public int IiIlliIliiIl() {
      return this.IiIlliIiIl;
   }

   private String IliIlllilIi() {
      long var4 = 2396644437702369490L;
      var4 ^= ((long)this.IIIlliIiIl.Ililllililil() << 32 ^ var4) & -1L << 32;
      String var2 = IlIiliIlllIiliIl.IlIlllIlilIl((int)(var4 >>> 32));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = GLFW.glfwGetKeyName((int)(var4 >>> 32), 0);
         return var3 != null ? var3.toUpperCase() : IlIiliIlllIiliIl.IIIllIIliIIl((int)(var4 >>> 32));
      }
   }
}
