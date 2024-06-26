package team.idivision.samples.designpatterns.patterns.structural.proxy

import team.idivision.samples.designpatterns.patterns.Pattern
import team.idivision.samples.designpatterns.patterns.structural.proxy.document.TextDocument
import team.idivision.samples.designpatterns.patterns.structural.proxy.image.ImageProxy


/** Proxy is applicable whenever there is a need for a more versatile or sophisticated reference
 *      to an object than a simple pointer
 *
 * Provide a surrogate or placeholder for another object to control access to it.
 *
 * - A **remote proxy** provides a local representative for an object in a different address space.
 *      NEXTSTEP [Add94] uses the class NXProxy for this purpose. Coplien [Cop92]
 *      calls this kind of proxy an "Ambassador."
 * - A **virtual proxy** creates expensive objects on demand. The ImageProxy described in the Motivation is
 *      an example of such a proxy.
 * - A **protection proxy** controls access to the original object. Protection proxies are useful when objects
 *      should have different access rights. For example, KernelProxies in the Choices operating system [CIRM93]
 *      provide protected access to operating system objects.
 * - A **smart reference** is a replacement for a bare pointer that performs additional actions when an object is accessed.
 *
 *      Typical uses include
 *      - counting the number of references to the real object so that it can be freed automatically when there are
 *      no more references (also called smart pointers [Ede92]).
 *      - loading a persistent object into memory when it's first referenced. o checking that the real object
 *      is locked before it's accessed to ensure that no other object can change it.
 */
class Proxy : Pattern("Proxy") {

    override fun launch() {
        val document = TextDocument()
        val imageProxy = ImageProxy("cool-image.png")

        imageProxy.load()
        document.insertImage(imageProxy)
        imageProxy.save()
    }
}