package gg.corz;

public class IlIIililllIIilil extends ilIllIiIll {
   private long llIliIIlil;
   private static final long ilIliIIlil = 8000L;
   public final iiIiiilIIliiil IlIliIIlil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","rWfi7Cw7RnsD65V37dWZpGmhknqdJwj+rq9fy/5yFd4rCmd4">(),
      IliIlllilIi<"IliIlllilIi","161uuy3Agf0pK0j9tPQS9aBVM5J4WAcvxml/ofXs976AiLpTmmYPXB7qEbL0cQQNQ4qZybl4jmHY+1sH4f4MgHBtlfYFMhN0wACcVyC3sn0/+3IGp468efATd0/MpQ==">(),
      false
   );

   @Override
   public boolean Iilllilliill() {
      return true;
   }

   public IlIIililllIIilil() {
      super(IliIlllilIi<"IliIlllilIi","nvjNhj/DdQnOTENdiQwo43LX0s3SfvBni+CM1M7A2ZJUitM=">(), lllIllillIll.illlIIIiIillIIIi);
      this.llIliIIlil = 0L;
      this.IIIllIIliIIl(
         new llIiliiilIilii(
            IliIlllilIi<"IliIlllilIi","nvjNhj/DdQnOTENdiQwo43LX0s3SfvBni+CM1M7A2ZJUitM=">(),
            IliIlllilIi<"IliIlllilIi","P4hjhnNWytgpcee64D4HEyPQU5TrYFllqZKeZ8hcsiu6RuSW77jrYT50/jlOuYOG3tqyzEzpdPPwGPiL/ybWlsAe0bYE6ENVyay9">()
         )
      );
      this.IIIllIIliIIl(this.IlIliIIlil);
      this.IlIliIIlil.lIiiIiIlilli();
      this.IIillIiliIil(true);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.IlIliIIlil.Iilllilliill()) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.llIliIIlil >= 8000L) {
            String var3 = lilllIiliilllIil.IIIIllIIIl();
            if (var3 != null) {
               this.llIliIIlil = var1;

               try {
                  if (!iilIliIlIIiIliIl.lIiiIiIlilli(var3)) {
                     return;
                  }

                  if (IIllliIilIllliIi.IliIlllilIi()) {
                     IIllliIilIllliIi.liiiIIllIl(var3, r -> {
                     });
                  }
               } catch (Exception var5) {
               }
            }
         }
      }
   }
}
