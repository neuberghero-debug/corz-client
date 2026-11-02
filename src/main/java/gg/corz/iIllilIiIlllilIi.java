package gg.corz;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_5321;

public final class iIllilIiIlllilIi {
   private final Map<Long, Integer> llIIillIIi;
   private final AtomicInteger IIlIillIIi;
   private final List<class_2338> lIIIillIIi;
   private int liIIillIIi;
   private final class_5321<class_1937> ilIIillIIi;
   private final AtomicInteger lIlIillIIi;
   private final AtomicInteger iiIIillIIi;
   private final long IiIIillIIi = System.currentTimeMillis();
   private volatile boolean iIlIillIIi;
   private final List<class_2680> iIIIillIIi;
   public static final int IIIIillIIi = 4096;

   public class_2338 lIiiIiIlilli(int i) {
      return this.lIIIillIIi.get(i);
   }

   public class_2680 iliIiiliiiii(int i) {
      return this.iIIIillIIi.get(i);
   }

   public iIllilIiIlllilIi(List<class_2338> crafterMasks, List<class_2680> positions, Map<Long, Integer> dimension, class_5321<class_1937> states) {
      this.iiIIillIIi = new AtomicInteger();
      this.IIlIillIIi = new AtomicInteger();
      this.lIlIillIIi = new AtomicInteger();
      if (crafterMasks.size() != positions.size()) {
         throw new IllegalArgumentException(
            Iilililiiili<"Iilililiiili","9qnE419UjeCedwJj3mhXPJJBPiYXEtMJ6W9Zx4/yUoxDBCorYiD5nsuVSdlCyzEudrOduBaLYBm42H72RI/yt4JcV1M=">()
               + crafterMasks.size()
               + Iilililiiili<"Iilililiiili","ZXKVvkjNHZSb5ZnGVhiLdOiYg9bxs+e3Nxtt+Idff/E=">()
               + positions.size()
         );
      } else {
         this.lIIIillIIi = crafterMasks;
         this.iIIIillIIi = positions;
         this.llIIillIIi = dimension == null ? Map.of() : dimension;
         this.ilIIillIIi = states;
      }
   }

   public Integer IIIllIIliIIl(class_2338 pos) {
      return this.llIIillIIi.get(pos.method_10063());
   }

   public int IliIlllilIi() {
      return this.lIIIillIIi.size();
   }

   public int Iiilliiliiil() {
      return this.iiIIillIIi.get();
   }

   public void Iilllilliill() {
      this.iiIIillIIi.incrementAndGet();
   }

   public boolean Illillliilli() {
      return this.iIlIillIIi;
   }

   public int IlIillIiilIi() {
      return this.lIlIillIIi.get();
   }

   public float IiIiliIiiiIi() {
      return this.IliIlllilIi() == 0 ? 1.0F : Math.min(1.0F, (float)this.IIlllIlliIll() / (float)this.IliIlllilIi());
   }

   public boolean IiIlliIliiIl() {
      return this.liIIillIIi >= this.IliIlllilIi();
   }

   public int liiiIIllIl() {
      return this.liIIillIIi;
   }

   public long IilliliilIIi() {
      return this.IiIIillIIi;
   }

   public boolean Illlllllilll() {
      return this.IiIlliIliiIl() && this.IIlllIlliIll() >= this.IliIlllilIi();
   }

   public void IIlilIliiIli() {
      this.iIlIillIIi = true;
   }

   public int IIIilIIiiIIi() {
      return this.IIlIillIIi.get();
   }

   public int IIlllIlliIll() {
      return this.iiIIillIIi.get() + this.IIlIillIIi.get() + this.lIlIillIIi.get();
   }

   public void IIillIiliIil() {
      this.IIlIillIIi.incrementAndGet();
   }

   public void Ililllililil(int n) {
      if (n > 0) {
         this.lIlIillIIi.addAndGet(n);
      }
   }

   public int IlIlllIlilIl(int budget) {
      this.liIIillIIi = Math.min(this.IliIlllilIi(), this.liIIillIIi + Math.max(0, budget));
      return this.liIIillIIi;
   }

   public class_5321<class_1937> iIlIlllllill() {
      return this.ilIIillIIi;
   }
}
