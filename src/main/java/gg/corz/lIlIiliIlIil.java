package gg.corz;

import net.minecraft.class_4588;
import net.minecraft.class_11659.class_11660;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class lIlIiliIlIil {
   final IllIlIilllIlIi iiIIiIliIIlIiIli;
   public final lliIililiIil iIIIiIliIlIIiIli = new lliIililiIil();
   boolean IllIiIlilllIiIli;
   final Iililillililil lIlIiIliiIlIiIli;
   private final Vector3f iIiIiIliIliIiIli;
   private final Vector3f lliIiIliiliIiIli;
   int IIiIiIlilIiIiIli;
   final class_11660 IiiIiIliliiIiIli;
   final float[] llIIiIliilIIiIli = new float[14];
   final float[] IiIIiIliliIIiIli = new float[14];
   int illIiIliIilIiIli;
   int lilIiIliiilIiIli;
   final class_11660 iiiIiIliIIIliIli;

   private void iIlIlllllill(class_4665 vc, class_4588 entry) {
      long var8 = -542093887852482557L;
      long var10 = 2615586143206459790L;

      try {
         Matrix4f var3 = vc.method_23761();
         float[] var4 = this.lIlIiIliiIlIiIli.IiililIliliililIli;
         var8 ^= ((long)(this.lIlIiIliiIlIiIli.IliIlllilIi() & -4) << 32 ^ var8) & -1L << 32;
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for (long var15 = var10 ^ (0L ^ var10) & -1L << 32; (int)var8 < (int)(var8 >>> 32); var15 += 34359738368L) {
            var3.transformPosition(var4[(int)(var15 >>> 32)], var4[(int)(var15 >>> 32) + 1], var4[(int)(var15 >>> 32) + 2], this.iIiIiIliIliIiIli);
            entry.method_22912(this.iIiIiIliIliIiIli.x, this.iIiIiIliIliIiIli.y, this.iIiIiIliIliIiIli.z)
               .method_39415(this.IIiIiIlilIiIiIli)
               .method_22913(var4[(int)(var15 >>> 32) + 3], var4[(int)(var15 >>> 32) + 4]);
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }
      } catch (Throwable var12) {
         llliIIllilliIIll.Ililllililil(IilliliilIIi<"IilliliilIIi","LCQbTw5osUdYnY2VTPNOwAl9kt0aJAG2s6VItNB2O+WQuxU=">(), var12);
      }
   }

   private void liiiIIllIl(class_4665 entry, class_4588 vc) {
      long var8 = -3762801494558328408L;
      long var10 = 1008142542367401543L;

      try {
         Matrix4f var3 = entry.method_23761();
         float[] var4 = this.lIlIiIliiIlIiIli.IiililIliliililIli;
         var8 ^= ((long)(this.lIlIiIliiIlIiIli.IliIlllilIi() & -4) << 32 ^ var8) & -1L << 32;
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for (long var15 = var10 ^ (0L ^ var10) & -1L << 32; (int)var8 < (int)(var8 >>> 32); var15 += 34359738368L) {
            var3.transformPosition(var4[(int)(var15 >>> 32)], var4[(int)(var15 >>> 32) + 1], var4[(int)(var15 >>> 32) + 2], this.iIiIiIliIliIiIli);
            entry.method_56820(var4[(int)(var15 >>> 32) + 5], var4[(int)(var15 >>> 32) + 6], var4[(int)(var15 >>> 32) + 7], this.lliIiIliiliIiIli);
            vc.method_23919(
               this.iIiIiIliIliIiIli.x,
               this.iIiIiIliIliIiIli.y,
               this.iIiIiIliIliIiIli.z,
               -1,
               var4[(int)(var15 >>> 32) + 3],
               var4[(int)(var15 >>> 32) + 4],
               this.lilIiIliiilIiIli,
               this.illIiIliIilIiIli,
               this.lliIiIliiliIiIli.x,
               this.lliIiIliiliIiIli.y,
               this.lliIiIliiliIiIli.z
            );
            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }
      } catch (Throwable var12) {
         llliIIllilliIIll.Ililllililil(IilliliilIIi<"IilliliilIIi","OhO7aJDk57+hzPaItW+xbHkdckRiVkjk7g3AMUz5Jus=">(), var12);
      }
   }

   public lIlIiliIlIil() {
      this.iiIIiIliIIlIiIli = new IllIlIilllIlIi();
      this.lIlIiIliiIlIiIli = new Iililillililil();
      this.iIiIiIliIliIiIli = new Vector3f();
      this.lliIiIliiliIiIli = new Vector3f();
      this.IiiIiIliliiIiIli = this::liiiIIllIl;
      this.iiiIiIliIIIliIli = this::iIlIlllllill;
   }

   void IliIlllilIi() {
      if (!this.IllIiIlilllIiIli) {
         lIIIIilliIIIIill.iIlIlllllill(this.llIIiIliilIIiIli, this.IiIIiIliliIIiIli, this.iiIIiIliIIlIiIli);
      }

      this.lIlIiIliiIlIiIli.IilliliilIIi(this.llIIiIliilIIiIli, this.IiIIiIliliIIiIli);
   }
}
