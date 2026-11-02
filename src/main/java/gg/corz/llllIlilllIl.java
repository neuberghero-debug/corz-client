package gg.corz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class llllIlilllIl {
   private volatile liIlilIiiiIlilIi lilIIllliilIIlll;
   private final AtomicBoolean IiiIIlllliiIIlll = new AtomicBoolean();
   private volatile liIlilIiiiIlilIi IIiIIllllIiIIlll;
   private volatile liIlilIiiiIlilIi iIiIIlllIliIIlll;
   private volatile Throwable lliIIllliliIIlll;
   public static final float IllIIllllllIIlll = 0.25F;
   private static final ExecutorService illIIlllIilIIlll = Executors.newSingleThreadExecutor(r -> {
      Thread var1 = new Thread(r, "corz-brainrot-warm");
      var1.setDaemon(true);
      var1.setPriority(1);
      return var1;
   });
   public static final float lIlIIllliIlIIlll = 0.5F;

   public abstract String liiiIIllIl();

   public float IiIlliIliiIl(liIlilIiiiIlilIi near) {
      return near.illilllIIi + 0.42F * (near.iililllIIi - near.illilllIIi);
   }

   public String iliIiiliiiii() {
      return null;
   }

   public final liIlilIiiiIlilIi IIillIiliIil() {
      return this.iIiIIlllIliIIlll;
   }

   public final Throwable Ililllililil() {
      return this.lliIIllliliIIlll;
   }

   public abstract String IliIlllilIi();

   public final synchronized liIlilIiiiIlilIi Iiilliiliiil() {
      if (this.lilIIllliilIIlll == null) {
         this.lilIIllliilIIlll = this.IiIiliIiiiIi(1.0F, null);
      }

      return this.lilIIllliilIIlll;
   }

   public int IlIlllIlilIl() {
      return 1;
   }

   protected abstract void IilliliilIIi(IIilllIilIilllIi var1);

   public final synchronized liIlilIiiiIlilIi IIIilIIiiIIi() {
      if (this.IIiIIllllIiIIlll == null) {
         this.IIiIIllllIiIIlll = this.IiIiliIiiiIi(0.5F, this.Iiilliiliiil().llIilllIIi);
      }

      return this.IIiIIllllIiIIlll;
   }

   public final liIlilIiiiIlilIi Iilllilliill() {
      return this.IIiIIllllIiIIlll;
   }

   public float IIIllIIliIIl() {
      return 1.0F;
   }

   public abstract void lIiiIiIlilli(iiiIlIIIll var1, IIlllilllIlllill var2);

   protected int iIlIlllllill() {
      return 512;
   }

   private liIlilIiiiIlilIi IiIiliIiiiIi(float sharedAtlas, int[] detail) {
      IIilllIilIilllIi var3 = new IIilllIilIilllIi(this.iIlIlllllill(), this.iIlIlllllill(), sharedAtlas, detail != null);
      this.IilliliilIIi(var3);
      return var3.iIIilIlIil(this.IliIlllilIi(), detail);
   }

   public final void IIlllIlliIll() {
      if (this.iIiIIlllIliIIlll == null && this.lliIIllliliIIlll == null && this.IiiIIlllliiIIlll.compareAndSet(false, true)) {
         illIIlllIilIIlll.execute(() -> {
            try {
               this.IlIillIiilIi();
            } catch (Throwable var2) {
               this.lliIIllliliIIlll = var2;
            }
         });
      }
   }

   public final synchronized liIlilIiiiIlilIi IlIillIiilIi() {
      if (this.iIiIIlllIliIIlll == null) {
         this.IIIilIIiiIIi();
         this.iIiIIlllIliIIlll = this.IiIiliIiiiIi(0.25F, this.Iiilliiliiil().llIilllIIi);
      }

      return this.iIiIIlllIliIIlll;
   }

   public final liIlilIiiiIlilIi Illlllllilll() {
      return this.lilIIllliilIIlll;
   }
}
