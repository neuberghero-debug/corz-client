package gg.corz;

public class lIllliiliIllliil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIlIiilil;
   private final iiIiiilIIliiil iiiIIiilil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","406CchzhmOM+/wYiVWM3mSl9qD0V+2QGJ6VNa7gOPQmkb6WV72HVR5zrYcw=">(),
      IliIlllilIi<"IliIlllilIi","DCG/IbJbFCcMga8kdou46zaKXbtLinV9iejU8W4z2EOxp7LIJ2kGb3gx+DrlhilFGWZqswN2ga8Ondkw5zzlNPktNX8Zsk7N7MRMneZwAWCr5s2IOojFrZWSi3CC3nhSfe1080ZCM4PNczCke0yxVk266343cjIb0DNT7B5KkXac+os1xtPpaMPepisKeA88o2R7YsYJjcNdYQhynPJ097GdACiWpTDEGR2Y+XMjV+k0K7I9RI2TOol1vm03bJIW5m5Lu3isSvkIQFoAygoyHOGomGH99I9U">(),
      true
   );

   public lIllliiliIllliil() {
      super(IliIlllilIi<"IliIlllilIi","83+zFgLDKk7w+nkALfTfx+9eF+y1QXY0epi+AFPmxTxMoE/e71+41og=">(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiIIiilil});
      this.IIIlIiilil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","xx1yzloD+nSPz9da7lLdz3saUtt8ogyqglHhl5itjQdhDf3ACCXXt12fbixrSA==">(),
         IliIlllilIi<"IliIlllilIi","dfi7iXIyObDd8RPTThiMjDjSElPpNQNxG4FKu9JVd0GG5lnvMQYb1AHH9dxCNb28KQN1WJ4KULQZEltn/YExgz80Gouboe+pAVNY87Dx6NE9qnWm8B9FO7GK1trtuKSQ7AjqJ+CSMO9qcZOR4BN0ntNDoBJHo8/+UxFk+Xm5PXHatFnghJP9YPULX1pK4de1wH4TS0GvHZ0n9n6esYj/gtg3U0DPwQJE/Ys+mCPh9boYXbvzTtRbDw8Sb/EVuHFl9bev1H1aIGbzQe4u10YlltonCoV5sEX92LzHc53J3QbCkaGygGdZBxfJ4TffWqMz29TwL0pILxrxXR4MIQTS8a4Foqgr+7g=">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIlIiilil});
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            new ililliIiIiilliIi(
                  IliIlllilIi<"IliIlllilIi","83+zFgLDKk7w+nkALfTfx+9eF+y1QXY0epi+AFPmxTxMoE/e71+41og=">(),
                  IliIlllilIi<"IliIlllilIi","3HuWUa8XrizR0B2K/3BtEDZVlwguJcU5sNgxD7Dumt/DswbkgNk/GELDiVc+wqOSsG78xPhwE1Le48zChVJCd29Py4ss0HeasvHyYZ/qD+JrK0UXdYD2vgwXXLsF6N3TcbuQhzK1flHqtjS7zOZ4iqmXj7Ewi6CDEeNlT9pd5gZycJajaKO7a2EUUwyHHd8ITWzipsEu8CwGu9ZpGGoBrxngQ+rm">(),
                  IliIlllilIi<"IliIlllilIi","83+zFgLDKk7w+nkALfTfx+9eF+y1QXY0epi+AFPmxTxMoE/e71+41og=">(),
                  this::iiiIlIIIll
               )
               .Ililllililil()
         }
      );
   }

   @Override
   public boolean Iilllilliill() {
      return true;
   }

   @Override
   public void Ililllililil() {
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         IIiIIllIiIIl.liiiIIllIl();
         if (Iiiilllliiilll.field_1755 != null) {
            Iiiilllliiilll.method_1507(null);
         }

         try (AutoCloseable var1 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            if (llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var2) {
               var2.lIIIiIlliIIIiIll();
            }

            for (ilIllIiIll var9 : lllIIiillIIi.IliIlllilIi(llilIllililIll.IilliliilIIi())) {
               var9.IIillIiliIil(false);
            }
         } catch (Exception var6) {
         }

         if (this.iiiIIiilil.Iilllilliill()) {
            Iilliillilliil.IilliliilIIi();
         }

         if (this.IIIlIiilil.Iilllilliill()) {
            IliIIiIilliIIiIi.iliIiiliiiii();
         }

         Thread var7 = new Thread(() -> {
            for (int var0 = 1; var0 <= 4; var0++) {
               System.gc();

               try {
                  Thread.sleep(100L * (long)var0);
               } catch (InterruptedException var2x) {
                  Thread.currentThread().interrupt();
                  return;
               }
            }

            System.gc();
         }, IliIlllilIi<"IliIlllilIi","fZdybbu+Vz0CcUjiYW4TjfFAHuSsifT14ljkKXvYYk5QA4gVKAG3lrjXtcXOqwZe">());
         var7.setDaemon(true);
         var7.start();
      }
   }
}
