package gg.corz;

import com.corz.client.CorzClient;
import java.io.InputStream;
import net.minecraft.class_4587;

public class llillililillil {
   private final IIliiIlllIliiIll IIIIiIIlilIIIiIIli;
   private class_4587 lIlIiIIliiIlIiIIli = new class_4587();
   private IIliiIlllIliiIll iiIIiIIliIIlIiIIli;
   private IIliiIlllIliiIll IiIIiIIliliIIiIIli;
   private final IIliiIlllIliiIll iIIIiIIliIlIIiIIli;
   private final IIliiIlllIliiIll liiilIIliiiiilIIli = new IIliiIlllIliiIll(this.IliIlllilIi(), 18.0F);
   private IIliiIlllIliiIll llIIiIIliilIIiIIli;

   private void IilliliilIIi() {
      if (this.llIIiIIliilIIiIIli == null) {
         this.llIIiIIliilIIiIIli = new lliIIllliliIIlll(18.0F);
         this.IiIIiIIliliIIiIIli = new lliIIllliliIIlll(18.0F);
         this.iiIIiIIliIIlIiIIli = new lliIIllliliIIlll(13.0F);
      }
   }

   private InputStream IliIlllilIi() {
      return CorzClient.class
         .getClassLoader()
         .getResourceAsStream(IlIlllIlilIl<"IlIlllIlilIl","xd1ErbB5m8BOGe3xrkKpa3Lnk/c1nswrzEDE+O9Ao0HglSFFRd68gwg5lwFs3oCqistubtHHfNEUB5E=">());
   }

   public IIliiIlllIliiIll lIiiIiIlilli() {
      if (ililliiIiillii.illiIliIIl) {
         this.IilliliilIIi();
         return this.llIIiIIliilIIiIIli;
      } else {
         return this.liiilIIliiiiilIIli;
      }
   }

   public class_4587 liiiIIllIl() {
      return this.lIlIiIIliiIlIiIIli;
   }

   public IIliiIlllIliiIll IIIllIIliIIl() {
      if (ililliiIiillii.illiIliIIl) {
         this.IilliliilIIi();
         return this.iiIIiIIliIIlIiIIli;
      } else {
         return this.iIIIiIIliIlIIiIIli;
      }
   }

   public IIliiIlllIliiIll iliIiiliiiii() {
      if (ililliiIiillii.illiIliIIl) {
         this.IilliliilIIi();
         return this.IiIIiIIliliIIiIIli;
      } else {
         return this.IIIIiIIlilIIIiIIli;
      }
   }

   public void iIlIlllllill(class_4587 matrixStack) {
      this.lIlIiIIliiIlIiIIli = matrixStack != null ? matrixStack : new class_4587();
   }

   public llillililillil() {
      this.IIIIiIIlilIIIiIIli = new IIliiIlllIliiIll(this.IliIlllilIi(), 18.0F, 1);
      this.iIIIiIIliIlIIiIIli = new IIliiIlllIliiIll(this.IliIlllilIi(), 13.0F, 1);
   }
}
